package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the WebChartControl control.
  */
trait ASPxClientWebChart extends ASPxClientWebChartElement {
  /**
    * Provides access to the chart's collection of annotations.
    * Value: An array of ASPxClientAnnotation objects, representing the collection of annotations.
    */
  var annotations: js.Array[ASPxClientAnnotation]
  /**
    * Gets the name of the appearance, which is currently used to draw the chart's elements.
    * Value: A string value that represents the appearance name.
    */
  var appearanceName: String
  /**
    * Gets the client-side Chart Control that owns the current chart.
    * Value: An ASPxClientWebChartControl object, to which the chart belongs.
    */
  var chartControl: ASPxClientWebChartControl
  /**
    * Gets the settings for a crosshair cursor concerning its position and appearance on a diagram.
    * Value: An ASPxClientCrosshairOptions object descendant which provides access to crosshair cursor options on a diagram.
    */
  var crosshairOptions: ASPxClientCrosshairOptions
  /**
    * Gets a css postfix for a chart.
    * Value: A string value.
    */
  var cssPostfix: String
  /**
    * Gets the chart's diagram and provides access to its settings.
    * Value: An ASPxClientRadarDiagram),  that represents the chart's diagram.
    */
  var diagram: ASPxClientWebChartElement
  /**
    * Gets the chart's legend and provides access to its settings.
    * Value: An ASPxClientLegend object that represents the chart's legend.
    */
  var legend: ASPxClientLegend
  /**
    * Returns the collection of legends.
    * Value: An array of ASPxClientLegend objects.
    */
  var legends: js.Array[ASPxClientLegend]
  /**
    * Gets the name of the palette currently used to draw the chart's series.
    * Value: A string value that represents the palette name.
    */
  var paletteName: String
  /**
    * Gets or sets a value which specifies how the chart elements are selected.
    * Value: A String object representing the name of the selection mode.
    */
  var selectionMode: String
  /**
    * Provides access to the chart's collection of series.
    * Value: An array of ASPxClientSeries objects that represent the collection of series.
    */
  var series: js.Array[ASPxClientSeries]
  /**
    * Gets a value indicating whether a crosshair cursor should be shown.
    * Value: true to show a crosshair cursor; otherwise, false.
    */
  var showCrosshair: Boolean
  /**
    * Gets a value indicating whether point tooltips should be shown.
    * Value: true to show tooltips for series points; otherwise, false.
    */
  var showPointToolTip: Boolean
  /**
    * Gets a value indicating whether series tooltips should be shown.
    * Value: true to show tooltips for series; otherwise, false.
    */
  var showSeriesToolTip: Boolean
  /**
    * Provides access to the collection of chart titles.
    * Value: An array of ASPxClientChartTitle objects, that represent the collection of chart titles.
    */
  var titles: js.Array[ASPxClientChartTitle]
  /**
    * Returns the tooltip controller that shows tooltips for chart elements.
    * Value: An ASPxClientToolTipController object.
    */
  var toolTipController: ASPxClientToolTipController
  /**
    * Gets a value that contains information on how the tooltip position is defined, for example, relative to a mouse pointer or chart element.
    * Value: An ASPxClientToolTipPosition class descendant that defines the tooltip position type.
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
    val __obj = js.Dynamic.literal(annotations = annotations, appearanceName = appearanceName, chart = chart, chartControl = chartControl, crosshairOptions = crosshairOptions, cssPostfix = cssPostfix, diagram = diagram, legend = legend, legends = legends, paletteName = paletteName, selectionMode = selectionMode, series = series, showCrosshair = showCrosshair, showPointToolTip = showPointToolTip, showSeriesToolTip = showSeriesToolTip, titles = titles, toolTipController = toolTipController, toolTipPosition = toolTipPosition)
  
    __obj.asInstanceOf[ASPxClientWebChart]
  }
}

