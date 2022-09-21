package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of items in the Rich Edit's context menu.
  */
@JSGlobal("ASPxClientRichEditPopupMenuItemCollection")
@js.native
open class ASPxClientRichEditPopupMenuItemCollection ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRichEditPopupMenuItemCollection {
  
  /**
    * Adds the specified menu item to the end of the collection.
    * @param item An ASPxClientRichEditPopupMenuItem object specifying the item to be added to the collection.
    */
  /* CompleteClass */
  override def Add(item: typings.devexpressWeb.ASPxClientRichEditPopupMenuItem): Unit = js.native
  
  /**
    * Removes all menu items from the collection.
    */
  /* CompleteClass */
  override def Clear(): Unit = js.native
  
  /**
    * Returns a menu item specified by its index in the collection. An ASPxClientRichEditPopupMenuItem object that is a menu item with the specified index.
    * @param index An integer value that is the zero-based index of the ASPxClientRichEditPopupMenuItem to retrieve from the ASPxClientRichEditPopupMenuItemCollection.
    */
  /* CompleteClass */
  override def Get(index: Double): typings.devexpressWeb.ASPxClientRichEditPopupMenuItem = js.native
  
  /**
    * Returns an item object with the specified ASPxClientRichEditPopupMenuItem.name property value. An ASPxClientRichEditPopupMenuItem object with a specific value of the ASPxClientRichEditPopupMenuItem.name property.
    * @param name A string value representing the ASPxClientRichEditPopupMenuItem.name property value of the required item.
    */
  /* CompleteClass */
  override def GetByName(name: String): typings.devexpressWeb.ASPxClientRichEditPopupMenuItem = js.native
  
  /**
    * Returns the total number of menu items in the collection.
    */
  /* CompleteClass */
  override def GetCount(): Double = js.native
  
  /**
    * Adds the specified item to the specified position within the collection.
    * @param index An integer value that specifies the zero-based index at which the specified item should be inserted.
    * @param item An ASPxClientRichEditPopupMenuItem object to insert.
    */
  /* CompleteClass */
  override def Insert(index: Double, item: typings.devexpressWeb.ASPxClientRichEditPopupMenuItem): Unit = js.native
  
  /**
    * Removes a menu item specified by its index within the collection.
    * @param index An integer value specifying the index of the menu item to remove.
    */
  /* CompleteClass */
  override def Remove(index: Double): Unit = js.native
  
  /**
    * Removes a menu item specified by its name.
    * @param name A string value specifying the ASPxClientRichEditPopupMenuItem.name property value of a menu item to remove from the collection.
    */
  /* CompleteClass */
  override def RemoveByName(name: String): Unit = js.native
}
