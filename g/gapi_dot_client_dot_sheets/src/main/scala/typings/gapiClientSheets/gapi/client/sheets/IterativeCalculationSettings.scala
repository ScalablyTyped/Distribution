package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait IterativeCalculationSettings extends js.Object {
  /**
    * When iterative calculation is enabled and successive results differ by
    * less than this threshold value, the calculation rounds stop.
    */
  var convergenceThreshold: js.UndefOr[Double] = js.undefined
  /**
    * When iterative calculation is enabled, the maximum number of calculation
    * rounds to perform.
    */
  var maxIterations: js.UndefOr[Double] = js.undefined
}

object IterativeCalculationSettings {
  @scala.inline
  def apply(
    convergenceThreshold: js.UndefOr[Double] = js.undefined,
    maxIterations: js.UndefOr[Double] = js.undefined
  ): IterativeCalculationSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(convergenceThreshold)) __obj.updateDynamic("convergenceThreshold")(convergenceThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxIterations)) __obj.updateDynamic("maxIterations")(maxIterations.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterativeCalculationSettings]
  }
}

