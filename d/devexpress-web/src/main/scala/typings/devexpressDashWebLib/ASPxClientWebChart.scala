package typings
package devexpressDashWebLib

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
  var appearanceName: java.lang.String
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
  var cssPostfix: java.lang.String
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
  var paletteName: java.lang.String
  /**
    * Gets or sets a value which specifies how the chart elements are selected.
    * Value: A String object representing the name of the selection mode.
    */
  var selectionMode: java.lang.String
  /**
    * Provides access to the chart's collection of series.
    * Value: An array of ASPxClientSeries objects that represent the collection of series.
    */
  var series: js.Array[ASPxClientSeries]
  /**
    * Gets a value indicating whether a crosshair cursor should be shown.
    * Value: true to show a crosshair cursor; otherwise, false.
    */
  var showCrosshair: scala.Boolean
  /**
    * Gets a value indicating whether point tooltips should be shown.
    * Value: true to show tooltips for series points; otherwise, false.
    */
  var showPointToolTip: scala.Boolean
  /**
    * Gets a value indicating whether series tooltips should be shown.
    * Value: true to show tooltips for series; otherwise, false.
    */
  var showSeriesToolTip: scala.Boolean
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
    appearanceName: java.lang.String,
    chart: ASPxClientWebChart,
    chartControl: ASPxClientWebChartControl,
    crosshairOptions: ASPxClientCrosshairOptions,
    cssPostfix: java.lang.String,
    diagram: ASPxClientWebChartElement,
    legend: ASPxClientLegend,
    legends: js.Array[ASPxClientLegend],
    paletteName: java.lang.String,
    selectionMode: java.lang.String,
    series: js.Array[ASPxClientSeries],
    showCrosshair: scala.Boolean,
    showPointToolTip: scala.Boolean,
    showSeriesToolTip: scala.Boolean,
    titles: js.Array[ASPxClientChartTitle],
    toolTipController: ASPxClientToolTipController,
    toolTipPosition: ASPxClientToolTipPosition
  ): ASPxClientWebChart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("annotations")(annotations)
    __obj.updateDynamic("appearanceName")(appearanceName)
    __obj.updateDynamic("chart")(chart)
    __obj.updateDynamic("chartControl")(chartControl)
    __obj.updateDynamic("crosshairOptions")(crosshairOptions)
    __obj.updateDynamic("cssPostfix")(cssPostfix)
    __obj.updateDynamic("diagram")(diagram)
    __obj.updateDynamic("legend")(legend)
    __obj.updateDynamic("legends")(legends)
    __obj.updateDynamic("paletteName")(paletteName)
    __obj.updateDynamic("selectionMode")(selectionMode)
    __obj.updateDynamic("series")(series)
    __obj.updateDynamic("showCrosshair")(showCrosshair)
    __obj.updateDynamic("showPointToolTip")(showPointToolTip)
    __obj.updateDynamic("showSeriesToolTip")(showSeriesToolTip)
    __obj.updateDynamic("titles")(titles)
    __obj.updateDynamic("toolTipController")(toolTipController)
    __obj.updateDynamic("toolTipPosition")(toolTipPosition)
    __obj.asInstanceOf[ASPxClientWebChart]
  }
}

