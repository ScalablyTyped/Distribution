package typings.gapiDotClientDotYoutubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccesstokenAlt extends js.Object {
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
  /** If set, only reports created after the specified date/time are returned. */
  var createdAfter: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** The ID of the job. */
  var jobId: String
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /**
    * The content owner's external ID on which behalf the user is acting on. If
    * not set, the user is acting for themselves (their own channel).
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
  /**
    * Requested page size. Server may return fewer report types than requested.
    * If unspecified, server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * A token identifying a page of results the server should return. Typically,
    * this is the value of
    * ListReportsResponse.next_page_token
    * returned in response to the previous call to the `ListReports` method.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * If set, only reports whose start time is greater than or equal the
    * specified date/time are returned.
    */
  var startTimeAtOrAfter: js.UndefOr[String] = js.undefined
  /**
    * If set, only reports whose start time is smaller than the specified
    * date/time are returned.
    */
  var startTimeBefore: js.UndefOr[String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
}

object Anon_AccesstokenAlt {
  @scala.inline
  def apply(
    jobId: String,
    `$.xgafv`: String = null,
    access_token: String = null,
    alt: String = null,
    bearer_token: String = null,
    callback: String = null,
    createdAfter: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    onBehalfOfContentOwner: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    pp: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    startTimeAtOrAfter: String = null,
    startTimeBefore: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): Anon_AccesstokenAlt = {
    val __obj = js.Dynamic.literal(jobId = jobId)
    if (`$.xgafv` != null) __obj.updateDynamic("$.xgafv")(`$.xgafv`)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (createdAfter != null) __obj.updateDynamic("createdAfter")(createdAfter)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (onBehalfOfContentOwner != null) __obj.updateDynamic("onBehalfOfContentOwner")(onBehalfOfContentOwner)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (startTimeAtOrAfter != null) __obj.updateDynamic("startTimeAtOrAfter")(startTimeAtOrAfter)
    if (startTimeBefore != null) __obj.updateDynamic("startTimeBefore")(startTimeBefore)
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType)
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol)
    __obj.asInstanceOf[Anon_AccesstokenAlt]
  }
}

