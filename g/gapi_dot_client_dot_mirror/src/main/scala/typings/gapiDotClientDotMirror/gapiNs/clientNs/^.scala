package typings.gapiDotClientDotMirror.gapiNs.clientNs

import typings.gapiDotClientDotMirror.gapiDotClientDotMirrorStrings.mirror
import typings.gapiDotClientDotMirror.gapiDotClientDotMirrorStrings.v1
import typings.gapiDotClientDotMirror.gapiNs.clientNs.mirrorNs.AccountsResource
import typings.gapiDotClientDotMirror.gapiNs.clientNs.mirrorNs.ContactsResource
import typings.gapiDotClientDotMirror.gapiNs.clientNs.mirrorNs.LocationsResource
import typings.gapiDotClientDotMirror.gapiNs.clientNs.mirrorNs.SettingsResource
import typings.gapiDotClientDotMirror.gapiNs.clientNs.mirrorNs.SubscriptionsResource
import typings.gapiDotClientDotMirror.gapiNs.clientNs.mirrorNs.TimelineResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val accounts: AccountsResource = js.native
  val contacts: ContactsResource = js.native
  val locations: LocationsResource = js.native
  val settings: SettingsResource = js.native
  val subscriptions: SubscriptionsResource = js.native
  val timeline: TimelineResource = js.native
  /** Load Google Mirror API v1 */
  def load(name: mirror, version: v1): js.Thenable[Unit] = js.native
  def load(name: mirror, version: v1, callback: js.Function0[_]): Unit = js.native
}

