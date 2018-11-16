package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_UrlFirstStepRequired extends js.Object {
  /** Determines if the goal URL must exactly match the capitalization of visited URLs. */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /** Determines if the first step in this goal is required. */
  var firstStepRequired: js.UndefOr[scala.Boolean] = js.undefined
  /** Match type for the goal URL. Possible values are HEAD, EXACT, or REGEX. */
  var matchType: js.UndefOr[java.lang.String] = js.undefined
  /** List of steps configured for this goal funnel. */
  var steps: js.UndefOr[js.Array[Anon_Url]] = js.undefined
  /** URL for this goal. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

