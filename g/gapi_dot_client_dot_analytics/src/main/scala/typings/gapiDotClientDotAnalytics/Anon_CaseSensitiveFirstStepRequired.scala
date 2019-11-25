package typings.gapiDotClientDotAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaseSensitiveFirstStepRequired extends js.Object {
  /** Determines if the goal URL must exactly match the capitalization of visited URLs. */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /** Determines if the first step in this goal is required. */
  var firstStepRequired: js.UndefOr[Boolean] = js.undefined
  /** Match type for the goal URL. Possible values are HEAD, EXACT, or REGEX. */
  var matchType: js.UndefOr[String] = js.undefined
  /** List of steps configured for this goal funnel. */
  var steps: js.UndefOr[js.Array[Anon_NameNumber]] = js.undefined
  /** URL for this goal. */
  var url: js.UndefOr[String] = js.undefined
}

object Anon_CaseSensitiveFirstStepRequired {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    firstStepRequired: js.UndefOr[Boolean] = js.undefined,
    matchType: String = null,
    steps: js.Array[Anon_NameNumber] = null,
    url: String = null
  ): Anon_CaseSensitiveFirstStepRequired = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(firstStepRequired)) __obj.updateDynamic("firstStepRequired")(firstStepRequired.asInstanceOf[js.Any])
    if (matchType != null) __obj.updateDynamic("matchType")(matchType.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CaseSensitiveFirstStepRequired]
  }
}

