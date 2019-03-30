package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalUrlDestinationDetails extends js.Object {
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  var firstStepRequired: js.UndefOr[scala.Boolean] = js.undefined
  var matchType: js.UndefOr[java.lang.String] = js.undefined
  var steps: js.UndefOr[js.Array[GoalUrlDestinationDetailsSteps]] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object GoalUrlDestinationDetails {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    firstStepRequired: js.UndefOr[scala.Boolean] = js.undefined,
    matchType: java.lang.String = null,
    steps: js.Array[GoalUrlDestinationDetailsSteps] = null,
    url: java.lang.String = null
  ): GoalUrlDestinationDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (!js.isUndefined(firstStepRequired)) __obj.updateDynamic("firstStepRequired")(firstStepRequired)
    if (matchType != null) __obj.updateDynamic("matchType")(matchType)
    if (steps != null) __obj.updateDynamic("steps")(steps)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GoalUrlDestinationDetails]
  }
}

