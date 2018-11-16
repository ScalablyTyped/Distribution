package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val accounts: gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs.AccountsResource = js.native
  val contacts: gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs.ContactsResource = js.native
  val locations: gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs.LocationsResource = js.native
  val settings: gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs.SettingsResource = js.native
  val subscriptions: gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs.SubscriptionsResource = js.native
  val timeline: gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs.TimelineResource = js.native
  /** Load Google Mirror API v1 */
  def load(
    name: gapiDotClientDotMirrorLib.gapiDotClientDotMirrorLibStrings.mirror,
    version: gapiDotClientDotMirrorLib.gapiDotClientDotMirrorLibStrings.v1
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotMirrorLib.gapiDotClientDotMirrorLibStrings.mirror,
    version: gapiDotClientDotMirrorLib.gapiDotClientDotMirrorLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

