package typings.expoDevServer.anon

import org.scalablytyped.runtime.Instantiable1
import typings.connect.mod.Server
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Middleware extends StObject {
  
  def middleware(req: IncomingMessage, res: ServerResponse[IncomingMessage]): Unit
  def middleware(req: IncomingMessage, res: ServerResponse[IncomingMessage], next: js.Function): Unit
  @JSName("middleware")
  var middleware_Original: Server
  
  var server: typings.node.httpMod.Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]
}
object Middleware {
  
  inline def apply(
    middleware: Server,
    server: typings.node.httpMod.Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ): Middleware = {
    val __obj = js.Dynamic.literal(middleware = middleware.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[Middleware]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Middleware] (val x: Self) extends AnyVal {
    
    inline def setMiddleware(value: Server): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    inline def setServer(
      value: typings.node.httpMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}
