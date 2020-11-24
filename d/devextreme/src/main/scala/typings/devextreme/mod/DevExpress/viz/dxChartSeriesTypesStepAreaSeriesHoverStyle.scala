package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:dxChartSeriesTypes.StepAreaSeries.hoverStyle]
  */
@js.native
trait dxChartSeriesTypesStepAreaSeriesHoverStyle extends dxChartSeriesTypesCommonSeriesHoverStyle {
  
  /**
    * [descr:dxChartSeriesTypes.StepAreaSeries.hoverStyle.border]
    */
  @JSName("border")
  var border_dxChartSeriesTypesStepAreaSeriesHoverStyle: js.UndefOr[dxChartSeriesTypesStepAreaSeriesHoverStyleBorder] = js.native
}
object dxChartSeriesTypesStepAreaSeriesHoverStyle {
  
  @scala.inline
  def apply(): dxChartSeriesTypesStepAreaSeriesHoverStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesStepAreaSeriesHoverStyle]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesStepAreaSeriesHoverStyleOps[Self <: dxChartSeriesTypesStepAreaSeriesHoverStyle] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: dxChartSeriesTypesStepAreaSeriesHoverStyleBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
  }
}
