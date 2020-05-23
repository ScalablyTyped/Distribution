package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the CrosshairOptions class.
  */
trait ASPxClientCrosshairOptions extends ASPxClientWebChartElement {
  /**
    * Gets the color of a crosshair argument line.
    */
  var argumentLineColor: String
  /**
    * Specifies the way in which the crosshair label is shown for a series on a diagram.
    */
  var crosshairLabelMode: String
  /**
    * Gets a string which represents the  pattern specifying the group header text to be displayed within the crosshair label.
    */
  var groupHeaderPattern: String
  /**
    * Gets the value specifying how the Crosshair Cursor's lines snap to points when hovering on them.
    */
  var linesMode: String
  /**
    * Gets a value that indicates whether a crosshair cursor argument line is shown for a series point on a diagram.
    */
  var showArgumentLine: Boolean
  /**
    * Gets a value indicating whether it is necessary to show a crosshair label for the X-axis.
    */
  var showAxisXLabels: Boolean
  /**
    * Gets a value indicating whether it is necessary to show a crosshair label for the Y-axis.
    */
  var showAxisYLabels: Boolean
  /**
    * Gets a value that defines whether a crosshair label of a series point indicated by a crosshair cursor is shown on a diagram.
    */
  var showCrosshairLabels: Boolean
  /**
    * Gets a value that indicates whether to show a header for each series group in crosshair cursor labels.
    */
  var showGroupHeaders: Boolean
  /**
    * Gets a value that specifies whether to show a crosshair cursor in a focused pane only.
    */
  var showOnlyInFocusedPane: Boolean
  /**
    * Gets a value that specifies whether the Crosshair cursor should show points that are out of visual range.
    */
  var showOutOfRangePoints: Boolean
  /**
    * Specifies whether to show a value line of a series point indicated by a crosshair cursor on a diagram.
    */
  var showValueLine: Boolean
  /**
    * Specifies the current snap mode of a crosshair cursor.
    */
  var snapMode: String
  /**
    * Gets the color of a crosshair value line.
    */
  var valueLineColor: String
  /**
    * Gets the identifier specifying the behavior of the selection of points shown in the crosshair label.
    */
  var valueSelectionMode: String
}

object ASPxClientCrosshairOptions {
  @scala.inline
  def apply(
    argumentLineColor: String,
    chart: ASPxClientWebChart,
    crosshairLabelMode: String,
    groupHeaderPattern: String,
    linesMode: String,
    showArgumentLine: Boolean,
    showAxisXLabels: Boolean,
    showAxisYLabels: Boolean,
    showCrosshairLabels: Boolean,
    showGroupHeaders: Boolean,
    showOnlyInFocusedPane: Boolean,
    showOutOfRangePoints: Boolean,
    showValueLine: Boolean,
    snapMode: String,
    valueLineColor: String,
    valueSelectionMode: String
  ): ASPxClientCrosshairOptions = {
    val __obj = js.Dynamic.literal(argumentLineColor = argumentLineColor.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], crosshairLabelMode = crosshairLabelMode.asInstanceOf[js.Any], groupHeaderPattern = groupHeaderPattern.asInstanceOf[js.Any], linesMode = linesMode.asInstanceOf[js.Any], showArgumentLine = showArgumentLine.asInstanceOf[js.Any], showAxisXLabels = showAxisXLabels.asInstanceOf[js.Any], showAxisYLabels = showAxisYLabels.asInstanceOf[js.Any], showCrosshairLabels = showCrosshairLabels.asInstanceOf[js.Any], showGroupHeaders = showGroupHeaders.asInstanceOf[js.Any], showOnlyInFocusedPane = showOnlyInFocusedPane.asInstanceOf[js.Any], showOutOfRangePoints = showOutOfRangePoints.asInstanceOf[js.Any], showValueLine = showValueLine.asInstanceOf[js.Any], snapMode = snapMode.asInstanceOf[js.Any], valueLineColor = valueLineColor.asInstanceOf[js.Any], valueSelectionMode = valueSelectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairOptions]
  }
}

