package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ArgumentComponent
import typings.devextreme.anon.ConvertToAxisDataType
import typings.devextreme.anon.CustomizeSeriesNameField
import typings.devextreme.anon.ElementEventModelTarget
import typings.devextreme.anon.PreviousRange
import typings.devextreme.anon.Range
import typings.devextreme.anon.`25`
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.single_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPolarChartOptions extends BaseChartOptions[dxPolarChart] {
  
  /**
    * [descr:dxPolarChart.Options.adaptiveLayout]
    */
  @JSName("adaptiveLayout")
  var adaptiveLayout_dxPolarChartOptions: js.UndefOr[dxPolarChartAdaptiveLayout] = js.native
  
  /**
    * [descr:dxPolarChart.Options.annotations]
    */
  var annotations: js.UndefOr[js.Array[dxPolarChartAnnotationConfig | _]] = js.native
  
  /**
    * [descr:dxPolarChart.Options.argumentAxis]
    */
  var argumentAxis: js.UndefOr[dxPolarChartArgumentAxis] = js.native
  
  /**
    * [descr:dxPolarChart.Options.barGroupPadding]
    */
  var barGroupPadding: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxPolarChart.Options.barGroupWidth]
    */
  var barGroupWidth: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxPolarChart.Options.commonAnnotationSettings]
    */
  var commonAnnotationSettings: js.UndefOr[dxPolarChartCommonAnnotationConfig] = js.native
  
  /**
    * [descr:dxPolarChart.Options.commonAxisSettings]
    */
  var commonAxisSettings: js.UndefOr[dxPolarChartCommonAxisSettings] = js.native
  
  /**
    * [descr:dxPolarChart.Options.commonSeriesSettings]
    */
  var commonSeriesSettings: js.UndefOr[dxPolarChartCommonSeriesSettings] = js.native
  
  /**
    * [descr:dxPolarChart.Options.containerBackgroundColor]
    */
  var containerBackgroundColor: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxPolarChart.Options.customizeAnnotation]
    */
  var customizeAnnotation: js.UndefOr[
    js.Function1[
      /* annotation */ dxPolarChartAnnotationConfig | js.Any, 
      dxPolarChartAnnotationConfig
    ]
  ] = js.native
  
  /**
    * [descr:dxPolarChart.Options.dataPrepareSettings]
    */
  var dataPrepareSettings: js.UndefOr[ConvertToAxisDataType] = js.native
  
  /**
    * [descr:dxPolarChart.Options.legend]
    */
  @JSName("legend")
  var legend_dxPolarChartOptions: js.UndefOr[dxPolarChartLegend] = js.native
  
  /**
    * [descr:dxPolarChart.Options.negativesAsZeroes]
    */
  var negativesAsZeroes: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPolarChart.Options.onArgumentAxisClick]
    */
  var onArgumentAxisClick: js.UndefOr[(js.Function1[/* e */ ArgumentComponent, _]) | String] = js.native
  
  /**
    * [descr:dxPolarChart.Options.onLegendClick]
    */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ ElementEventModelTarget, _]) | String] = js.native
  
  /**
    * [descr:dxPolarChart.Options.onSeriesClick]
    */
  var onSeriesClick: js.UndefOr[(js.Function1[/* e */ ElementEventModelTarget, _]) | String] = js.native
  
  /**
    * [descr:dxPolarChart.Options.onSeriesHoverChanged]
    */
  var onSeriesHoverChanged: js.UndefOr[js.Function1[/* e */ `25`, _]] = js.native
  
  /**
    * [descr:dxPolarChart.Options.onSeriesSelectionChanged]
    */
  var onSeriesSelectionChanged: js.UndefOr[js.Function1[/* e */ `25`, _]] = js.native
  
  /**
    * [descr:dxPolarChart.Options.onZoomEnd]
    */
  var onZoomEnd: js.UndefOr[js.Function1[/* e */ PreviousRange, _]] = js.native
  
  /**
    * [descr:dxPolarChart.Options.onZoomStart]
    */
  var onZoomStart: js.UndefOr[js.Function1[/* e */ Range, _]] = js.native
  
  /**
    * [descr:dxPolarChart.Options.resolveLabelOverlapping]
    */
  var resolveLabelOverlapping: js.UndefOr[hide | none] = js.native
  
  /**
    * [descr:dxPolarChart.Options.seriesSelectionMode]
    */
  var seriesSelectionMode: js.UndefOr[multiple | single_] = js.native
  
  /**
    * [descr:dxPolarChart.Options.seriesTemplate]
    */
  var seriesTemplate: js.UndefOr[CustomizeSeriesNameField] = js.native
  
  /**
    * [descr:dxPolarChart.Options.series]
    */
  @JSName("series")
  var series_dxPolarChartOptions: js.UndefOr[PolarChartSeries | js.Array[PolarChartSeries]] = js.native
  
  /**
    * [descr:dxPolarChart.Options.tooltip]
    */
  @JSName("tooltip")
  var tooltip_dxPolarChartOptions: js.UndefOr[dxPolarChartTooltip] = js.native
  
  /**
    * [descr:dxPolarChart.Options.useSpiderWeb]
    */
  var useSpiderWeb: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxPolarChart.Options.valueAxis]
    */
  var valueAxis: js.UndefOr[dxPolarChartValueAxis] = js.native
}
object dxPolarChartOptions {
  
  @scala.inline
  def apply(): dxPolarChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartOptions]
  }
  
  @scala.inline
  implicit class dxPolarChartOptionsOps[Self <: dxPolarChartOptions] (val x: Self) extends AnyVal {
    
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
    def setAdaptiveLayout(value: dxPolarChartAdaptiveLayout): Self = this.set("adaptiveLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdaptiveLayout: Self = this.set("adaptiveLayout", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: (dxPolarChartAnnotationConfig | js.Any)*): Self = this.set("annotations", js.Array(value :_*))
    
    @scala.inline
    def setAnnotations(value: js.Array[dxPolarChartAnnotationConfig | _]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setArgumentAxis(value: dxPolarChartArgumentAxis): Self = this.set("argumentAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgumentAxis: Self = this.set("argumentAxis", js.undefined)
    
    @scala.inline
    def setBarGroupPadding(value: Double): Self = this.set("barGroupPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarGroupPadding: Self = this.set("barGroupPadding", js.undefined)
    
    @scala.inline
    def setBarGroupWidth(value: Double): Self = this.set("barGroupWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarGroupWidth: Self = this.set("barGroupWidth", js.undefined)
    
    @scala.inline
    def setCommonAnnotationSettings(value: dxPolarChartCommonAnnotationConfig): Self = this.set("commonAnnotationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonAnnotationSettings: Self = this.set("commonAnnotationSettings", js.undefined)
    
    @scala.inline
    def setCommonAxisSettings(value: dxPolarChartCommonAxisSettings): Self = this.set("commonAxisSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonAxisSettings: Self = this.set("commonAxisSettings", js.undefined)
    
    @scala.inline
    def setCommonSeriesSettings(value: dxPolarChartCommonSeriesSettings): Self = this.set("commonSeriesSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonSeriesSettings: Self = this.set("commonSeriesSettings", js.undefined)
    
    @scala.inline
    def setContainerBackgroundColor(value: String): Self = this.set("containerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerBackgroundColor: Self = this.set("containerBackgroundColor", js.undefined)
    
    @scala.inline
    def setCustomizeAnnotation(value: /* annotation */ dxPolarChartAnnotationConfig | js.Any => dxPolarChartAnnotationConfig): Self = this.set("customizeAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeAnnotation: Self = this.set("customizeAnnotation", js.undefined)
    
    @scala.inline
    def setDataPrepareSettings(value: ConvertToAxisDataType): Self = this.set("dataPrepareSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataPrepareSettings: Self = this.set("dataPrepareSettings", js.undefined)
    
    @scala.inline
    def setLegend(value: dxPolarChartLegend): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setNegativesAsZeroes(value: Boolean): Self = this.set("negativesAsZeroes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativesAsZeroes: Self = this.set("negativesAsZeroes", js.undefined)
    
    @scala.inline
    def setOnArgumentAxisClickFunction1(value: /* e */ ArgumentComponent => _): Self = this.set("onArgumentAxisClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnArgumentAxisClick(value: (js.Function1[/* e */ ArgumentComponent, _]) | String): Self = this.set("onArgumentAxisClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnArgumentAxisClick: Self = this.set("onArgumentAxisClick", js.undefined)
    
    @scala.inline
    def setOnLegendClickFunction1(value: /* e */ ElementEventModelTarget => _): Self = this.set("onLegendClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLegendClick(value: (js.Function1[/* e */ ElementEventModelTarget, _]) | String): Self = this.set("onLegendClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLegendClick: Self = this.set("onLegendClick", js.undefined)
    
    @scala.inline
    def setOnSeriesClickFunction1(value: /* e */ ElementEventModelTarget => _): Self = this.set("onSeriesClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeriesClick(value: (js.Function1[/* e */ ElementEventModelTarget, _]) | String): Self = this.set("onSeriesClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSeriesClick: Self = this.set("onSeriesClick", js.undefined)
    
    @scala.inline
    def setOnSeriesHoverChanged(value: /* e */ `25` => _): Self = this.set("onSeriesHoverChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSeriesHoverChanged: Self = this.set("onSeriesHoverChanged", js.undefined)
    
    @scala.inline
    def setOnSeriesSelectionChanged(value: /* e */ `25` => _): Self = this.set("onSeriesSelectionChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSeriesSelectionChanged: Self = this.set("onSeriesSelectionChanged", js.undefined)
    
    @scala.inline
    def setOnZoomEnd(value: /* e */ PreviousRange => _): Self = this.set("onZoomEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnZoomEnd: Self = this.set("onZoomEnd", js.undefined)
    
    @scala.inline
    def setOnZoomStart(value: /* e */ Range => _): Self = this.set("onZoomStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnZoomStart: Self = this.set("onZoomStart", js.undefined)
    
    @scala.inline
    def setResolveLabelOverlapping(value: hide | none): Self = this.set("resolveLabelOverlapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveLabelOverlapping: Self = this.set("resolveLabelOverlapping", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: PolarChartSeries*): Self = this.set("series", js.Array(value :_*))
    
    @scala.inline
    def setSeries(value: PolarChartSeries | js.Array[PolarChartSeries]): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setSeriesSelectionMode(value: multiple | single_): Self = this.set("seriesSelectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesSelectionMode: Self = this.set("seriesSelectionMode", js.undefined)
    
    @scala.inline
    def setSeriesTemplate(value: CustomizeSeriesNameField): Self = this.set("seriesTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesTemplate: Self = this.set("seriesTemplate", js.undefined)
    
    @scala.inline
    def setTooltip(value: dxPolarChartTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setUseSpiderWeb(value: Boolean): Self = this.set("useSpiderWeb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSpiderWeb: Self = this.set("useSpiderWeb", js.undefined)
    
    @scala.inline
    def setValueAxis(value: dxPolarChartValueAxis): Self = this.set("valueAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueAxis: Self = this.set("valueAxis", js.undefined)
  }
}
