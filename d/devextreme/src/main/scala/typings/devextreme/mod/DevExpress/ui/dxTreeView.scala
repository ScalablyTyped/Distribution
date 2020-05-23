package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTreeView extends CollectionWidget {
  /** @name dxTreeView.collapseAll() */
  def collapseAll(): Unit = js.native
  /** @name dxTreeView.collapseItem(itemData) */
  def collapseItem(itemData: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxTreeView.collapseItem(itemElement) */
  def collapseItem(itemElement: Element): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxTreeView.expandAll() */
  def expandAll(): Unit = js.native
  /** @name dxTreeView.expandItem(itemData) */
  def expandItem(itemData: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxTreeView.expandItem(itemElement) */
  def expandItem(itemElement: Element): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxTreeView.getNodes() */
  def getNodes(): js.Array[dxTreeViewNode] = js.native
  /** @name dxTreeView.selectAll() */
  def selectAll(): Unit = js.native
  /** @name dxTreeView.selectItem(itemData) */
  def selectItem(itemData: js.Any): Unit = js.native
  /** @name dxTreeView.selectItem(itemElement) */
  def selectItem(itemElement: Element): Unit = js.native
  /** @name dxTreeView.unselectAll() */
  def unselectAll(): Unit = js.native
  /** @name dxTreeView.unselectItem(itemData) */
  def unselectItem(itemData: js.Any): Unit = js.native
  /** @name dxTreeView.unselectItem(itemElement) */
  def unselectItem(itemElement: Element): Unit = js.native
  /** @name dxTreeView.updateDimensions() */
  def updateDimensions(): Promise[Unit] with JQueryPromise[Unit] = js.native
}

