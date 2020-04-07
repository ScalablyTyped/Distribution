package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceServicesSkusList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ISO 4217 currency code for the pricing info in the response proto.
    * Will use the conversion rate as of start_time. Optional. If not specified
    * USD will be used.
    */
  var currencyCode: js.UndefOr[String] = js.native
  /**
    * Optional exclusive end time of the time range for which the pricing
    * versions will be returned. Timestamps in the future are not allowed. The
    * time range has to be within a single calendar month in
    * America/Los_Angeles timezone. Time range as a whole is optional. If not
    * specified, the latest pricing will be returned (up to 12 hours old at
    * most).
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Requested page size. Defaults to 5000.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results to return. This should be a
    * `next_page_token` value returned from a previous `ListSkus` call. If
    * unspecified, the first page of results is returned.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The name of the service. Example: "services/DA34-426B-A397"
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Optional inclusive start time of the time range for which the pricing
    * versions will be returned. Timestamps in the future are not allowed. The
    * time range has to be within a single calendar month in
    * America/Los_Angeles timezone. Time range as a whole is optional. If not
    * specified, the latest pricing will be returned (up to 12 hours old at
    * most).
    */
  var startTime: js.UndefOr[String] = js.native
}

object ParamsResourceServicesSkusList {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    currencyCode: String = null,
    endTime: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    parent: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    startTime: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceServicesSkusList = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceServicesSkusList]
  }
}

