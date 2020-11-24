package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.continuous
import typings.devextreme.devextremeStrings.datetime
import typings.devextreme.devextremeStrings.day
import typings.devextreme.devextremeStrings.discrete
import typings.devextreme.devextremeStrings.hour
import typings.devextreme.devextremeStrings.keep
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.logarithmic
import typings.devextreme.devextremeStrings.millisecond
import typings.devextreme.devextremeStrings.minute
import typings.devextreme.devextremeStrings.month
import typings.devextreme.devextremeStrings.numeric
import typings.devextreme.devextremeStrings.quarter
import typings.devextreme.devextremeStrings.reset
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.second
import typings.devextreme.devextremeStrings.shift
import typings.devextreme.devextremeStrings.string_
import typings.devextreme.devextremeStrings.top
import typings.devextreme.devextremeStrings.week
import typings.devextreme.devextremeStrings.year
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxChartValueAxis extends dxChartCommonAxisSettings {
  
  /**
    * [descr:dxChart.Options.valueAxis.autoBreaksEnabled]
    */
  var autoBreaksEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.axisDivisionFactor]
    */
  var axisDivisionFactor: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.breaks]
    */
  var breaks: js.UndefOr[js.Array[ScaleBreak]] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.categories]
    */
  var categories: js.UndefOr[js.Array[Double | String | Date]] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.constantLineStyle]
    */
  @JSName("constantLineStyle")
  var constantLineStyle_dxChartValueAxis: js.UndefOr[dxChartValueAxisConstantLineStyle] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.constantLines]
    */
  var constantLines: js.UndefOr[js.Array[dxChartValueAxisConstantLines]] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.customPosition]
    */
  var customPosition: js.UndefOr[Double | Date | String] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.label]
    */
  @JSName("label")
  var label_dxChartValueAxis: js.UndefOr[dxChartValueAxisLabel] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.linearThreshold]
    */
  var linearThreshold: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.logarithmBase]
    */
  var logarithmBase: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.maxAutoBreakCount]
    */
  var maxAutoBreakCount: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.minVisualRangeLength]
    */
  var minVisualRangeLength: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.minorTickCount]
    */
  var minorTickCount: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.minorTickInterval]
    */
  var minorTickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.multipleAxesSpacing]
    */
  var multipleAxesSpacing: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.name]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.offset]
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.pane]
    */
  var pane: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.position]
    */
  var position: js.UndefOr[bottom | left | right | top] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.showZero]
    */
  var showZero: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.strips]
    */
  var strips: js.UndefOr[js.Array[dxChartValueAxisStrips]] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.synchronizedValue]
    */
  var synchronizedValue: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.tickInterval]
    */
  var tickInterval: js.UndefOr[
    Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
  ] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.title]
    */
  @JSName("title")
  var title_dxChartValueAxis: js.UndefOr[dxChartValueAxisTitle] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.type]
    */
  var `type`: js.UndefOr[continuous | discrete | logarithmic] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.valueType]
    */
  var valueType: js.UndefOr[datetime | numeric | string_] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.visualRange]
    */
  var visualRange: js.UndefOr[VizRange | (js.Array[Double | String | Date])] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.visualRangeUpdateMode]
    */
  var visualRangeUpdateMode: js.UndefOr[auto | keep | reset | shift] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis.wholeRange]
    */
  var wholeRange: js.UndefOr[VizRange | (js.Array[Double | String | Date])] = js.native
}
object dxChartValueAxis {
  
  @scala.inline
  def apply(): dxChartValueAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartValueAxis]
  }
  
  @scala.inline
  implicit class dxChartValueAxisOps[Self <: dxChartValueAxis] (val x: Self) extends AnyVal {
    
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
    def setAutoBreaksEnabled(value: Boolean): Self = this.set("autoBreaksEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBreaksEnabled: Self = this.set("autoBreaksEnabled", js.undefined)
    
    @scala.inline
    def setAxisDivisionFactor(value: Double): Self = this.set("axisDivisionFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisDivisionFactor: Self = this.set("axisDivisionFactor", js.undefined)
    
    @scala.inline
    def setBreaksVarargs(value: ScaleBreak*): Self = this.set("breaks", js.Array(value :_*))
    
    @scala.inline
    def setBreaks(value: js.Array[ScaleBreak]): Self = this.set("breaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreaks: Self = this.set("breaks", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: (Double | String | Date)*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[Double | String | Date]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setConstantLineStyle(value: dxChartValueAxisConstantLineStyle): Self = this.set("constantLineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstantLineStyle: Self = this.set("constantLineStyle", js.undefined)
    
    @scala.inline
    def setConstantLinesVarargs(value: dxChartValueAxisConstantLines*): Self = this.set("constantLines", js.Array(value :_*))
    
    @scala.inline
    def setConstantLines(value: js.Array[dxChartValueAxisConstantLines]): Self = this.set("constantLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstantLines: Self = this.set("constantLines", js.undefined)
    
    @scala.inline
    def setCustomPosition(value: Double | Date | String): Self = this.set("customPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomPosition: Self = this.set("customPosition", js.undefined)
    
    @scala.inline
    def setLabel(value: dxChartValueAxisLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
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
    def setMaxAutoBreakCount(value: Double): Self = this.set("maxAutoBreakCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAutoBreakCount: Self = this.set("maxAutoBreakCount", js.undefined)
    
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
    def setMultipleAxesSpacing(value: Double): Self = this.set("multipleAxesSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleAxesSpacing: Self = this.set("multipleAxesSpacing", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPane(value: String): Self = this.set("pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    
    @scala.inline
    def setPosition(value: bottom | left | right | top): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShowZero(value: Boolean): Self = this.set("showZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowZero: Self = this.set("showZero", js.undefined)
    
    @scala.inline
    def setStripsVarargs(value: dxChartValueAxisStrips*): Self = this.set("strips", js.Array(value :_*))
    
    @scala.inline
    def setStrips(value: js.Array[dxChartValueAxisStrips]): Self = this.set("strips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrips: Self = this.set("strips", js.undefined)
    
    @scala.inline
    def setSynchronizedValue(value: Double): Self = this.set("synchronizedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynchronizedValue: Self = this.set("synchronizedValue", js.undefined)
    
    @scala.inline
    def setTickInterval(
      value: Double | js.Any | day | hour | millisecond | minute | month | quarter | second | week | year
    ): Self = this.set("tickInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickInterval: Self = this.set("tickInterval", js.undefined)
    
    @scala.inline
    def setTitle(value: dxChartValueAxisTitle): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: continuous | discrete | logarithmic): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
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
    def setVisualRangeUpdateMode(value: auto | keep | reset | shift): Self = this.set("visualRangeUpdateMode", value.asInstanceOf[js.Any])
    
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
