package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterativeCalculationSettings extends js.Object {
  var convergenceThreshold: js.UndefOr[Double] = js.undefined
  var maxIterations: js.UndefOr[Double] = js.undefined
}

object IterativeCalculationSettings {
  @scala.inline
  def apply(convergenceThreshold: Int | Double = null, maxIterations: Int | Double = null): IterativeCalculationSettings = {
    val __obj = js.Dynamic.literal()
    if (convergenceThreshold != null) __obj.updateDynamic("convergenceThreshold")(convergenceThreshold.asInstanceOf[js.Any])
    if (maxIterations != null) __obj.updateDynamic("maxIterations")(maxIterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterativeCalculationSettings]
  }
}

