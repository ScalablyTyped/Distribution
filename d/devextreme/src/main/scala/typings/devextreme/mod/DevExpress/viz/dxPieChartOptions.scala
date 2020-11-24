package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.NameField
import typings.devextreme.anon.Points
import typings.devextreme.devextremeStrings.anticlockwise
import typings.devextreme.devextremeStrings.clockwise
import typings.devextreme.devextremeStrings.donut
import typings.devextreme.devextremeStrings.doughnut
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.pie
import typings.devextreme.devextremeStrings.shift
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.global.JQuery
import typings.std.SVGElement
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPieChartOptions extends BaseChartOptions[dxPieChart] {
  
  /**
    * [descr:dxPieChart.Options.adaptiveLayout]
    */
  @JSName("adaptiveLayout")
  var adaptiveLayout_dxPieChartOptions: js.UndefOr[dxPieChartAdaptiveLayout] = js.native
  
  /**
    * [descr:dxPieChart.Options.annotations]
    */
  var annotations: js.UndefOr[js.Array[dxPieChartAnnotationConfig | _]] = js.native
  
  /**
    * [descr:dxPieChart.Options.centerTemplate]
    */
  var centerTemplate: js.UndefOr[
    template | (js.Function2[/* component */ dxPieChart, /* element */ SVGGElement, String | SVGElement | JQuery])
  ] = js.native
  
  /**
    * [descr:dxPieChart.Options.commonAnnotationSettings]
    */
  var commonAnnotationSettings: js.UndefOr[dxPieChartCommonAnnotationConfig] = js.native
  
  /**
    * [descr:dxPieChart.Options.commonSeriesSettings]
    */
  var commonSeriesSettings: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:dxPieChart.Options.customizeAnnotation]
    */
  var customizeAnnotation: js.UndefOr[
    js.Function1[/* annotation */ dxPieChartAnnotationConfig | js.Any, dxPieChartAnnotationConfig]
  ] = js.native
  
  /**
    * [descr:dxPieChart.Options.diameter]
    */
  var diameter: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxPieChart.Options.innerRadius]
    */
  var innerRadius: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxPieChart.Options.legend]
    */
  @JSName("legend")
  var legend_dxPieChartOptions: js.UndefOr[dxPieChartLegend] = js.native
  
  /**
    * [descr:dxPieChart.Options.minDiameter]
    */
  var minDiameter: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxPieChart.Options.onLegendClick]
    */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ Points, _]) | String] = js.native
  
  /**
    * [descr:dxPieChart.Options.resolveLabelOverlapping]
    */
  var resolveLabelOverlapping: js.UndefOr[hide | none | shift] = js.native
  
  /**
    * [descr:dxPieChart.Options.segmentsDirection]
    */
  var segmentsDirection: js.UndefOr[anticlockwise | clockwise] = js.native
  
  /**
    * [descr:dxPieChart.Options.seriesTemplate]
    */
  var seriesTemplate: js.UndefOr[NameField] = js.native
  
  /**
    * [descr:dxPieChart.Options.series]
    */
  @JSName("series")
  var series_dxPieChartOptions: js.UndefOr[PieChartSeries | js.Array[PieChartSeries]] = js.native
  
  /**
    * [descr:dxPieChart.Options.sizeGroup]
    */
  var sizeGroup: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxPieChart.Options.startAngle]
    */
  var startAngle: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxPieChart.Options.type]
    */
  var `type`: js.UndefOr[donut | doughnut | pie] = js.native
}
object dxPieChartOptions {
  
  @scala.inline
  def apply(): dxPieChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPieChartOptions]
  }
  
  @scala.inline
  implicit class dxPieChartOptionsOps[Self <: dxPieChartOptions] (val x: Self) extends AnyVal {
    
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
    def setAdaptiveLayout(value: dxPieChartAdaptiveLayout): Self = this.set("adaptiveLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdaptiveLayout: Self = this.set("adaptiveLayout", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: (dxPieChartAnnotationConfig | js.Any)*): Self = this.set("annotations", js.Array(value :_*))
    
    @scala.inline
    def setAnnotations(value: js.Array[dxPieChartAnnotationConfig | _]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setCenterTemplateFunction2(value: (/* component */ dxPieChart, /* element */ SVGGElement) => String | SVGElement | JQuery): Self = this.set("centerTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCenterTemplate(
      value: template | (js.Function2[/* component */ dxPieChart, /* element */ SVGGElement, String | SVGElement | JQuery])
    ): Self = this.set("centerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterTemplate: Self = this.set("centerTemplate", js.undefined)
    
    @scala.inline
    def setCommonAnnotationSettings(value: dxPieChartCommonAnnotationConfig): Self = this.set("commonAnnotationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonAnnotationSettings: Self = this.set("commonAnnotationSettings", js.undefined)
    
    @scala.inline
    def setCommonSeriesSettings(value: js.Any): Self = this.set("commonSeriesSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonSeriesSettings: Self = this.set("commonSeriesSettings", js.undefined)
    
    @scala.inline
    def setCustomizeAnnotation(value: /* annotation */ dxPieChartAnnotationConfig | js.Any => dxPieChartAnnotationConfig): Self = this.set("customizeAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeAnnotation: Self = this.set("customizeAnnotation", js.undefined)
    
    @scala.inline
    def setDiameter(value: Double): Self = this.set("diameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiameter: Self = this.set("diameter", js.undefined)
    
    @scala.inline
    def setInnerRadius(value: Double): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRadius: Self = this.set("innerRadius", js.undefined)
    
    @scala.inline
    def setLegend(value: dxPieChartLegend): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setMinDiameter(value: Double): Self = this.set("minDiameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDiameter: Self = this.set("minDiameter", js.undefined)
    
    @scala.inline
    def setOnLegendClickFunction1(value: /* e */ Points => _): Self = this.set("onLegendClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLegendClick(value: (js.Function1[/* e */ Points, _]) | String): Self = this.set("onLegendClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLegendClick: Self = this.set("onLegendClick", js.undefined)
    
    @scala.inline
    def setResolveLabelOverlapping(value: hide | none | shift): Self = this.set("resolveLabelOverlapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveLabelOverlapping: Self = this.set("resolveLabelOverlapping", js.undefined)
    
    @scala.inline
    def setSegmentsDirection(value: anticlockwise | clockwise): Self = this.set("segmentsDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentsDirection: Self = this.set("segmentsDirection", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: PieChartSeries*): Self = this.set("series", js.Array(value :_*))
    
    @scala.inline
    def setSeries(value: PieChartSeries | js.Array[PieChartSeries]): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setSeriesTemplate(value: NameField): Self = this.set("seriesTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesTemplate: Self = this.set("seriesTemplate", js.undefined)
    
    @scala.inline
    def setSizeGroup(value: String): Self = this.set("sizeGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeGroup: Self = this.set("sizeGroup", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    
    @scala.inline
    def setType(value: donut | doughnut | pie): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
