package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstStepRequired extends js.Object {
  /** Determines if the goal URL must exactly match the capitalization of visited URLs. */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /** Determines if the first step in this goal is required. */
  var firstStepRequired: js.UndefOr[Boolean] = js.undefined
  /** Match type for the goal URL. Possible values are HEAD, EXACT, or REGEX. */
  var matchType: js.UndefOr[String] = js.undefined
  /** List of steps configured for this goal funnel. */
  var steps: js.UndefOr[js.Array[Number]] = js.undefined
  /** URL for this goal. */
  var url: js.UndefOr[String] = js.undefined
}

object FirstStepRequired {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    firstStepRequired: js.UndefOr[Boolean] = js.undefined,
    matchType: String = null,
    steps: js.Array[Number] = null,
    url: String = null
  ): FirstStepRequired = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstStepRequired)) __obj.updateDynamic("firstStepRequired")(firstStepRequired.get.asInstanceOf[js.Any])
    if (matchType != null) __obj.updateDynamic("matchType")(matchType.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstStepRequired]
  }
}

