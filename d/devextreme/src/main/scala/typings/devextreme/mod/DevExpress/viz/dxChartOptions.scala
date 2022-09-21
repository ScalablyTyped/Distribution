package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.AllowMouseWheel
import typings.devextreme.anon.CheckTypeForAllData
import typings.devextreme.anon.ColorOffset
import typings.devextreme.anon.CustomizeSeries
import typings.devextreme.anon.HorizontalLine
import typings.devextreme.mod.DevExpress.common.SingleOrMultiple
import typings.devextreme.mod.DevExpress.common.charts.ChartsLabelOverlap
import typings.devextreme.mod.DevExpress.viz.dxChart.ArgumentAxisClickEvent
import typings.devextreme.mod.DevExpress.viz.dxChart.LegendClickEvent
import typings.devextreme.mod.DevExpress.viz.dxChart.SeriesClickEvent
import typings.devextreme.mod.DevExpress.viz.dxChart.SeriesHoverChangedEvent
import typings.devextreme.mod.DevExpress.viz.dxChart.SeriesSelectionChangedEvent
import typings.devextreme.mod.DevExpress.viz.dxChart.ZoomEndEvent
import typings.devextreme.mod.DevExpress.viz.dxChart.ZoomStartEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartOptions
  extends StObject
     with BaseChartOptions[dxChart] {
  
  /**
    * Specifies whether to adjust the value axis&apos;s visualRange when the argument axis is being zoomed or panned.
    */
  var adjustOnZoom: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the annotation collection.
    */
  var annotations: js.UndefOr[js.Array[dxChartAnnotationConfig | Any]] = js.undefined
  
  /**
    * Configures the argument axis.
    */
  var argumentAxis: js.UndefOr[dxChartArgumentAxis] = js.undefined
  
  /**
    * Specifies whether to hide series point markers automatically to reduce visual clutter.
    */
  var autoHidePointMarkers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls the padding and consequently the width of a group of bars with the same argument using relative units. Ignored if the barGroupWidth property is set.
    */
  var barGroupPadding: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a fixed width for groups of bars with the same argument, measured in pixels. Takes precedence over the barGroupPadding property.
    */
  var barGroupWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies settings common for all annotations in the chart.
    */
  var commonAnnotationSettings: js.UndefOr[dxChartCommonAnnotationConfig] = js.undefined
  
  /**
    * Defines common settings for both the argument and value axis in a chart.
    */
  var commonAxisSettings: js.UndefOr[dxChartCommonAxisSettings] = js.undefined
  
  /**
    * Defines common settings for all panes in a chart.
    */
  var commonPaneSettings: js.UndefOr[dxChartCommonPaneSettings] = js.undefined
  
  /**
    * Specifies settings common for all series in the chart.
    */
  var commonSeriesSettings: js.UndefOr[dxChartCommonSeriesSettings] = js.undefined
  
  /**
    * Colors the background of the chart container.
    */
  var containerBackgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Configures the crosshair feature.
    */
  var crosshair: js.UndefOr[HorizontalLine] = js.undefined
  
  /**
    * Customizes an individual annotation.
    */
  var customizeAnnotation: js.UndefOr[
    js.Function1[/* annotation */ dxChartAnnotationConfig | Any, dxChartAnnotationConfig]
  ] = js.undefined
  
  /**
    * Processes data before visualizing it.
    */
  var dataPrepareSettings: js.UndefOr[CheckTypeForAllData] = js.undefined
  
  /**
    * Specifies which pane should be used by default.
    */
  var defaultPane: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the properties of a chart&apos;s legend.
    */
  @JSName("legend")
  var legend_dxChartOptions: js.UndefOr[dxChartLegend] = js.undefined
  
  /**
    * Specifies a coefficient determining the diameter of the largest bubble.
    */
  var maxBubbleSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the diameter of the smallest bubble measured in pixels.
    */
  var minBubbleSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Forces the UI component to treat negative values as zeroes. Applies to stacked-like series only.
    */
  var negativesAsZeroes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that is executed when a label on the argument axis is clicked or tapped.
    */
  var onArgumentAxisClick: js.UndefOr[(js.Function1[/* e */ ArgumentAxisClickEvent, Unit]) | String] = js.undefined
  
  /**
    * A function that is executed when a legend item is clicked or tapped.
    */
  var onLegendClick: js.UndefOr[(js.Function1[/* e */ LegendClickEvent, Unit]) | String] = js.undefined
  
  /**
    * A function that is executed when a series is clicked or tapped.
    */
  var onSeriesClick: js.UndefOr[(js.Function1[/* e */ SeriesClickEvent, Unit]) | String] = js.undefined
  
  /**
    * A function that is executed after the pointer enters or leaves a series.
    */
  var onSeriesHoverChanged: js.UndefOr[js.Function1[/* e */ SeriesHoverChangedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a series is selected or selection is canceled.
    */
  var onSeriesSelectionChanged: js.UndefOr[js.Function1[/* e */ SeriesSelectionChangedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when zooming or panning ends.
    */
  var onZoomEnd: js.UndefOr[js.Function1[/* e */ ZoomEndEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when zooming or panning begins.
    */
  var onZoomStart: js.UndefOr[js.Function1[/* e */ ZoomStartEvent, Unit]] = js.undefined
  
  /**
    * Declares a collection of panes.
    */
  var panes: js.UndefOr[dxChartPanes | js.Array[dxChartPanes]] = js.undefined
  
  /**
    * Specifies whether panes can be resized if other chart elements require more space after zooming or panning.
    */
  var resizePanesOnZoom: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how the chart must behave when series point labels overlap.
    */
  var resolveLabelOverlapping: js.UndefOr[ChartsLabelOverlap] = js.undefined
  
  /**
    * Swaps the axes around making the value axis horizontal and the argument axis vertical.
    */
  var rotated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the settings of the scroll bar.
    */
  var scrollBar: js.UndefOr[ColorOffset] = js.undefined
  
  /**
    * Specifies whether a single series or multiple series can be selected in the chart.
    */
  var seriesSelectionMode: js.UndefOr[SingleOrMultiple] = js.undefined
  
  /**
    * Defines properties for the series template.
    */
  var seriesTemplate: js.UndefOr[CustomizeSeries] = js.undefined
  
  /**
    * Specifies properties for Chart UI component series.
    */
  @JSName("series")
  var series_dxChartOptions: js.UndefOr[ChartSeries | js.Array[ChartSeries]] = js.undefined
  
  /**
    * Specifies whether a point should remain in the hover state when the mouse pointer moves away.
    */
  var stickyHovering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether or not to synchronize value axes when they are displayed on a single pane.
    */
  var synchronizeMultiAxes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures tooltips.
    */
  @JSName("tooltip")
  var tooltip_dxChartOptions: js.UndefOr[dxChartTooltip] = js.undefined
  
  /**
    * Configures the value axis.
    */
  var valueAxis: js.UndefOr[dxChartValueAxis | js.Array[dxChartValueAxis]] = js.undefined
  
  /**
    * Configures zooming and panning.
    */
  var zoomAndPan: js.UndefOr[AllowMouseWheel] = js.undefined
}
object dxChartOptions {
  
  inline def apply(): dxChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartOptions]
  }
  
  extension [Self <: dxChartOptions](x: Self) {
    
    inline def setAdjustOnZoom(value: Boolean): Self = StObject.set(x, "adjustOnZoom", value.asInstanceOf[js.Any])
    
    inline def setAdjustOnZoomUndefined: Self = StObject.set(x, "adjustOnZoom", js.undefined)
    
    inline def setAnnotations(value: js.Array[dxChartAnnotationConfig | Any]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: (dxChartAnnotationConfig | Any)*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setArgumentAxis(value: dxChartArgumentAxis): Self = StObject.set(x, "argumentAxis", value.asInstanceOf[js.Any])
    
    inline def setArgumentAxisUndefined: Self = StObject.set(x, "argumentAxis", js.undefined)
    
    inline def setAutoHidePointMarkers(value: Boolean): Self = StObject.set(x, "autoHidePointMarkers", value.asInstanceOf[js.Any])
    
    inline def setAutoHidePointMarkersUndefined: Self = StObject.set(x, "autoHidePointMarkers", js.undefined)
    
    inline def setBarGroupPadding(value: Double): Self = StObject.set(x, "barGroupPadding", value.asInstanceOf[js.Any])
    
    inline def setBarGroupPaddingUndefined: Self = StObject.set(x, "barGroupPadding", js.undefined)
    
    inline def setBarGroupWidth(value: Double): Self = StObject.set(x, "barGroupWidth", value.asInstanceOf[js.Any])
    
    inline def setBarGroupWidthUndefined: Self = StObject.set(x, "barGroupWidth", js.undefined)
    
    inline def setCommonAnnotationSettings(value: dxChartCommonAnnotationConfig): Self = StObject.set(x, "commonAnnotationSettings", value.asInstanceOf[js.Any])
    
    inline def setCommonAnnotationSettingsUndefined: Self = StObject.set(x, "commonAnnotationSettings", js.undefined)
    
    inline def setCommonAxisSettings(value: dxChartCommonAxisSettings): Self = StObject.set(x, "commonAxisSettings", value.asInstanceOf[js.Any])
    
    inline def setCommonAxisSettingsUndefined: Self = StObject.set(x, "commonAxisSettings", js.undefined)
    
    inline def setCommonPaneSettings(value: dxChartCommonPaneSettings): Self = StObject.set(x, "commonPaneSettings", value.asInstanceOf[js.Any])
    
    inline def setCommonPaneSettingsUndefined: Self = StObject.set(x, "commonPaneSettings", js.undefined)
    
    inline def setCommonSeriesSettings(value: dxChartCommonSeriesSettings): Self = StObject.set(x, "commonSeriesSettings", value.asInstanceOf[js.Any])
    
    inline def setCommonSeriesSettingsUndefined: Self = StObject.set(x, "commonSeriesSettings", js.undefined)
    
    inline def setContainerBackgroundColor(value: String): Self = StObject.set(x, "containerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setContainerBackgroundColorUndefined: Self = StObject.set(x, "containerBackgroundColor", js.undefined)
    
    inline def setCrosshair(value: HorizontalLine): Self = StObject.set(x, "crosshair", value.asInstanceOf[js.Any])
    
    inline def setCrosshairUndefined: Self = StObject.set(x, "crosshair", js.undefined)
    
    inline def setCustomizeAnnotation(value: /* annotation */ dxChartAnnotationConfig | Any => dxChartAnnotationConfig): Self = StObject.set(x, "customizeAnnotation", js.Any.fromFunction1(value))
    
    inline def setCustomizeAnnotationUndefined: Self = StObject.set(x, "customizeAnnotation", js.undefined)
    
    inline def setDataPrepareSettings(value: CheckTypeForAllData): Self = StObject.set(x, "dataPrepareSettings", value.asInstanceOf[js.Any])
    
    inline def setDataPrepareSettingsUndefined: Self = StObject.set(x, "dataPrepareSettings", js.undefined)
    
    inline def setDefaultPane(value: String): Self = StObject.set(x, "defaultPane", value.asInstanceOf[js.Any])
    
    inline def setDefaultPaneUndefined: Self = StObject.set(x, "defaultPane", js.undefined)
    
    inline def setLegend(value: dxChartLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setMaxBubbleSize(value: Double): Self = StObject.set(x, "maxBubbleSize", value.asInstanceOf[js.Any])
    
    inline def setMaxBubbleSizeUndefined: Self = StObject.set(x, "maxBubbleSize", js.undefined)
    
    inline def setMinBubbleSize(value: Double): Self = StObject.set(x, "minBubbleSize", value.asInstanceOf[js.Any])
    
    inline def setMinBubbleSizeUndefined: Self = StObject.set(x, "minBubbleSize", js.undefined)
    
    inline def setNegativesAsZeroes(value: Boolean): Self = StObject.set(x, "negativesAsZeroes", value.asInstanceOf[js.Any])
    
    inline def setNegativesAsZeroesUndefined: Self = StObject.set(x, "negativesAsZeroes", js.undefined)
    
    inline def setOnArgumentAxisClick(value: (js.Function1[/* e */ ArgumentAxisClickEvent, Unit]) | String): Self = StObject.set(x, "onArgumentAxisClick", value.asInstanceOf[js.Any])
    
    inline def setOnArgumentAxisClickFunction1(value: /* e */ ArgumentAxisClickEvent => Unit): Self = StObject.set(x, "onArgumentAxisClick", js.Any.fromFunction1(value))
    
    inline def setOnArgumentAxisClickUndefined: Self = StObject.set(x, "onArgumentAxisClick", js.undefined)
    
    inline def setOnLegendClick(value: (js.Function1[/* e */ LegendClickEvent, Unit]) | String): Self = StObject.set(x, "onLegendClick", value.asInstanceOf[js.Any])
    
    inline def setOnLegendClickFunction1(value: /* e */ LegendClickEvent => Unit): Self = StObject.set(x, "onLegendClick", js.Any.fromFunction1(value))
    
    inline def setOnLegendClickUndefined: Self = StObject.set(x, "onLegendClick", js.undefined)
    
    inline def setOnSeriesClick(value: (js.Function1[/* e */ SeriesClickEvent, Unit]) | String): Self = StObject.set(x, "onSeriesClick", value.asInstanceOf[js.Any])
    
    inline def setOnSeriesClickFunction1(value: /* e */ SeriesClickEvent => Unit): Self = StObject.set(x, "onSeriesClick", js.Any.fromFunction1(value))
    
    inline def setOnSeriesClickUndefined: Self = StObject.set(x, "onSeriesClick", js.undefined)
    
    inline def setOnSeriesHoverChanged(value: /* e */ SeriesHoverChangedEvent => Unit): Self = StObject.set(x, "onSeriesHoverChanged", js.Any.fromFunction1(value))
    
    inline def setOnSeriesHoverChangedUndefined: Self = StObject.set(x, "onSeriesHoverChanged", js.undefined)
    
    inline def setOnSeriesSelectionChanged(value: /* e */ SeriesSelectionChangedEvent => Unit): Self = StObject.set(x, "onSeriesSelectionChanged", js.Any.fromFunction1(value))
    
    inline def setOnSeriesSelectionChangedUndefined: Self = StObject.set(x, "onSeriesSelectionChanged", js.undefined)
    
    inline def setOnZoomEnd(value: /* e */ ZoomEndEvent => Unit): Self = StObject.set(x, "onZoomEnd", js.Any.fromFunction1(value))
    
    inline def setOnZoomEndUndefined: Self = StObject.set(x, "onZoomEnd", js.undefined)
    
    inline def setOnZoomStart(value: /* e */ ZoomStartEvent => Unit): Self = StObject.set(x, "onZoomStart", js.Any.fromFunction1(value))
    
    inline def setOnZoomStartUndefined: Self = StObject.set(x, "onZoomStart", js.undefined)
    
    inline def setPanes(value: dxChartPanes | js.Array[dxChartPanes]): Self = StObject.set(x, "panes", value.asInstanceOf[js.Any])
    
    inline def setPanesUndefined: Self = StObject.set(x, "panes", js.undefined)
    
    inline def setPanesVarargs(value: dxChartPanes*): Self = StObject.set(x, "panes", js.Array(value*))
    
    inline def setResizePanesOnZoom(value: Boolean): Self = StObject.set(x, "resizePanesOnZoom", value.asInstanceOf[js.Any])
    
    inline def setResizePanesOnZoomUndefined: Self = StObject.set(x, "resizePanesOnZoom", js.undefined)
    
    inline def setResolveLabelOverlapping(value: ChartsLabelOverlap): Self = StObject.set(x, "resolveLabelOverlapping", value.asInstanceOf[js.Any])
    
    inline def setResolveLabelOverlappingUndefined: Self = StObject.set(x, "resolveLabelOverlapping", js.undefined)
    
    inline def setRotated(value: Boolean): Self = StObject.set(x, "rotated", value.asInstanceOf[js.Any])
    
    inline def setRotatedUndefined: Self = StObject.set(x, "rotated", js.undefined)
    
    inline def setScrollBar(value: ColorOffset): Self = StObject.set(x, "scrollBar", value.asInstanceOf[js.Any])
    
    inline def setScrollBarUndefined: Self = StObject.set(x, "scrollBar", js.undefined)
    
    inline def setSeries(value: ChartSeries | js.Array[ChartSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesSelectionMode(value: SingleOrMultiple): Self = StObject.set(x, "seriesSelectionMode", value.asInstanceOf[js.Any])
    
    inline def setSeriesSelectionModeUndefined: Self = StObject.set(x, "seriesSelectionMode", js.undefined)
    
    inline def setSeriesTemplate(value: CustomizeSeries): Self = StObject.set(x, "seriesTemplate", value.asInstanceOf[js.Any])
    
    inline def setSeriesTemplateUndefined: Self = StObject.set(x, "seriesTemplate", js.undefined)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: ChartSeries*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setStickyHovering(value: Boolean): Self = StObject.set(x, "stickyHovering", value.asInstanceOf[js.Any])
    
    inline def setStickyHoveringUndefined: Self = StObject.set(x, "stickyHovering", js.undefined)
    
    inline def setSynchronizeMultiAxes(value: Boolean): Self = StObject.set(x, "synchronizeMultiAxes", value.asInstanceOf[js.Any])
    
    inline def setSynchronizeMultiAxesUndefined: Self = StObject.set(x, "synchronizeMultiAxes", js.undefined)
    
    inline def setTooltip(value: dxChartTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setValueAxis(value: dxChartValueAxis | js.Array[dxChartValueAxis]): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    inline def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
    
    inline def setValueAxisVarargs(value: dxChartValueAxis*): Self = StObject.set(x, "valueAxis", js.Array(value*))
    
    inline def setZoomAndPan(value: AllowMouseWheel): Self = StObject.set(x, "zoomAndPan", value.asInstanceOf[js.Any])
    
    inline def setZoomAndPanUndefined: Self = StObject.set(x, "zoomAndPan", js.undefined)
  }
}
