package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterativeCalculationSetting extends js.Object {
  var convergenceThreshold: Double
  var maxIterations: Double
}

object IterativeCalculationSetting {
  @scala.inline
  def apply(convergenceThreshold: Double, maxIterations: Double): IterativeCalculationSetting = {
    val __obj = js.Dynamic.literal(convergenceThreshold = convergenceThreshold.asInstanceOf[js.Any], maxIterations = maxIterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterativeCalculationSetting]
  }
}

