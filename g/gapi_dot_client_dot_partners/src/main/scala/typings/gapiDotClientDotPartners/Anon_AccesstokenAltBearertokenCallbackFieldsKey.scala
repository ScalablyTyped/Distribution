package typings.gapiDotClientDotPartners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccesstokenAltBearertokenCallbackFieldsKey extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Experiment IDs the current request belongs to. */
  var `requestMetadata.experimentIds`: js.UndefOr[String] = js.undefined
  /** Locale to use for the current request. */
  var `requestMetadata.locale`: js.UndefOr[String] = js.undefined
  /** Google Partners session ID. */
  var `requestMetadata.partnersSessionId`: js.UndefOr[String] = js.undefined
  /**
    * Identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  var `requestMetadata.trafficSource.trafficSourceId`: js.UndefOr[String] = js.undefined
  /**
    * Second level identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  var `requestMetadata.trafficSource.trafficSubId`: js.UndefOr[String] = js.undefined
  /** IP address to use instead of the user's geo-located IP address. */
  var `requestMetadata.userOverrides.ipAddress`: js.UndefOr[String] = js.undefined
  /** Logged-in user ID to impersonate instead of the user's ID. */
  var `requestMetadata.userOverrides.userId`: js.UndefOr[String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
  /**
    * The ID of the user. Can be set to <code>me</code> to mean
    * the currently authenticated user.
    */
  var userId: String
}

object Anon_AccesstokenAltBearertokenCallbackFieldsKey {
  @scala.inline
  def apply(
    userId: String,
    `$.xgafv`: String = null,
    access_token: String = null,
    alt: String = null,
    bearer_token: String = null,
    callback: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    pp: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    `requestMetadata.experimentIds`: String = null,
    `requestMetadata.locale`: String = null,
    `requestMetadata.partnersSessionId`: String = null,
    `requestMetadata.trafficSource.trafficSourceId`: String = null,
    `requestMetadata.trafficSource.trafficSubId`: String = null,
    `requestMetadata.userOverrides.ipAddress`: String = null,
    `requestMetadata.userOverrides.userId`: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): Anon_AccesstokenAltBearertokenCallbackFieldsKey = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    if (`$.xgafv` != null) __obj.updateDynamic("$.xgafv")(`$.xgafv`.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (`requestMetadata.experimentIds` != null) __obj.updateDynamic("requestMetadata.experimentIds")(`requestMetadata.experimentIds`.asInstanceOf[js.Any])
    if (`requestMetadata.locale` != null) __obj.updateDynamic("requestMetadata.locale")(`requestMetadata.locale`.asInstanceOf[js.Any])
    if (`requestMetadata.partnersSessionId` != null) __obj.updateDynamic("requestMetadata.partnersSessionId")(`requestMetadata.partnersSessionId`.asInstanceOf[js.Any])
    if (`requestMetadata.trafficSource.trafficSourceId` != null) __obj.updateDynamic("requestMetadata.trafficSource.trafficSourceId")(`requestMetadata.trafficSource.trafficSourceId`.asInstanceOf[js.Any])
    if (`requestMetadata.trafficSource.trafficSubId` != null) __obj.updateDynamic("requestMetadata.trafficSource.trafficSubId")(`requestMetadata.trafficSource.trafficSubId`.asInstanceOf[js.Any])
    if (`requestMetadata.userOverrides.ipAddress` != null) __obj.updateDynamic("requestMetadata.userOverrides.ipAddress")(`requestMetadata.userOverrides.ipAddress`.asInstanceOf[js.Any])
    if (`requestMetadata.userOverrides.userId` != null) __obj.updateDynamic("requestMetadata.userOverrides.userId")(`requestMetadata.userOverrides.userId`.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccesstokenAltBearertokenCallbackFieldsKey]
  }
}

