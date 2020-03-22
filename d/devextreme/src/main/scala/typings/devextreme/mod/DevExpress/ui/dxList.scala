package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxList extends CollectionWidget {
  /** Gets the widget's height in pixels. */
  def clientHeight(): Double = js.native
  /** Collapses a group with a specific index. */
  def collapseGroup(groupIndex: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Removes an item found using its DOM node. */
  def deleteItem(itemElement: Element): Promise[Unit] with JQueryPromise[Unit] = js.native
  def deleteItem(itemIndex: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Removes an item with a specific index. */
  def deleteItem(itemIndex: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Expands a group with a specific index. */
  def expandGroup(groupIndex: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Checks whether an item found using its DOM node is selected. */
  def isItemSelected(itemElement: Element): Boolean = js.native
  def isItemSelected(itemIndex: js.Any): Boolean = js.native
  /** Checks whether an item with a specific index is selected. */
  def isItemSelected(itemIndex: Double): Boolean = js.native
  /** Reloads list data. */
  def reload(): Unit = js.native
  /** Reorders items found using their DOM nodes. */
  def reorderItem(itemElement: Element, toItemElement: Element): Promise[Unit] with JQueryPromise[Unit] = js.native
  def reorderItem(itemIndex: js.Any, toItemIndex: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  def reorderItem(itemIndex: js.Any, toItemIndex: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  def reorderItem(itemIndex: Double, toItemIndex: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Reorders items with specific indexes. */
  def reorderItem(itemIndex: Double, toItemIndex: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Scrolls the content by a specified distance. */
  def scrollBy(distance: Double): Unit = js.native
  /** Gets the content's height in pixels. */
  def scrollHeight(): Double = js.native
  /** Scrolls the content to a specific position. */
  def scrollTo(location: Double): Unit = js.native
  /** Scrolls the content to an item found using its DOM node. */
  def scrollToItem(itemElement: Element): Unit = js.native
  def scrollToItem(itemIndex: js.Any): Unit = js.native
  /** Scrolls the content to an item with a specific index. */
  def scrollToItem(itemIndex: Double): Unit = js.native
  /** Gets the top scroll offset. */
  def scrollTop(): Double = js.native
  /** Selects all items. */
  def selectAll(): Unit = js.native
  /** Selects an item found using its DOM node. */
  def selectItem(itemElement: Element): Unit = js.native
  def selectItem(itemIndex: js.Any): Unit = js.native
  /** Selects an item with a specific index. */
  def selectItem(itemIndex: Double): Unit = js.native
  /** Cancels the selection of all items. */
  def unselectAll(): Unit = js.native
  /** Cancels the selection of an item found using its DOM node. */
  def unselectItem(itemElement: Element): Unit = js.native
  def unselectItem(itemIndex: js.Any): Unit = js.native
  /** Cancels the selection of an item with a specific index. */
  def unselectItem(itemIndex: Double): Unit = js.native
  /** Updates the widget scrollbar according to widget content size. */
  def updateDimensions(): Promise[Unit] with JQueryPromise[Unit] = js.native
}

