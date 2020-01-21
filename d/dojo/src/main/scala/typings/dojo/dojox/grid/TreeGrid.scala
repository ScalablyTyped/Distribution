package typings.dojo.dojox.grid

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.aggregator
import typings.dojo.dojoStrings.defaultOpen
import typings.dojo.dojoStrings.expandoCell
import typings.dojo.dojoStrings.openAtLevels
import typings.dojo.dojoStrings.sortChildItems
import typings.dojo.dojoStrings.treeModel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/TreeGrid.html
  *
  * A grid that supports nesting rows - it provides an expando function
  * similar to dijit.Tree.  It also provides mechanisms for aggregating
  * the values of subrows
  * TreeGrid currently only works on "simple" structures.  That is,
  * single-view structures with a single row in them.
  *
  * The TreeGrid works using the concept of "levels" - level 0 are the
  * top-level items.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.grid.TreeGrid")
@js.native
class TreeGrid () extends DataGrid {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * The aggregator class - it will be populated automatically if we
    * are a collapsible grid
    *
    */
  var aggregator: js.Object = js.native
  /**
    * Whether or not we default to open (all levels).  This defaults to
    * false for grids with a treeModel.
    *
    */
  var defaultOpen: Boolean = js.native
  /**
    * When used in conjunction with a treeModel (see above), this is a 0-based
    * index of the cell in which to place the actual expando
    *
    */
  var expandoCell: Double = js.native
  /**
    * Which levels we are open at (overrides defaultOpen for the values
    * that exist here).  Its values can be a boolean (true/false) or an
    * integer (for the # of children to be closed if there are more than
    * that)
    *
    */
  var openAtLevels: js.Array[_] = js.native
  /**
    * If true, child items will be returned sorted according to the sorting
    * properties of the grid.
    *
    */
  var sortChildItems: Boolean = js.native
  /**
    * A dijit.Tree model that will be used instead of using aggregates.
    * Setting this value will make the TreeGrid behave like a columnar
    * tree.  When setting this value, defaultOpen will default to false,
    * and openAtLevels will be ignored.
    *
    */
  var treeModel: js.Object = js.native
  /**
    * Returns the default open state for the given definition and item
    * It reads from the openAtLevels and defaultOpen values of the
    * grid to calculate if the given item should default to open or
    * not.
    *
    * @param cellDef
    * @param item
    */
  def getDefaultOpenState(cellDef: js.Any, item: js.Any): js.Any = js.native
  /**
    * overridden so that you can pass in a '/' delimited string of indexes to get the
    * item based off its path...that is, passing in "1/3/2" will get the
    * 3rd (0-based) child from the 4th child of the 2nd top-level item.
    *
    * @param idx
    */
  def getItem(idx: String): js.Any = js.native
  /**
    * overridden so that you can pass in a '/' delimited string of indexes to get the
    * item based off its path...that is, passing in "1/3/2" will get the
    * 3rd (0-based) child from the 4th child of the 2nd top-level item.
    *
    * @param idx
    */
  def getItem(idx: js.Array[_]): js.Any = js.native
  /**
    * overridden so that you can pass in a '/' delimited string of indexes to get the
    * item based off its path...that is, passing in "1/3/2" will get the
    * 3rd (0-based) child from the 4th child of the 2nd top-level item.
    *
    * @param idx
    */
  def getItem(idx: Double): js.Any = js.native
  @JSName("get")
  def get_aggregator(property: aggregator): js.Object = js.native
  @JSName("get")
  def get_defaultOpen(property: defaultOpen): Boolean = js.native
  @JSName("get")
  def get_expandoCell(property: expandoCell): Double = js.native
  @JSName("get")
  def get_openAtLevels(property: openAtLevels): js.Array[_] = js.native
  @JSName("get")
  def get_sortChildItems(property: sortChildItems): Boolean = js.native
  @JSName("get")
  def get_treeModel(property: treeModel): js.Object = js.native
  /**
    *
    * @param inRowIndex
    */
  def onCanSelect(inRowIndex: js.Any): js.Any = js.native
  /**
    *
    * @param treeModel
    */
  def setModel(treeModel: js.Any): Unit = js.native
  @JSName("set")
  def set_aggregator(property: aggregator, value: js.Object): Unit = js.native
  @JSName("set")
  def set_defaultOpen(property: defaultOpen, value: Boolean): Unit = js.native
  @JSName("set")
  def set_expandoCell(property: expandoCell, value: Double): Unit = js.native
  @JSName("set")
  def set_openAtLevels(property: openAtLevels, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_sortChildItems(property: sortChildItems, value: Boolean): Unit = js.native
  @JSName("set")
  def set_treeModel(property: treeModel, value: js.Object): Unit = js.native
  /**
    *
    * @param inRowIndex
    * @param inRowNode
    */
  def styleRowNode(inRowIndex: js.Any, inRowNode: js.Any): Unit = js.native
  @JSName("watch")
  def watch_aggregator(
    property: aggregator,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_defaultOpen(
    property: defaultOpen,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_expandoCell(
    property: expandoCell,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_openAtLevels(
    property: openAtLevels,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_sortChildItems(
    property: sortChildItems,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_treeModel(
    property: treeModel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

