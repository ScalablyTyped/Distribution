package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalUrlDestinationDetails extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var firstStepRequired: js.UndefOr[Boolean] = js.undefined
  var matchType: js.UndefOr[String] = js.undefined
  var steps: js.UndefOr[js.Array[GoalUrlDestinationDetailsSteps]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object GoalUrlDestinationDetails {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    firstStepRequired: js.UndefOr[Boolean] = js.undefined,
    matchType: String = null,
    steps: js.Array[GoalUrlDestinationDetailsSteps] = null,
    url: String = null
  ): GoalUrlDestinationDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstStepRequired)) __obj.updateDynamic("firstStepRequired")(firstStepRequired.get.asInstanceOf[js.Any])
    if (matchType != null) __obj.updateDynamic("matchType")(matchType.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoalUrlDestinationDetails]
  }
}

