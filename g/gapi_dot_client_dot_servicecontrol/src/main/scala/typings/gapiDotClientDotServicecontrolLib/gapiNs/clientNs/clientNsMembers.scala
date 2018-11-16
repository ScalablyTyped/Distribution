package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val services: gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs.ServicesResource = js.native
  /** Load Google Service Control API v1 */
  def load(
    name: gapiDotClientDotServicecontrolLib.gapiDotClientDotServicecontrolLibStrings.servicecontrol,
    version: gapiDotClientDotServicecontrolLib.gapiDotClientDotServicecontrolLibStrings.v1
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotServicecontrolLib.gapiDotClientDotServicecontrolLibStrings.servicecontrol,
    version: gapiDotClientDotServicecontrolLib.gapiDotClientDotServicecontrolLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

