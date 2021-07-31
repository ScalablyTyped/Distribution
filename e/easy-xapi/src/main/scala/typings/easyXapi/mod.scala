package typings.easyXapi

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("easy-xapi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(conf: Config): Result = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(conf.asInstanceOf[js.Any]).asInstanceOf[Result]
  
  @scala.inline
  def init(conf: InitConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(conf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Config extends StObject {
    
    var log: Level
    
    def mount(app: Application_): Unit
    
    var name: String
    
    var port: Double
    
    var root: String
    
    var xHeaderDefaults: js.UndefOr[js.Object] = js.undefined
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
  
  trait InitConfig extends StObject {
    
    var jSend: js.UndefOr[Partial] = js.undefined
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
  
  trait Result extends StObject {
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: Response[js.Any, Double]): js.Any
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: ServerResponse): js.Any
    def app(req: IncomingMessage, res: Response[js.Any, Double]): js.Any
    def app(req: IncomingMessage, res: ServerResponse): js.Any
    @JSName("app")
    var app_Original: Application_
    
    var express: js.Any
    
    def listen(): Unit
    
    var log: typings.bunyan.mod.^
    
    var server: Server
  }
  object Result {
    
    @scala.inline
    def apply(app: Application_, express: js.Any, listen: () => Unit, log: typings.bunyan.mod.^, server: Server): Result = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], express = express.asInstanceOf[js.Any], listen = js.Any.fromFunction0(listen), log = log.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: Application_): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpress(value: js.Any): Self = StObject.set(x, "express", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListen(value: () => Unit): Self = StObject.set(x, "listen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLog(value: typings.bunyan.mod.^): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
}
