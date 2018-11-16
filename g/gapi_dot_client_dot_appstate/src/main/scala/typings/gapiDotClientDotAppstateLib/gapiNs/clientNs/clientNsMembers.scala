package typings
package gapiDotClientDotAppstateLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val states: gapiDotClientDotAppstateLib.gapiNs.clientNs.appstateNs.StatesResource = js.native
  /** Load Google App State API v1 */
  def load(
    name: gapiDotClientDotAppstateLib.gapiDotClientDotAppstateLibStrings.appstate,
    version: gapiDotClientDotAppstateLib.gapiDotClientDotAppstateLibStrings.v1
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotAppstateLib.gapiDotClientDotAppstateLibStrings.appstate,
    version: gapiDotClientDotAppstateLib.gapiDotClientDotAppstateLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

