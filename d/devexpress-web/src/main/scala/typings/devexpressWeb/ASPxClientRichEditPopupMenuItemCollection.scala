package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of items in the Rich Edit's context menu.
  */
@js.native
trait ASPxClientRichEditPopupMenuItemCollection extends StObject {
  
  /**
    * Adds the specified menu item to the end of the collection.
    * @param item An ASPxClientRichEditPopupMenuItem object specifying the item to be added to the collection.
    */
  def Add(item: ASPxClientRichEditPopupMenuItem): Unit = js.native
  
  /**
    * Removes all menu items from the collection.
    */
  def Clear(): Unit = js.native
  
  /**
    * Returns a menu item specified by its index in the collection. An ASPxClientRichEditPopupMenuItem object that is a menu item with the specified index.
    * @param index An integer value that is the zero-based index of the ASPxClientRichEditPopupMenuItem to retrieve from the ASPxClientRichEditPopupMenuItemCollection.
    */
  def Get(index: Double): ASPxClientRichEditPopupMenuItem = js.native
  
  /**
    * Returns an item object with the specified ASPxClientRichEditPopupMenuItem.name property value. An ASPxClientRichEditPopupMenuItem object with a specific value of the ASPxClientRichEditPopupMenuItem.name property.
    * @param name A string value representing the ASPxClientRichEditPopupMenuItem.name property value of the required item.
    */
  def GetByName(name: String): ASPxClientRichEditPopupMenuItem = js.native
  
  /**
    * Returns the total number of menu items in the collection.
    */
  def GetCount(): Double = js.native
  
  /**
    * Adds the specified item to the specified position within the collection.
    * @param index An integer value that specifies the zero-based index at which the specified item should be inserted.
    * @param item An ASPxClientRichEditPopupMenuItem object to insert.
    */
  def Insert(index: Double, item: ASPxClientRichEditPopupMenuItem): Unit = js.native
  
  /**
    * Removes a menu item specified by its index within the collection.
    * @param index An integer value specifying the index of the menu item to remove.
    */
  def Remove(index: Double): Unit = js.native
  
  /**
    * Removes a menu item specified by its name.
    * @param name A string value specifying the ASPxClientRichEditPopupMenuItem.name property value of a menu item to remove from the collection.
    */
  def RemoveByName(name: String): Unit = js.native
}
object ASPxClientRichEditPopupMenuItemCollection {
  
  @scala.inline
  def apply(
    Add: ASPxClientRichEditPopupMenuItem => Unit,
    Clear: () => Unit,
    Get: Double => ASPxClientRichEditPopupMenuItem,
    GetByName: String => ASPxClientRichEditPopupMenuItem,
    GetCount: () => Double,
    Insert: (Double, ASPxClientRichEditPopupMenuItem) => Unit,
    Remove: Double => Unit,
    RemoveByName: String => Unit
  ): ASPxClientRichEditPopupMenuItemCollection = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Clear = js.Any.fromFunction0(Clear), Get = js.Any.fromFunction1(Get), GetByName = js.Any.fromFunction1(GetByName), GetCount = js.Any.fromFunction0(GetCount), Insert = js.Any.fromFunction2(Insert), Remove = js.Any.fromFunction1(Remove), RemoveByName = js.Any.fromFunction1(RemoveByName))
    __obj.asInstanceOf[ASPxClientRichEditPopupMenuItemCollection]
  }
  
  @scala.inline
  implicit class ASPxClientRichEditPopupMenuItemCollectionMutableBuilder[Self <: ASPxClientRichEditPopupMenuItemCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: ASPxClientRichEditPopupMenuItem => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: Double => ASPxClientRichEditPopupMenuItem): Self = StObject.set(x, "Get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetByName(value: String => ASPxClientRichEditPopupMenuItem): Self = StObject.set(x, "GetByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCount(value: () => Double): Self = StObject.set(x, "GetCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsert(value: (Double, ASPxClientRichEditPopupMenuItem) => Unit): Self = StObject.set(x, "Insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveByName(value: String => Unit): Self = StObject.set(x, "RemoveByName", js.Any.fromFunction1(value))
  }
}
