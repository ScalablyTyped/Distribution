package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ItemVisualInteractivity event.
  */
@JSGlobal("ASPxClientDashboardItemVisualInteractivityEventArgs")
@js.native
open class ASPxClientDashboardItemVisualInteractivityEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDashboardItemVisualInteractivityEventArgs {
  
  /**
    * Enables highlighting for the current dashboard item.
    * @param enableHighlighting true, to enable highlighting; otherwise, false.
    */
  /* CompleteClass */
  override def EnableHighlighting(enableHighlighting: Boolean): Unit = js.native
  
  /**
    * Gets the default selection for the current dashboard item.
    */
  /* CompleteClass */
  override def GetDefaultSelection(): js.Array[typings.devexpressWeb.ASPxClientDashboardItemDataAxisPointTuple] = js.native
  
  /**
    * Gets the selection mode for dashboard item elements.
    */
  /* CompleteClass */
  override def GetSelectionMode(): String = js.native
  
  /**
    * Gets data axes used to perform custom interactivity actions.
    */
  /* CompleteClass */
  override def GetTargetAxes(): js.Array[String] = js.native
  
  /**
    * Returns whether highlighting is enabled for the current dashboard item.
    */
  /* CompleteClass */
  override def IsHighlightingEnabled(): Boolean = js.native
  
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  /* CompleteClass */
  var ItemName: String = js.native
  
  /**
    * Sets the default selection for the current dashboard item.
    * @param values An array of ASPxClientDashboardItemDataAxisPointTuple objects specifying axis point tuples used to select default elements.
    */
  /* CompleteClass */
  override def SetDefaultSelection(values: js.Array[typings.devexpressWeb.ASPxClientDashboardItemDataAxisPointTuple]): Unit = js.native
  
  /**
    * Sets the selection mode for dashboard item elements.
    * @param selectionMode A DashboardSelectionMode value that specifies the selection mode.
    */
  /* CompleteClass */
  override def SetSelectionMode(selectionMode: String): Unit = js.native
  
  /**
    * Sets data axes used to perform custom interactivity actions.
    * @param targetAxes An array of String objects that specify names of data axes.
    */
  /* CompleteClass */
  override def SetTargetAxes(targetAxes: js.Array[String]): Unit = js.native
}
