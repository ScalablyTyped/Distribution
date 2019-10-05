package typings.dojo.dojox.grid

import typings.dojo.Fn_ItemsSize
import typings.dojo.dijit.tree.ForestStoreModel
import typings.dojo.dojo.data.api.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/LazyTreeGridStoreModel.html
  *
  *
  * @param args
  */
@JSGlobal("dojox.grid.LazyTreeGridStoreModel")
@js.native
class LazyTreeGridStoreModel protected () extends ForestStoreModel {
  def this(args: js.Object) = this()
  /**
    *
    */
  var serverStore: Boolean = js.native
  /**
    *
    * @param parentItem
    * @param onComplete
    * @param onError
    * @param queryObj
    */
  def getChildren(parentItem: Item, onComplete: Fn_ItemsSize, onError: js.Function): Unit = js.native
  def getChildren(parentItem: Item, onComplete: Fn_ItemsSize, onError: js.Function, queryObj: js.Object): Unit = js.native
  /**
    *
    * @param item
    */
  def onDeleteItem(item: js.Any): Unit = js.native
  /**
    *
    * @param item
    * @param parentInfo
    */
  def onNewItem(item: js.Any, parentInfo: js.Any): Unit = js.native
}

