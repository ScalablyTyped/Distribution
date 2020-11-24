package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of items in the Spreadsheet's context menu.
  */
@js.native
trait ASPxClientSpreadsheetPopupMenuItemCollection extends js.Object {
  
  /**
    * Adds the specified menu item to the end of the collection.
    * @param item An ASPxClientSpreadsheetPopupMenuItem object specifying the item to be added to the collection.
    */
  def Add(item: ASPxClientSpreadsheetPopupMenuItem): Unit = js.native
  
  /**
    * Removes all menu items from the collection.
    */
  def Clear(): Unit = js.native
  
  /**
    * Returns a menu item specified by its index in the collection. A ASPxClientSpreadsheetPopupMenuItem object that is a menu item with the specified index.
    * @param index An integer value that is the zero-based index of the ASPxClientSpreadsheetPopupMenuItem to retrieve from the ASPxClientSpreadsheetPopupMenuItemCollection.
    */
  def Get(index: Double): ASPxClientSpreadsheetPopupMenuItem = js.native
  
  /**
    * Returns an item object with the specified ASPxClientSpreadsheetPopupMenuItem.name property value. An ASPxClientSpreadsheetPopupMenuItem object with a specific value of the ASPxClientSpreadsheetPopupMenuItem.name property.
    * @param name A string value representing the ASPxClientSpreadsheetPopupMenuItem.name property value of the required item.
    */
  def GetByName(name: String): ASPxClientSpreadsheetPopupMenuItem = js.native
  
  /**
    * Returns the total number of menu items in the collection.
    */
  def GetCount(): Double = js.native
  
  /**
    * Adds the specified item to the specified position within the collection.
    * @param index An integer value that specifies the zero-based index at which the specified item should be inserted.
    * @param item An ASPxClientSpreadsheetPopupMenuItem object to insert.
    */
  def Insert(index: Double, item: ASPxClientSpreadsheetPopupMenuItem): Unit = js.native
  
  /**
    * Removes a menu item specified by its index within the collection.
    * @param index An integer value specifying the index of the menu item to remove.
    */
  def Remove(index: Double): Unit = js.native
  
  /**
    * Removes a menu item specified by its name.
    * @param name A string value specifying the ASPxClientSpreadsheetPopupMenuItem.name property value of a menu item to remove from the collection.
    */
  def RemoveByName(name: String): Unit = js.native
}
object ASPxClientSpreadsheetPopupMenuItemCollection {
  
  @scala.inline
  def apply(
    Add: ASPxClientSpreadsheetPopupMenuItem => Unit,
    Clear: () => Unit,
    Get: Double => ASPxClientSpreadsheetPopupMenuItem,
    GetByName: String => ASPxClientSpreadsheetPopupMenuItem,
    GetCount: () => Double,
    Insert: (Double, ASPxClientSpreadsheetPopupMenuItem) => Unit,
    Remove: Double => Unit,
    RemoveByName: String => Unit
  ): ASPxClientSpreadsheetPopupMenuItemCollection = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Clear = js.Any.fromFunction0(Clear), Get = js.Any.fromFunction1(Get), GetByName = js.Any.fromFunction1(GetByName), GetCount = js.Any.fromFunction0(GetCount), Insert = js.Any.fromFunction2(Insert), Remove = js.Any.fromFunction1(Remove), RemoveByName = js.Any.fromFunction1(RemoveByName))
    __obj.asInstanceOf[ASPxClientSpreadsheetPopupMenuItemCollection]
  }
  
  @scala.inline
  implicit class ASPxClientSpreadsheetPopupMenuItemCollectionOps[Self <: ASPxClientSpreadsheetPopupMenuItemCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: ASPxClientSpreadsheetPopupMenuItem => Unit): Self = this.set("Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: Double => ASPxClientSpreadsheetPopupMenuItem): Self = this.set("Get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetByName(value: String => ASPxClientSpreadsheetPopupMenuItem): Self = this.set("GetByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("GetCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsert(value: (Double, ASPxClientSpreadsheetPopupMenuItem) => Unit): Self = this.set("Insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveByName(value: String => Unit): Self = this.set("RemoveByName", js.Any.fromFunction1(value))
  }
}
