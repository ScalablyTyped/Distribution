package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Series class.
  */
@JSGlobal("ASPxClientSeries")
@js.native
class ASPxClientSeries () extends ASPxClientWebChartElementNamed {
  /**
    * Gets a value indicating whether a crosshair cursor is enabled.
    */
  var actualCrosshairEnabled: Boolean = js.native
  /**
    * Gets a value indicating whether a crosshair label should be shown for this series.
    */
  var actualCrosshairLabelVisibility: Boolean = js.native
  /**
    * Gets a value that specifies the scale type for the argument data of the series' data points.
    */
  var argumentScaleType: String = js.native
  /**
    * Gets the X-Axis that is used to plot the current series on the XY-diagram.
    */
  var axisX: String = js.native
  /**
    * Gets the Y-Axis that is used to plot the current series on the XY-diagram.
    */
  var axisY: String = js.native
  /**
    * Gets the color of a series.
    */
  var color: String = js.native
  /**
    * Gets a string which represents the pattern specifying the text to be displayed within a crosshair label for the current Series  type.
    */
  var crosshairLabelPattern: String = js.native
  /**
    * Returns a collection of crosshair value items.
    */
  var crosshairValueItems: js.Array[ASPxClientCrosshairValueItem] = js.native
  /** @deprecated This property is now obsolete. Use the indicators property instead. */
  /**
    * Provides access to the collection of Fibonacci Indicators.
    */
  var fibonacciIndicators: js.Array[ASPxClientFibonacciIndicator] = js.native
  /**
    * This property is intended for internal use only.
    */
  var groupedElementsPattern: String = js.native
  /**
    * Gets the series' collection of indicators.
    */
  var indicators: js.Array[ASPxClientIndicator] = js.native
  /**
    * Gets the settings of series labels.
    */
  var label: ASPxClientSeriesLabel = js.native
  /**
    * Gets the pane that is used to plot the current series on the XY-diagram.
    */
  var pane: String = js.native
  /**
    * Gets the series' collection of data points.
    */
  var points: js.Array[ASPxClientSeriesPoint] = js.native
  /** @deprecated This property is now obsolete. Use the indicators property instead. */
  /**
    * Provides access to the collection of regression lines.
    */
  var regressionLines: js.Array[ASPxClientRegressionLine] = js.native
  /**
    * Gets a value that defines a group for stacked series.
    */
  var stackedGroup: String = js.native
  /**
    * Provides access to the collection of series titles.
    */
  var titles: js.Array[ASPxClientSeriesTitle] = js.native
  /**
    * Gets a value that specifies whether or not a tooltip is enabled for a chart.
    */
  var toolTipEnabled: Boolean = js.native
  /**
    * Gets an image to be displayed within series tooltips.
    */
  var toolTipImage: String = js.native
  /**
    * Gets the text to be displayed within series tooltips.
    */
  var toolTipText: String = js.native
  /** @deprecated This property is now obsolete. Use the indicators property instead. */
  /**
    * Provides access to the collection of trendlines.
    */
  var trendLines: js.Array[ASPxClientTrendLine] = js.native
  /**
    * Gets a value that specifies the scale type for the value data of the series' data points.
    */
  var valueScaleType: String = js.native
  /**
    * Gets a value that specifies the view type of the series.
    */
  var viewType: String = js.native
  /**
    * Gets a value indicating whether the series is visible.
    */
  var visible: Boolean = js.native
}

