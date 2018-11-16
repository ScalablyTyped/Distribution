package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DistributionUpdate extends js.Object {
  /** The count of the number of elements present in the distribution. */
  var count: js.UndefOr[SplitInt64] = js.undefined
  /** (Optional) Histogram of value counts for the distribution. */
  var histogram: js.UndefOr[Histogram] = js.undefined
  /** The maximum value present in the distribution. */
  var max: js.UndefOr[SplitInt64] = js.undefined
  /** The minimum value present in the distribution. */
  var min: js.UndefOr[SplitInt64] = js.undefined
  /**
               * Use an int64 since we'd prefer the added precision. If overflow is a common
               * problem we can detect it and use an additional int64 or a double.
               */
  var sum: js.UndefOr[SplitInt64] = js.undefined
  /** Use a double since the sum of squares is likely to overflow int64. */
  var sumOfSquares: js.UndefOr[scala.Double] = js.undefined
}

