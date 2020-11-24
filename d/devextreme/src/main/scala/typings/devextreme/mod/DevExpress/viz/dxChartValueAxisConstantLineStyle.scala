package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxChartValueAxisConstantLineStyle extends dxChartCommonAxisSettingsConstantLineStyle {
  
  /**
    * [descr:dxChart.Options.valueAxis.constantLineStyle.label]
    */
  @JSName("label")
  var label_dxChartValueAxisConstantLineStyle: js.UndefOr[dxChartValueAxisConstantLineStyleLabel] = js.native
}
object dxChartValueAxisConstantLineStyle {
  
  @scala.inline
  def apply(): dxChartValueAxisConstantLineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartValueAxisConstantLineStyle]
  }
  
  @scala.inline
  implicit class dxChartValueAxisConstantLineStyleOps[Self <: dxChartValueAxisConstantLineStyle] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: dxChartValueAxisConstantLineStyleLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
