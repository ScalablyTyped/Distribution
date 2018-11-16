package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a collection of items in the Rich Edit's context menu.
 */

trait ASPxClientRichEditPopupMenuItemCollection extends js.Object {
  /**
       * Adds the specified menu item to the end of the collection.
       * @param item An ASPxClientRichEditPopupMenuItem object specifying the item to be added to the collection.
       */
  def Add(item: ASPxClientRichEditPopupMenuItem): scala.Unit
  /**
       * Removes all menu items from the collection.
       */
  def Clear(): scala.Unit
  /**
       * Returns a menu item specified by its index in the collection.
       * @param index An integer value that is the zero-based index of the <see cref="ASPxClientRichEditPopupMenuItem" /> to retrieve from the ASPxClientRichEditPopupMenuItemCollection.
       */
  def Get(index: scala.Double): ASPxClientRichEditPopupMenuItem
  /**
       * Returns an item object with the specified name property value.
       * @param name A string value representing the name property value of the required item.
       */
  def GetByName(name: java.lang.String): ASPxClientRichEditPopupMenuItem
  /**
       * Returns the total number of menu items in the collection.
       */
  def GetCount(): scala.Double
  /**
       * Adds the specified item to the specified position within the collection.
       * @param index An integer value that specifies the zero-based index at which the specified item should be inserted.
       * @param item An ASPxClientRichEditPopupMenuItem object to insert.
       */
  def Insert(index: scala.Double, item: ASPxClientRichEditPopupMenuItem): scala.Unit
  /**
       * Removes a menu item specified by its index within the collection.
       * @param index An integer value specifying the index of the menu item to remove.
       */
  def Remove(index: scala.Double): scala.Unit
  /**
       * Removes a menu item specified by its name.
       * @param name A string value specifying the name property value of a menu item to remove from the collection.
       */
  def RemoveByName(name: java.lang.String): scala.Unit
}

