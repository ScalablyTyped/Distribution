package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxList extends CollectionWidget {
  
  /**
    * [descr:dxList.clientHeight()]
    */
  def clientHeight(): Double = js.native
  
  /**
    * [descr:dxList.collapseGroup(groupIndex)]
    */
  def collapseGroup(groupIndex: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxList.deleteItem(itemElement)]
    */
  def deleteItem(itemElement: Element): Promise[Unit] with JQueryPromise[Unit] = js.native
  def deleteItem(itemIndex: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /**
    * [descr:dxList.deleteItem(itemIndex)]
    */
  def deleteItem(itemIndex: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxList.expandGroup(groupIndex)]
    */
  def expandGroup(groupIndex: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxList.isItemSelected(itemElement)]
    */
  def isItemSelected(itemElement: Element): Boolean = js.native
  def isItemSelected(itemIndex: js.Any): Boolean = js.native
  /**
    * [descr:dxList.isItemSelected(itemIndex)]
    */
  def isItemSelected(itemIndex: Double): Boolean = js.native
  
  /**
    * [descr:dxList.reload()]
    */
  def reload(): Unit = js.native
  
  /**
    * [descr:dxList.reorderItem(itemElement, toItemElement)]
    */
  def reorderItem(itemElement: Element, toItemElement: Element): Promise[Unit] with JQueryPromise[Unit] = js.native
  def reorderItem(itemIndex: js.Any, toItemIndex: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  def reorderItem(itemIndex: js.Any, toItemIndex: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  def reorderItem(itemIndex: Double, toItemIndex: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  /**
    * [descr:dxList.reorderItem(itemIndex, toItemIndex)]
    */
  def reorderItem(itemIndex: Double, toItemIndex: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxList.scrollBy(distance)]
    */
  def scrollBy(distance: Double): Unit = js.native
  
  /**
    * [descr:dxList.scrollHeight()]
    */
  def scrollHeight(): Double = js.native
  
  /**
    * [descr:dxList.scrollTo(location)]
    */
  def scrollTo(location: Double): Unit = js.native
  
  /**
    * [descr:dxList.scrollToItem(itemElement)]
    */
  def scrollToItem(itemElement: Element): Unit = js.native
  def scrollToItem(itemIndex: js.Any): Unit = js.native
  /**
    * [descr:dxList.scrollToItem(itemIndex)]
    */
  def scrollToItem(itemIndex: Double): Unit = js.native
  
  /**
    * [descr:dxList.scrollTop()]
    */
  def scrollTop(): Double = js.native
  
  /**
    * [descr:dxList.selectAll()]
    */
  def selectAll(): Unit = js.native
  
  /**
    * [descr:dxList.selectItem(itemElement)]
    */
  def selectItem(itemElement: Element): Unit = js.native
  def selectItem(itemIndex: js.Any): Unit = js.native
  /**
    * [descr:dxList.selectItem(itemIndex)]
    */
  def selectItem(itemIndex: Double): Unit = js.native
  
  /**
    * [descr:dxList.unselectAll()]
    */
  def unselectAll(): Unit = js.native
  
  /**
    * [descr:dxList.unselectItem(itemElement)]
    */
  def unselectItem(itemElement: Element): Unit = js.native
  def unselectItem(itemIndex: js.Any): Unit = js.native
  /**
    * [descr:dxList.unselectItem(itemIndex)]
    */
  def unselectItem(itemIndex: Double): Unit = js.native
  
  /**
    * [descr:dxList.updateDimensions()]
    */
  def updateDimensions(): Promise[Unit] with JQueryPromise[Unit] = js.native
}
