package typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountTicket extends js.Object {
  /** Account for this ticket. */
  var account: js.UndefOr[Account] = js.undefined
  /** Account ticket ID used to access the account ticket. */
  var id: js.UndefOr[String] = js.undefined
  /** Resource type for account ticket. */
  var kind: js.UndefOr[String] = js.undefined
  /** View (Profile) for the account. */
  var profile: js.UndefOr[Profile] = js.undefined
  /** Redirect URI where the user will be sent after accepting Terms of Service. Must be configured in APIs console as a callback URL. */
  var redirectUri: js.UndefOr[String] = js.undefined
  /** Web property for the account. */
  var webproperty: js.UndefOr[Webproperty] = js.undefined
}

object AccountTicket {
  @scala.inline
  def apply(
    account: Account = null,
    id: String = null,
    kind: String = null,
    profile: Profile = null,
    redirectUri: String = null,
    webproperty: Webproperty = null
  ): AccountTicket = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    if (webproperty != null) __obj.updateDynamic("webproperty")(webproperty)
    __obj.asInstanceOf[AccountTicket]
  }
}

