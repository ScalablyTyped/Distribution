package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the WebChartControl control.
  */
@JSGlobal("ASPxClientWebChart")
@js.native
class ASPxClientWebChart ()
  extends typings.devexpressWeb.ASPxClientWebChart {
  /**
    * Provides access to the chart's collection of annotations.
    */
  /* CompleteClass */
  override var annotations: js.Array[typings.devexpressWeb.ASPxClientAnnotation] = js.native
  /**
    * Gets the name of the appearance, which is currently used to draw the chart's elements.
    */
  /* CompleteClass */
  override var appearanceName: String = js.native
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets the client-side Chart Control that owns the current chart.
    */
  /* CompleteClass */
  override var chartControl: typings.devexpressWeb.ASPxClientWebChartControl = js.native
  /**
    * Gets the settings for a crosshair cursor concerning its position and appearance on a diagram.
    */
  /* CompleteClass */
  override var crosshairOptions: typings.devexpressWeb.ASPxClientCrosshairOptions = js.native
  /**
    * Gets a css postfix for a chart.
    */
  /* CompleteClass */
  override var cssPostfix: String = js.native
  /**
    * Gets the chart's diagram and provides access to its settings.
    */
  /* CompleteClass */
  override var diagram: typings.devexpressWeb.ASPxClientWebChartElement = js.native
  /**
    * Gets the chart's legend and provides access to its settings.
    */
  /* CompleteClass */
  override var legend: typings.devexpressWeb.ASPxClientLegend = js.native
  /**
    * Returns the collection of legends.
    */
  /* CompleteClass */
  override var legends: js.Array[typings.devexpressWeb.ASPxClientLegend] = js.native
  /**
    * Gets the name of the palette currently used to draw the chart's series.
    */
  /* CompleteClass */
  override var paletteName: String = js.native
  /**
    * Gets or sets a value which specifies how the chart elements are selected.
    */
  /* CompleteClass */
  override var selectionMode: String = js.native
  /**
    * Provides access to the chart's collection of series.
    */
  /* CompleteClass */
  override var series: js.Array[typings.devexpressWeb.ASPxClientSeries] = js.native
  /**
    * Gets a value indicating whether a crosshair cursor should be shown.
    */
  /* CompleteClass */
  override var showCrosshair: Boolean = js.native
  /**
    * Gets a value indicating whether point tooltips should be shown.
    */
  /* CompleteClass */
  override var showPointToolTip: Boolean = js.native
  /**
    * Gets a value indicating whether series tooltips should be shown.
    */
  /* CompleteClass */
  override var showSeriesToolTip: Boolean = js.native
  /**
    * Provides access to the collection of chart titles.
    */
  /* CompleteClass */
  override var titles: js.Array[typings.devexpressWeb.ASPxClientChartTitle] = js.native
  /**
    * Returns the tooltip controller that shows tooltips for chart elements.
    */
  /* CompleteClass */
  override var toolTipController: typings.devexpressWeb.ASPxClientToolTipController = js.native
  /**
    * Gets a value that contains information on how the tooltip position is defined, for example, relative to a mouse pointer or chart element.
    */
  /* CompleteClass */
  override var toolTipPosition: typings.devexpressWeb.ASPxClientToolTipPosition = js.native
}

