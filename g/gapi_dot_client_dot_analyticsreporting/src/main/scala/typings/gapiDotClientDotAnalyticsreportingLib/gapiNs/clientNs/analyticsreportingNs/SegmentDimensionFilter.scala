package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentDimensionFilter extends js.Object {
  /** Should the match be case sensitive, ignored for `IN_LIST` operator. */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /** Name of the dimension for which the filter is being applied. */
  var dimensionName: js.UndefOr[java.lang.String] = js.undefined
  /** The list of expressions, only the first element is used for all operators */
  var expressions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Maximum comparison values for `BETWEEN` match type. */
  var maxComparisonValue: js.UndefOr[java.lang.String] = js.undefined
  /** Minimum comparison values for `BETWEEN` match type. */
  var minComparisonValue: js.UndefOr[java.lang.String] = js.undefined
  /** The operator to use to match the dimension with the expressions. */
  var operator: js.UndefOr[java.lang.String] = js.undefined
}

object SegmentDimensionFilter {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    dimensionName: java.lang.String = null,
    expressions: js.Array[java.lang.String] = null,
    maxComparisonValue: java.lang.String = null,
    minComparisonValue: java.lang.String = null,
    operator: java.lang.String = null
  ): SegmentDimensionFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName)
    if (expressions != null) __obj.updateDynamic("expressions")(expressions)
    if (maxComparisonValue != null) __obj.updateDynamic("maxComparisonValue")(maxComparisonValue)
    if (minComparisonValue != null) __obj.updateDynamic("minComparisonValue")(minComparisonValue)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    __obj.asInstanceOf[SegmentDimensionFilter]
  }
}

