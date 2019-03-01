package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterativeCalculationSettings extends js.Object {
  /**
    * When iterative calculation is enabled and successive results differ by
    * less than this threshold value, the calculation rounds stop.
    */
  var convergenceThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * When iterative calculation is enabled, the maximum number of calculation
    * rounds to perform.
    */
  var maxIterations: js.UndefOr[scala.Double] = js.undefined
}

object IterativeCalculationSettings {
  @scala.inline
  def apply(
    convergenceThreshold: scala.Int | scala.Double = null,
    maxIterations: scala.Int | scala.Double = null
  ): IterativeCalculationSettings = {
    val __obj = js.Dynamic.literal()
    if (convergenceThreshold != null) __obj.updateDynamic("convergenceThreshold")(convergenceThreshold.asInstanceOf[js.Any])
    if (maxIterations != null) __obj.updateDynamic("maxIterations")(maxIterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterativeCalculationSettings]
  }
}

