package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ItemVisualInteractivity events.
  */
trait ASPxClientDashboardItemVisualInteractivityEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    * Value: A string value that is the component name of the dashboard item.
    */
  var ItemName: java.lang.String
  /**
    * Enables highlighting for the current dashboard item.
    * @param enableHighlighting true, to enable highlighting; otherwise, false.
    */
  def EnableHighlighting(enableHighlighting: scala.Boolean): scala.Unit
  /**
    * Gets the default selection for the current dashboard item.
    */
  def GetDefaultSelection(): js.Array[ASPxClientDashboardItemDataAxisPointTuple]
  /**
    * Gets the selection mode for dashboard item elements.
    */
  def GetSelectionMode(): java.lang.String
  /**
    * Gets data axes used to perform custom interactivity actions.
    */
  def GetTargetAxes(): js.Array[java.lang.String]
  /**
    * Returns whether or not highlighting is enabled for the current dashboard item.
    */
  def IsHighlightingEnabled(): scala.Boolean
  /**
    * Sets the default selection for the current dashboard item.
    * @param values An array of ASPxClientDashboardItemDataAxisPointTuple objects specifying axis point tuples used to select default elements.
    */
  def SetDefaultSelection(values: js.Array[ASPxClientDashboardItemDataAxisPointTuple]): scala.Unit
  /**
    * Sets the selection mode for dashboard item elements.
    * @param selectionMode A String that specifies the selection mode.
    */
  def SetSelectionMode(selectionMode: java.lang.String): scala.Unit
  /**
    * Sets data axes used to perform custom interactivity actions.
    * @param targetAxes An array of String objects that specify names of data axes.
    */
  def SetTargetAxes(targetAxes: js.Array[java.lang.String]): scala.Unit
}

