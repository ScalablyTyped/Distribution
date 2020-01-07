package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A metric value representing a distribution.
  */
@js.native
trait Schema$DistributionUpdate extends js.Object {
  /**
    * The count of the number of elements present in the distribution.
    */
  var count: js.UndefOr[Schema$SplitInt64] = js.native
  /**
    * (Optional) Histogram of value counts for the distribution.
    */
  var histogram: js.UndefOr[Schema$Histogram] = js.native
  /**
    * The maximum value present in the distribution.
    */
  var max: js.UndefOr[Schema$SplitInt64] = js.native
  /**
    * The minimum value present in the distribution.
    */
  var min: js.UndefOr[Schema$SplitInt64] = js.native
  /**
    * Use an int64 since we&#39;d prefer the added precision. If overflow is a
    * common problem we can detect it and use an additional int64 or a double.
    */
  var sum: js.UndefOr[Schema$SplitInt64] = js.native
  /**
    * Use a double since the sum of squares is likely to overflow int64.
    */
  var sumOfSquares: js.UndefOr[Double] = js.native
}

object Schema$DistributionUpdate {
  @scala.inline
  def apply(
    count: Schema$SplitInt64 = null,
    histogram: Schema$Histogram = null,
    max: Schema$SplitInt64 = null,
    min: Schema$SplitInt64 = null,
    sum: Schema$SplitInt64 = null,
    sumOfSquares: Int | Double = null
  ): Schema$DistributionUpdate = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (histogram != null) __obj.updateDynamic("histogram")(histogram.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(sum.asInstanceOf[js.Any])
    if (sumOfSquares != null) __obj.updateDynamic("sumOfSquares")(sumOfSquares.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DistributionUpdate]
  }
}

