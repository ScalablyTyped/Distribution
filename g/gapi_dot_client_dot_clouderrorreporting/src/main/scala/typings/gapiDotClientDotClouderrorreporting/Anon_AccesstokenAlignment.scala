package typings.gapiDotClientDotClouderrorreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccesstokenAlignment extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  /**
    * [Optional] The alignment of the timed counts to be returned.
    * Default is `ALIGNMENT_EQUAL_AT_END`.
    */
  var alignment: js.UndefOr[String] = js.undefined
  /**
    * [Optional] Time where the timed counts shall be aligned if rounded
    * alignment is chosen. Default is 00:00 UTC.
    */
  var alignmentTime: js.UndefOr[String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** [Optional] List all <code>ErrorGroupStats</code> with these IDs. */
  var groupId: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /**
    * [Optional] The sort order in which the results are returned.
    * Default is `COUNT_DESC`.
    */
  var order: js.UndefOr[String] = js.undefined
  /**
    * [Optional] The maximum number of results to return per response.
    * Default is 20.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * [Optional] A `next_page_token` provided by a previous response. To view
    * additional results, pass this token along with the identical query
    * parameters as the first request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * [Required] The resource name of the Google Cloud Platform project. Written
    * as <code>projects/</code> plus the
    * <a href="https://support.google.com/cloud/answer/6158840">Google Cloud
    * Platform project ID</a>.
    *
    * Example: <code>projects/my-project-123</code>.
    */
  var projectName: String
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * [Optional] The exact value to match against
    * [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
    */
  var `serviceFilter.resourceType`: js.UndefOr[String] = js.undefined
  /**
    * [Optional] The exact value to match against
    * [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
    */
  var `serviceFilter.service`: js.UndefOr[String] = js.undefined
  /**
    * [Optional] The exact value to match against
    * [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
    */
  var `serviceFilter.version`: js.UndefOr[String] = js.undefined
  /** Restricts the query to the specified time range. */
  var `timeRange.period`: js.UndefOr[String] = js.undefined
  /**
    * [Optional] The preferred duration for a single returned `TimedCount`.
    * If not set, no timed counts are returned.
    */
  var timedCountDuration: js.UndefOr[String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
}

object Anon_AccesstokenAlignment {
  @scala.inline
  def apply(
    projectName: String,
    `$.xgafv`: String = null,
    access_token: String = null,
    alignment: String = null,
    alignmentTime: String = null,
    alt: String = null,
    bearer_token: String = null,
    callback: String = null,
    fields: String = null,
    groupId: String = null,
    key: String = null,
    oauth_token: String = null,
    order: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    pp: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    `serviceFilter.resourceType`: String = null,
    `serviceFilter.service`: String = null,
    `serviceFilter.version`: String = null,
    `timeRange.period`: String = null,
    timedCountDuration: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): Anon_AccesstokenAlignment = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
    if (`$.xgafv` != null) __obj.updateDynamic("$.xgafv")(`$.xgafv`.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (alignmentTime != null) __obj.updateDynamic("alignmentTime")(alignmentTime.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (`serviceFilter.resourceType` != null) __obj.updateDynamic("serviceFilter.resourceType")(`serviceFilter.resourceType`.asInstanceOf[js.Any])
    if (`serviceFilter.service` != null) __obj.updateDynamic("serviceFilter.service")(`serviceFilter.service`.asInstanceOf[js.Any])
    if (`serviceFilter.version` != null) __obj.updateDynamic("serviceFilter.version")(`serviceFilter.version`.asInstanceOf[js.Any])
    if (`timeRange.period` != null) __obj.updateDynamic("timeRange.period")(`timeRange.period`.asInstanceOf[js.Any])
    if (timedCountDuration != null) __obj.updateDynamic("timedCountDuration")(timedCountDuration.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccesstokenAlignment]
  }
}

