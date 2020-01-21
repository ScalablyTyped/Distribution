package typings.gapiClientPrediction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCountMean extends js.Object {
  /** Number of numeric output values in the data set. */
  var count: js.UndefOr[String] = js.undefined
  /** Mean of the output values in the data set. */
  var mean: js.UndefOr[String] = js.undefined
  /** Variance of the output values in the data set. */
  var variance: js.UndefOr[String] = js.undefined
}

object AnonCountMean {
  @scala.inline
  def apply(count: String = null, mean: String = null, variance: String = null): AnonCountMean = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (mean != null) __obj.updateDynamic("mean")(mean.asInstanceOf[js.Any])
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCountMean]
  }
}

