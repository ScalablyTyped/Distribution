package typings.dojo.dojox.mobile

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.autoComplete
import typings.dojo.dojoStrings.dropDown
import typings.dojo.dojoStrings.dropDownClass
import typings.dojo.dojoStrings.dropDownPosition
import typings.dojo.dojoStrings.fetchProperties
import typings.dojo.dojoStrings.highlightMatch
import typings.dojo.dojoStrings.ignoreCase
import typings.dojo.dojoStrings.item
import typings.dojo.dojoStrings.labelAttr
import typings.dojo.dojoStrings.labelType
import typings.dojo.dojoStrings.maxHeight
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
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/ComboBox.html
  *
  * A non-templated auto-completing text box widget.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.form.SearchMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit.form.AutoCompleterMixin because Inheritance from two classes. Inlined autoComplete, fetchProperties, highlightMatch, ignoreCase, item, labelAttr, labelType, maxHeight, pageSize, query, queryExpr, searchAttr, searchDelay, store, closeDropDown, doHighlight, isLoaded, loadDropDown, postCreate, postMixInProperties, reset, onSearch */ @JSGlobal("dojox.mobile.ComboBox")
@js.native
class ComboBox () extends TextBox {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Flag which enables the auto-completion.
    *
    */
  var autoComplete: Boolean = js.native
  /**
    * The widget to display as a popup. This widget must be
    * defined before the startup function is called.
    *
    */
  var dropDown: js.Object = js.native
  /**
    * Name of the drop-down widget class used to select a date/time.
    * Should be specified by subclasses.
    *
    */
  var dropDownClass: String = js.native
  /**
    * This variable controls the position of the drop-down.
    * It is an array of strings with the following values:
    *
    * before: places drop down to the left of the target node/widget, or to the right in
    * the case of RTL scripts like Hebrew and Arabic
    * after: places drop down to the right of the target node/widget, or to the left in
    * the case of RTL scripts like Hebrew and Arabic
    * above: drop down goes above target node
    * below: drop down goes below target node
    * The list is positions is tried, in order, until a position is found where the drop down fits
    * within the viewport.
    *
    */
  var dropDownPosition: js.Object = js.native
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
    * One of: "first", "all" or "none".
    *
    * If the ComboBox/FilteringSelect opens with the search results and the searched
    * string can be found, it will be highlighted.  If set to "all"
    * then will probably want to change queryExpr parameter to '${0}'
    *
    * Highlighting is only performed when labelType is "text", so as to not
    * interfere with any HTML markup an HTML label might contain.
    *
    */
  var highlightMatch: String = js.native
  /**
    * Set true if the query should ignore case when matching possible items
    *
    */
  var ignoreCase: Boolean = js.native
  /**
    * This is the item returned by the dojo/store/api/Store implementation that
    * provides the data for this ComboBox, it's the currently selected item.
    *
    */
  var item: js.Object = js.native
  /**
    * The entries in the drop down list come from this attribute in the
    * dojo.data items.
    * If not specified, the searchAttr attribute is used instead.
    *
    */
  var labelAttr: js.Object = js.native
  /**
    * Specifies how to interpret the labelAttr in the data store items.
    * Can be "html" or "text".
    *
    */
  var labelType: String = js.native
  /**
    * The maximum height for the drop-down.
    * Any drop-down taller than this value will have scrollbars.
    * Set to -1 to limit the height to the available space in the viewport.
    *
    */
  var maxHeight: Double = js.native
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
  var value_ComboBox: String = js.native
  /**
    * Closes the drop down on this widget
    *
    */
  /**
    * 
    */
  def closeDropDown(): Unit = js.native
  /**
    * Highlights the string entered by the user in the menu.  By default this
    * highlights the first occurrence found. Override this method
    * to implement your custom highlighting.
    *
    * @param label
    * @param find
    */
  /**
    * Highlights the string entered by the user in the menu.  By default this
    * highlights the first occurrence found. Override this method
    * to implement your custom highlighting.
    * 
    * @param label             
    * @param find             
    */
  def doHighlight(label: String, find: String): js.Any = js.native
  @JSName("get")
  def get_autoComplete(property: autoComplete): Boolean = js.native
  @JSName("get")
  def get_dropDown(property: dropDown): js.Object = js.native
  @JSName("get")
  def get_dropDownClass(property: dropDownClass): String = js.native
  @JSName("get")
  def get_dropDownPosition(property: dropDownPosition): js.Object = js.native
  @JSName("get")
  def get_fetchProperties(property: fetchProperties): js.Object = js.native
  @JSName("get")
  def get_highlightMatch(property: highlightMatch): String = js.native
  @JSName("get")
  def get_ignoreCase(property: ignoreCase): Boolean = js.native
  @JSName("get")
  def get_item(property: item): js.Object = js.native
  @JSName("get")
  def get_labelAttr(property: labelAttr): js.Object = js.native
  @JSName("get")
  def get_labelType(property: labelType): String = js.native
  @JSName("get")
  def get_maxHeight(property: maxHeight): Double = js.native
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
    *
    */
  /**
    * 
    */
  def isLoaded(): Boolean = js.native
  /**
    *
    * @param callback
    */
  /**
    * 
    * @param callback             
    */
  def loadDropDown(callback: js.Function): Unit = js.native
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
  /**
    * Opens the dropdown for this widget. To be called only when this.dropDown
    * has been created and is ready to display (that is, its data is loaded).
    *
    */
  def openDropDown(): js.Any = js.native
  @JSName("set")
  def set_autoComplete(property: autoComplete, value: Boolean): Unit = js.native
  @JSName("set")
  def set_dropDown(property: dropDown, value: js.Object): Unit = js.native
  @JSName("set")
  def set_dropDownClass(property: dropDownClass, value: String): Unit = js.native
  @JSName("set")
  def set_dropDownPosition(property: dropDownPosition, value: js.Object): Unit = js.native
  @JSName("set")
  def set_fetchProperties(property: fetchProperties, value: js.Object): Unit = js.native
  @JSName("set")
  def set_highlightMatch(property: highlightMatch, value: String): Unit = js.native
  @JSName("set")
  def set_ignoreCase(property: ignoreCase, value: Boolean): Unit = js.native
  @JSName("set")
  def set_item(property: item, value: js.Object): Unit = js.native
  @JSName("set")
  def set_labelAttr(property: labelAttr, value: js.Object): Unit = js.native
  @JSName("set")
  def set_labelType(property: labelType, value: String): Unit = js.native
  @JSName("set")
  def set_maxHeight(property: maxHeight, value: Double): Unit = js.native
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
  def watch_autoComplete(
    property: autoComplete,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dropDown(
    property: dropDown,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dropDownClass(
    property: dropDownClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_dropDownPosition(
    property: dropDownPosition,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_fetchProperties(
    property: fetchProperties,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_highlightMatch(
    property: highlightMatch,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_ignoreCase(
    property: ignoreCase,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_item(
    property: item,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_labelAttr(
    property: labelAttr,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_labelType(
    property: labelType,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_maxHeight(
    property: maxHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_pageSize(
    property: pageSize,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_query(
    property: query,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_queryExpr(
    property: queryExpr,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_searchAttr(
    property: searchAttr,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_searchDelay(
    property: searchDelay,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_store(
    property: store,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

