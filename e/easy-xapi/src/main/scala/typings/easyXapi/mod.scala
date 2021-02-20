package typings.easyXapi

import typings.bunyan.mod.^
import typings.easyXapi.anon.Level
import typings.easyXapi.anon.Partial
import typings.express.mod.Application_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("easy-xapi", "create")
  @js.native
  def create(conf: Config): Result = js.native
  
  @JSImport("easy-xapi", "init")
  @js.native
  def init(conf: InitConfig): Unit = js.native
  
  @js.native
  trait Config extends StObject {
    
    var log: Level = js.native
    
    def mount(app: Application_): Unit = js.native
    
    var name: String = js.native
    
    var port: Double = js.native
    
    var root: String = js.native
    
    var xHeaderDefaults: js.UndefOr[js.Object] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(log: Level, mount: Application_ => Unit, name: String, port: Double, root: String): Config = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any], mount = js.Any.fromFunction1(mount), name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLog(value: Level): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMount(value: Application_ => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXHeaderDefaults(value: js.Object): Self = StObject.set(x, "xHeaderDefaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXHeaderDefaultsUndefined: Self = StObject.set(x, "xHeaderDefaults", js.undefined)
    }
  }
  
  @js.native
  trait InitConfig extends StObject {
    
    var jSend: js.UndefOr[Partial] = js.native
  }
  object InitConfig {
    
    @scala.inline
    def apply(): InitConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitConfig]
    }
    
    @scala.inline
    implicit class InitConfigMutableBuilder[Self <: InitConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJSend(value: Partial): Self = StObject.set(x, "jSend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJSendUndefined: Self = StObject.set(x, "jSend", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
    def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
    def app(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
    def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    @JSName("app")
    var app_Original: Application_ = js.native
    
    var express: js.Any = js.native
    
    def listen(): Unit = js.native
    
    var log: ^ = js.native
    
    var server: Server = js.native
  }
}
