package typings
package extendedDashListboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseListBox extends js.Object {
  /** Adds a new item to the list */
  def addItem(item: ListBoxItem): java.lang.String = js.native
  /** Adds a new item to the list */
  def addItem(item: java.lang.String): java.lang.String = js.native
  /** Adds new items to the list */
  def addItems(items: js.Array[java.lang.String | ListBoxItem]): js.Array[java.lang.String] = js.native
  /** Resets the selection state of all items */
  def clearSelection(): scala.Unit = js.native
  /** Reverts all changes from the DOM */
  def destroy(): scala.Unit = js.native
  /** Enables or disables the whole list and all childs */
  def enable(state: scala.Boolean): scala.Unit = js.native
  /** Returns a item object for the given id or display text */
  def getItem(identifier: java.lang.String): ListBoxItem = js.native
  /** Returns all item objects */
  def getItems(): js.Array[ListBoxItem] = js.native
  /** Returns all ListBoxItem's which are selected */
  def getSelection(): js.Array[ListBoxItem] = js.native
  /** Increases the index of the matching item by one */
  def moveItemDown(identifier: java.lang.String): scala.Double = js.native
  /** Moves item to the bottom of the list */
  def moveItemToBottom(identifier: java.lang.String): scala.Double = js.native
  /** Moves item to the top of the list */
  def moveItemToTop(identifier: java.lang.String): scala.Double = js.native
  /** Decreases the index of the matching item by one */
  def moveItemUp(identifier: java.lang.String): scala.Double = js.native
  /** Removes a item from the list */
  def removeItem(identifier: java.lang.String): scala.Unit = js.native
  /** Removes items from the list */
  def removeItems(identifiers: js.Array[java.lang.String]): scala.Unit = js.native
}

