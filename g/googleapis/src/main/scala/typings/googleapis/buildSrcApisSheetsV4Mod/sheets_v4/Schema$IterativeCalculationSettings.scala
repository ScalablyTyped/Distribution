package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings to control how circular dependencies are resolved with iterative
  * calculation.
  */
@js.native
trait Schema$IterativeCalculationSettings extends js.Object {
  /**
    * When iterative calculation is enabled and successive results differ by
    * less than this threshold value, the calculation rounds stop.
    */
  var convergenceThreshold: js.UndefOr[Double] = js.native
  /**
    * When iterative calculation is enabled, the maximum number of calculation
    * rounds to perform.
    */
  var maxIterations: js.UndefOr[Double] = js.native
}

object Schema$IterativeCalculationSettings {
  @scala.inline
  def apply(convergenceThreshold: Int | Double = null, maxIterations: Int | Double = null): Schema$IterativeCalculationSettings = {
    val __obj = js.Dynamic.literal()
    if (convergenceThreshold != null) __obj.updateDynamic("convergenceThreshold")(convergenceThreshold.asInstanceOf[js.Any])
    if (maxIterations != null) __obj.updateDynamic("maxIterations")(maxIterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IterativeCalculationSettings]
  }
}

