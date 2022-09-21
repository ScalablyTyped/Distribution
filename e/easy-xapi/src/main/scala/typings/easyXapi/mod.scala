package typings.easyXapi

import org.scalablytyped.runtime.Instantiable1
import typings.easyXapi.anon.Level
import typings.easyXapi.anon.Partial
import typings.express.mod.Application_
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("easy-xapi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(conf: Config): Result = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(conf.asInstanceOf[js.Any]).asInstanceOf[Result]
  
  inline def init(conf: InitConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(conf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Config extends StObject {
    
    var log: Level
    
    def mount(app: Application_): Unit
    
    var name: String
    
    var port: Double
    
    var root: String
    
    var xHeaderDefaults: js.UndefOr[js.Object] = js.undefined
  }
  object Config {
    
    inline def apply(log: Level, mount: Application_ => Unit, name: String, port: Double, root: String): Config = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any], mount = js.Any.fromFunction1(mount), name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setLog(value: Level): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setMount(value: Application_ => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setXHeaderDefaults(value: js.Object): Self = StObject.set(x, "xHeaderDefaults", value.asInstanceOf[js.Any])
      
      inline def setXHeaderDefaultsUndefined: Self = StObject.set(x, "xHeaderDefaults", js.undefined)
    }
  }
  
  trait InitConfig extends StObject {
    
    var jSend: js.UndefOr[Partial] = js.undefined
  }
  object InitConfig {
    
    inline def apply(): InitConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitConfig]
    }
    
    extension [Self <: InitConfig](x: Self) {
      
      inline def setJSend(value: Partial): Self = StObject.set(x, "jSend", value.asInstanceOf[js.Any])
      
      inline def setJSendUndefined: Self = StObject.set(x, "jSend", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    var app: Application_
    
    var express: Any
    
    def listen(): Unit
    
    var log: typings.bunyan.mod.^
    
    var server: Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ]
  }
  object Result {
    
    inline def apply(
      app: Application_,
      express: Any,
      listen: () => Unit,
      log: typings.bunyan.mod.^,
      server: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): Result = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], express = express.asInstanceOf[js.Any], listen = js.Any.fromFunction0(listen), log = log.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setApp(value: Application_): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setExpress(value: Any): Self = StObject.set(x, "express", value.asInstanceOf[js.Any])
      
      inline def setListen(value: () => Unit): Self = StObject.set(x, "listen", js.Any.fromFunction0(value))
      
      inline def setLog(value: typings.bunyan.mod.^): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setServer(
        value: Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ]
      ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
}
