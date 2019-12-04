package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.fetchProperties
import typings.dojo.dojoStrings.ignoreCase
import typings.dojo.dojoStrings.incremental
import typings.dojo.dojoStrings.pageSize
import typings.dojo.dojoStrings.query
import typings.dojo.dojoStrings.queryExpr
import typings.dojo.dojoStrings.searchAttr
import typings.dojo.dojoStrings.searchDelay
import typings.dojo.dojoStrings.store
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/SearchBox.html
  *
  * A non-templated base class for INPUT type="search".
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.form._SearchMixin because Inheritance from two classes. Inlined fetchProperties, ignoreCase, pageSize, query, queryExpr, searchAttr, searchDelay, store, postMixInProperties, onSearch */ @JSGlobal("dojox.mobile.SearchBox")
@js.native
class SearchBox () extends TextBox {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Mixin to the store's fetch.
    * For example, to set the sort order of the ComboBox menu, pass:
    *
    * { sort: [{attribute:"name",descending: true}] }
    * To override the default queryOptions so that deep=false, do:
    *
    * { queryOptions: {ignoreCase: true, deep: false} }
    *
    */
  var fetchProperties: js.Object = js.native
  /**
    * Set true if the query should ignore case when matching possible items
    *
    */
  var ignoreCase: Boolean = js.native
  /**
    * Set true to search on every key or false to only search after
    * pressing ENTER or cancel.
    *
    */
  var incremental: Boolean = js.native
  /**
    * Argument to data provider.
    * Specifies maximum number of search results to return per query
    *
    */
  var pageSize: Double = js.native
  /**
    * A query that can be passed to store to initially filter the items.
    * ComboBox overwrites any reference to the searchAttr and sets it to the queryExpr with the user's input substituted.
    *
    */
  var query: js.Object = js.native
  /**
    * This specifies what query is sent to the data store,
    * based on what the user has typed.  Changing this expression will modify
    * whether the results are only exact matches, a "starting with" match,
    * etc.
    * ${0} will be substituted for the user text.
    * * is used for wildcards.
    * ${0}* means "starts with", *${0}* means "contains", ${0} means "is"
    *
    */
  var queryExpr: String = js.native
  /**
    * Search for items in the data store where this attribute (in the item)
    * matches what the user typed
    *
    */
  var searchAttr: String = js.native
  /**
    * Delay in milliseconds between when user types something and we start
    * searching based on that value
    *
    */
  var searchDelay: Double = js.native
  /**
    * Reference to data provider object used by this ComboBox.
    * The store must accept an object hash of properties for its query. See query and queryExpr for details.
    *
    */
  var store: js.Object = js.native
  /**
    * Corresponds to the native HTML <input> element's attribute.
    *
    */
  @JSName("value")
  var value_SearchBox: String = js.native
  @JSName("get")
  def get_fetchProperties(property: fetchProperties): js.Object = js.native
  @JSName("get")
  def get_ignoreCase(property: ignoreCase): Boolean = js.native
  @JSName("get")
  def get_incremental(property: incremental): Boolean = js.native
  @JSName("get")
  def get_pageSize(property: pageSize): Double = js.native
  @JSName("get")
  def get_query(property: query): js.Object = js.native
  @JSName("get")
  def get_queryExpr(property: queryExpr): String = js.native
  @JSName("get")
  def get_searchAttr(property: searchAttr): String = js.native
  @JSName("get")
  def get_searchDelay(property: searchDelay): Double = js.native
  @JSName("get")
  def get_store(property: store): js.Object = js.native
  /**
    * Callback when a search completes.
    *
    * @param results An array of items from the originating _SearchMixin's store.
    * @param query A copy of the originating _SearchMixin's query property.
    * @param options The additional parameters sent to the originating _SearchMixin's store, including: start, count, queryOptions.
    */
  /**
    * Callback when a search completes.
    * 
    * @param results An array of items from the originating _SearchMixin's store.             
    * @param query A copy of the originating _SearchMixin's query property.             
    * @param options The additional parameters sent to the originating _SearchMixin's store, including: start, count, queryOptions.             
    */
  def onSearch(results: js.Object, query: js.Object, options: js.Object): Unit = js.native
  @JSName("set")
  def set_fetchProperties(property: fetchProperties, value: js.Object): Unit = js.native
  @JSName("set")
  def set_ignoreCase(property: ignoreCase, value: Boolean): Unit = js.native
  @JSName("set")
  def set_incremental(property: incremental, value: Boolean): Unit = js.native
  @JSName("set")
  def set_pageSize(property: pageSize, value: Double): Unit = js.native
  @JSName("set")
  def set_query(property: query, value: js.Object): Unit = js.native
  @JSName("set")
  def set_queryExpr(property: queryExpr, value: String): Unit = js.native
  @JSName("set")
  def set_searchAttr(property: searchAttr, value: String): Unit = js.native
  @JSName("set")
  def set_searchDelay(property: searchDelay, value: Double): Unit = js.native
  @JSName("set")
  def set_store(property: store, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_fetchProperties(
    property: fetchProperties,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_ignoreCase(
    property: ignoreCase,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_incremental(
    property: incremental,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_pageSize(
    property: pageSize,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
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
  def watch_queryExpr(
    property: queryExpr,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_searchAttr(
    property: searchAttr,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_searchDelay(
    property: searchDelay,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
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

