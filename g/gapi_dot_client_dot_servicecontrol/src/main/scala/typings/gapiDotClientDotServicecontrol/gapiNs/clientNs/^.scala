package typings.gapiDotClientDotServicecontrol.gapiNs.clientNs

import typings.gapiDotClientDotServicecontrol.gapiDotClientDotServicecontrolStrings.servicecontrol
import typings.gapiDotClientDotServicecontrol.gapiDotClientDotServicecontrolStrings.v1
import typings.gapiDotClientDotServicecontrol.gapiNs.clientNs.servicecontrolNs.ServicesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val services: ServicesResource = js.native
  /** Load Google Service Control API v1 */
  def load(name: servicecontrol, version: v1): js.Thenable[Unit] = js.native
  def load(name: servicecontrol, version: v1, callback: js.Function0[_]): Unit = js.native
}

