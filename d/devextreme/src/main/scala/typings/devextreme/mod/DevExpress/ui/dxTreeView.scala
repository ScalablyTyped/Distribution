package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTreeView extends CollectionWidget {
  
  /**
    * [descr:dxTreeView.collapseAll()]
    */
  def collapseAll(): Unit = js.native
  
  /**
    * [descr:dxTreeView.collapseItem(itemData)]
    */
  def collapseItem(itemData: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /**
    * [descr:dxTreeView.collapseItem(itemElement)]
    */
  def collapseItem(itemElement: Element): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxTreeView.expandAll()]
    */
  def expandAll(): Unit = js.native
  
  /**
    * [descr:dxTreeView.expandItem(itemData)]
    */
  def expandItem(itemData: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /**
    * [descr:dxTreeView.expandItem(itemElement)]
    */
  def expandItem(itemElement: Element): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxTreeView.getNodes()]
    */
  def getNodes(): js.Array[dxTreeViewNode] = js.native
  
  /**
    * [descr:dxTreeView.getSelectedNodeKeys()]
    */
  def getSelectedNodeKeys(): js.Array[_] = js.native
  
  /**
    * [descr:dxTreeView.getSelectedNodes()]
    */
  def getSelectedNodes(): js.Array[dxTreeViewNode] = js.native
  
  /**
    * [descr:dxTreeView.scrollToItem(itemData)]
    */
  def scrollToItem(itemData: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /**
    * [descr:dxTreeView.scrollToItem(itemElement)]
    */
  def scrollToItem(itemElement: Element): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxTreeView.selectAll()]
    */
  def selectAll(): Unit = js.native
  
  /**
    * [descr:dxTreeView.selectItem(itemData)]
    */
  def selectItem(itemData: js.Any): Boolean = js.native
  /**
    * [descr:dxTreeView.selectItem(itemElement)]
    */
  def selectItem(itemElement: Element): Boolean = js.native
  
  /**
    * [descr:dxTreeView.unselectAll()]
    */
  def unselectAll(): Unit = js.native
  
  /**
    * [descr:dxTreeView.unselectItem(itemData)]
    */
  def unselectItem(itemData: js.Any): Boolean = js.native
  /**
    * [descr:dxTreeView.unselectItem(itemElement)]
    */
  def unselectItem(itemElement: Element): Boolean = js.native
  
  /**
    * [descr:dxTreeView.updateDimensions()]
    */
  def updateDimensions(): Promise[Unit] with JQueryPromise[Unit] = js.native
}
