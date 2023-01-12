package typings.fastify.mod

import org.scalablytyped.runtime.Instantiable1
import typings.fastify.typesLoggerMod.FastifyBaseLogger
import typings.node.httpsMod.ServerOptions
import typings.node.nodeColonhttpMod.IncomingMessage
import typings.node.nodeColonhttpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastifyHttpsOptions[Server /* <: typings.node.httpsMod.Server[
Instantiable1[/* socket */ Socket, IncomingMessage], 
Instantiable1[
  /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
  ServerResponse[typings.node.httpMod.IncomingMessage]
]] */, Logger /* <: FastifyBaseLogger */]
  extends StObject
     with FastifyServerOptions[Server, Logger] {
  
  var https: (ServerOptions[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[typings.node.httpMod.IncomingMessage]
    ]
  ]) | Null
}
object FastifyHttpsOptions {
  
  inline def apply[Server /* <: typings.node.httpsMod.Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[typings.node.httpMod.IncomingMessage]
    ]
  ] */, Logger /* <: FastifyBaseLogger */](): FastifyHttpsOptions[Server, Logger] = {
    val __obj = js.Dynamic.literal(https = null)
    __obj.asInstanceOf[FastifyHttpsOptions[Server, Logger]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FastifyHttpsOptions[?, ?], Server /* <: typings.node.httpsMod.Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[typings.node.httpMod.IncomingMessage]
    ]
  ] */, Logger /* <: FastifyBaseLogger */] (val x: Self & (FastifyHttpsOptions[Server, Logger])) extends AnyVal {
    
    inline def setHttps(
      value: ServerOptions[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typings.node.httpMod.IncomingMessage]
          ]
        ]
    ): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsNull: Self = StObject.set(x, "https", null)
  }
}
