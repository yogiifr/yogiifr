### Yogi Fitriadi Rakhim

> /'yo.gi fit.ri.a.di 'ra.khim/

I'm a Web Developer and occasional UI/UX Designer who loves making high-quality websites and applications. I am a recent graduate with a major in Engineering Physics. My current pursuits involve exploring the intricacies of the universe's workings while also delving into the realms of web development.

[`📫 yogiffrr@gmail.com`](mailto:yogiffrr@gmail.com)
[`💼 yogiifr`](https://www.linkedin.com/in/yogiifr/)

### 👷 Check out what I'm currently working on
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### 🌱 My latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}

### 🔨 My recent Pull Requests
{{ range recentPullRequests 5 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}

### 🔭 Latest releases I've contributed to
{{ range recentReleases 5 }}
- [{{ .Name }}]({{ .URL }}) [`{{ .LastRelease.TagName }}`]({{ .LastRelease.URL }}) - {{.Description}}
{{- end }}

### ⭐ Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### 💖 Recent followers
{{ range followers 5 }}
- [**@{{ .Login }}**]({{ .URL }})
{{- end }}

### 📰 Recent Blog Posts
{{ range rss "https://maximousblk.me/feed" 5 }}
- [{{ .Title }}]({{ .URL }})
{{- end }}
