package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The context menu item collection.
  */
trait ASPxClientGanttContextMenuItemCollection extends StObject {
  
  /**
    * Adds a context menu item.
    * @param item The context menu item.
    */
  def Add(item: ASPxClientGanttContextMenuItem): Unit
  
  /**
    * Removes predefined items from the context menu.
    */
  def Clear(): Unit
  
  /**
    * Returns a context menu item with the specified index. The context menu item.
    * @param index The index.
    */
  def Get(index: Double): ASPxClientGanttContextMenuItem
  
  /**
    * Returns a context menu item with the specified name. The context menu item.
    * @param name The name.
    */
  def GetByName(name: String): ASPxClientGanttContextMenuItem
  
  /**
    * Returns the number of context menu items.
    */
  def GetCount(): Double
  
  /**
    * Inserts a context menu item at the specified position in the collection.
    * @param index The context menu item's index.
    * @param item The context menu item.
    */
  def Insert(index: Double, item: ASPxClientGanttContextMenuItem): Unit
  
  /**
    * Removes a context menu item with the specified index from the item collection.
    * @param index The context menu item's index.
    */
  def Remove(index: Double): Unit
  
  /**
    * Removes a context menu item with the specified name from the item collection.
    * @param name The context menu item's name.
    */
  def RemoveByName(name: String): Unit
}
object ASPxClientGanttContextMenuItemCollection {
  
  inline def apply(
    Add: ASPxClientGanttContextMenuItem => Unit,
    Clear: () => Unit,
    Get: Double => ASPxClientGanttContextMenuItem,
    GetByName: String => ASPxClientGanttContextMenuItem,
    GetCount: () => Double,
    Insert: (Double, ASPxClientGanttContextMenuItem) => Unit,
    Remove: Double => Unit,
    RemoveByName: String => Unit
  ): ASPxClientGanttContextMenuItemCollection = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Clear = js.Any.fromFunction0(Clear), Get = js.Any.fromFunction1(Get), GetByName = js.Any.fromFunction1(GetByName), GetCount = js.Any.fromFunction0(GetCount), Insert = js.Any.fromFunction2(Insert), Remove = js.Any.fromFunction1(Remove), RemoveByName = js.Any.fromFunction1(RemoveByName))
    __obj.asInstanceOf[ASPxClientGanttContextMenuItemCollection]
  }
  
  extension [Self <: ASPxClientGanttContextMenuItemCollection](x: Self) {
    
    inline def setAdd(value: ASPxClientGanttContextMenuItem => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    inline def setGet(value: Double => ASPxClientGanttContextMenuItem): Self = StObject.set(x, "Get", js.Any.fromFunction1(value))
    
    inline def setGetByName(value: String => ASPxClientGanttContextMenuItem): Self = StObject.set(x, "GetByName", js.Any.fromFunction1(value))
    
    inline def setGetCount(value: () => Double): Self = StObject.set(x, "GetCount", js.Any.fromFunction0(value))
    
    inline def setInsert(value: (Double, ASPxClientGanttContextMenuItem) => Unit): Self = StObject.set(x, "Insert", js.Any.fromFunction2(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    inline def setRemoveByName(value: String => Unit): Self = StObject.set(x, "RemoveByName", js.Any.fromFunction1(value))
  }
}
