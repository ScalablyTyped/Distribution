package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTreeView extends CollectionWidget {
  /** Collapses all items. */
  def collapseAll(): Unit = js.native
  /** Collapses an item with a specific key. */
  def collapseItem(itemData: js.Any): Unit = js.native
  /** Collapses an item found using its DOM node. */
  def collapseItem(itemElement: Element): Unit = js.native
  /** Expands all items. If you load items on demand, this method expands only the loaded items. */
  def expandAll(): Unit = js.native
  /** Expands an item found using its data object. */
  def expandItem(itemData: js.Any): Unit = js.native
  /** Expands an item found using its DOM node. */
  def expandItem(itemElement: Element): Unit = js.native
  /** Gets all nodes. */
  def getNodes(): js.Array[dxTreeViewNode] = js.native
  /** Selects all items. */
  def selectAll(): Unit = js.native
  /** Selects an item found using its data object. */
  def selectItem(itemData: js.Any): Unit = js.native
  /** Selects an item found using its DOM node. */
  def selectItem(itemElement: Element): Unit = js.native
  /** Cancels the selection of all items. */
  def unselectAll(): Unit = js.native
  /** Cancels the selection of an item found using its data object. */
  def unselectItem(itemData: js.Any): Unit = js.native
  /** Cancels the selection of an item found using its DOM node. */
  def unselectItem(itemElement: Element): Unit = js.native
  /** Updates the tree view scrollbars according to the current size of the widget content. */
  def updateDimensions(): Promise[Unit] with JQueryPromise[Unit] = js.native
}

