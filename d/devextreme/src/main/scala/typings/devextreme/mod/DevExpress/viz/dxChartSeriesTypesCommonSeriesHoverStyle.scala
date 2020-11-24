package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:dxChartSeriesTypes.CommonSeries.hoverStyle]
  */
@js.native
trait dxChartSeriesTypesCommonSeriesHoverStyle extends js.Object {
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.hoverStyle.border]
    */
  var border: js.UndefOr[dxChartSeriesTypesCommonSeriesHoverStyleBorder] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.hoverStyle.color]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.hoverStyle.dashStyle]
    */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.hoverStyle.hatching]
    */
  var hatching: js.UndefOr[dxChartSeriesTypesCommonSeriesHoverStyleHatching] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.hoverStyle.width]
    */
  var width: js.UndefOr[Double] = js.native
}
object dxChartSeriesTypesCommonSeriesHoverStyle {
  
  @scala.inline
  def apply(): dxChartSeriesTypesCommonSeriesHoverStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesHoverStyle]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesCommonSeriesHoverStyleOps[Self <: dxChartSeriesTypesCommonSeriesHoverStyle] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: dxChartSeriesTypesCommonSeriesHoverStyleBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDashStyle(value: dash | dot | longDash | solid): Self = this.set("dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashStyle: Self = this.set("dashStyle", js.undefined)
    
    @scala.inline
    def setHatching(value: dxChartSeriesTypesCommonSeriesHoverStyleHatching): Self = this.set("hatching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHatching: Self = this.set("hatching", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
