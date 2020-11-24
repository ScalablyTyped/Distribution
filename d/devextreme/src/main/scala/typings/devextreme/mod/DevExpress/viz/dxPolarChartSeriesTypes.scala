package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPolarChartSeriesTypes extends js.Object {
  
  /**
    * [descr:dxPolarChartSeriesTypes.CommonPolarChartSeries]
    */
  var CommonPolarChartSeries: js.UndefOr[dxPolarChartSeriesTypesCommonPolarChartSeries] = js.native
  
  /**
    * [descr:dxPolarChartSeriesTypes.areapolarseries]
    */
  var areapolarseries: js.UndefOr[dxPolarChartSeriesTypesAreapolarseries] = js.native
  
  /**
    * [descr:dxPolarChartSeriesTypes.barpolarseries]
    */
  var barpolarseries: js.UndefOr[dxPolarChartSeriesTypesBarpolarseries] = js.native
  
  /**
    * [descr:dxPolarChartSeriesTypes.linepolarseries]
    */
  var linepolarseries: js.UndefOr[dxPolarChartSeriesTypesLinepolarseries] = js.native
  
  /**
    * [descr:dxPolarChartSeriesTypes.scatterpolarseries]
    */
  var scatterpolarseries: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxPolarChartSeriesTypes.stackedbarpolarseries]
    */
  var stackedbarpolarseries: js.UndefOr[dxPolarChartSeriesTypesStackedbarpolarseries] = js.native
}
object dxPolarChartSeriesTypes {
  
  @scala.inline
  def apply(): dxPolarChartSeriesTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartSeriesTypes]
  }
  
  @scala.inline
  implicit class dxPolarChartSeriesTypesOps[Self <: dxPolarChartSeriesTypes] (val x: Self) extends AnyVal {
    
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
    def setCommonPolarChartSeries(value: dxPolarChartSeriesTypesCommonPolarChartSeries): Self = this.set("CommonPolarChartSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonPolarChartSeries: Self = this.set("CommonPolarChartSeries", js.undefined)
    
    @scala.inline
    def setAreapolarseries(value: dxPolarChartSeriesTypesAreapolarseries): Self = this.set("areapolarseries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreapolarseries: Self = this.set("areapolarseries", js.undefined)
    
    @scala.inline
    def setBarpolarseries(value: dxPolarChartSeriesTypesBarpolarseries): Self = this.set("barpolarseries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarpolarseries: Self = this.set("barpolarseries", js.undefined)
    
    @scala.inline
    def setLinepolarseries(value: dxPolarChartSeriesTypesLinepolarseries): Self = this.set("linepolarseries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinepolarseries: Self = this.set("linepolarseries", js.undefined)
    
    @scala.inline
    def setScatterpolarseries(value: js.Any): Self = this.set("scatterpolarseries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScatterpolarseries: Self = this.set("scatterpolarseries", js.undefined)
    
    @scala.inline
    def setStackedbarpolarseries(value: dxPolarChartSeriesTypesStackedbarpolarseries): Self = this.set("stackedbarpolarseries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackedbarpolarseries: Self = this.set("stackedbarpolarseries", js.undefined)
  }
}
