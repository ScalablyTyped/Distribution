package typings.expressWsRoutes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends typings.node.httpMod.Server {
  var wsServer: typings.ws.mod.Server = js.native
}

