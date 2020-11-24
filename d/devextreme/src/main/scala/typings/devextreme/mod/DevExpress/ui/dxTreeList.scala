package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTreeList extends GridBase {
  
  def addColumn(columnOptions: String): Unit = js.native
  /**
    * [descr:dxTreeList.addColumn(columnOptions)]
    */
  def addColumn(columnOptions: js.Any): Unit = js.native
  
  /**
    * [descr:dxTreeList.addRow()]
    */
  def addRow(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /**
    * [descr:dxTreeList.addRow(parentId)]
    */
  def addRow(parentId: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxTreeList.collapseRow(key)]
    */
  def collapseRow(key: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxTreeList.expandRow(key)]
    */
  def expandRow(key: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxTreeList.forEachNode(callback)]
    */
  def forEachNode(callback: js.Function): Unit = js.native
  /**
    * [descr:dxTreeList.forEachNode(nodes, callback)]
    */
  def forEachNode(nodes: js.Array[dxTreeListNode], callback: js.Function): Unit = js.native
  
  def getNodeByKey(key: String): dxTreeListNode = js.native
  /**
    * [descr:dxTreeList.getNodeByKey(key)]
    */
  def getNodeByKey(key: js.Any): dxTreeListNode = js.native
  def getNodeByKey(key: Double): dxTreeListNode = js.native
  
  /**
    * [descr:dxTreeList.getRootNode()]
    */
  def getRootNode(): dxTreeListNode = js.native
  
  /**
    * [descr:dxTreeList.getSelectedRowKeys()]
    */
  def getSelectedRowKeys(): js.Array[_] = js.native
  /**
    * [descr:dxTreeList.getSelectedRowKeys(mode)]
    */
  def getSelectedRowKeys(mode: String): js.Array[_] = js.native
  
  /**
    * [descr:dxTreeList.getSelectedRowsData()]
    */
  def getSelectedRowsData(): js.Array[_] = js.native
  /**
    * [descr:dxTreeList.getSelectedRowsData(mode)]
    */
  def getSelectedRowsData(mode: String): js.Array[_] = js.native
  
  /**
    * [descr:dxTreeList.getVisibleColumns()]
    */
  def getVisibleColumns(): js.Array[dxTreeListColumn] = js.native
  /**
    * [descr:dxTreeList.getVisibleColumns(headerLevel)]
    */
  def getVisibleColumns(headerLevel: Double): js.Array[dxTreeListColumn] = js.native
  
  /**
    * [descr:dxTreeList.getVisibleRows()]
    */
  def getVisibleRows(): js.Array[dxTreeListRowObject] = js.native
  
  /**
    * [descr:dxTreeList.isRowExpanded(key)]
    */
  def isRowExpanded(key: js.Any): Boolean = js.native
  
  /**
    * [descr:dxTreeList.loadDescendants()]
    */
  def loadDescendants(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /**
    * [descr:dxTreeList.loadDescendants(keys)]
    */
  def loadDescendants(keys: js.Array[_]): Promise[Unit] with JQueryPromise[Unit] = js.native
  /**
    * [descr:dxTreeList.loadDescendants(keys, childrenOnly)]
    */
  def loadDescendants(keys: js.Array[_], childrenOnly: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}
