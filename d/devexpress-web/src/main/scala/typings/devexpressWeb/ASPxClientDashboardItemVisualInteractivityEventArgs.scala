package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ItemVisualInteractivity event.
  */
@js.native
trait ASPxClientDashboardItemVisualInteractivityEventArgs extends ASPxClientEventArgs {
  
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
    * Gets the component name of the dashboard item for which the event was raised.
    */
  var ItemName: String = js.native
  
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
  
  @scala.inline
  implicit class ASPxClientDashboardItemVisualInteractivityEventArgsMutableBuilder[Self <: ASPxClientDashboardItemVisualInteractivityEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableHighlighting(value: Boolean => Unit): Self = StObject.set(x, "EnableHighlighting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDefaultSelection(value: () => js.Array[ASPxClientDashboardItemDataAxisPointTuple]): Self = StObject.set(x, "GetDefaultSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectionMode(value: () => String): Self = StObject.set(x, "GetSelectionMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTargetAxes(value: () => js.Array[String]): Self = StObject.set(x, "GetTargetAxes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsHighlightingEnabled(value: () => Boolean): Self = StObject.set(x, "IsHighlightingEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setItemName(value: String): Self = StObject.set(x, "ItemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDefaultSelection(value: js.Array[ASPxClientDashboardItemDataAxisPointTuple] => Unit): Self = StObject.set(x, "SetDefaultSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSelectionMode(value: String => Unit): Self = StObject.set(x, "SetSelectionMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTargetAxes(value: js.Array[String] => Unit): Self = StObject.set(x, "SetTargetAxes", js.Any.fromFunction1(value))
  }
}
