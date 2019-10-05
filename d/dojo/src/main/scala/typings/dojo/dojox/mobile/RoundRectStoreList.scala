package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.dojo.store.api.Store
import typings.dojo.dojoStrings.append
import typings.dojo.dojoStrings.childrenProperty
import typings.dojo.dojoStrings.itemMap
import typings.dojo.dojoStrings.labelProperty
import typings.dojo.dojoStrings.query
import typings.dojo.dojoStrings.queryOptions
import typings.dojo.dojoStrings.store
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/RoundRectStoreList.html
  *
  * A dojo/store-enabled version of RoundRectList.
  * RoundRectStoreList is a subclass of RoundRectList which
  * can generate ListItems according to the given dojo/store store.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojox.mobile._StoreMixin because Inheritance from two classes. Inlined 
- typings.dojo.dojox.mobile._StoreListMixin because Inheritance from two classes. Inlined append, childrenProperty, itemMap, labelProperty, query, queryOptions, store, buildRendering, createListItem, destroy, generateList, itemRenderer, refresh, setQuery, setStore, onAdd, onComplete, onDelete, onError, onUpdate */ @JSGlobal("dojox.mobile.RoundRectStoreList")
@js.native
class RoundRectStoreList () extends RoundRectList {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * If true, refresh() does not clear the existing items.
    *
    */
  var append: Boolean = js.native
  /**
    * A property name (a property in the dojo/store item) that specifies that item's children.
    *
    */
  var childrenProperty: String = js.native
  /**
    * An optional parameter mapping field names from the store to ItemList names.
    * Example: itemMap:{text:'label', profile_image_url:'icon'}
    *
    */
  var itemMap: js.Object = js.native
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
  @JSName("get")
  def get_append(property: append): Boolean = js.native
  @JSName("get")
  def get_childrenProperty(property: childrenProperty): String = js.native
  @JSName("get")
  def get_itemMap(property: itemMap): js.Object = js.native
  @JSName("get")
  def get_labelProperty(property: labelProperty): String = js.native
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
  @JSName("set")
  def set_append(property: append, value: Boolean): Unit = js.native
  @JSName("set")
  def set_childrenProperty(property: childrenProperty, value: String): Unit = js.native
  @JSName("set")
  def set_itemMap(property: itemMap, value: js.Object): Unit = js.native
  @JSName("set")
  def set_labelProperty(property: labelProperty, value: String): Unit = js.native
  @JSName("set")
  def set_query(property: query, value: js.Object): Unit = js.native
  @JSName("set")
  def set_queryOptions(property: queryOptions, value: js.Object): Unit = js.native
  @JSName("set")
  def set_store(property: store, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_append(property: append, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_childrenProperty(property: childrenProperty, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_itemMap(property: itemMap, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_labelProperty(property: labelProperty, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_query(property: query, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_queryOptions(property: queryOptions, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_store(property: store, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
}

