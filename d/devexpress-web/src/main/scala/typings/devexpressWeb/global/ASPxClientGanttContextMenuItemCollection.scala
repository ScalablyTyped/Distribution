package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The context menu item collection.
  */
@JSGlobal("ASPxClientGanttContextMenuItemCollection")
@js.native
open class ASPxClientGanttContextMenuItemCollection ()
  extends StObject
     with typings.devexpressWeb.ASPxClientGanttContextMenuItemCollection {
  
  /**
    * Adds a context menu item.
    * @param item The context menu item.
    */
  /* CompleteClass */
  override def Add(item: typings.devexpressWeb.ASPxClientGanttContextMenuItem): Unit = js.native
  
  /**
    * Removes predefined items from the context menu.
    */
  /* CompleteClass */
  override def Clear(): Unit = js.native
  
  /**
    * Returns a context menu item with the specified index. The context menu item.
    * @param index The index.
    */
  /* CompleteClass */
  override def Get(index: Double): typings.devexpressWeb.ASPxClientGanttContextMenuItem = js.native
  
  /**
    * Returns a context menu item with the specified name. The context menu item.
    * @param name The name.
    */
  /* CompleteClass */
  override def GetByName(name: String): typings.devexpressWeb.ASPxClientGanttContextMenuItem = js.native
  
  /**
    * Returns the number of context menu items.
    */
  /* CompleteClass */
  override def GetCount(): Double = js.native
  
  /**
    * Inserts a context menu item at the specified position in the collection.
    * @param index The context menu item's index.
    * @param item The context menu item.
    */
  /* CompleteClass */
  override def Insert(index: Double, item: typings.devexpressWeb.ASPxClientGanttContextMenuItem): Unit = js.native
  
  /**
    * Removes a context menu item with the specified index from the item collection.
    * @param index The context menu item's index.
    */
  /* CompleteClass */
  override def Remove(index: Double): Unit = js.native
  
  /**
    * Removes a context menu item with the specified name from the item collection.
    * @param name The context menu item's name.
    */
  /* CompleteClass */
  override def RemoveByName(name: String): Unit = js.native
}
