package typings
package gapiDotClientDotClouderrorreportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccesstokenAlignment extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Optional] The alignment of the timed counts to be returned.
    * Default is `ALIGNMENT_EQUAL_AT_END`.
    */
  var alignment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Optional] Time where the timed counts shall be aligned if rounded
    * alignment is chosen. Default is 00:00 UTC.
    */
  var alignmentTime: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** [Optional] List all <code>ErrorGroupStats</code> with these IDs. */
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Optional] The sort order in which the results are returned.
    * Default is `COUNT_DESC`.
    */
  var order: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Optional] The maximum number of results to return per response.
    * Default is 20.
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * [Optional] A `next_page_token` provided by a previous response. To view
    * additional results, pass this token along with the identical query
    * parameters as the first request.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * [Required] The resource name of the Google Cloud Platform project. Written
    * as <code>projects/</code> plus the
    * <a href="https://support.google.com/cloud/answer/6158840">Google Cloud
    * Platform project ID</a>.
    *
    * Example: <code>projects/my-project-123</code>.
    */
  var projectName: java.lang.String
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Optional] The exact value to match against
    * [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
    */
  var `serviceFilter.resourceType`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Optional] The exact value to match against
    * [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
    */
  var `serviceFilter.service`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Optional] The exact value to match against
    * [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
    */
  var `serviceFilter.version`: js.UndefOr[java.lang.String] = js.undefined
  /** Restricts the query to the specified time range. */
  var `timeRange.period`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Optional] The preferred duration for a single returned `TimedCount`.
    * If not set, no timed counts are returned.
    */
  var timedCountDuration: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AccesstokenAlignment {
  @scala.inline
  def apply(
    projectName: java.lang.String,
    `$.xgafv`: java.lang.String = null,
    access_token: java.lang.String = null,
    alignment: java.lang.String = null,
    alignmentTime: java.lang.String = null,
    alt: java.lang.String = null,
    bearer_token: java.lang.String = null,
    callback: java.lang.String = null,
    fields: java.lang.String = null,
    groupId: java.lang.String = null,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    order: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null,
    pp: js.UndefOr[scala.Boolean] = js.undefined,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    `serviceFilter.resourceType`: java.lang.String = null,
    `serviceFilter.service`: java.lang.String = null,
    `serviceFilter.version`: java.lang.String = null,
    `timeRange.period`: java.lang.String = null,
    timedCountDuration: java.lang.String = null,
    uploadType: java.lang.String = null,
    upload_protocol: java.lang.String = null
  ): Anon_AccesstokenAlignment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("projectName")(projectName)
    if (`$.xgafv` != null) __obj.updateDynamic("$.xgafv")(`$.xgafv`)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (alignmentTime != null) __obj.updateDynamic("alignmentTime")(alignmentTime)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (order != null) __obj.updateDynamic("order")(order)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (`serviceFilter.resourceType` != null) __obj.updateDynamic("serviceFilter.resourceType")(`serviceFilter.resourceType`)
    if (`serviceFilter.service` != null) __obj.updateDynamic("serviceFilter.service")(`serviceFilter.service`)
    if (`serviceFilter.version` != null) __obj.updateDynamic("serviceFilter.version")(`serviceFilter.version`)
    if (`timeRange.period` != null) __obj.updateDynamic("timeRange.period")(`timeRange.period`)
    if (timedCountDuration != null) __obj.updateDynamic("timedCountDuration")(timedCountDuration)
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType)
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol)
    __obj.asInstanceOf[Anon_AccesstokenAlignment]
  }
}

