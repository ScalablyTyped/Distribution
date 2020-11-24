package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ActionType
import typings.devextreme.anon.AllowMouseWheel
import typings.devextreme.anon.Argument
import typings.devextreme.anon.Axis
import typings.devextreme.anon.CheckTypeForAllData
import typings.devextreme.anon.CustomizeSeries
import typings.devextreme.anon.EventModelTarget
import typings.devextreme.anon.HorizontalLine
import typings.devextreme.anon.Offset
import typings.devextreme.anon.`22`
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.devextremeStrings.stack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxChartOptions extends BaseChartOptions[dxChart] {
  
  /**
    * [descr:dxChart.Options.adjustOnZoom]
    */
  var adjustOnZoom: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxChart.Options.annotations]
    */
  var annotations: js.UndefOr[js.Array[dxChartAnnotationConfig | _]] = js.native
  
  /**
    * [descr:dxChart.Options.argumentAxis]
    */
  var argumentAxis: js.UndefOr[dxChartArgumentAxis] = js.native
  
  /**
    * [descr:dxChart.Options.autoHidePointMarkers]
    */
  var autoHidePointMarkers: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxChart.Options.barGroupPadding]
    */
  var barGroupPadding: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChart.Options.barGroupWidth]
    */
  var barGroupWidth: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChart.Options.commonAnnotationSettings]
    */
  var commonAnnotationSettings: js.UndefOr[dxChartCommonAnnotationConfig] = js.native
  
  /**
    * [descr:dxChart.Options.commonAxisSettings]
    */
  var commonAxisSettings: js.UndefOr[dxChartCommonAxisSettings] = js.native
  
  /**
    * [descr:dxChart.Options.commonPaneSettings]
    */
  var commonPaneSettings: js.UndefOr[dxChartCommonPaneSettings] = js.native
  
  /**
    * [descr:dxChart.Options.commonSeriesSettings]
    */
  var commonSeriesSettings: js.UndefOr[dxChartCommonSeriesSettings] = js.native
  
  /**
    * [descr:dxChart.Options.containerBackgroundColor]
    */
  var containerBackgroundColor: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChart.Options.crosshair]
    */
  var crosshair: js.UndefOr[HorizontalLine] = js.native
  
  /**
    * [descr:dxChart.Options.customizeAnnotation]
    */
  var customizeAnnotation: js.UndefOr[
    js.Function1[/* annotation */ dxChartAnnotationConfig | js.Any, dxChartAnnotationConfig]
  ] = js.native
  
  /**
    * [descr:dxChart.Options.dataPrepareSettings]
    */
  var dataPrepareSettings: js.UndefOr[CheckTypeForAllData] = js.native
  
  /**
    * [descr:dxChart.Options.defaultPane]
    */
  var defaultPane: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxChart.Options.legend]
    */
  @JSName("legend")
  var legend_dxChartOptions: js.UndefOr[dxChartLegend] = js.native
  
  /**
    * [descr:dxChart.Options.maxBubbleSize]
    */
  var maxBubbleSize: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChart.Options.minBubbleSize]
    */
  var minBubbleSize: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxChart.Options.negativesAsZeroes]
    */
  var negativesAsZeroes: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxChart.Options.onArgumentAxisClick]
    */
  var onArgumentAxisClick: js.UndefOr[(js.Function1[/* e */ Argument, _]) | String] = js.native
  
  /**
    * [descr:dxChart.Options.onLegendClick]
    */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ EventModelTarget, _]) | String] = js.native
  
  /**
    * [descr:dxChart.Options.onSeriesClick]
    */
  var onSeriesClick: js.UndefOr[(js.Function1[/* e */ EventModelTarget, _]) | String] = js.native
  
  /**
    * [descr:dxChart.Options.onSeriesHoverChanged]
    */
  var onSeriesHoverChanged: js.UndefOr[js.Function1[/* e */ `22`, _]] = js.native
  
  /**
    * [descr:dxChart.Options.onSeriesSelectionChanged]
    */
  var onSeriesSelectionChanged: js.UndefOr[js.Function1[/* e */ `22`, _]] = js.native
  
  /**
    * [descr:dxChart.Options.onZoomEnd]
    */
  var onZoomEnd: js.UndefOr[js.Function1[/* e */ ActionType, _]] = js.native
  
  /**
    * [descr:dxChart.Options.onZoomStart]
    */
  var onZoomStart: js.UndefOr[js.Function1[/* e */ Axis, _]] = js.native
  
  /**
    * [descr:dxChart.Options.panes]
    */
  var panes: js.UndefOr[dxChartPanes | js.Array[dxChartPanes]] = js.native
  
  /**
    * [descr:dxChart.Options.resizePanesOnZoom]
    */
  var resizePanesOnZoom: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxChart.Options.resolveLabelOverlapping]
    */
  var resolveLabelOverlapping: js.UndefOr[hide | none | stack] = js.native
  
  /**
    * [descr:dxChart.Options.rotated]
    */
  var rotated: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxChart.Options.scrollBar]
    */
  var scrollBar: js.UndefOr[Offset] = js.native
  
  /**
    * [descr:dxChart.Options.seriesSelectionMode]
    */
  var seriesSelectionMode: js.UndefOr[multiple | single_] = js.native
  
  /**
    * [descr:dxChart.Options.seriesTemplate]
    */
  var seriesTemplate: js.UndefOr[CustomizeSeries] = js.native
  
  /**
    * [descr:dxChart.Options.series]
    */
  @JSName("series")
  var series_dxChartOptions: js.UndefOr[ChartSeries | js.Array[ChartSeries]] = js.native
  
  /**
    * [descr:dxChart.Options.stickyHovering]
    */
  var stickyHovering: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxChart.Options.synchronizeMultiAxes]
    */
  var synchronizeMultiAxes: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxChart.Options.tooltip]
    */
  @JSName("tooltip")
  var tooltip_dxChartOptions: js.UndefOr[dxChartTooltip] = js.native
  
  /**
    * [descr:dxChart.Options.valueAxis]
    */
  var valueAxis: js.UndefOr[dxChartValueAxis | js.Array[dxChartValueAxis]] = js.native
  
  /**
    * [descr:dxChart.Options.zoomAndPan]
    */
  var zoomAndPan: js.UndefOr[AllowMouseWheel] = js.native
}
object dxChartOptions {
  
  @scala.inline
  def apply(): dxChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartOptions]
  }
  
  @scala.inline
  implicit class dxChartOptionsOps[Self <: dxChartOptions] (val x: Self) extends AnyVal {
    
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
    def setAdjustOnZoom(value: Boolean): Self = this.set("adjustOnZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustOnZoom: Self = this.set("adjustOnZoom", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: (dxChartAnnotationConfig | js.Any)*): Self = this.set("annotations", js.Array(value :_*))
    
    @scala.inline
    def setAnnotations(value: js.Array[dxChartAnnotationConfig | _]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setArgumentAxis(value: dxChartArgumentAxis): Self = this.set("argumentAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgumentAxis: Self = this.set("argumentAxis", js.undefined)
    
    @scala.inline
    def setAutoHidePointMarkers(value: Boolean): Self = this.set("autoHidePointMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHidePointMarkers: Self = this.set("autoHidePointMarkers", js.undefined)
    
    @scala.inline
    def setBarGroupPadding(value: Double): Self = this.set("barGroupPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarGroupPadding: Self = this.set("barGroupPadding", js.undefined)
    
    @scala.inline
    def setBarGroupWidth(value: Double): Self = this.set("barGroupWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarGroupWidth: Self = this.set("barGroupWidth", js.undefined)
    
    @scala.inline
    def setCommonAnnotationSettings(value: dxChartCommonAnnotationConfig): Self = this.set("commonAnnotationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonAnnotationSettings: Self = this.set("commonAnnotationSettings", js.undefined)
    
    @scala.inline
    def setCommonAxisSettings(value: dxChartCommonAxisSettings): Self = this.set("commonAxisSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonAxisSettings: Self = this.set("commonAxisSettings", js.undefined)
    
    @scala.inline
    def setCommonPaneSettings(value: dxChartCommonPaneSettings): Self = this.set("commonPaneSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonPaneSettings: Self = this.set("commonPaneSettings", js.undefined)
    
    @scala.inline
    def setCommonSeriesSettings(value: dxChartCommonSeriesSettings): Self = this.set("commonSeriesSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonSeriesSettings: Self = this.set("commonSeriesSettings", js.undefined)
    
    @scala.inline
    def setContainerBackgroundColor(value: String): Self = this.set("containerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerBackgroundColor: Self = this.set("containerBackgroundColor", js.undefined)
    
    @scala.inline
    def setCrosshair(value: HorizontalLine): Self = this.set("crosshair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshair: Self = this.set("crosshair", js.undefined)
    
    @scala.inline
    def setCustomizeAnnotation(value: /* annotation */ dxChartAnnotationConfig | js.Any => dxChartAnnotationConfig): Self = this.set("customizeAnnotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeAnnotation: Self = this.set("customizeAnnotation", js.undefined)
    
    @scala.inline
    def setDataPrepareSettings(value: CheckTypeForAllData): Self = this.set("dataPrepareSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataPrepareSettings: Self = this.set("dataPrepareSettings", js.undefined)
    
    @scala.inline
    def setDefaultPane(value: String): Self = this.set("defaultPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPane: Self = this.set("defaultPane", js.undefined)
    
    @scala.inline
    def setLegend(value: dxChartLegend): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setMaxBubbleSize(value: Double): Self = this.set("maxBubbleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBubbleSize: Self = this.set("maxBubbleSize", js.undefined)
    
    @scala.inline
    def setMinBubbleSize(value: Double): Self = this.set("minBubbleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinBubbleSize: Self = this.set("minBubbleSize", js.undefined)
    
    @scala.inline
    def setNegativesAsZeroes(value: Boolean): Self = this.set("negativesAsZeroes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativesAsZeroes: Self = this.set("negativesAsZeroes", js.undefined)
    
    @scala.inline
    def setOnArgumentAxisClickFunction1(value: /* e */ Argument => _): Self = this.set("onArgumentAxisClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnArgumentAxisClick(value: (js.Function1[/* e */ Argument, _]) | String): Self = this.set("onArgumentAxisClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnArgumentAxisClick: Self = this.set("onArgumentAxisClick", js.undefined)
    
    @scala.inline
    def setOnLegendClickFunction1(value: /* e */ EventModelTarget => _): Self = this.set("onLegendClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLegendClick(value: (js.Function1[/* e */ EventModelTarget, _]) | String): Self = this.set("onLegendClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLegendClick: Self = this.set("onLegendClick", js.undefined)
    
    @scala.inline
    def setOnSeriesClickFunction1(value: /* e */ EventModelTarget => _): Self = this.set("onSeriesClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSeriesClick(value: (js.Function1[/* e */ EventModelTarget, _]) | String): Self = this.set("onSeriesClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSeriesClick: Self = this.set("onSeriesClick", js.undefined)
    
    @scala.inline
    def setOnSeriesHoverChanged(value: /* e */ `22` => _): Self = this.set("onSeriesHoverChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSeriesHoverChanged: Self = this.set("onSeriesHoverChanged", js.undefined)
    
    @scala.inline
    def setOnSeriesSelectionChanged(value: /* e */ `22` => _): Self = this.set("onSeriesSelectionChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSeriesSelectionChanged: Self = this.set("onSeriesSelectionChanged", js.undefined)
    
    @scala.inline
    def setOnZoomEnd(value: /* e */ ActionType => _): Self = this.set("onZoomEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnZoomEnd: Self = this.set("onZoomEnd", js.undefined)
    
    @scala.inline
    def setOnZoomStart(value: /* e */ Axis => _): Self = this.set("onZoomStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnZoomStart: Self = this.set("onZoomStart", js.undefined)
    
    @scala.inline
    def setPanesVarargs(value: dxChartPanes*): Self = this.set("panes", js.Array(value :_*))
    
    @scala.inline
    def setPanes(value: dxChartPanes | js.Array[dxChartPanes]): Self = this.set("panes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanes: Self = this.set("panes", js.undefined)
    
    @scala.inline
    def setResizePanesOnZoom(value: Boolean): Self = this.set("resizePanesOnZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizePanesOnZoom: Self = this.set("resizePanesOnZoom", js.undefined)
    
    @scala.inline
    def setResolveLabelOverlapping(value: hide | none | stack): Self = this.set("resolveLabelOverlapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveLabelOverlapping: Self = this.set("resolveLabelOverlapping", js.undefined)
    
    @scala.inline
    def setRotated(value: Boolean): Self = this.set("rotated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotated: Self = this.set("rotated", js.undefined)
    
    @scala.inline
    def setScrollBar(value: Offset): Self = this.set("scrollBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollBar: Self = this.set("scrollBar", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: ChartSeries*): Self = this.set("series", js.Array(value :_*))
    
    @scala.inline
    def setSeries(value: ChartSeries | js.Array[ChartSeries]): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setSeriesSelectionMode(value: multiple | single_): Self = this.set("seriesSelectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesSelectionMode: Self = this.set("seriesSelectionMode", js.undefined)
    
    @scala.inline
    def setSeriesTemplate(value: CustomizeSeries): Self = this.set("seriesTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesTemplate: Self = this.set("seriesTemplate", js.undefined)
    
    @scala.inline
    def setStickyHovering(value: Boolean): Self = this.set("stickyHovering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickyHovering: Self = this.set("stickyHovering", js.undefined)
    
    @scala.inline
    def setSynchronizeMultiAxes(value: Boolean): Self = this.set("synchronizeMultiAxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynchronizeMultiAxes: Self = this.set("synchronizeMultiAxes", js.undefined)
    
    @scala.inline
    def setTooltip(value: dxChartTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setValueAxisVarargs(value: dxChartValueAxis*): Self = this.set("valueAxis", js.Array(value :_*))
    
    @scala.inline
    def setValueAxis(value: dxChartValueAxis | js.Array[dxChartValueAxis]): Self = this.set("valueAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueAxis: Self = this.set("valueAxis", js.undefined)
    
    @scala.inline
    def setZoomAndPan(value: AllowMouseWheel): Self = this.set("zoomAndPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomAndPan: Self = this.set("zoomAndPan", js.undefined)
  }
}
