package typings.frctlFractal.mod.fractal.web

import typings.frctlFractal.mod.WebTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebConfig extends js.Object {
  
  var builder: js.UndefOr[WebBuilderConfig] = js.native
  
  @JSName("builder.concurrency")
  var builderDotconcurrency: js.UndefOr[Double] = js.native
  
  @JSName("builder.dest")
  var builderDotdest: js.UndefOr[String] = js.native
  
  @JSName("builder.ext")
  var builderDotext: js.UndefOr[String] = js.native
  
  @JSName("builder.theme")
  var builderDottheme: js.UndefOr[WebTheme | String] = js.native
  
  @JSName("builder.urls")
  var builderDoturls: js.UndefOr[WebBuilderUrls] = js.native
  
  @JSName("builder.urls.ext")
  var builderDoturlsDotext: js.UndefOr[String] = js.native
  
  var server: js.UndefOr[WebServerConfig] = js.native
  
  @JSName("server.port")
  var serverDotport: js.UndefOr[Double] = js.native
  
  @JSName("server.sync")
  var serverDotsync: js.UndefOr[Boolean] = js.native
  
  @JSName("server.syncOptions")
  var serverDotsyncOptions: js.UndefOr[WebServerSyncOptions] = js.native
  
  @JSName("server.syncOptions.browser")
  var serverDotsyncOptionsDotbrowser: js.UndefOr[js.Array[String]] = js.native
  
  @JSName("server.syncOptions.notify")
  var serverDotsyncOptionsDotnotify: js.UndefOr[Boolean] = js.native
  
  @JSName("server.syncOptions.open")
  var serverDotsyncOptionsDotopen: js.UndefOr[Boolean] = js.native
  
  @JSName("server.theme")
  var serverDottheme: js.UndefOr[WebTheme | String] = js.native
  
  @JSName("server.watch")
  var serverDotwatch: js.UndefOr[Boolean] = js.native
  
  var static: js.UndefOr[WebStaticConfig] = js.native
  
  @JSName("static.mount")
  var staticDotmount: js.UndefOr[String] = js.native
  
  @JSName("static.path")
  var staticDotpath: js.UndefOr[String] = js.native
}
object WebConfig {
  
  @scala.inline
  def apply(): WebConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebConfig]
  }
  
  @scala.inline
  implicit class WebConfigOps[Self <: WebConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuilder(value: WebBuilderConfig): Self = this.set("builder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuilder: Self = this.set("builder", js.undefined)
    
    @scala.inline
    def setBuilderDotconcurrency(value: Double): Self = this.set("builder.concurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuilderDotconcurrency: Self = this.set("builder.concurrency", js.undefined)
    
    @scala.inline
    def setBuilderDotdest(value: String): Self = this.set("builder.dest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuilderDotdest: Self = this.set("builder.dest", js.undefined)
    
    @scala.inline
    def setBuilderDotext(value: String): Self = this.set("builder.ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuilderDotext: Self = this.set("builder.ext", js.undefined)
    
    @scala.inline
    def setBuilderDottheme(value: WebTheme | String): Self = this.set("builder.theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuilderDottheme: Self = this.set("builder.theme", js.undefined)
    
    @scala.inline
    def setBuilderDoturls(value: WebBuilderUrls): Self = this.set("builder.urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuilderDoturls: Self = this.set("builder.urls", js.undefined)
    
    @scala.inline
    def setBuilderDoturlsDotext(value: String): Self = this.set("builder.urls.ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuilderDoturlsDotext: Self = this.set("builder.urls.ext", js.undefined)
    
    @scala.inline
    def setServer(value: WebServerConfig): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    
    @scala.inline
    def setServerDotport(value: Double): Self = this.set("server.port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerDotport: Self = this.set("server.port", js.undefined)
    
    @scala.inline
    def setServerDotsync(value: Boolean): Self = this.set("server.sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerDotsync: Self = this.set("server.sync", js.undefined)
    
    @scala.inline
    def setServerDotsyncOptions(value: WebServerSyncOptions): Self = this.set("server.syncOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerDotsyncOptions: Self = this.set("server.syncOptions", js.undefined)
    
    @scala.inline
    def setServerDotsyncOptionsDotbrowserVarargs(value: String*): Self = this.set("server.syncOptions.browser", js.Array(value :_*))
    
    @scala.inline
    def setServerDotsyncOptionsDotbrowser(value: js.Array[String]): Self = this.set("server.syncOptions.browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerDotsyncOptionsDotbrowser: Self = this.set("server.syncOptions.browser", js.undefined)
    
    @scala.inline
    def setServerDotsyncOptionsDotnotify(value: Boolean): Self = this.set("server.syncOptions.notify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerDotsyncOptionsDotnotify: Self = this.set("server.syncOptions.notify", js.undefined)
    
    @scala.inline
    def setServerDotsyncOptionsDotopen(value: Boolean): Self = this.set("server.syncOptions.open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerDotsyncOptionsDotopen: Self = this.set("server.syncOptions.open", js.undefined)
    
    @scala.inline
    def setServerDottheme(value: WebTheme | String): Self = this.set("server.theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerDottheme: Self = this.set("server.theme", js.undefined)
    
    @scala.inline
    def setServerDotwatch(value: Boolean): Self = this.set("server.watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerDotwatch: Self = this.set("server.watch", js.undefined)
    
    @scala.inline
    def setStatic(value: WebStaticConfig): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
    
    @scala.inline
    def setStaticDotmount(value: String): Self = this.set("static.mount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticDotmount: Self = this.set("static.mount", js.undefined)
    
    @scala.inline
    def setStaticDotpath(value: String): Self = this.set("static.path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticDotpath: Self = this.set("static.path", js.undefined)
  }
}
