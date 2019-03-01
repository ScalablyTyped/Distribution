package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionFilter extends js.Object {
  /** Should the match be case sensitive? Default is false. */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /** The dimension to filter on. A DimensionFilter must contain a dimension. */
  var dimensionName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Strings or regular expression to match against. Only the first value of
    * the list is used for comparison unless the operator is `IN_LIST`.
    * If `IN_LIST` operator, then the entire list is used to filter the
    * dimensions as explained in the description of the `IN_LIST` operator.
    */
  var expressions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Logical `NOT` operator. If this boolean is set to true, then the matching
    * dimension values will be excluded in the report. The default is false.
    */
  var not: js.UndefOr[scala.Boolean] = js.undefined
  /** How to match the dimension to the expression. The default is REGEXP. */
  var operator: js.UndefOr[java.lang.String] = js.undefined
}

object DimensionFilter {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    dimensionName: java.lang.String = null,
    expressions: js.Array[java.lang.String] = null,
    not: js.UndefOr[scala.Boolean] = js.undefined,
    operator: java.lang.String = null
  ): DimensionFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName)
    if (expressions != null) __obj.updateDynamic("expressions")(expressions)
    if (!js.isUndefined(not)) __obj.updateDynamic("not")(not)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    __obj.asInstanceOf[DimensionFilter]
  }
}

