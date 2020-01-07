package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics account ticket. The account ticket consists
  * of the ticket ID and the basic information for the account, property and
  * profile.
  */
@js.native
trait Schema$AccountTicket extends js.Object {
  /**
    * Account for this ticket.
    */
  var account: js.UndefOr[Schema$Account] = js.native
  /**
    * Account ticket ID used to access the account ticket.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type for account ticket.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * View (Profile) for the account.
    */
  var profile: js.UndefOr[Schema$Profile] = js.native
  /**
    * Redirect URI where the user will be sent after accepting Terms of
    * Service. Must be configured in APIs console as a callback URL.
    */
  var redirectUri: js.UndefOr[String] = js.native
  /**
    * Web property for the account.
    */
  var webproperty: js.UndefOr[Schema$Webproperty] = js.native
}

object Schema$AccountTicket {
  @scala.inline
  def apply(
    account: Schema$Account = null,
    id: String = null,
    kind: String = null,
    profile: Schema$Profile = null,
    redirectUri: String = null,
    webproperty: Schema$Webproperty = null
  ): Schema$AccountTicket = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (webproperty != null) __obj.updateDynamic("webproperty")(webproperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountTicket]
  }
}

