package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.dojo.data.api.Read
import typings.dojo.dojo.data.api.Request
import typings.dojo.dojoStrings.append
import typings.dojo.dojoStrings.itemMap
import typings.dojo.dojoStrings.query
import typings.dojo.dojoStrings.queryOptions
import typings.dojo.dojoStrings.store
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/RoundRectDataList.html
  *
  * A dojo/data-enabled version of RoundRectList.
  * RoundRectDataList is a subclass RoundRectList which
  * can generate ListItems according to the given dojo/data store.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojox.mobile._DataMixin because Inheritance from two classes. Inlined 
- typings.dojo.dojox.mobile._DataListMixin because Inheritance from two classes. Inlined append, itemMap, query, queryOptions, store, buildRendering, createListItem, generateList, itemRenderer, refresh, setQuery, setQuery, setStore, setStore, onComplete, onDelete, onError, onNew, onSet, onSet, onSet, onSet, onStoreClose */ @JSGlobal("dojox.mobile.RoundRectDataList")
@js.native
class RoundRectDataList () extends RoundRectList {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
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
  @JSName("get")
  def get_append(property: append): Boolean = js.native
  @JSName("get")
  def get_itemMap(property: itemMap): js.Object = js.native
  @JSName("get")
  def get_query(property: query): js.Object = js.native
  @JSName("get")
  def get_queryOptions(property: queryOptions): js.Object = js.native
  @JSName("get")
  def get_store(property: store): js.Object = js.native
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
  /**
    * Fetches the data and generates the list items.
    *
    */
  def refresh(): js.Any = js.native
  /**
    * Sets a query.
    *
    * @param query
    * @param queryOptions               Optional
    */
  def setQuery(query: js.Object, queryOptions: js.Object): js.Any = js.native
  /**
    * Sets a query.
    *
    * @param query
    * @param queryOptions               Optional
    */
  def setQuery(query: Request, queryOptions: js.Object): js.Any = js.native
  /**
    * Sets the store to use with this widget.
    *
    * @param store
    * @param query
    * @param queryOptions               Optional
    */
  def setStore(store: Read, query: js.Object, queryOptions: js.Object): js.Any = js.native
  /**
    * Sets the store to use with this widget.
    *
    * @param store
    * @param query
    * @param queryOptions               Optional
    */
  def setStore(store: Read, query: Request, queryOptions: js.Object): js.Any = js.native
  @JSName("set")
  def set_append(property: append, value: Boolean): Unit = js.native
  @JSName("set")
  def set_itemMap(property: itemMap, value: js.Object): Unit = js.native
  @JSName("set")
  def set_query(property: query, value: js.Object): Unit = js.native
  @JSName("set")
  def set_queryOptions(property: queryOptions, value: js.Object): Unit = js.native
  @JSName("set")
  def set_store(property: store, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_append(property: append, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_itemMap(property: itemMap, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_query(property: query, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_queryOptions(property: queryOptions, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_store(property: store, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
}

