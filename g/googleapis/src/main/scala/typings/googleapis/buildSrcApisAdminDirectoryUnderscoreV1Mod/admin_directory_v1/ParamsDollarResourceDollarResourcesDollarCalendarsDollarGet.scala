package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarResourcesDollarCalendarsDollarGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The unique ID of the calendar resource to retrieve.
    */
  var calendarResourceId: js.UndefOr[String] = js.native
  /**
    * The unique ID for the customer's G Suite account. As an account
    * administrator, you can also use the my_customer alias to represent your
    * account's customer ID.
    */
  var customer: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarResourcesDollarCalendarsDollarGet {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    calendarResourceId: String = null,
    customer: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarResourcesDollarCalendarsDollarGet = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (calendarResourceId != null) __obj.updateDynamic("calendarResourceId")(calendarResourceId.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarResourcesDollarCalendarsDollarGet]
  }
}

