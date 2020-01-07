package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A tool results execution ID.
    */
  var executionId: js.UndefOr[String] = js.native
  /**
    * Specify one or more PerfMetricType values such as CPU to filter the
    * result
    */
  var filter: js.UndefOr[js.Array[String]] = js.native
  /**
    * A tool results history ID.
    */
  var historyId: js.UndefOr[String] = js.native
  /**
    * The cloud project
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * A tool results step ID.
    */
  var stepId: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarList {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    executionId: String = null,
    fields: String = null,
    filter: js.Array[String] = null,
    historyId: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    projectId: String = null,
    quotaUser: String = null,
    stepId: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (executionId != null) __obj.updateDynamic("executionId")(executionId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (historyId != null) __obj.updateDynamic("historyId")(historyId.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (stepId != null) __obj.updateDynamic("stepId")(stepId.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarList]
  }
}

