package typings.echarts.echarts.EChartOption.SeriesCustom

import typings.echarts.echartsStrings.calendar
import typings.echarts.echartsStrings.cartesian2d
import typings.echarts.echartsStrings.geo
import typings.echarts.echartsStrings.polar
import typings.echarts.echartsStrings.singleAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * coordSys is variable by different types of coordinate systems.
  */
@js.native
trait CoordSys extends js.Object {
  
  /**
    * calendar cellHeight
    *
    * It is valid when type is 'calendar'
    */
  var cellHeight: js.UndefOr[Double] = js.native
  
  // calendar cellWidth
  /**
    * calendar cellWidth
    *
    * It is valid when type is 'calendar'
    */
  var cellWidth: js.UndefOr[Double] = js.native
  
  /**
    * x of polar center.
    *
    * It is valid when type is 'polar'
    */
  var cx: js.UndefOr[Double] = js.native
  
  /**
    * y of polar center.
    *
    * It is valid when type is 'polar'
    */
  var cy: js.UndefOr[Double] = js.native
  
  /**
    * height of grid rect, calendar rect, geo rect or singleAxis rect
    *
    * It is not valid when type is 'polar'
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * outer radius of polar.
    *
    * It is valid when type is 'polar'
    */
  var r: js.UndefOr[Double] = js.native
  
  /**
    * inner radius of polar.
    *
    * It is valid when type is 'polar'
    */
  var r0: js.UndefOr[Double] = js.native
  
  /**
    * calendar rangeInfo
    *
    * It is valid when type is 'calendar'
    */
  var rangeInfo: js.UndefOr[RangeInfo] = js.native
  
  var `type`: js.UndefOr[cartesian2d | calendar | geo | polar | singleAxis] = js.native
  
  /**
    * width of grid rect, calendar rect, geo rect or singleAxis rect
    *
    * It is not valid when type is 'polar'
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * x of grid rect, calendar rect, geo rect or singleAxis rect
    *
    * It is not valid when type is 'polar'
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * y of grid rect, calendar rect, geo rect or singleAxis rect
    *
    * It is not valid when type is 'polar'
    */
  var y: js.UndefOr[Double] = js.native
  
  /**
    * zoom ratio, 1 if no zoom, 0.5 means shrink to 50%.
    *
    * It is valid when type is 'geo'
    */
  var zoom: js.UndefOr[Double] = js.native
}
object CoordSys {
  
  @scala.inline
  def apply(): CoordSys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoordSys]
  }
  
  @scala.inline
  implicit class CoordSysOps[Self <: CoordSys] (val x: Self) extends AnyVal {
    
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
    def setCellHeight(value: Double): Self = this.set("cellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellHeight: Self = this.set("cellHeight", js.undefined)
    
    @scala.inline
    def setCellWidth(value: Double): Self = this.set("cellWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellWidth: Self = this.set("cellWidth", js.undefined)
    
    @scala.inline
    def setCx(value: Double): Self = this.set("cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCx: Self = this.set("cx", js.undefined)
    
    @scala.inline
    def setCy(value: Double): Self = this.set("cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCy: Self = this.set("cy", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    
    @scala.inline
    def setR0(value: Double): Self = this.set("r0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteR0: Self = this.set("r0", js.undefined)
    
    @scala.inline
    def setRangeInfo(value: RangeInfo): Self = this.set("rangeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeInfo: Self = this.set("rangeInfo", js.undefined)
    
    @scala.inline
    def setType(value: cartesian2d | calendar | geo | polar | singleAxis): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
