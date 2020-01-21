package typings.dojo.dojox.mobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_StoreListMixin.html
  *
  * Mixin for widgets to generate the list items corresponding to
  * the dojo/store data provider object.
  * Mixin for widgets to generate the list items corresponding to
  * the dojo/store data provider object.
  * By mixing this class into the widgets, the list item nodes are
  * generated as the child nodes of the widget and automatically
  * regenerated whenever the corresponding data items are modified.
  *
  */
@JSGlobal("dojox.mobile._StoreListMixin")
@js.native
class StoreListMixin () extends StoreMixin {
  /**
    * If true, refresh() does not clear the existing items.
    *
    */
  var append: Boolean = js.native
  /**
    * An optional parameter mapping field names from the store to ItemList names.
    * Example: itemMap:{text:'label', profile_image_url:'icon'}
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
    */
  def generateList(items: js.Array[_]): Unit = js.native
  /**
    * The class used to create list items. Default is dojox/mobile/ListItem.
    *
    */
  def itemRenderer(): Unit = js.native
  /**
    * Calls createListItem and adds the new list item when a new data item has been added to the store.
    *
    * @param item
    * @param insertedInto
    */
  def onAdd(item: js.Object, insertedInto: Double): Unit = js.native
  /**
    * A handler that is called after the fetch completes.
    *
    * @param items
    */
  def onComplete(items: js.Array[_]): Unit = js.native
  /**
    * Deletes an existing item.
    *
    * @param item
    * @param removedFrom
    */
  def onDelete(item: js.Object, removedFrom: Double): Unit = js.native
  /**
    * An error handler.
    *
    * @param errorData
    */
  def onError(errorData: js.Object): Unit = js.native
  /**
    * Updates an existing list item when a data item has been modified.
    *
    * @param item
    * @param insertedInto
    */
  def onUpdate(item: js.Object, insertedInto: Double): Unit = js.native
}

