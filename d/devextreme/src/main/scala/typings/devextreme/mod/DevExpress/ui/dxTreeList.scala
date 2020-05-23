package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTreeList extends GridBase {
  def addColumn(columnOptions: String): Unit = js.native
  /** @name dxTreeList.addColumn(columnOptions) */
  def addColumn(columnOptions: js.Any): Unit = js.native
  /** @name dxTreeList.addRow() */
  def addRow(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxTreeList.addRow(parentId) */
  def addRow(parentId: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxTreeList.collapseRow(key) */
  def collapseRow(key: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxTreeList.expandRow(key) */
  def expandRow(key: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxTreeList.forEachNode(callback) */
  def forEachNode(callback: js.Function): Unit = js.native
  /** @name dxTreeList.forEachNode(nodes, callback) */
  def forEachNode(nodes: js.Array[dxTreeListNode], callback: js.Function): Unit = js.native
  def getNodeByKey(key: String): dxTreeListNode = js.native
  /** @name dxTreeList.getNodeByKey(key) */
  def getNodeByKey(key: js.Any): dxTreeListNode = js.native
  def getNodeByKey(key: Double): dxTreeListNode = js.native
  /** @name dxTreeList.getRootNode() */
  def getRootNode(): dxTreeListNode = js.native
  /** @name dxTreeList.getSelectedRowKeys() */
  def getSelectedRowKeys(): js.Array[_] = js.native
  /** @deprecated */
  /** @name dxTreeList.getSelectedRowKeys(leavesOnly) */
  def getSelectedRowKeys(leavesOnly: Boolean): js.Array[_] = js.native
  /** @name dxTreeList.getSelectedRowKeys(mode) */
  def getSelectedRowKeys(mode: String): js.Array[_] = js.native
  /** @name dxTreeList.getSelectedRowsData() */
  def getSelectedRowsData(): js.Array[_] = js.native
  /** @name dxTreeList.getSelectedRowsData(mode) */
  def getSelectedRowsData(mode: String): js.Array[_] = js.native
  /** @name dxTreeList.getVisibleColumns() */
  def getVisibleColumns(): js.Array[dxTreeListColumn] = js.native
  /** @name dxTreeList.getVisibleColumns(headerLevel) */
  def getVisibleColumns(headerLevel: Double): js.Array[dxTreeListColumn] = js.native
  /** @name dxTreeList.getVisibleRows() */
  def getVisibleRows(): js.Array[dxTreeListRowObject] = js.native
  /** @name dxTreeList.isRowExpanded(key) */
  def isRowExpanded(key: js.Any): Boolean = js.native
  /** @name dxTreeList.loadDescendants() */
  def loadDescendants(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxTreeList.loadDescendants(keys) */
  def loadDescendants(keys: js.Array[_]): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxTreeList.loadDescendants(keys, childrenOnly) */
  def loadDescendants(keys: js.Array[_], childrenOnly: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}

