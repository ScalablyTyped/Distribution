package typings.gapiClientMirror

import typings.gapiClientMirror.gapi.client.mirror.AccountsResource
import typings.gapiClientMirror.gapi.client.mirror.ContactsResource
import typings.gapiClientMirror.gapi.client.mirror.LocationsResource
import typings.gapiClientMirror.gapi.client.mirror.SettingsResource
import typings.gapiClientMirror.gapi.client.mirror.SubscriptionsResource
import typings.gapiClientMirror.gapi.client.mirror.TimelineResource
import typings.gapiClientMirror.gapiClientMirrorStrings.mirror
import typings.gapiClientMirror.gapiClientMirrorStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
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
    
  }
  
}

