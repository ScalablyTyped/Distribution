package typings
package gapiDotClientDotPredictionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountMean extends js.Object {
  /** Number of numeric output values in the data set. */
  var count: js.UndefOr[java.lang.String] = js.undefined
  /** Mean of the output values in the data set. */
  var mean: js.UndefOr[java.lang.String] = js.undefined
  /** Variance of the output values in the data set. */
  var variance: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CountMean {
  @scala.inline
  def apply(count: java.lang.String = null, mean: java.lang.String = null, variance: java.lang.String = null): Anon_CountMean = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count)
    if (mean != null) __obj.updateDynamic("mean")(mean)
    if (variance != null) __obj.updateDynamic("variance")(variance)
    __obj.asInstanceOf[Anon_CountMean]
  }
}

