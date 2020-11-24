package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorVisible
import typings.devextreme.anon.HeightUrl
import typings.devextreme.anon.Size
import typings.devextreme.devextremeStrings.allArgumentPoints
import typings.devextreme.devextremeStrings.allSeriesPoints
import typings.devextreme.devextremeStrings.circle
import typings.devextreme.devextremeStrings.cross
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.onlyPoint
import typings.devextreme.devextremeStrings.polygon
import typings.devextreme.devextremeStrings.square
import typings.devextreme.devextremeStrings.triangleDown
import typings.devextreme.devextremeStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:dxChartSeriesTypes.CommonSeries.point]
  */
@js.native
trait dxChartSeriesTypesCommonSeriesPoint extends js.Object {
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.point.border]
    */
  var border: js.UndefOr[ColorVisible] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.point.color]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.point.hoverMode]
    */
  var hoverMode: js.UndefOr[allArgumentPoints | allSeriesPoints | none | onlyPoint] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.point.hoverStyle]
    */
  var hoverStyle: js.UndefOr[Size] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.point.image]
    */
  var image: js.UndefOr[String | HeightUrl] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.point.selectionMode]
    */
  var selectionMode: js.UndefOr[allArgumentPoints | allSeriesPoints | none | onlyPoint] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.point.selectionStyle]
    */
  var selectionStyle: js.UndefOr[Size] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.point.size]
    */
  var size: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.point.symbol]
    */
  var symbol: js.UndefOr[circle | cross | polygon | square | triangleDown | triangleUp] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries.point.visible]
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object dxChartSeriesTypesCommonSeriesPoint {
  
  @scala.inline
  def apply(): dxChartSeriesTypesCommonSeriesPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesPoint]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesCommonSeriesPointOps[Self <: dxChartSeriesTypesCommonSeriesPoint] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: ColorVisible): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setHoverMode(value: allArgumentPoints | allSeriesPoints | none | onlyPoint): Self = this.set("hoverMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverMode: Self = this.set("hoverMode", js.undefined)
    
    @scala.inline
    def setHoverStyle(value: Size): Self = this.set("hoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverStyle: Self = this.set("hoverStyle", js.undefined)
    
    @scala.inline
    def setImage(value: String | HeightUrl): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: allArgumentPoints | allSeriesPoints | none | onlyPoint): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    
    @scala.inline
    def setSelectionStyle(value: Size): Self = this.set("selectionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionStyle: Self = this.set("selectionStyle", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSymbol(value: circle | cross | polygon | square | triangleDown | triangleUp): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
