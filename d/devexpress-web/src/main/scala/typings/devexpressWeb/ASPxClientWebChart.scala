package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the WebChartControl control.
  */
trait ASPxClientWebChart extends ASPxClientWebChartElement {
  /**
    * Provides access to the chart's collection of annotations.
    */
  var annotations: js.Array[ASPxClientAnnotation]
  /**
    * Gets the name of the appearance, which is currently used to draw the chart's elements.
    */
  var appearanceName: String
  /**
    * Gets the client-side Chart Control that owns the current chart.
    */
  var chartControl: ASPxClientWebChartControl
  /**
    * Gets the settings for a crosshair cursor concerning its position and appearance on a diagram.
    */
  var crosshairOptions: ASPxClientCrosshairOptions
  /**
    * Gets a css postfix for a chart.
    */
  var cssPostfix: String
  /**
    * Gets the chart's diagram and provides access to its settings.
    */
  var diagram: ASPxClientWebChartElement
  /**
    * Gets the chart's legend and provides access to its settings.
    */
  var legend: ASPxClientLegend
  /**
    * Returns the collection of legends.
    */
  var legends: js.Array[ASPxClientLegend]
  /**
    * Gets the name of the palette currently used to draw the chart's series.
    */
  var paletteName: String
  /**
    * Gets or sets a value which specifies how the chart elements are selected.
    */
  var selectionMode: String
  /**
    * Provides access to the chart's collection of series.
    */
  var series: js.Array[ASPxClientSeries]
  /**
    * Gets a value indicating whether a crosshair cursor should be shown.
    */
  var showCrosshair: Boolean
  /**
    * Gets a value indicating whether point tooltips should be shown.
    */
  var showPointToolTip: Boolean
  /**
    * Gets a value indicating whether series tooltips should be shown.
    */
  var showSeriesToolTip: Boolean
  /**
    * Provides access to the collection of chart titles.
    */
  var titles: js.Array[ASPxClientChartTitle]
  /**
    * Returns the tooltip controller that shows tooltips for chart elements.
    */
  var toolTipController: ASPxClientToolTipController
  /**
    * Gets a value that contains information on how the tooltip position is defined, for example, relative to a mouse pointer or chart element.
    */
  var toolTipPosition: ASPxClientToolTipPosition
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
}

