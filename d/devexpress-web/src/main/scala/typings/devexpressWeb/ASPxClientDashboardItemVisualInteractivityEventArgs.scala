package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemVisualInteractivity event.
  */
@JSGlobal("ASPxClientDashboardItemVisualInteractivityEventArgs")
@js.native
class ASPxClientDashboardItemVisualInteractivityEventArgs () extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  var ItemName: String = js.native
  /**
    * Enables highlighting for the current dashboard item.
    * @param enableHighlighting true, to enable highlighting; otherwise, false.
    */
  def EnableHighlighting(enableHighlighting: Boolean): Unit = js.native
  /**
    * Gets the default selection for the current dashboard item.
    */
  def GetDefaultSelection(): js.Array[ASPxClientDashboardItemDataAxisPointTuple] = js.native
  /**
    * Gets the selection mode for dashboard item elements.
    */
  def GetSelectionMode(): String = js.native
  /**
    * Gets data axes used to perform custom interactivity actions.
    */
  def GetTargetAxes(): js.Array[String] = js.native
  /**
    * Returns whether highlighting is enabled for the current dashboard item.
    */
  def IsHighlightingEnabled(): Boolean = js.native
  /**
    * Sets the default selection for the current dashboard item.
    * @param values An array of ASPxClientDashboardItemDataAxisPointTuple objects specifying axis point tuples used to select default elements.
    */
  def SetDefaultSelection(values: js.Array[ASPxClientDashboardItemDataAxisPointTuple]): Unit = js.native
  /**
    * Sets the selection mode for dashboard item elements.
    * @param selectionMode A DashboardSelectionMode value that specifies the selection mode.
    */
  def SetSelectionMode(selectionMode: String): Unit = js.native
  /**
    * Sets data axes used to perform custom interactivity actions.
    * @param targetAxes An array of String objects that specify names of data axes.
    */
  def SetTargetAxes(targetAxes: js.Array[String]): Unit = js.native
}

