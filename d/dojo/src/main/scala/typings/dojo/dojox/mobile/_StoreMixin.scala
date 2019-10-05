package typings.dojo.dojox.mobile

import typings.dojo.dojo.store.api.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/_StoreMixin.html
  *
  * Mixin for widgets to enable dojo/store data store.
  * By mixing this class into a widget, it can get data through a
  * dojo/store data store. The widget must implement the following
  * methods to handle the retrieved data:
  *
  * onComplete(/Array/items), onError(/Object/errorData),
  * onUpdate(/Object/item, /Number/insertedInto), and
  * onDelete(/Object/item, /Number/removedFrom).
  *
  */
@JSGlobal("dojox.mobile._StoreMixin")
@js.native
class _StoreMixin () extends js.Object {
  /**
    * A property name (a property in the dojo/store item) that specifies that item's children.
    *
    */
  var childrenProperty: String = js.native
  /**
    * A property name (a property in the dojo/store item) that specifies that item's label.
    *
    */
  var labelProperty: String = js.native
  /**
    * A query that can be passed to 'store' to initially filter the items.
    *
    */
  var query: js.Object = js.native
  /**
    * An optional parameter for the query.
    *
    */
  var queryOptions: js.Object = js.native
  /**
    * Reference to data provider object used by this widget.
    *
    */
  var store: js.Object = js.native
  /**
    *
    */
  def destroy(): Unit = js.native
  /**
    * Called when a new data item has been added to the store.
    * Note: for compatibility with previous versions where this function did not exist,
    * if onAdd is not defined, onUpdate will be called instead.
    *
    * @param item
    * @param insertedInto
    */
  def onAdd(item: js.Any, insertedInto: js.Any): Unit = js.native
  /**
    * A handler that is called after the fetch completes.
    *
    * @param items
    */
  def onComplete(items: js.Any): Unit = js.native
  /**
    * Called when a data item has been removed from the store.
    *
    * @param item
    * @param removedFrom
    */
  def onDelete(item: js.Any, removedFrom: js.Any): Unit = js.native
  /**
    * An error handler.
    *
    * @param errorData
    */
  def onError(errorData: js.Any): Unit = js.native
  /**
    * Called when an existing data item has been modified in the store.
    * Note: for compatibility with previous versions where only onUpdate was present,
    * if onAdd is not defined, onUpdate will be called instead.
    *
    * @param item
    * @param insertedInto
    */
  def onUpdate(item: js.Any, insertedInto: js.Any): Unit = js.native
  /**
    * Fetches the data and generates the list items.
    *
    */
  def refresh(): js.Any = js.native
  /**
    *
    * @param query
    * @param queryOptions
    */
  def setQuery(query: String, queryOptions: js.Object): js.Any = js.native
  /**
    * Sets the store to use with this widget.
    *
    * @param store
    * @param query
    * @param queryOptions
    */
  def setStore(store: Store, query: String, queryOptions: js.Object): js.Any = js.native
}

