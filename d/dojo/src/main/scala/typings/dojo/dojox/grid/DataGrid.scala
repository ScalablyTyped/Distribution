package typings.dojo.dojox.grid

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dojoStrings.fetchText
import typings.dojo.dojoStrings.items
import typings.dojo.dojoStrings.keepSelection
import typings.dojo.dojoStrings.query
import typings.dojo.dojoStrings.queryOptions
import typings.dojo.dojoStrings.sortFields
import typings.dojo.dojoStrings.store
import typings.dojo.dojoStrings.updateDelay
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/DataGrid.html
  *
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.grid.DataGrid")
@js.native
class DataGrid () extends _Grid {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    *
    */
  var fetchText: String = js.native
  /**
    *
    */
  var items: js.Object = js.native
  /**
    * Whether keep selection after sort, filter etc.
    *
    */
  var keepSelection: Boolean = js.native
  /**
    *
    */
  var query: js.Object = js.native
  /**
    *
    */
  var queryOptions: js.Object = js.native
  /**
    *
    */
  var sortFields: js.Object = js.native
  /**
    *
    */
  var store: js.Object = js.native
  /**
    * Time, in milliseconds, to delay updates automatically so that multiple
    * calls to onSet/onNew/onDelete don't keep rerendering the grid.  Set
    * to 0 to immediately cause updates.  A higher value will result in
    * better performance at the expense of responsiveness of the grid.
    *
    */
  var updateDelay: Double = js.native
  /**
    *
    * @param inCell
    * @param inRowIndex
    */
  def canEdit(inCell: js.Any, inRowIndex: js.Any): js.Any = js.native
  /**
    *
    */
  def canSort(): Boolean = js.native
  /**
    *
    * @param cellFunc
    * @param node
    * @param cellDef
    */
  def cell_markupFactory(cellFunc: js.Any, node: js.Any, cellDef: js.Any): Unit = js.native
  def doApplyEdit(inRowIndex: js.Any, inDataAttr: js.Any): Unit = js.native
  /**
    *
    * @param query
    * @param reRender
    */
  def filter(query: js.Any, reRender: js.Any): Unit = js.native
  /**
    * Default data getter.
    * Provides data to display in a grid cell. Called in grid cell context.
    * So this.cell.index is the column index.
    *
    * @param inRowIndex Row for which to provide data
    * @param inItem
    */
  def get(inRowIndex: Double, inItem: js.Any): js.Any = js.native
  /**
    *
    * @param item
    */
  def getItemIndex(item: js.Any): js.Any = js.native
  /**
    *
    */
  def getSortProps(): js.Any = js.native
  @JSName("get")
  def get_fetchText(property: fetchText): String = js.native
  @JSName("get")
  def get_items(property: items): js.Object = js.native
  @JSName("get")
  def get_keepSelection(property: keepSelection): Boolean = js.native
  @JSName("get")
  def get_query(property: query): js.Object = js.native
  @JSName("get")
  def get_queryOptions(property: queryOptions): js.Object = js.native
  @JSName("get")
  def get_sortFields(property: sortFields): js.Object = js.native
  @JSName("get")
  def get_store(property: store): js.Object = js.native
  @JSName("get")
  def get_updateDelay(property: updateDelay): Double = js.native
  /**
    *
    * @param err
    * @param req
    */
  def onFetchError(err: js.Any, req: js.Any): Unit = js.native
  /**
    *
    * @param inRow
    */
  def onStyleRow(inRow: js.Any): Unit = js.native
  /**
    *
    * @param items
    */
  def setItems(items: js.Any): Unit = js.native
  /**
    *
    * @param query
    * @param queryOptions
    */
  def setQuery(query: js.Any, queryOptions: js.Any): Unit = js.native
  /**
    *
    * @param store
    * @param query
    * @param queryOptions
    */
  def setStore(store: js.Any, query: js.Any, queryOptions: js.Any): Unit = js.native
  @JSName("set")
  def set_fetchText(property: fetchText, value: String): Unit = js.native
  @JSName("set")
  def set_items(property: items, value: js.Object): Unit = js.native
  @JSName("set")
  def set_keepSelection(property: keepSelection, value: Boolean): Unit = js.native
  @JSName("set")
  def set_query(property: query, value: js.Object): Unit = js.native
  @JSName("set")
  def set_queryOptions(property: queryOptions, value: js.Object): Unit = js.native
  @JSName("set")
  def set_sortFields(property: sortFields, value: js.Object): Unit = js.native
  @JSName("set")
  def set_store(property: store, value: js.Object): Unit = js.native
  @JSName("set")
  def set_updateDelay(property: updateDelay, value: Double): Unit = js.native
  /**
    * Perform row styling
    *
    * @param inRow
    */
  def styleRowState(inRow: js.Any): Unit = js.native
  @JSName("watch")
  def watch_fetchText(property: fetchText, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_items(property: items, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_keepSelection(property: keepSelection, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_query(property: query, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_queryOptions(property: queryOptions, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_sortFields(property: sortFields, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_store(property: store, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_updateDelay(property: updateDelay, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
}

