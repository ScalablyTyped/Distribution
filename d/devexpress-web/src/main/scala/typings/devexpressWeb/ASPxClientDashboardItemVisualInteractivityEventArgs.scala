package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemVisualInteractivity event.
  */
trait ASPxClientDashboardItemVisualInteractivityEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  var ItemName: String
  /**
    * Enables highlighting for the current dashboard item.
    * @param enableHighlighting true, to enable highlighting; otherwise, false.
    */
  def EnableHighlighting(enableHighlighting: Boolean): Unit
  /**
    * Gets the default selection for the current dashboard item.
    */
  def GetDefaultSelection(): js.Array[ASPxClientDashboardItemDataAxisPointTuple]
  /**
    * Gets the selection mode for dashboard item elements.
    */
  def GetSelectionMode(): String
  /**
    * Gets data axes used to perform custom interactivity actions.
    */
  def GetTargetAxes(): js.Array[String]
  /**
    * Returns whether highlighting is enabled for the current dashboard item.
    */
  def IsHighlightingEnabled(): Boolean
  /**
    * Sets the default selection for the current dashboard item.
    * @param values An array of ASPxClientDashboardItemDataAxisPointTuple objects specifying axis point tuples used to select default elements.
    */
  def SetDefaultSelection(values: js.Array[ASPxClientDashboardItemDataAxisPointTuple]): Unit
  /**
    * Sets the selection mode for dashboard item elements.
    * @param selectionMode A DashboardSelectionMode value that specifies the selection mode.
    */
  def SetSelectionMode(selectionMode: String): Unit
  /**
    * Sets data axes used to perform custom interactivity actions.
    * @param targetAxes An array of String objects that specify names of data axes.
    */
  def SetTargetAxes(targetAxes: js.Array[String]): Unit
}

object ASPxClientDashboardItemVisualInteractivityEventArgs {
  @scala.inline
  def apply(
    EnableHighlighting: Boolean => Unit,
    GetDefaultSelection: () => js.Array[ASPxClientDashboardItemDataAxisPointTuple],
    GetSelectionMode: () => String,
    GetTargetAxes: () => js.Array[String],
    IsHighlightingEnabled: () => Boolean,
    ItemName: String,
    SetDefaultSelection: js.Array[ASPxClientDashboardItemDataAxisPointTuple] => Unit,
    SetSelectionMode: String => Unit,
    SetTargetAxes: js.Array[String] => Unit
  ): ASPxClientDashboardItemVisualInteractivityEventArgs = {
    val __obj = js.Dynamic.literal(EnableHighlighting = js.Any.fromFunction1(EnableHighlighting), GetDefaultSelection = js.Any.fromFunction0(GetDefaultSelection), GetSelectionMode = js.Any.fromFunction0(GetSelectionMode), GetTargetAxes = js.Any.fromFunction0(GetTargetAxes), IsHighlightingEnabled = js.Any.fromFunction0(IsHighlightingEnabled), ItemName = ItemName.asInstanceOf[js.Any], SetDefaultSelection = js.Any.fromFunction1(SetDefaultSelection), SetSelectionMode = js.Any.fromFunction1(SetSelectionMode), SetTargetAxes = js.Any.fromFunction1(SetTargetAxes))
    __obj.asInstanceOf[ASPxClientDashboardItemVisualInteractivityEventArgs]
  }
}

