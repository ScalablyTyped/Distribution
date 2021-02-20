package typings.extendedListbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseListBox extends StObject {
  
  /** Adds a new item to the list */
  def addItem(item: String): String = js.native
  def addItem(item: ListBoxItem): String = js.native
  
  /** Adds new items to the list */
  def addItems(items: js.Array[String | ListBoxItem]): js.Array[String] = js.native
  
  /** Resets the selection state of all items */
  def clearSelection(): Unit = js.native
  
  /** Reverts all changes from the DOM */
  def destroy(): Unit = js.native
  
  /** Enables or disables the whole list and all childs */
  def enable(state: Boolean): Unit = js.native
  
  /** Returns a item object for the given id or display text */
  def getItem(identifier: String): ListBoxItem = js.native
  
  /** Returns all item objects */
  def getItems(): js.Array[ListBoxItem] = js.native
  
  /** Returns all ListBoxItem's which are selected */
  def getSelection(): js.Array[ListBoxItem] = js.native
  
  /** Increases the index of the matching item by one */
  def moveItemDown(identifier: String): Double = js.native
  
  /** Moves item to the bottom of the list */
  def moveItemToBottom(identifier: String): Double = js.native
  
  /** Moves item to the top of the list */
  def moveItemToTop(identifier: String): Double = js.native
  
  /** Decreases the index of the matching item by one */
  def moveItemUp(identifier: String): Double = js.native
  
  /** Removes a item from the list */
  def removeItem(identifier: String): Unit = js.native
  
  /** Removes items from the list */
  def removeItems(identifiers: js.Array[String]): Unit = js.native
}
