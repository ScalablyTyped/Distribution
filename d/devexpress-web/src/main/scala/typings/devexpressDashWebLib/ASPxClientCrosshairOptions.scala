package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the CrosshairOptions class.
  */
trait ASPxClientCrosshairOptions extends ASPxClientWebChartElement {
  /**
    * Gets the color of a crosshair argument line.
    * Value: A String value, specifying the color of a crosshair argument line.
    */
  var argumentLineColor: java.lang.String
  /**
    * Specifies the way in which the crosshair label is shown for a series on a diagram.
    * Value: A string value that specifies how the crosshair label is shown for a series.
    */
  var crosshairLabelMode: java.lang.String
  /**
    * Gets a string which represents the  pattern specifying the group header text to be displayed within the crosshair label.
    * Value: A String, which represents the group header's pattern.
    */
  var groupHeaderPattern: java.lang.String
  /**
    * Gets the value specifying how the Crosshair Cursor's lines snap to points when hovering on them.
    * Value: The value that specifies how lines snap.
    */
  var linesMode: java.lang.String
  /**
    * Gets a value that indicates whether a crosshair cursor argument line is shown for a series point on a diagram.
    * Value: true if a crosshair cursor argument line is displayed on a diagram;  otherwise, false.
    */
  var showArgumentLine: scala.Boolean
  /**
    * Gets a value indicating whether it is necessary to show a crosshair label for the X-axis.
    * Value: true to show a crosshair label for the X-axis; otherwise, false.
    */
  var showAxisXLabels: scala.Boolean
  /**
    * Gets a value indicating whether it is necessary to show a crosshair label for the Y-axis.
    * Value: true to show the crosshair label for the Y-axis; otherwise, false.
    */
  var showAxisYLabels: scala.Boolean
  /**
    * Gets a value that defines whether a crosshair label of a series point indicated by a crosshair cursor is shown on a diagram.
    * Value: true if a crosshair label indicated by a crosshair cursor is shown on a diagram; otherwise, false.
    */
  var showCrosshairLabels: scala.Boolean
  /**
    * Gets a value that indicates whether to show a header for each series group in crosshair cursor labels.
    * Value: true, to show a group header in crosshair cursor labels; otherwise, false.
    */
  var showGroupHeaders: scala.Boolean
  /**
    * Gets a value that specifies whether to show a crosshair cursor in a focused pane only.
    * Value: true to display a crosshair cursor in a focused pane; otherwise, false.
    */
  var showOnlyInFocusedPane: scala.Boolean
  /**
    * Gets a value that specifies whether the Crosshair cursor should show points that are out of visual range.
    * Value: true if the out of visual range points should be shown in the Crosshair label; otherwise false.
    */
  var showOutOfRangePoints: scala.Boolean
  /**
    * Specifies whether to show a value line of a series point indicated by a crosshair cursor on a diagram.
    * Value: true to display a value line indicated by a crosshair cursor on a diagram; otherwise, false.
    */
  var showValueLine: scala.Boolean
  /**
    * Specifies the current snap mode of a crosshair cursor.
    * Value: A string value.
    */
  var snapMode: java.lang.String
  /**
    * Gets the color of a crosshair value line.
    * Value: A String value, specifying the color of a crosshair value line.
    */
  var valueLineColor: java.lang.String
  /**
    * Gets the identifier specifying the behavior of the selection of points shown in the crosshair label.
    * Value: The selection behavior identifier.
    */
  var valueSelectionMode: java.lang.String
}

