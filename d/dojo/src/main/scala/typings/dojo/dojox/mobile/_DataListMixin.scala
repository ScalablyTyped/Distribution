package typings.dojo.dojox.mobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_DataListMixin.html
  *
  * Mixin for widgets to generate the list items corresponding to
  * the data provider object.
  * By mixing this class into the widgets, the list item nodes are
  * generated as the child nodes of the widget and automatically
  * regenerated whenever the corresponding data items are modified.
  *
  */
@JSGlobal("dojox.mobile._DataListMixin")
@js.native
class _DataListMixin () extends _DataMixin {
  /**
    * If true, refresh() does not clear the existing items.
    *
    */
  var append: Boolean = js.native
  /**
    * An optional parameter mapping field names from the store to ItemList name.
    *
    */
  var itemMap: js.Object = js.native
  /**
    *
    */
  def buildRendering(): Unit = js.native
  /**
    * Creates a list item widget.
    *
    * @param item
    */
  def createListItem(item: js.Object): js.Any = js.native
  /**
    * Given the data, generates a list of items.
    *
    * @param items
    * @param dataObject
    */
  def generateList(items: js.Array[_], dataObject: js.Object): Unit = js.native
  /**
    * The class used to create list items. Default is dojox/mobile/ListItem.
    *
    */
  def itemRenderer(): Unit = js.native
  /**
    * An handler that is called after the fetch completes.
    *
    * @param items
    * @param request
    */
  def onComplete(items: js.Array[_], request: js.Object): Unit = js.native
  /**
    * See dojo/data/api/Notification.onDelete().
    *
    * @param deletedItem
    */
  def onDelete(deletedItem: js.Object): Unit = js.native
  /**
    * An error handler.
    *
    * @param errorData
    * @param request
    */
  def onError(errorData: js.Object, request: js.Object): Unit = js.native
  /**
    * See dojo/data/api/Notification.onNew().
    *
    * @param newItem
    * @param parentInfo               Optional
    */
  def onNew(newItem: js.Object, parentInfo: js.Object): Unit = js.native
  /**
    * See dojo/data/api/Notification.onSet().
    *
    * @param item
    * @param attribute
    * @param oldValue
    * @param newValue
    */
  def onSet(item: js.Object, attribute: String, oldValue: js.Array[_], newValue: js.Array[_]): Unit = js.native
  /**
    * See dojo/data/api/Notification.onSet().
    *
    * @param item
    * @param attribute
    * @param oldValue
    * @param newValue
    */
  def onSet(item: js.Object, attribute: String, oldValue: js.Array[_], newValue: js.Object): Unit = js.native
  /**
    * See dojo/data/api/Notification.onSet().
    *
    * @param item
    * @param attribute
    * @param oldValue
    * @param newValue
    */
  def onSet(item: js.Object, attribute: String, oldValue: js.Object, newValue: js.Array[_]): Unit = js.native
  /**
    * See dojo/data/api/Notification.onSet().
    *
    * @param item
    * @param attribute
    * @param oldValue
    * @param newValue
    */
  def onSet(item: js.Object, attribute: String, oldValue: js.Object, newValue: js.Object): Unit = js.native
  /**
    * Refresh list on close.
    *
    * @param request               Optional
    */
  def onStoreClose(request: js.Object): Unit = js.native
}

