package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.ChartSeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomizeSeries extends js.Object {
  var customizeSeries: js.UndefOr[js.Function1[/* seriesName */ js.Any, ChartSeries]] = js.native
  var nameField: js.UndefOr[String] = js.native
}

object CustomizeSeries {
  @scala.inline
  def apply(): CustomizeSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomizeSeries]
  }
  @scala.inline
  implicit class CustomizeSeriesOps[Self <: CustomizeSeries] (val x: Self) extends AnyVal {
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
    def setCustomizeSeries(value: /* seriesName */ js.Any => ChartSeries): Self = this.set("customizeSeries", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomizeSeries: Self = this.set("customizeSeries", js.undefined)
    @scala.inline
    def setNameField(value: String): Self = this.set("nameField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameField: Self = this.set("nameField", js.undefined)
  }
  
}

