package typings.gapiClientPartners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntireCompany extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  /** if true, show history for the entire company.  Requires user to be admin. */
  var entireCompany: js.UndefOr[Boolean] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /**
    * Comma-separated list of fields to order by, e.g.: "foo,bar,baz".
    * Use "foo desc" to sort descending.
    * List of valid field names is: name, offer_code, expiration_time, status,
    * last_modified_time, sender_name, creation_time, country_code,
    * offer_type.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  /** Maximum number of rows to return per page. */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** Token to retrieve a specific page. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Experiment IDs the current request belongs to. */
  @JSName("requestMetadata.experimentIds")
  var requestMetadataDotexperimentIds: js.UndefOr[String] = js.undefined
  /** Locale to use for the current request. */
  @JSName("requestMetadata.locale")
  var requestMetadataDotlocale: js.UndefOr[String] = js.undefined
  /** Google Partners session ID. */
  @JSName("requestMetadata.partnersSessionId")
  var requestMetadataDotpartnersSessionId: js.UndefOr[String] = js.undefined
  /**
    * Identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  @JSName("requestMetadata.trafficSource.trafficSourceId")
  var requestMetadataDottrafficSourceDottrafficSourceId: js.UndefOr[String] = js.undefined
  /**
    * Second level identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  @JSName("requestMetadata.trafficSource.trafficSubId")
  var requestMetadataDottrafficSourceDottrafficSubId: js.UndefOr[String] = js.undefined
  /** IP address to use instead of the user's geo-located IP address. */
  @JSName("requestMetadata.userOverrides.ipAddress")
  var requestMetadataDotuserOverridesDotipAddress: js.UndefOr[String] = js.undefined
  /** Logged-in user ID to impersonate instead of the user's ID. */
  @JSName("requestMetadata.userOverrides.userId")
  var requestMetadataDotuserOverridesDotuserId: js.UndefOr[String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
}

object AnonEntireCompany {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    bearer_token: String = null,
    callback: String = null,
    entireCompany: js.UndefOr[Boolean] = js.undefined,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    orderBy: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    pp: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestMetadataDotexperimentIds: String = null,
    requestMetadataDotlocale: String = null,
    requestMetadataDotpartnersSessionId: String = null,
    requestMetadataDottrafficSourceDottrafficSourceId: String = null,
    requestMetadataDottrafficSourceDottrafficSubId: String = null,
    requestMetadataDotuserOverridesDotipAddress: String = null,
    requestMetadataDotuserOverridesDotuserId: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): AnonEntireCompany = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (!js.isUndefined(entireCompany)) __obj.updateDynamic("entireCompany")(entireCompany.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (requestMetadataDotexperimentIds != null) __obj.updateDynamic("requestMetadata.experimentIds")(requestMetadataDotexperimentIds.asInstanceOf[js.Any])
    if (requestMetadataDotlocale != null) __obj.updateDynamic("requestMetadata.locale")(requestMetadataDotlocale.asInstanceOf[js.Any])
    if (requestMetadataDotpartnersSessionId != null) __obj.updateDynamic("requestMetadata.partnersSessionId")(requestMetadataDotpartnersSessionId.asInstanceOf[js.Any])
    if (requestMetadataDottrafficSourceDottrafficSourceId != null) __obj.updateDynamic("requestMetadata.trafficSource.trafficSourceId")(requestMetadataDottrafficSourceDottrafficSourceId.asInstanceOf[js.Any])
    if (requestMetadataDottrafficSourceDottrafficSubId != null) __obj.updateDynamic("requestMetadata.trafficSource.trafficSubId")(requestMetadataDottrafficSourceDottrafficSubId.asInstanceOf[js.Any])
    if (requestMetadataDotuserOverridesDotipAddress != null) __obj.updateDynamic("requestMetadata.userOverrides.ipAddress")(requestMetadataDotuserOverridesDotipAddress.asInstanceOf[js.Any])
    if (requestMetadataDotuserOverridesDotuserId != null) __obj.updateDynamic("requestMetadata.userOverrides.userId")(requestMetadataDotuserOverridesDotuserId.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEntireCompany]
  }
}

