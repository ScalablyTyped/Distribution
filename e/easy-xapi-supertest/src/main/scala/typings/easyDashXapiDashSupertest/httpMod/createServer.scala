package typings.easyDashXapiDashSupertest.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http", "createServer")
@js.native
object createServer extends js.Object {
  def apply(): Server = js.native
  def apply(requestListener: js.Function2[/* request */ IncomingMessage, /* response */ ServerResponse, Unit]): Server = js.native
}

