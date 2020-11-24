package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.continuous
import typings.devextreme.devextremeStrings.datetime
import typings.devextreme.devextremeStrings.day
import typings.devextreme.devextremeStrings.discrete
import typings.devextreme.devextremeStrings.hour
import typings.devextreme.devextremeStrings.keep
import typings.devextreme.devextremeStrings.logarithmic
import typings.devextreme.devextremeStrings.millisecond
import typings.devextreme.devextremeStrings.minute
import typings.devextreme.devextremeStrings.month
import typings.devextreme.devextremeStrings.numeric
import typings.devextreme.devextremeStrings.quarter
import typings.devextreme.devextremeStrings.reset
import typings.devextreme.devextremeStrings.second
import typings.devextreme.devextremeStrings.string_
import typings.devextreme.devextremeStrings.week
import typings.devextreme.devextremeStrings.year
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPolarChartValueAxis extends dxPolarChartCommonAxisSettings {
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.axisDivisionFactor]
    */
  var axisDivisionFactor: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.categories]
    */
  var categories: js.UndefOr[js.Array[Double | String | Date]] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.constantLines]
    */
  var constantLines: js.UndefOr[js.Array[dxPolarChartValueAxisConstantLines]] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.label]
    */
  @JSName("label")
  var label_dxPolarChartValueAxis: js.UndefOr[dxPolarChartValueAxisLabel] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.linearThreshold]
    */
  var linearThreshold: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.logarithmBase]
    */
  var logarithmBase: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.maxValueMargin]
    */
  var maxValueMargin: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.minValueMargin]
    */
  var minValueMargin: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.minVisualRangeLength]
    */
  var minVisualRangeLength: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.minorTickCount]
    */
  var minorTickCount: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.minorTickInterval]
    */
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.showZero]
    */
  var showZero: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.strips]
    */
  var strips: js.UndefOr[js.Array[dxPolarChartValueAxisStrips]] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.tickInterval]
    */
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.tick]
    */
  @JSName("tick")
  var tick_dxPolarChartValueAxis: js.UndefOr[dxPolarChartValueAxisTick] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.type]
    */
  var `type`: js.UndefOr[continuous | discrete | logarithmic] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.valueMarginsEnabled]
    */
  var valueMarginsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.valueType]
    */
  var valueType: js.UndefOr[datetime | numeric | string_] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.visualRange]
    */
  var visualRange: js.UndefOr[VizRange | (js.Array[Double | String | Date])] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.visualRangeUpdateMode]
    */
  var visualRangeUpdateMode: js.UndefOr[auto | keep | reset] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis.wholeRange]
    */
  var wholeRange: js.UndefOr[VizRange | (js.Array[Double | String | Date])] = js.native
}
object dxPolarChartValueAxis {
  
  @scala.inline
  def apply(): dxPolarChartValueAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartValueAxis]
  }
  
  @scala.inline
  implicit class dxPolarChartValueAxisOps[Self <: dxPolarChartValueAxis] (val x: Self) extends AnyVal {
    
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
    def setAxisDivisionFactor(value: Double): Self = this.set("axisDivisionFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisDivisionFactor: Self = this.set("axisDivisionFactor", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: (Double | String | Date)*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[Double | String | Date]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setConstantLinesVarargs(value: dxPolarChartValueAxisConstantLines*): Self = this.set("constantLines", js.Array(value :_*))
    
    @scala.inline
    def setConstantLines(value: js.Array[dxPolarChartValueAxisConstantLines]): Self = this.set("constantLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstantLines: Self = this.set("constantLines", js.undefined)
    
    @scala.inline
    def setLabel(value: dxPolarChartValueAxisLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLinearThreshold(value: Double): Self = this.set("linearThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinearThreshold: Self = this.set("linearThreshold", js.undefined)
    
    @scala.inline
    def setLogarithmBase(value: Double): Self = this.set("logarithmBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogarithmBase: Self = this.set("logarithmBase", js.undefined)
    
    @scala.inline
    def setMaxValueMargin(value: Double): Self = this.set("maxValueMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValueMargin: Self = this.set("maxValueMargin", js.undefined)
    
    @scala.inline
    def setMinValueMargin(value: Double): Self = this.set("minValueMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValueMargin: Self = this.set("minValueMargin", js.undefined)
    
    @scala.inline
    def setMinVisualRangeLength(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = this.set("minVisualRangeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinVisualRangeLength: Self = this.set("minVisualRangeLength", js.undefined)
    
    @scala.inline
    def setMinorTickCount(value: Double): Self = this.set("minorTickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTickCount: Self = this.set("minorTickCount", js.undefined)
    
    @scala.inline
    def setMinorTickInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = this.set("minorTickInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTickInterval: Self = this.set("minorTickInterval", js.undefined)
    
    @scala.inline
    def setShowZero(value: Boolean): Self = this.set("showZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowZero: Self = this.set("showZero", js.undefined)
    
    @scala.inline
    def setStripsVarargs(value: dxPolarChartValueAxisStrips*): Self = this.set("strips", js.Array(value :_*))
    
    @scala.inline
    def setStrips(value: js.Array[dxPolarChartValueAxisStrips]): Self = this.set("strips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrips: Self = this.set("strips", js.undefined)
    
    @scala.inline
    def setTick(value: dxPolarChartValueAxisTick): Self = this.set("tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTick: Self = this.set("tick", js.undefined)
    
    @scala.inline
    def setTickInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = this.set("tickInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickInterval: Self = this.set("tickInterval", js.undefined)
    
    @scala.inline
    def setType(value: continuous | discrete | logarithmic): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValueMarginsEnabled(value: Boolean): Self = this.set("valueMarginsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueMarginsEnabled: Self = this.set("valueMarginsEnabled", js.undefined)
    
    @scala.inline
    def setValueType(value: datetime | numeric | string_): Self = this.set("valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueType: Self = this.set("valueType", js.undefined)
    
    @scala.inline
    def setVisualRangeVarargs(value: (Double | String | Date)*): Self = this.set("visualRange", js.Array(value :_*))
    
    @scala.inline
    def setVisualRange(value: VizRange | (js.Array[Double | String | Date])): Self = this.set("visualRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisualRange: Self = this.set("visualRange", js.undefined)
    
    @scala.inline
    def setVisualRangeUpdateMode(value: auto | keep | reset): Self = this.set("visualRangeUpdateMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisualRangeUpdateMode: Self = this.set("visualRangeUpdateMode", js.undefined)
    
    @scala.inline
    def setWholeRangeVarargs(value: (Double | String | Date)*): Self = this.set("wholeRange", js.Array(value :_*))
    
    @scala.inline
    def setWholeRange(value: VizRange | (js.Array[Double | String | Date])): Self = this.set("wholeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWholeRange: Self = this.set("wholeRange", js.undefined)
  }
}
