package typings.gapiDotClientDotGroupssettings.gapiNs.clientNs

import typings.gapiDotClientDotGroupssettings.gapiDotClientDotGroupssettingsStrings.groupssettings
import typings.gapiDotClientDotGroupssettings.gapiDotClientDotGroupssettingsStrings.v1
import typings.gapiDotClientDotGroupssettings.gapiNs.clientNs.groupssettingsNs.GroupsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val groups: GroupsResource = js.native
  /** Load Groups Settings API v1 */
  def load(name: groupssettings, version: v1): js.Thenable[Unit] = js.native
  def load(name: groupssettings, version: v1, callback: js.Function0[_]): Unit = js.native
}

