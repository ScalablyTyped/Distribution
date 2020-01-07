package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarSeriesDollarMembershipDollarGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Number of maximum results per page to be included in the response.
    */
  var page_size: js.UndefOr[Double] = js.native
  /**
    * The value of the nextToken from the previous page.
    */
  var page_token: js.UndefOr[String] = js.native
  /**
    * String that identifies the series
    */
  var series_id: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarSeriesDollarMembershipDollarGet {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    page_size: Int | Double = null,
    page_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    series_id: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarSeriesDollarMembershipDollarGet = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (page_size != null) __obj.updateDynamic("page_size")(page_size.asInstanceOf[js.Any])
    if (page_token != null) __obj.updateDynamic("page_token")(page_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (series_id != null) __obj.updateDynamic("series_id")(series_id.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarSeriesDollarMembershipDollarGet]
  }
}

