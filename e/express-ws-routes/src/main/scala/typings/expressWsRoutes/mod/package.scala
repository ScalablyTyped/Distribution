package typings.expressWsRoutes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CbHandler = js.Function1[
    /* connectHandler */ typings.expressWsRoutes.mod.WebSocketHandler | scala.Boolean, 
    scala.Unit
  ]
  
  type WebSocketHandler = js.Function1[/* socket */ typings.ws.mod.^, scala.Unit]
  
  type WebSocketRouteHandler = js.Function3[
    /* info */ typings.expressWsRoutes.mod.ClientInfo, 
    /* cb */ typings.expressWsRoutes.mod.CbHandler, 
    /* next */ typings.express.mod.NextFunction, 
    scala.Unit
  ]
}
