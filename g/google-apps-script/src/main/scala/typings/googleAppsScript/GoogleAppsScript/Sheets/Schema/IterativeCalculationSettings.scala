package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IterativeCalculationSettings extends js.Object {
  var convergenceThreshold: js.UndefOr[Double] = js.native
  var maxIterations: js.UndefOr[Double] = js.native
}

object IterativeCalculationSettings {
  @scala.inline
  def apply(): IterativeCalculationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IterativeCalculationSettings]
  }
  @scala.inline
  implicit class IterativeCalculationSettingsOps[Self <: IterativeCalculationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConvergenceThreshold(value: Double): Self = this.set("convergenceThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConvergenceThreshold: Self = this.set("convergenceThreshold", js.undefined)
    @scala.inline
    def setMaxIterations(value: Double): Self = this.set("maxIterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxIterations: Self = this.set("maxIterations", js.undefined)
  }
  
}

