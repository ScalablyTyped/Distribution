package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaseSensitiveFirstStepRequired extends js.Object {
  /** Determines if the goal URL must exactly match the capitalization of visited URLs. */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /** Determines if the first step in this goal is required. */
  var firstStepRequired: js.UndefOr[scala.Boolean] = js.undefined
  /** Match type for the goal URL. Possible values are HEAD, EXACT, or REGEX. */
  var matchType: js.UndefOr[java.lang.String] = js.undefined
  /** List of steps configured for this goal funnel. */
  var steps: js.UndefOr[js.Array[Anon_NameNumber]] = js.undefined
  /** URL for this goal. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CaseSensitiveFirstStepRequired {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    firstStepRequired: js.UndefOr[scala.Boolean] = js.undefined,
    matchType: java.lang.String = null,
    steps: js.Array[Anon_NameNumber] = null,
    url: java.lang.String = null
  ): Anon_CaseSensitiveFirstStepRequired = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (!js.isUndefined(firstStepRequired)) __obj.updateDynamic("firstStepRequired")(firstStepRequired)
    if (matchType != null) __obj.updateDynamic("matchType")(matchType)
    if (steps != null) __obj.updateDynamic("steps")(steps)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_CaseSensitiveFirstStepRequired]
  }
}

