package typings.googleapis.buildSrcApisClouderrorreportingV1beta1Mod.clouderrorreporting_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarGroupstatsDollarList extends StandardParameters {
  /**
    * [Optional] The alignment of the timed counts to be returned. Default is
    * `ALIGNMENT_EQUAL_AT_END`.
    */
  var alignment: js.UndefOr[String] = js.native
  /**
    * [Optional] Time where the timed counts shall be aligned if rounded
    * alignment is chosen. Default is 00:00 UTC.
    */
  var alignmentTime: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * [Optional] List all <code>ErrorGroupStats</code> with these IDs.
    */
  var groupId: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Optional] The sort order in which the results are returned. Default is
    * `COUNT_DESC`.
    */
  var order: js.UndefOr[String] = js.native
  /**
    * [Optional] The maximum number of results to return per response. Default
    * is 20.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * [Optional] A `next_page_token` provided by a previous response. To view
    * additional results, pass this token along with the identical query
    * parameters as the first request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * [Required] The resource name of the Google Cloud Platform project.
    * Written as <code>projects/</code> plus the <a
    * href="https://support.google.com/cloud/answer/6158840">Google Cloud
    * Platform project ID</a>.  Example: <code>projects/my-project-123</code>.
    */
  var projectName: js.UndefOr[String] = js.native
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
  /**
    * Restricts the query to the specified time range.
    */
  @JSName("timeRange.period")
  var timeRangeDotperiod: js.UndefOr[String] = js.native
  /**
    * [Optional] The preferred duration for a single returned `TimedCount`. If
    * not set, no timed counts are returned.
    */
  var timedCountDuration: js.UndefOr[String] = js.native
}

