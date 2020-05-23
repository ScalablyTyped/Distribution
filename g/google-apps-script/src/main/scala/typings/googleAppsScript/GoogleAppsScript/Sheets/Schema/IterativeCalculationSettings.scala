package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterativeCalculationSettings extends js.Object {
  var convergenceThreshold: js.UndefOr[Double] = js.undefined
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

