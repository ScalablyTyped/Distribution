package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the WebChartControl control.
  */
@js.native
trait ASPxClientWebChart extends ASPxClientWebChartElement {
  
  /**
    * Provides access to the chart's collection of annotations.
    */
  var annotations: js.Array[ASPxClientAnnotation] = js.native
  
  /**
    * Gets the name of the appearance, which is currently used to draw the chart's elements.
    */
  var appearanceName: String = js.native
  
  /**
    * Gets the client-side Chart Control that owns the current chart.
    */
  var chartControl: ASPxClientWebChartControl = js.native
  
  /**
    * Gets the settings for a crosshair cursor concerning its position and appearance on a diagram.
    */
  var crosshairOptions: ASPxClientCrosshairOptions = js.native
  
  /**
    * Gets a css postfix for a chart.
    */
  var cssPostfix: String = js.native
  
  /**
    * Gets the chart's diagram and provides access to its settings.
    */
  var diagram: ASPxClientWebChartElement = js.native
  
  /**
    * Gets the chart's legend and provides access to its settings.
    */
  var legend: ASPxClientLegend = js.native
  
  /**
    * Returns the collection of legends.
    */
  var legends: js.Array[ASPxClientLegend] = js.native
  
  /**
    * Gets the name of the palette currently used to draw the chart's series.
    */
  var paletteName: String = js.native
  
  /**
    * Gets or sets a value which specifies how the chart elements are selected.
    */
  var selectionMode: String = js.native
  
  /**
    * Provides access to the chart's collection of series.
    */
  var series: js.Array[ASPxClientSeries] = js.native
  
  /**
    * Gets a value indicating whether a crosshair cursor should be shown.
    */
  var showCrosshair: Boolean = js.native
  
  /**
    * Gets a value indicating whether point tooltips should be shown.
    */
  var showPointToolTip: Boolean = js.native
  
  /**
    * Gets a value indicating whether series tooltips should be shown.
    */
  var showSeriesToolTip: Boolean = js.native
  
  /**
    * Provides access to the collection of chart titles.
    */
  var titles: js.Array[ASPxClientChartTitle] = js.native
  
  /**
    * Returns the tooltip controller that shows tooltips for chart elements.
    */
  var toolTipController: ASPxClientToolTipController = js.native
  
  /**
    * Gets a value that contains information on how the tooltip position is defined, for example, relative to a mouse pointer or chart element.
    */
  var toolTipPosition: ASPxClientToolTipPosition = js.native
}
object ASPxClientWebChart {
  
  @scala.inline
  def apply(
    annotations: js.Array[ASPxClientAnnotation],
    appearanceName: String,
    chart: ASPxClientWebChart,
    chartControl: ASPxClientWebChartControl,
    crosshairOptions: ASPxClientCrosshairOptions,
    cssPostfix: String,
    diagram: ASPxClientWebChartElement,
    legend: ASPxClientLegend,
    legends: js.Array[ASPxClientLegend],
    paletteName: String,
    selectionMode: String,
    series: js.Array[ASPxClientSeries],
    showCrosshair: Boolean,
    showPointToolTip: Boolean,
    showSeriesToolTip: Boolean,
    titles: js.Array[ASPxClientChartTitle],
    toolTipController: ASPxClientToolTipController,
    toolTipPosition: ASPxClientToolTipPosition
  ): ASPxClientWebChart = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], appearanceName = appearanceName.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], chartControl = chartControl.asInstanceOf[js.Any], crosshairOptions = crosshairOptions.asInstanceOf[js.Any], cssPostfix = cssPostfix.asInstanceOf[js.Any], diagram = diagram.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any], paletteName = paletteName.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], showCrosshair = showCrosshair.asInstanceOf[js.Any], showPointToolTip = showPointToolTip.asInstanceOf[js.Any], showSeriesToolTip = showSeriesToolTip.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any], toolTipController = toolTipController.asInstanceOf[js.Any], toolTipPosition = toolTipPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebChart]
  }
  
  @scala.inline
  implicit class ASPxClientWebChartMutableBuilder[Self <: ASPxClientWebChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(value: js.Array[ASPxClientAnnotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsVarargs(value: ASPxClientAnnotation*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    @scala.inline
    def setAppearanceName(value: String): Self = StObject.set(x, "appearanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartControl(value: ASPxClientWebChartControl): Self = StObject.set(x, "chartControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairOptions(value: ASPxClientCrosshairOptions): Self = StObject.set(x, "crosshairOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssPostfix(value: String): Self = StObject.set(x, "cssPostfix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagram(value: ASPxClientWebChartElement): Self = StObject.set(x, "diagram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegend(value: ASPxClientLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegends(value: js.Array[ASPxClientLegend]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendsVarargs(value: ASPxClientLegend*): Self = StObject.set(x, "legends", js.Array(value :_*))
    
    @scala.inline
    def setPaletteName(value: String): Self = StObject.set(x, "paletteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionMode(value: String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeries(value: js.Array[ASPxClientSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesVarargs(value: ASPxClientSeries*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    @scala.inline
    def setShowCrosshair(value: Boolean): Self = StObject.set(x, "showCrosshair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPointToolTip(value: Boolean): Self = StObject.set(x, "showPointToolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSeriesToolTip(value: Boolean): Self = StObject.set(x, "showSeriesToolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitles(value: js.Array[ASPxClientChartTitle]): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlesVarargs(value: ASPxClientChartTitle*): Self = StObject.set(x, "titles", js.Array(value :_*))
    
    @scala.inline
    def setToolTipController(value: ASPxClientToolTipController): Self = StObject.set(x, "toolTipController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolTipPosition(value: ASPxClientToolTipPosition): Self = StObject.set(x, "toolTipPosition", value.asInstanceOf[js.Any])
  }
}
