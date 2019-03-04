package typings
package gapiDotClientDotPartnersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Experiment IDs the current request belongs to. */
  var `requestMetadata.experimentIds`: js.UndefOr[java.lang.String] = js.undefined
  /** Locale to use for the current request. */
  var `requestMetadata.locale`: js.UndefOr[java.lang.String] = js.undefined
  /** Google Partners session ID. */
  var `requestMetadata.partnersSessionId`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  var `requestMetadata.trafficSource.trafficSourceId`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Second level identifier to indicate where the traffic comes from.
    * An identifier has multiple letters created by a team which redirected the
    * traffic to us.
    */
  var `requestMetadata.trafficSource.trafficSubId`: js.UndefOr[java.lang.String] = js.undefined
  /** IP address to use instead of the user's geo-located IP address. */
  var `requestMetadata.userOverrides.ipAddress`: js.UndefOr[java.lang.String] = js.undefined
  /** Logged-in user ID to impersonate instead of the user's ID. */
  var `requestMetadata.userOverrides.userId`: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifier of the user. Can be set to <code>me</code> to mean the currently
    * authenticated user.
    */
  var userId: java.lang.String
  /** Specifies what parts of the user information to return. */
  var userView: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken {
  @scala.inline
  def apply(
    userId: java.lang.String,
    `$.xgafv`: java.lang.String = null,
    access_token: java.lang.String = null,
    alt: java.lang.String = null,
    bearer_token: java.lang.String = null,
    callback: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    pp: js.UndefOr[scala.Boolean] = js.undefined,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    `requestMetadata.experimentIds`: java.lang.String = null,
    `requestMetadata.locale`: java.lang.String = null,
    `requestMetadata.partnersSessionId`: java.lang.String = null,
    `requestMetadata.trafficSource.trafficSourceId`: java.lang.String = null,
    `requestMetadata.trafficSource.trafficSubId`: java.lang.String = null,
    `requestMetadata.userOverrides.ipAddress`: java.lang.String = null,
    `requestMetadata.userOverrides.userId`: java.lang.String = null,
    uploadType: java.lang.String = null,
    upload_protocol: java.lang.String = null,
    userView: java.lang.String = null
  ): Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken = {
    val __obj = js.Dynamic.literal(userId = userId)
    if (`$.xgafv` != null) __obj.updateDynamic("$.xgafv")(`$.xgafv`)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (`requestMetadata.experimentIds` != null) __obj.updateDynamic("requestMetadata.experimentIds")(`requestMetadata.experimentIds`)
    if (`requestMetadata.locale` != null) __obj.updateDynamic("requestMetadata.locale")(`requestMetadata.locale`)
    if (`requestMetadata.partnersSessionId` != null) __obj.updateDynamic("requestMetadata.partnersSessionId")(`requestMetadata.partnersSessionId`)
    if (`requestMetadata.trafficSource.trafficSourceId` != null) __obj.updateDynamic("requestMetadata.trafficSource.trafficSourceId")(`requestMetadata.trafficSource.trafficSourceId`)
    if (`requestMetadata.trafficSource.trafficSubId` != null) __obj.updateDynamic("requestMetadata.trafficSource.trafficSubId")(`requestMetadata.trafficSource.trafficSubId`)
    if (`requestMetadata.userOverrides.ipAddress` != null) __obj.updateDynamic("requestMetadata.userOverrides.ipAddress")(`requestMetadata.userOverrides.ipAddress`)
    if (`requestMetadata.userOverrides.userId` != null) __obj.updateDynamic("requestMetadata.userOverrides.userId")(`requestMetadata.userOverrides.userId`)
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType)
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol)
    if (userView != null) __obj.updateDynamic("userView")(userView)
    __obj.asInstanceOf[Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken]
  }
}

