package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the WebChartControl control.
  */
@JSGlobal("ASPxClientWebChart")
@js.native
class ASPxClientWebChart () extends ASPxClientWebChartElement {
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

