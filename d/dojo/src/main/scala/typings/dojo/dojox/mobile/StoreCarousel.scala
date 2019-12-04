package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.dojo.store.api.Store
import typings.dojo.dojoStrings.childrenProperty
import typings.dojo.dojoStrings.labelProperty
import typings.dojo.dojoStrings.query
import typings.dojo.dojoStrings.queryOptions
import typings.dojo.dojoStrings.store
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/StoreCarousel.html
  *
  * A dojo/store enabled Carousel.
  * StoreCarousel is a subclass of dojox/mobile/Carousel which
  * can generate contents according to the given dojo/store store.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojox.mobile._StoreMixin because Inheritance from two classes. Inlined childrenProperty, labelProperty, query, queryOptions, store, destroy, refresh, setQuery, setStore, onAdd, onComplete, onDelete, onError, onUpdate */ @JSGlobal("dojox.mobile.StoreCarousel")
@js.native
class StoreCarousel () extends Carousel {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
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
  @JSName("get")
  def get_childrenProperty(property: childrenProperty): String = js.native
  @JSName("get")
  def get_labelProperty(property: labelProperty): String = js.native
  @JSName("get")
  def get_query(property: query): js.Object = js.native
  @JSName("get")
  def get_queryOptions(property: queryOptions): js.Object = js.native
  @JSName("get")
  def get_store(property: store): js.Object = js.native
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
  @JSName("set")
  def set_childrenProperty(property: childrenProperty, value: String): Unit = js.native
  @JSName("set")
  def set_labelProperty(property: labelProperty, value: String): Unit = js.native
  @JSName("set")
  def set_query(property: query, value: js.Object): Unit = js.native
  @JSName("set")
  def set_queryOptions(property: queryOptions, value: js.Object): Unit = js.native
  @JSName("set")
  def set_store(property: store, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_childrenProperty(
    property: childrenProperty,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_labelProperty(
    property: labelProperty,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_query(
    property: query,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_queryOptions(
    property: queryOptions,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_store(
    property: store,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

