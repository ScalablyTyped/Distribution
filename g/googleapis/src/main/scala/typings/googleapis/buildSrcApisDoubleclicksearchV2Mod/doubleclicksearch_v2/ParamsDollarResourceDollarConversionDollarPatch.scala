package typings.googleapis.buildSrcApisDoubleclicksearchV2Mod.doubleclicksearch_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarConversionDollarPatch extends StandardParameters {
  /**
    * Numeric ID of the advertiser.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Numeric ID of the agency.
    */
  var agencyId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Last date (inclusive) on which to retrieve conversions. Format is
    * yyyymmdd.
    */
  var endDate: js.UndefOr[Double] = js.native
  /**
    * Numeric ID of the engine account.
    */
  var engineAccountId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$ConversionList] = js.native
  /**
    * The number of conversions to return per call.
    */
  var rowCount: js.UndefOr[Double] = js.native
  /**
    * First date (inclusive) on which to retrieve conversions. Format is
    * yyyymmdd.
    */
  var startDate: js.UndefOr[Double] = js.native
  /**
    * The 0-based starting index for retrieving conversions results.
    */
  var startRow: js.UndefOr[Double] = js.native
}

object ParamsDollarResourceDollarConversionDollarPatch {
  @scala.inline
  def apply(
    advertiserId: String = null,
    agencyId: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    endDate: Int | Double = null,
    engineAccountId: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestBody: Schema$ConversionList = null,
    rowCount: Int | Double = null,
    startDate: Int | Double = null,
    startRow: Int | Double = null,
    userIp: String = null
  ): ParamsDollarResourceDollarConversionDollarPatch = {
    val __obj = js.Dynamic.literal()
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (agencyId != null) __obj.updateDynamic("agencyId")(agencyId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (engineAccountId != null) __obj.updateDynamic("engineAccountId")(engineAccountId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (startRow != null) __obj.updateDynamic("startRow")(startRow.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarConversionDollarPatch]
  }
}

