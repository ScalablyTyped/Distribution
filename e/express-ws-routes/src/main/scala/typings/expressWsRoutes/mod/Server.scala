package typings.expressWsRoutes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Server
  extends typings.node.httpMod.Server {
  
  var wsServer: typings.ws.mod.Server = js.native
}
