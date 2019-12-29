package typings.gapiDotClientDotClouderrorreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AccesstokenAlignment extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /**
    * [Optional] The alignment of the timed counts to be returned.
    * Default is `ALIGNMENT_EQUAL_AT_END`.
    */
  var alignment: js.UndefOr[String] = js.native
  /**
    * [Optional] Time where the timed counts shall be aligned if rounded
    * alignment is chosen. Default is 00:00 UTC.
    */
  var alignmentTime: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** [Optional] List all <code>ErrorGroupStats</code> with these IDs. */
  var groupId: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * [Optional] The sort order in which the results are returned.
    * Default is `COUNT_DESC`.
    */
  var order: js.UndefOr[String] = js.native
  /**
    * [Optional] The maximum number of results to return per response.
    * Default is 20.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * [Optional] A `next_page_token` provided by a previous response. To view
    * additional results, pass this token along with the identical query
    * parameters as the first request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * [Required] The resource name of the Google Cloud Platform project. Written
    * as <code>projects/</code> plus the
    * <a href="https://support.google.com/cloud/answer/6158840">Google Cloud
    * Platform project ID</a>.
    *
    * Example: <code>projects/my-project-123</code>.
    */
  var projectName: String = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * [Optional] The exact value to match against
    * [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
    */
  @JSName("serviceFilter.resourceType")
  var serviceFilterDotresourceType: js.UndefOr[String] = js.native
  /**
    * [Optional] The exact value to match against
    * [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
    */
  @JSName("serviceFilter.service")
  var serviceFilterDotservice: js.UndefOr[String] = js.native
  /**
    * [Optional] The exact value to match against
    * [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
    */
  @JSName("serviceFilter.version")
  var serviceFilterDotversion: js.UndefOr[String] = js.native
  /** Restricts the query to the specified time range. */
  @JSName("timeRange.period")
  var timeRangeDotperiod: js.UndefOr[String] = js.native
  /**
    * [Optional] The preferred duration for a single returned `TimedCount`.
    * If not set, no timed counts are returned.
    */
  var timedCountDuration: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

