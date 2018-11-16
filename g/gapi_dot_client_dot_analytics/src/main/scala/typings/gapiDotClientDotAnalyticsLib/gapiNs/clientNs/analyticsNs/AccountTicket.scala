package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AccountTicket extends js.Object {
  /** Account for this ticket. */
  var account: js.UndefOr[Account] = js.undefined
  /** Account ticket ID used to access the account ticket. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for account ticket. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** View (Profile) for the account. */
  var profile: js.UndefOr[Profile] = js.undefined
  /** Redirect URI where the user will be sent after accepting Terms of Service. Must be configured in APIs console as a callback URL. */
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
  /** Web property for the account. */
  var webproperty: js.UndefOr[Webproperty] = js.undefined
}

