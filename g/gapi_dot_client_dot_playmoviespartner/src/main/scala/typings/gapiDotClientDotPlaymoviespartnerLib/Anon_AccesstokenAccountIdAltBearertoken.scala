package typings
package gapiDotClientDotPlaymoviespartnerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccesstokenAccountIdAltBearertoken extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /** REQUIRED. See _General rules_ for more information about this field. */
  var accountId: java.lang.String
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /** Filter Orders that match a case-insensitive, partner-specific custom id. */
  var customId: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Filter that matches Orders with a `name`, `show`, `season` or `episode`
    * that contains the given case-insensitive name.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** See _List methods rules_ for info about this field. */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /** See _List methods rules_ for info about this field. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** See _List methods rules_ for info about this field. */
  var pphNames: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Filter Orders that match one of the given status. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** See _List methods rules_ for info about this field. */
  var studioNames: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
  /** Filter Orders that match any of the given `video_id`s. */
  var videoIds: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AccesstokenAccountIdAltBearertoken {
  @scala.inline
  def apply(
    accountId: java.lang.String,
    `$.xgafv`: java.lang.String = null,
    access_token: java.lang.String = null,
    alt: java.lang.String = null,
    bearer_token: java.lang.String = null,
    callback: java.lang.String = null,
    customId: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    name: java.lang.String = null,
    oauth_token: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null,
    pp: js.UndefOr[scala.Boolean] = js.undefined,
    pphNames: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    status: java.lang.String = null,
    studioNames: java.lang.String = null,
    uploadType: java.lang.String = null,
    upload_protocol: java.lang.String = null,
    videoIds: java.lang.String = null
  ): Anon_AccesstokenAccountIdAltBearertoken = {
    val __obj = js.Dynamic.literal(accountId = accountId)
    if (`$.xgafv` != null) __obj.updateDynamic("$.xgafv")(`$.xgafv`)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (customId != null) __obj.updateDynamic("customId")(customId)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (name != null) __obj.updateDynamic("name")(name)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp)
    if (pphNames != null) __obj.updateDynamic("pphNames")(pphNames)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (status != null) __obj.updateDynamic("status")(status)
    if (studioNames != null) __obj.updateDynamic("studioNames")(studioNames)
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType)
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol)
    if (videoIds != null) __obj.updateDynamic("videoIds")(videoIds)
    __obj.asInstanceOf[Anon_AccesstokenAccountIdAltBearertoken]
  }
}

