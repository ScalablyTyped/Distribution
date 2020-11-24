package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz.PieChartSeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameField extends js.Object {
  
  var customizeSeries: js.UndefOr[js.Function1[/* seriesName */ js.Any, PieChartSeries]] = js.native
  
  var nameField: js.UndefOr[String] = js.native
}
object NameField {
  
  @scala.inline
  def apply(): NameField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameField]
  }
  
  @scala.inline
  implicit class NameFieldOps[Self <: NameField] (val x: Self) extends AnyVal {
    
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
    def setCustomizeSeries(value: /* seriesName */ js.Any => PieChartSeries): Self = this.set("customizeSeries", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeSeries: Self = this.set("customizeSeries", js.undefined)
    
    @scala.inline
    def setNameField(value: String): Self = this.set("nameField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameField: Self = this.set("nameField", js.undefined)
  }
}
