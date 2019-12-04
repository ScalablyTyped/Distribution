package typings.dojo.dojox.grid

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.colSpans
import typings.dojo.dojoStrings.defaultState
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/LazyTreeGrid.html
  *
  * An enhanced TreeGrid widget which supports lazy-loading for nested children items
  * LazyTreeGrid inherits from dojo.grid.TreeGrid and applies virtual scrolling mechanism
  * to nested children rows so that it's possible to deal with complex tree structure data set
  * with nested and huge children rows. It's also compatible with dijit.tree.ForestStoreModel
  *
  * Most methods and properties pertaining to dojox.grid.DataGrid
  * and dojox.grid.TreeGrid also apply here
  *
  * LazyTreeGrid does not support summary row/items aggregate due to the lazy-loading rationale.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.grid.LazyTreeGrid")
@js.native
class LazyTreeGrid () extends TreeGrid {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * A json object that defines column span of each level rows.  Attributes:
    *
    * 0/1/..: which level need to colspan
    * start: start column index of colspan
    * end: end column index of colspan
    * primary: index of column which content will be displayed (default is value of start).
    * example:
    *
    * colSpans = {
    * 0:  [
    *         {start: 0, end: 1, primary: 0},
    *         {start: 2, end: 4, primary: 3}
    *     ],
    * 1:  [
    *         {start: 0, end: 3, primary: 1}
    *     ]
    * };
    *
    */
  var colSpans: js.Object = js.native
  /**
    * Used to restore the state of LazyTreeGrid.
    * This object should ONLY be obtained from LazyTreeGrid.getState().
    *
    */
  var defaultState: js.Object = js.native
  /**
    * Collapse the row with the given itemId.
    *
    * @param itemId               Optional
    */
  def collapse(itemId: String): Unit = js.native
  /**
    * Expand the row with the given itemId.
    *
    * @param itemId               Optional
    */
  def expand(itemId: String): Unit = js.native
  /**
    * Function for fetch children of a given row
    *
    * @param rowIndex
    * @param open
    */
  def expandoFetch(rowIndex: js.Any, open: js.Any): Unit = js.native
  /**
    * Get the current state of LazyTreeGrid including expanding, sorting, selection and scroll top state.
    *
    */
  def getState(): js.Object = js.native
  @JSName("get")
  def get_colSpans(property: colSpans): js.Object = js.native
  @JSName("get")
  def get_defaultState(property: defaultState): js.Object = js.native
  /**
    * Event fired when a default state being set.
    *
    */
  def onSetState(): Unit = js.native
  /**
    * Refresh, and persist the expand/collapse state when keepState equals true
    *
    * @param keepState
    */
  def refresh(keepState: Boolean): Unit = js.native
  /**
    *
    * @param inIndex
    * @param inAsc
    */
  def setSortIndex(inIndex: js.Any, inAsc: js.Any): Unit = js.native
  @JSName("set")
  def set_colSpans(property: colSpans, value: js.Object): Unit = js.native
  @JSName("set")
  def set_defaultState(property: defaultState, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_colSpans(
    property: colSpans,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_defaultState(
    property: defaultState,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

