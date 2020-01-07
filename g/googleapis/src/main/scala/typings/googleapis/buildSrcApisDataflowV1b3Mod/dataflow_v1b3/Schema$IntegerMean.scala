package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an integer mean metric contribution.
  */
@js.native
trait Schema$IntegerMean extends js.Object {
  /**
    * The number of values being aggregated.
    */
  var count: js.UndefOr[Schema$SplitInt64] = js.native
  /**
    * The sum of all values being aggregated.
    */
  var sum: js.UndefOr[Schema$SplitInt64] = js.native
}

object Schema$IntegerMean {
  @scala.inline
  def apply(count: Schema$SplitInt64 = null, sum: Schema$SplitInt64 = null): Schema$IntegerMean = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IntegerMean]
  }
}

