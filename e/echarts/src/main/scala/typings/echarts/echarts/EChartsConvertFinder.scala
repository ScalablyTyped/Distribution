package typings.echarts.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EChartsConvertFinder extends js.Object {
  
  var geoId: js.UndefOr[String] = js.native
  
  var geoIndex: js.UndefOr[Double] = js.native
  
  var geoName: js.UndefOr[String] = js.native
  
  var gridId: js.UndefOr[String] = js.native
  
  var gridIndex: js.UndefOr[Double] = js.native
  
  var gridName: js.UndefOr[String] = js.native
  
  var seriesId: js.UndefOr[String] = js.native
  
  var seriesIndex: js.UndefOr[Double] = js.native
  
  var seriesName: js.UndefOr[String] = js.native
  
  var xAxisId: js.UndefOr[String] = js.native
  
  var xAxisIndex: js.UndefOr[Double] = js.native
  
  var xAxisName: js.UndefOr[String] = js.native
  
  var yAxisId: js.UndefOr[String] = js.native
  
  var yAxisIndex: js.UndefOr[Double] = js.native
  
  var yAxisName: js.UndefOr[String] = js.native
}
object EChartsConvertFinder {
  
  @scala.inline
  def apply(): EChartsConvertFinder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartsConvertFinder]
  }
  
  @scala.inline
  implicit class EChartsConvertFinderOps[Self <: EChartsConvertFinder] (val x: Self) extends AnyVal {
    
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
    def setGeoId(value: String): Self = this.set("geoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoId: Self = this.set("geoId", js.undefined)
    
    @scala.inline
    def setGeoIndex(value: Double): Self = this.set("geoIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoIndex: Self = this.set("geoIndex", js.undefined)
    
    @scala.inline
    def setGeoName(value: String): Self = this.set("geoName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoName: Self = this.set("geoName", js.undefined)
    
    @scala.inline
    def setGridId(value: String): Self = this.set("gridId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridId: Self = this.set("gridId", js.undefined)
    
    @scala.inline
    def setGridIndex(value: Double): Self = this.set("gridIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridIndex: Self = this.set("gridIndex", js.undefined)
    
    @scala.inline
    def setGridName(value: String): Self = this.set("gridName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridName: Self = this.set("gridName", js.undefined)
    
    @scala.inline
    def setSeriesId(value: String): Self = this.set("seriesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesId: Self = this.set("seriesId", js.undefined)
    
    @scala.inline
    def setSeriesIndex(value: Double): Self = this.set("seriesIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesIndex: Self = this.set("seriesIndex", js.undefined)
    
    @scala.inline
    def setSeriesName(value: String): Self = this.set("seriesName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesName: Self = this.set("seriesName", js.undefined)
    
    @scala.inline
    def setXAxisId(value: String): Self = this.set("xAxisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisId: Self = this.set("xAxisId", js.undefined)
    
    @scala.inline
    def setXAxisIndex(value: Double): Self = this.set("xAxisIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisIndex: Self = this.set("xAxisIndex", js.undefined)
    
    @scala.inline
    def setXAxisName(value: String): Self = this.set("xAxisName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisName: Self = this.set("xAxisName", js.undefined)
    
    @scala.inline
    def setYAxisId(value: String): Self = this.set("yAxisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisId: Self = this.set("yAxisId", js.undefined)
    
    @scala.inline
    def setYAxisIndex(value: Double): Self = this.set("yAxisIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisIndex: Self = this.set("yAxisIndex", js.undefined)
    
    @scala.inline
    def setYAxisName(value: String): Self = this.set("yAxisName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisName: Self = this.set("yAxisName", js.undefined)
  }
}
