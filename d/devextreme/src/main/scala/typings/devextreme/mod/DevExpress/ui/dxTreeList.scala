package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTreeList extends GridBase {
  def addColumn(columnOptions: String): Unit = js.native
  /** Adds a new column. */
  def addColumn(columnOptions: js.Any): Unit = js.native
  /** Adds an empty data row to the highest hierarchical level and switches it to the editing state. */
  def addRow(): Unit = js.native
  /** Adds an empty data row to a specified parent row. */
  def addRow(parentId: js.Any): Unit = js.native
  /** Collapses a row with a specific key. */
  def collapseRow(key: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Expands a row with a specific key. */
  def expandRow(key: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Performs a pre-order tree traversal, executing a function on each visited node. Starts traversing from the top level nodes. */
  def forEachNode(callback: js.Function): Unit = js.native
  /** Performs a pre-order tree traversal, executing a function on each visited node. Starts traversing from the specified nodes. */
  def forEachNode(nodes: js.Array[dxTreeListNode], callback: js.Function): Unit = js.native
  def getNodeByKey(key: String): dxTreeListNode = js.native
  /** Gets a node with a specific key. */
  def getNodeByKey(key: js.Any): dxTreeListNode = js.native
  def getNodeByKey(key: Double): dxTreeListNode = js.native
  /** Gets the root node. */
  def getRootNode(): dxTreeListNode = js.native
  /** Gets the keys of the rows selected explicitly via the API or via a click or tap. */
  def getSelectedRowKeys(): js.Array[_] = js.native
  /** @deprecated Use the [getSelectedRowKeys(mode)](/api-reference/10%20UI%20Widgets/dxTreeList/3%20Methods/getSelectedRowKeys(mode).md '/Documentation/ApiReference/UI_Widgets/dxTreeList/Methods/#getSelectedRowKeysmode') method instead. */
  /** Gets the selected rows' keys. */
  def getSelectedRowKeys(leavesOnly: Boolean): js.Array[_] = js.native
  /** Gets the selected rows' keys. */
  def getSelectedRowKeys(mode: String): js.Array[_] = js.native
  /** Gets the data objects of the rows selected explicitly via the API or via a click or tap. */
  def getSelectedRowsData(): js.Array[_] = js.native
  /** Gets the selected rows' data objects. */
  def getSelectedRowsData(mode: String): js.Array[_] = js.native
  /** Gets all visible columns. */
  def getVisibleColumns(): js.Array[dxTreeListColumn] = js.native
  /** Gets all visible columns at a specific hierarchical level of column headers. Use it to access banded columns. */
  def getVisibleColumns(headerLevel: Double): js.Array[dxTreeListColumn] = js.native
  /** Gets currently rendered rows. */
  def getVisibleRows(): js.Array[dxTreeListRowObject] = js.native
  /** Checks whether a row is expanded or collapsed. */
  def isRowExpanded(key: js.Any): Boolean = js.native
  /** Loads all root node descendants (all data items). Takes effect only if data has the plain structure and remoteOperations | filtering is true. */
  def loadDescendants(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Loads a specific node's descendants. Takes effect only if data has the plain structure and remoteOperations | filtering is true. */
  def loadDescendants(keys: js.Array[_]): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Loads all or only direct descendants of specific nodes. Takes effect only if data has the plain structure and remoteOperations | filtering is true. */
  def loadDescendants(keys: js.Array[_], childrenOnly: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}

