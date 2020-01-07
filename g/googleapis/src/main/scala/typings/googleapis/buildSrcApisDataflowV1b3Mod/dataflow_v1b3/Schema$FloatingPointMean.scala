package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a floating point mean metric contribution.
  */
@js.native
trait Schema$FloatingPointMean extends js.Object {
  /**
    * The number of values being aggregated.
    */
  var count: js.UndefOr[Schema$SplitInt64] = js.native
  /**
    * The sum of all values being aggregated.
    */
  var sum: js.UndefOr[Double] = js.native
}

object Schema$FloatingPointMean {
  @scala.inline
  def apply(count: Schema$SplitInt64 = null, sum: Int | Double = null): Schema$FloatingPointMean = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FloatingPointMean]
  }
}

