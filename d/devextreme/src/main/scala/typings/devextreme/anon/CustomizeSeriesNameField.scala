package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.PolarChartSeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomizeSeriesNameField extends js.Object {
  var customizeSeries: js.UndefOr[js.Function1[/* seriesName */ js.Any, PolarChartSeries]] = js.native
  var nameField: js.UndefOr[String] = js.native
}

object CustomizeSeriesNameField {
  @scala.inline
  def apply(): CustomizeSeriesNameField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomizeSeriesNameField]
  }
  @scala.inline
  implicit class CustomizeSeriesNameFieldOps[Self <: CustomizeSeriesNameField] (val x: Self) extends AnyVal {
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
    def setCustomizeSeries(value: /* seriesName */ js.Any => PolarChartSeries): Self = this.set("customizeSeries", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomizeSeries: Self = this.set("customizeSeries", js.undefined)
    @scala.inline
    def setNameField(value: String): Self = this.set("nameField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameField: Self = this.set("nameField", js.undefined)
  }
  
}

