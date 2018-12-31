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

