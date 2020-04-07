package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsGroupstatsList extends StandardParameters {
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

object ParamsResourceProjectsGroupstatsList {
  @scala.inline
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alignment: String = null,
    alignmentTime: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    fields: String = null,
    groupId: js.Array[String] = null,
    key: String = null,
    oauth_token: String = null,
    order: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    projectName: String = null,
    quotaUser: String = null,
    serviceFilterDotresourceType: String = null,
    serviceFilterDotservice: String = null,
    serviceFilterDotversion: String = null,
    timeRangeDotperiod: String = null,
    timedCountDuration: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceProjectsGroupstatsList = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (alignmentTime != null) __obj.updateDynamic("alignmentTime")(alignmentTime.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (projectName != null) __obj.updateDynamic("projectName")(projectName.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (serviceFilterDotresourceType != null) __obj.updateDynamic("serviceFilter.resourceType")(serviceFilterDotresourceType.asInstanceOf[js.Any])
    if (serviceFilterDotservice != null) __obj.updateDynamic("serviceFilter.service")(serviceFilterDotservice.asInstanceOf[js.Any])
    if (serviceFilterDotversion != null) __obj.updateDynamic("serviceFilter.version")(serviceFilterDotversion.asInstanceOf[js.Any])
    if (timeRangeDotperiod != null) __obj.updateDynamic("timeRange.period")(timeRangeDotperiod.asInstanceOf[js.Any])
    if (timedCountDuration != null) __obj.updateDynamic("timedCountDuration")(timedCountDuration.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceProjectsGroupstatsList]
  }
}

