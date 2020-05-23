package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the Series class.
  */
@JSGlobal("ASPxClientSeries")
@js.native
class ASPxClientSeries ()
  extends typings.devexpressWeb.ASPxClientSeries {
  /**
    * Gets a value indicating whether a crosshair cursor is enabled.
    */
  /* CompleteClass */
  override var actualCrosshairEnabled: Boolean = js.native
  /**
    * Gets a value indicating whether a crosshair label should be shown for this series.
    */
  /* CompleteClass */
  override var actualCrosshairLabelVisibility: Boolean = js.native
  /**
    * Gets a value that specifies the scale type for the argument data of the series' data points.
    */
  /* CompleteClass */
  override var argumentScaleType: String = js.native
  /**
    * Gets the X-Axis that is used to plot the current series on the XY-diagram.
    */
  /* CompleteClass */
  override var axisX: String = js.native
  /**
    * Gets the Y-Axis that is used to plot the current series on the XY-diagram.
    */
  /* CompleteClass */
  override var axisY: String = js.native
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets the color of a series.
    */
  /* CompleteClass */
  override var color: String = js.native
  /**
    * Gets a string which represents the pattern specifying the text to be displayed within a crosshair label for the current Series  type.
    */
  /* CompleteClass */
  override var crosshairLabelPattern: String = js.native
  /**
    * Returns a collection of crosshair value items.
    */
  /* CompleteClass */
  override var crosshairValueItems: js.Array[typings.devexpressWeb.ASPxClientCrosshairValueItem] = js.native
  /** @deprecated This property is now obsolete. Use the indicators property instead. */
  /**
    * Provides access to the collection of Fibonacci Indicators.
    */
  /* CompleteClass */
  override var fibonacciIndicators: js.Array[typings.devexpressWeb.ASPxClientFibonacciIndicator] = js.native
  /**
    * This property is intended for internal use only.
    */
  /* CompleteClass */
  override var groupedElementsPattern: String = js.native
  /**
    * Gets the series' collection of indicators.
    */
  /* CompleteClass */
  override var indicators: js.Array[typings.devexpressWeb.ASPxClientIndicator] = js.native
  /**
    * Gets the settings of series labels.
    */
  /* CompleteClass */
  override var label: typings.devexpressWeb.ASPxClientSeriesLabel = js.native
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Gets the pane that is used to plot the current series on the XY-diagram.
    */
  /* CompleteClass */
  override var pane: String = js.native
  /**
    * Gets the series' collection of data points.
    */
  /* CompleteClass */
  override var points: js.Array[typings.devexpressWeb.ASPxClientSeriesPoint] = js.native
  /** @deprecated This property is now obsolete. Use the indicators property instead. */
  /**
    * Provides access to the collection of regression lines.
    */
  /* CompleteClass */
  override var regressionLines: js.Array[typings.devexpressWeb.ASPxClientRegressionLine] = js.native
  /**
    * Gets a value that defines a group for stacked series.
    */
  /* CompleteClass */
  override var stackedGroup: String = js.native
  /**
    * Provides access to the collection of series titles.
    */
  /* CompleteClass */
  override var titles: js.Array[typings.devexpressWeb.ASPxClientSeriesTitle] = js.native
  /**
    * Gets a value that specifies whether or not a tooltip is enabled for a chart.
    */
  /* CompleteClass */
  override var toolTipEnabled: Boolean = js.native
  /**
    * Gets an image to be displayed within series tooltips.
    */
  /* CompleteClass */
  override var toolTipImage: String = js.native
  /**
    * Gets the text to be displayed within series tooltips.
    */
  /* CompleteClass */
  override var toolTipText: String = js.native
  /** @deprecated This property is now obsolete. Use the indicators property instead. */
  /**
    * Provides access to the collection of trendlines.
    */
  /* CompleteClass */
  override var trendLines: js.Array[typings.devexpressWeb.ASPxClientTrendLine] = js.native
  /**
    * Gets a value that specifies the scale type for the value data of the series' data points.
    */
  /* CompleteClass */
  override var valueScaleType: String = js.native
  /**
    * Gets a value that specifies the view type of the series.
    */
  /* CompleteClass */
  override var viewType: String = js.native
  /**
    * Gets a value indicating whether the series is visible.
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
}

