package typings.frctlFractal.mod.fractal

import org.scalablytyped.runtime.Instantiable1
import typings.frctlFractal.anon.ErrorCount
import typings.frctlFractal.anon.Sync
import typings.frctlFractal.mod.WebTheme
import typings.frctlFractal.mod.fractal.core.mixins.ConfigurableEmitter
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object web {
  
  @JSImport("@frctl/fractal", "fractal.web.Builder")
  @js.native
  open class Builder () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    /**
      * @deprecated Use start() instead.
      */
    def build(): js.Promise[ErrorCount] = js.native
    
    def start(): js.Promise[ErrorCount] = js.native
    
    def stop(): Unit = js.native
    
    def use(): Unit = js.native
  }
  
  @JSImport("@frctl/fractal", "fractal.web.Server")
  @js.native
  open class Server () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    val isSynced: Boolean = js.native
    
    val port: js.UndefOr[Double] = js.native
    
    val ports: typings.frctlFractal.anon.Server = js.native
    
    def start(): js.Promise[
        typings.node.httpMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
      ] = js.native
    def start(sync: Boolean): js.Promise[
        typings.node.httpMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
      ] = js.native
    
    def stop(): Unit = js.native
    
    val url: js.UndefOr[String] = js.native
    
    val urls: Sync = js.native
    
    def use(mount: String, middleware: Any): Unit = js.native
  }
  
  @JSImport("@frctl/fractal", "fractal.web.Web")
  @js.native
  open class Web () extends ConfigurableEmitter[WebConfig] {
    def this(options: EventEmitterOptions) = this()
    
    def builder(): Builder = js.native
    def builder(config: WebBuilderConfig): Builder = js.native
    
    def defaultTheme(): WebTheme = js.native
    def defaultTheme(instance: WebTheme): this.type = js.native
    
    def server(): Server = js.native
    def server(config: WebServerConfig): Server = js.native
    
    def theme(name: String): this.type = js.native
    def theme(name: String, instance: WebTheme): this.type = js.native
  }
  
  trait WebBuilderConfig extends StObject {
    
    var concurrency: js.UndefOr[Double] = js.undefined
    
    var dest: js.UndefOr[String] = js.undefined
    
    var ext: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[WebTheme | String] = js.undefined
    
    var urls: js.UndefOr[WebBuilderUrls] = js.undefined
  }
  object WebBuilderConfig {
    
    inline def apply(): WebBuilderConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebBuilderConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebBuilderConfig] (val x: Self) extends AnyVal {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setTheme(value: WebTheme | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUrls(value: WebBuilderUrls): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    }
  }
  
  trait WebBuilderUrls extends StObject {
    
    var ext: js.UndefOr[String] = js.undefined
  }
  object WebBuilderUrls {
    
    inline def apply(): WebBuilderUrls = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebBuilderUrls]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebBuilderUrls] (val x: Self) extends AnyVal {
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    }
  }
  
  trait WebConfig extends StObject {
    
    var builder: js.UndefOr[WebBuilderConfig] = js.undefined
    
    @JSName("builder.concurrency")
    var builderDotconcurrency: js.UndefOr[Double] = js.undefined
    
    @JSName("builder.dest")
    var builderDotdest: js.UndefOr[String] = js.undefined
    
    @JSName("builder.ext")
    var builderDotext: js.UndefOr[String] = js.undefined
    
    @JSName("builder.theme")
    var builderDottheme: js.UndefOr[WebTheme | String] = js.undefined
    
    @JSName("builder.urls")
    var builderDoturls: js.UndefOr[WebBuilderUrls] = js.undefined
    
    @JSName("builder.urls.ext")
    var builderDoturlsDotext: js.UndefOr[String] = js.undefined
    
    var server: js.UndefOr[WebServerConfig] = js.undefined
    
    @JSName("server.port")
    var serverDotport: js.UndefOr[Double] = js.undefined
    
    @JSName("server.sync")
    var serverDotsync: js.UndefOr[Boolean] = js.undefined
    
    @JSName("server.syncOptions")
    var serverDotsyncOptions: js.UndefOr[WebServerSyncOptions] = js.undefined
    
    @JSName("server.syncOptions.browser")
    var serverDotsyncOptionsDotbrowser: js.UndefOr[js.Array[String]] = js.undefined
    
    @JSName("server.syncOptions.notify")
    var serverDotsyncOptionsDotnotify: js.UndefOr[Boolean] = js.undefined
    
    @JSName("server.syncOptions.open")
    var serverDotsyncOptionsDotopen: js.UndefOr[Boolean] = js.undefined
    
    @JSName("server.theme")
    var serverDottheme: js.UndefOr[WebTheme | String] = js.undefined
    
    @JSName("server.watch")
    var serverDotwatch: js.UndefOr[Boolean] = js.undefined
    
    var static: js.UndefOr[WebStaticConfig] = js.undefined
    
    @JSName("static.mount")
    var staticDotmount: js.UndefOr[String] = js.undefined
    
    @JSName("static.path")
    var staticDotpath: js.UndefOr[String] = js.undefined
  }
  object WebConfig {
    
    inline def apply(): WebConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebConfig] (val x: Self) extends AnyVal {
      
      inline def setBuilder(value: WebBuilderConfig): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
      
      inline def setBuilderDotconcurrency(value: Double): Self = StObject.set(x, "builder.concurrency", value.asInstanceOf[js.Any])
      
      inline def setBuilderDotconcurrencyUndefined: Self = StObject.set(x, "builder.concurrency", js.undefined)
      
      inline def setBuilderDotdest(value: String): Self = StObject.set(x, "builder.dest", value.asInstanceOf[js.Any])
      
      inline def setBuilderDotdestUndefined: Self = StObject.set(x, "builder.dest", js.undefined)
      
      inline def setBuilderDotext(value: String): Self = StObject.set(x, "builder.ext", value.asInstanceOf[js.Any])
      
      inline def setBuilderDotextUndefined: Self = StObject.set(x, "builder.ext", js.undefined)
      
      inline def setBuilderDottheme(value: WebTheme | String): Self = StObject.set(x, "builder.theme", value.asInstanceOf[js.Any])
      
      inline def setBuilderDotthemeUndefined: Self = StObject.set(x, "builder.theme", js.undefined)
      
      inline def setBuilderDoturls(value: WebBuilderUrls): Self = StObject.set(x, "builder.urls", value.asInstanceOf[js.Any])
      
      inline def setBuilderDoturlsDotext(value: String): Self = StObject.set(x, "builder.urls.ext", value.asInstanceOf[js.Any])
      
      inline def setBuilderDoturlsDotextUndefined: Self = StObject.set(x, "builder.urls.ext", js.undefined)
      
      inline def setBuilderDoturlsUndefined: Self = StObject.set(x, "builder.urls", js.undefined)
      
      inline def setBuilderUndefined: Self = StObject.set(x, "builder", js.undefined)
      
      inline def setServer(value: WebServerConfig): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerDotport(value: Double): Self = StObject.set(x, "server.port", value.asInstanceOf[js.Any])
      
      inline def setServerDotportUndefined: Self = StObject.set(x, "server.port", js.undefined)
      
      inline def setServerDotsync(value: Boolean): Self = StObject.set(x, "server.sync", value.asInstanceOf[js.Any])
      
      inline def setServerDotsyncOptions(value: WebServerSyncOptions): Self = StObject.set(x, "server.syncOptions", value.asInstanceOf[js.Any])
      
      inline def setServerDotsyncOptionsDotbrowser(value: js.Array[String]): Self = StObject.set(x, "server.syncOptions.browser", value.asInstanceOf[js.Any])
      
      inline def setServerDotsyncOptionsDotbrowserUndefined: Self = StObject.set(x, "server.syncOptions.browser", js.undefined)
      
      inline def setServerDotsyncOptionsDotbrowserVarargs(value: String*): Self = StObject.set(x, "server.syncOptions.browser", js.Array(value*))
      
      inline def setServerDotsyncOptionsDotnotify(value: Boolean): Self = StObject.set(x, "server.syncOptions.notify", value.asInstanceOf[js.Any])
      
      inline def setServerDotsyncOptionsDotnotifyUndefined: Self = StObject.set(x, "server.syncOptions.notify", js.undefined)
      
      inline def setServerDotsyncOptionsDotopen(value: Boolean): Self = StObject.set(x, "server.syncOptions.open", value.asInstanceOf[js.Any])
      
      inline def setServerDotsyncOptionsDotopenUndefined: Self = StObject.set(x, "server.syncOptions.open", js.undefined)
      
      inline def setServerDotsyncOptionsUndefined: Self = StObject.set(x, "server.syncOptions", js.undefined)
      
      inline def setServerDotsyncUndefined: Self = StObject.set(x, "server.sync", js.undefined)
      
      inline def setServerDottheme(value: WebTheme | String): Self = StObject.set(x, "server.theme", value.asInstanceOf[js.Any])
      
      inline def setServerDotthemeUndefined: Self = StObject.set(x, "server.theme", js.undefined)
      
      inline def setServerDotwatch(value: Boolean): Self = StObject.set(x, "server.watch", value.asInstanceOf[js.Any])
      
      inline def setServerDotwatchUndefined: Self = StObject.set(x, "server.watch", js.undefined)
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setStatic(value: WebStaticConfig): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setStaticDotmount(value: String): Self = StObject.set(x, "static.mount", value.asInstanceOf[js.Any])
      
      inline def setStaticDotmountUndefined: Self = StObject.set(x, "static.mount", js.undefined)
      
      inline def setStaticDotpath(value: String): Self = StObject.set(x, "static.path", value.asInstanceOf[js.Any])
      
      inline def setStaticDotpathUndefined: Self = StObject.set(x, "static.path", js.undefined)
      
      inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    }
  }
  
  trait WebServerConfig extends StObject {
    
    var port: js.UndefOr[Double] = js.undefined
    
    var sync: js.UndefOr[Boolean] = js.undefined
    
    var syncOptions: js.UndefOr[WebServerSyncOptions] = js.undefined
    
    var theme: js.UndefOr[WebTheme | String] = js.undefined
    
    var watch: js.UndefOr[Boolean] = js.undefined
  }
  object WebServerConfig {
    
    inline def apply(): WebServerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebServerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebServerConfig] (val x: Self) extends AnyVal {
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncOptions(value: WebServerSyncOptions): Self = StObject.set(x, "syncOptions", value.asInstanceOf[js.Any])
      
      inline def setSyncOptionsUndefined: Self = StObject.set(x, "syncOptions", js.undefined)
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      inline def setTheme(value: WebTheme | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  trait WebServerSyncOptions extends StObject {
    
    var browser: js.UndefOr[js.Array[String]] = js.undefined
    
    @JSName("notify")
    var notify_FWebServerSyncOptions: js.UndefOr[Boolean] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
  }
  object WebServerSyncOptions {
    
    inline def apply(): WebServerSyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebServerSyncOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebServerSyncOptions] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: js.Array[String]): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setBrowserVarargs(value: String*): Self = StObject.set(x, "browser", js.Array(value*))
      
      inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
      
      inline def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
  
  trait WebStaticConfig extends StObject {
    
    var mount: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object WebStaticConfig {
    
    inline def apply(): WebStaticConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebStaticConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebStaticConfig] (val x: Self) extends AnyVal {
      
      inline def setMount(value: String): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
      
      inline def setMountUndefined: Self = StObject.set(x, "mount", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
