package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:dxChartSeriesTypes]
  */
@js.native
trait dxChartSeriesTypes extends js.Object {
  
  /**
    * [descr:dxChartSeriesTypes.AreaSeries]
    */
  var AreaSeries: js.UndefOr[dxChartSeriesTypesAreaSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.BarSeries]
    */
  var BarSeries: js.UndefOr[dxChartSeriesTypesBarSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.BubbleSeries]
    */
  var BubbleSeries: js.UndefOr[dxChartSeriesTypesBubbleSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CandleStickSeries]
    */
  var CandleStickSeries: js.UndefOr[dxChartSeriesTypesCandleStickSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.CommonSeries]
    */
  var CommonSeries: js.UndefOr[dxChartSeriesTypesCommonSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.FullStackedAreaSeries]
    */
  var FullStackedAreaSeries: js.UndefOr[dxChartSeriesTypesFullStackedAreaSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.FullStackedBarSeries]
    */
  var FullStackedBarSeries: js.UndefOr[dxChartSeriesTypesFullStackedBarSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.FullStackedLineSeries]
    */
  var FullStackedLineSeries: js.UndefOr[dxChartSeriesTypesFullStackedLineSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.FullStackedSplineAreaSeries]
    */
  var FullStackedSplineAreaSeries: js.UndefOr[dxChartSeriesTypesFullStackedSplineAreaSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.FullStackedSplineSeries]
    */
  var FullStackedSplineSeries: js.UndefOr[dxChartSeriesTypesFullStackedSplineSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.LineSeries]
    */
  var LineSeries: js.UndefOr[dxChartSeriesTypesLineSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.RangeAreaSeries]
    */
  var RangeAreaSeries: js.UndefOr[dxChartSeriesTypesRangeAreaSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.RangeBarSeries]
    */
  var RangeBarSeries: js.UndefOr[dxChartSeriesTypesRangeBarSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.ScatterSeries]
    */
  var ScatterSeries: js.UndefOr[dxChartSeriesTypesScatterSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.SplineAreaSeries]
    */
  var SplineAreaSeries: js.UndefOr[dxChartSeriesTypesSplineAreaSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.SplineSeries]
    */
  var SplineSeries: js.UndefOr[dxChartSeriesTypesSplineSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.StackedAreaSeries]
    */
  var StackedAreaSeries: js.UndefOr[dxChartSeriesTypesStackedAreaSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.StackedBarSeries]
    */
  var StackedBarSeries: js.UndefOr[dxChartSeriesTypesStackedBarSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.StackedLineSeries]
    */
  var StackedLineSeries: js.UndefOr[dxChartSeriesTypesStackedLineSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.StackedSplineAreaSeries]
    */
  var StackedSplineAreaSeries: js.UndefOr[dxChartSeriesTypesStackedSplineAreaSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.StackedSplineSeries]
    */
  var StackedSplineSeries: js.UndefOr[dxChartSeriesTypesStackedSplineSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.StepAreaSeries]
    */
  var StepAreaSeries: js.UndefOr[dxChartSeriesTypesStepAreaSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.StepLineSeries]
    */
  var StepLineSeries: js.UndefOr[dxChartSeriesTypesStepLineSeries] = js.native
  
  /**
    * [descr:dxChartSeriesTypes.StockSeries]
    */
  var StockSeries: js.UndefOr[dxChartSeriesTypesStockSeries] = js.native
}
object dxChartSeriesTypes {
  
  @scala.inline
  def apply(): dxChartSeriesTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartSeriesTypes]
  }
  
  @scala.inline
  implicit class dxChartSeriesTypesOps[Self <: dxChartSeriesTypes] (val x: Self) extends AnyVal {
    
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
    def setAreaSeries(value: dxChartSeriesTypesAreaSeries): Self = this.set("AreaSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreaSeries: Self = this.set("AreaSeries", js.undefined)
    
    @scala.inline
    def setBarSeries(value: dxChartSeriesTypesBarSeries): Self = this.set("BarSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarSeries: Self = this.set("BarSeries", js.undefined)
    
    @scala.inline
    def setBubbleSeries(value: dxChartSeriesTypesBubbleSeries): Self = this.set("BubbleSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubbleSeries: Self = this.set("BubbleSeries", js.undefined)
    
    @scala.inline
    def setCandleStickSeries(value: dxChartSeriesTypesCandleStickSeries): Self = this.set("CandleStickSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCandleStickSeries: Self = this.set("CandleStickSeries", js.undefined)
    
    @scala.inline
    def setCommonSeries(value: dxChartSeriesTypesCommonSeries): Self = this.set("CommonSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonSeries: Self = this.set("CommonSeries", js.undefined)
    
    @scala.inline
    def setFullStackedAreaSeries(value: dxChartSeriesTypesFullStackedAreaSeries): Self = this.set("FullStackedAreaSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullStackedAreaSeries: Self = this.set("FullStackedAreaSeries", js.undefined)
    
    @scala.inline
    def setFullStackedBarSeries(value: dxChartSeriesTypesFullStackedBarSeries): Self = this.set("FullStackedBarSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullStackedBarSeries: Self = this.set("FullStackedBarSeries", js.undefined)
    
    @scala.inline
    def setFullStackedLineSeries(value: dxChartSeriesTypesFullStackedLineSeries): Self = this.set("FullStackedLineSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullStackedLineSeries: Self = this.set("FullStackedLineSeries", js.undefined)
    
    @scala.inline
    def setFullStackedSplineAreaSeries(value: dxChartSeriesTypesFullStackedSplineAreaSeries): Self = this.set("FullStackedSplineAreaSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullStackedSplineAreaSeries: Self = this.set("FullStackedSplineAreaSeries", js.undefined)
    
    @scala.inline
    def setFullStackedSplineSeries(value: dxChartSeriesTypesFullStackedSplineSeries): Self = this.set("FullStackedSplineSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullStackedSplineSeries: Self = this.set("FullStackedSplineSeries", js.undefined)
    
    @scala.inline
    def setLineSeries(value: dxChartSeriesTypesLineSeries): Self = this.set("LineSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineSeries: Self = this.set("LineSeries", js.undefined)
    
    @scala.inline
    def setRangeAreaSeries(value: dxChartSeriesTypesRangeAreaSeries): Self = this.set("RangeAreaSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeAreaSeries: Self = this.set("RangeAreaSeries", js.undefined)
    
    @scala.inline
    def setRangeBarSeries(value: dxChartSeriesTypesRangeBarSeries): Self = this.set("RangeBarSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeBarSeries: Self = this.set("RangeBarSeries", js.undefined)
    
    @scala.inline
    def setScatterSeries(value: dxChartSeriesTypesScatterSeries): Self = this.set("ScatterSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScatterSeries: Self = this.set("ScatterSeries", js.undefined)
    
    @scala.inline
    def setSplineAreaSeries(value: dxChartSeriesTypesSplineAreaSeries): Self = this.set("SplineAreaSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplineAreaSeries: Self = this.set("SplineAreaSeries", js.undefined)
    
    @scala.inline
    def setSplineSeries(value: dxChartSeriesTypesSplineSeries): Self = this.set("SplineSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplineSeries: Self = this.set("SplineSeries", js.undefined)
    
    @scala.inline
    def setStackedAreaSeries(value: dxChartSeriesTypesStackedAreaSeries): Self = this.set("StackedAreaSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackedAreaSeries: Self = this.set("StackedAreaSeries", js.undefined)
    
    @scala.inline
    def setStackedBarSeries(value: dxChartSeriesTypesStackedBarSeries): Self = this.set("StackedBarSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackedBarSeries: Self = this.set("StackedBarSeries", js.undefined)
    
    @scala.inline
    def setStackedLineSeries(value: dxChartSeriesTypesStackedLineSeries): Self = this.set("StackedLineSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackedLineSeries: Self = this.set("StackedLineSeries", js.undefined)
    
    @scala.inline
    def setStackedSplineAreaSeries(value: dxChartSeriesTypesStackedSplineAreaSeries): Self = this.set("StackedSplineAreaSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackedSplineAreaSeries: Self = this.set("StackedSplineAreaSeries", js.undefined)
    
    @scala.inline
    def setStackedSplineSeries(value: dxChartSeriesTypesStackedSplineSeries): Self = this.set("StackedSplineSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackedSplineSeries: Self = this.set("StackedSplineSeries", js.undefined)
    
    @scala.inline
    def setStepAreaSeries(value: dxChartSeriesTypesStepAreaSeries): Self = this.set("StepAreaSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepAreaSeries: Self = this.set("StepAreaSeries", js.undefined)
    
    @scala.inline
    def setStepLineSeries(value: dxChartSeriesTypesStepLineSeries): Self = this.set("StepLineSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepLineSeries: Self = this.set("StepLineSeries", js.undefined)
    
    @scala.inline
    def setStockSeries(value: dxChartSeriesTypesStockSeries): Self = this.set("StockSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStockSeries: Self = this.set("StockSeries", js.undefined)
  }
}
