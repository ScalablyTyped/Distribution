package typings.dojo.dojox.treemap

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyAnyArray
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.Fn_Void
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojo.store.api.Store
import typings.dojo.dojoStrings.areaAttr
import typings.dojo.dojoStrings.colorAttr
import typings.dojo.dojoStrings.colorModel
import typings.dojo.dojoStrings.groupAttrs
import typings.dojo.dojoStrings.groupFuncs
import typings.dojo.dojoStrings.invalidRendering
import typings.dojo.dojoStrings.invalidatingProperties
import typings.dojo.dojoStrings.itemToRenderer
import typings.dojo.dojoStrings.labelAttr
import typings.dojo.dojoStrings.labelThreshold
import typings.dojo.dojoStrings.query
import typings.dojo.dojoStrings.queryOptions
import typings.dojo.dojoStrings.rootItem
import typings.dojo.dojoStrings.selectedItem
import typings.dojo.dojoStrings.selectedItems
import typings.dojo.dojoStrings.selectionMode
import typings.dojo.dojoStrings.store
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.tooltipAttr
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/treemap/TreeMap.html
  *
  * A treemap widget.
  *
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojo.Stateful because Already inherited
- typings.dojo.dojox.widget.Selection because Inheritance from two classes. Inlined selectedItem, set_selectedItem, get_selectedItem, watch_selectedItem, selectedItems, set_selectedItems, get_selectedItems, watch_selectedItems, selectionMode, set_selectionMode, get_selectionMode, watch_selectionMode, dispatchChange, getIdentity, isItemSelected, selectFromEvent, setItemSelected, onChange
- typings.dojo.dojox.widget._Invalidating because Inheritance from two classes. Inlined invalidatingProperties, set_invalidatingProperties, get_invalidatingProperties, watch_invalidatingProperties, invalidRendering, set_invalidRendering, get_invalidRendering, watch_invalidRendering, addInvalidatingProperties, get, invalidateRendering, postscript, refreshRendering, set, validateRendering, watch */ @JSGlobal("dojox.treemap.TreeMap")
@js.native
class TreeMap () extends _WidgetBase {
  /**
    * The attribute of the store item that contains the data used to compute the area of a treemap cell.Default is "".
    *
    */
  var areaAttr: String = js.native
  /**
    * The attribute of the store item that contains the data used to compute the color of a treemap cell.
    * Default is "".
    *
    */
  var colorAttr: String = js.native
  /**
    * The optional color model that converts data to color.Default is null.
    *
    */
  var colorModel: js.Object = js.native
  /**
    * An array of data attributes used to group data in the treemap.Default is [].
    *
    */
  var groupAttrs: js.Array[_] = js.native
  /**
    * An array of grouping functions used to group data in the treemap.
    * When null, groupAttrs is to compute grouping functions.
    * Default is null.
    *
    */
  var groupFuncs: js.Array[_] = js.native
  /**
    *
    */
  var invalidRendering: Boolean = js.native
  /**
    *
    */
  var invalidatingProperties: js.Object = js.native
  /**
    *
    */
  @JSName("isValid")
  var isValid_Original: Fn_Void = js.native
  /**
    * The associated array item to renderer list.
    *
    */
  var itemToRenderer: js.Object = js.native
  /**
    * The attribute of the store item that contains the label of a treemap cell.Default is "label".
    *
    */
  var labelAttr: String = js.native
  /**
    * The starting depth level at which the labels are not displayed anymore on cells.If NaN no threshold is applied. The depth is the visual depth of the items on the screen not
    * in the data (i.e. after drill down the depth of an item might change).
    * Default is NaN.
    *
    */
  var labelThreshold: Double = js.native
  /**
    * A query that can be passed to when querying the store.
    *
    */
  var query: js.Object = js.native
  /**
    * Options to be applied when querying the store.
    *
    */
  var queryOptions: js.Object = js.native
  /**
    * The root item of the treemap, that is the first visible item.
    * If null the entire treemap hierarchy is shown.Default is null.
    *
    */
  var rootItem: js.Object = js.native
  /**
    * In single selection mode, the selected item or in multiple selection mode the last selected item.
    * Warning: Do not use this property directly, make sure to call set() or get() methods.
    *
    */
  var selectedItem: js.Object = js.native
  /**
    * The list of selected items.
    * Warning: Do not use this property directly, make sure to call set() or get() methods.
    *
    */
  var selectedItems: js.Object = js.native
  /**
    * Valid values are:
    *
    * "none": No selection can be done.
    * "single": Only one item can be selected at a time.
    * "multiple": Several item can be selected using the control key modifier.
    * Default value is "single".
    *
    */
  var selectionMode: String = js.native
  /**
    * The store that contains the items to display.
    *
    */
  var store: js.Object = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_TreeMap: String = js.native
  /**
    * The attribute of the store item that contains the tooltip text of a treemap cell.Default is "".
    *
    */
  var tooltipAttr: String = js.native
  /**
    * Add properties to the watched properties to trigger invalidation. This method must be called in
    * the constructor. It is typically used by subclasses of a _Invalidating class to add more properties
    * to watch for.
    *
    * @param properties The list of properties to watch for.
    */
  def addInvalidatingProperties(properties: js.Array[String]): Unit = js.native
  /**
    * A function that returns the value use to compute the area of cell from a store item.
    * Default implementation is using areaAttr.
    *
    * @param item
    * @param store
    */
  def areaFunc(item: js.Object, store: Store): Double = js.native
  /**
    * A function that returns from a store item the color value of cell or the value used by the
    * ColorModel to compute the cell color. If a color must be returned it must be in form accepted by the
    * dojo/_base/Color constructor. If a value must be returned it must be a Number.
    * Default implementation is using colorAttr.
    *
    * @param item
    * @param store
    */
  def colorFunc(item: js.Object, store: Store): js.Any = js.native
  /**
    * Creates an item renderer of the specified kind. This is called only when the treemap
    * is created. Default implementation always create div nodes. It also sets overflow
    * to hidden and position to absolute on non-header renderers.
    *
    * @param item The data item.
    * @param level The item depth level.
    * @param kind The specified kind. This can either be "leaf", "group", "header" or "content".
    */
  def createRenderer(item: js.Object, level: Double, kind: String): js.Any = js.native
  /**
    * Dispatch a selection change event.
    *
    * @param oldSelectedItem The previously selectedItem.
    * @param newSelectedItem The new selectedItem.
    * @param renderer The visual renderer of the selected/deselected item.
    * @param triggerEvent The event that lead to the selection of the item.
    */
  def dispatchChange(oldSelectedItem: js.Object, newSelectedItem: js.Object, renderer: js.Object, triggerEvent: Event): Unit = js.native
  /**
    * Returns the color for a given item. This either use the colorModel if not null
    * or just the result of the colorFunc.
    *
    * @param item The data item.
    */
  def getColorForItem(item: js.Object): js.Any = js.native
  /**
    *
    * @param item
    */
  def getIdentity(item: js.Any): js.Any = js.native
  /**
    * This function must be implemented to return the id of a item.
    *
    * @param item The item to query the identity for.
    */
  def getIdentity(item: js.Object): Unit = js.native
  /**
    * Returns the label for a given item.
    *
    * @param item The data item.
    */
  def getLabelForItem(item: js.Object): js.Any = js.native
  @JSName("get")
  def get_areaAttr(property: areaAttr): String = js.native
  @JSName("get")
  def get_colorAttr(property: colorAttr): String = js.native
  @JSName("get")
  def get_colorModel(property: colorModel): js.Object = js.native
  @JSName("get")
  def get_groupAttrs(property: groupAttrs): js.Array[_] = js.native
  @JSName("get")
  def get_groupFuncs(property: groupFuncs): js.Array[_] = js.native
  @JSName("get")
  def get_invalidRendering(property: invalidRendering): Boolean = js.native
  @JSName("get")
  def get_invalidatingProperties(property: invalidatingProperties): js.Object = js.native
  @JSName("get")
  def get_itemToRenderer(property: itemToRenderer): js.Object = js.native
  @JSName("get")
  def get_labelAttr(property: labelAttr): String = js.native
  @JSName("get")
  def get_labelThreshold(property: labelThreshold): Double = js.native
  @JSName("get")
  def get_query(property: query): js.Object = js.native
  @JSName("get")
  def get_queryOptions(property: queryOptions): js.Object = js.native
  @JSName("get")
  def get_rootItem(property: rootItem): js.Object = js.native
  @JSName("get")
  def get_selectedItem(property: selectedItem): js.Object = js.native
  @JSName("get")
  def get_selectedItems(property: selectedItems): js.Object = js.native
  @JSName("get")
  def get_selectionMode(property: selectionMode): String = js.native
  @JSName("get")
  def get_store(property: store): js.Object = js.native
  @JSName("get")
  def get_tooltipAttr(property: tooltipAttr): String = js.native
  /**
    * Invalidating the rendering for the next executation frame.
    *
    */
  def invalidateRendering(): Unit = js.native
  /**
    * Returns wether an item is selected or not.
    *
    * @param item The item to test the selection for.
    */
  def isItemSelected(item: js.Object): js.Any = js.native
  /**
    *
    */
  @JSName("isValid")
  def isValid_MTreeMap(): Unit = js.native
  /**
    * A function that returns the label of cell from a store item.Default implementation is using labelAttr.
    *
    * @param item
    * @param store
    */
  def labelFunc(item: js.Object, store: Store): js.Any = js.native
  /**
    * Called when the selection changed.
    *
    */
  def onChange(): Unit = js.native
  /**
    * Called when an item renderer has been rolled out.
    *
    */
  def onItemRollOut(): Unit = js.native
  /**
    * Called when an item renderer has been hovered.
    *
    */
  def onItemRollOver(): Unit = js.native
  /**
    * Called when a renderer has been updated. This is called after creation, styling and sizing for
    * each group and leaf renderers. For group renders this is also called after creation of children
    * renderers.
    *
    */
  def onRendererUpdated(): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    *
    * @param mixin
    */
  def postscript(mixin: js.Any): Unit = js.native
  /**
    *
    */
  /**
    * Actually refresh the rendering. Implementation should implement that method.
    *
    */
  def refreshRendering(): Unit = js.native
  /**
    *
    * @param box
    */
  def resize(box: js.Any): Unit = js.native
  /**
    * Applies selection triggered by an user interaction
    *
    * @param e The source event of the user interaction.
    * @param item The render item that has been selected/deselected.
    * @param renderer The visual renderer of the selected/deselected item.
    * @param dispatch Whether an event must be dispatched or not.
    */
  def selectFromEvent(e: Event, item: js.Object, renderer: js.Object, dispatch: Boolean): js.Any = js.native
  /**
    * Change the selection state of an item.
    *
    * @param item The item to change the selection state for.
    * @param value True to select the item, false to deselect it.
    */
  def setItemSelected(item: js.Object, value: Boolean): Unit = js.native
  @JSName("set")
  def set_areaAttr(property: areaAttr, value: String): Unit = js.native
  @JSName("set")
  def set_colorAttr(property: colorAttr, value: String): Unit = js.native
  @JSName("set")
  def set_colorModel(property: colorModel, value: js.Object): Unit = js.native
  @JSName("set")
  def set_groupAttrs(property: groupAttrs, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_groupFuncs(property: groupFuncs, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_invalidRendering(property: invalidRendering, value: Boolean): Unit = js.native
  @JSName("set")
  def set_invalidatingProperties(property: invalidatingProperties, value: js.Object): Unit = js.native
  @JSName("set")
  def set_itemToRenderer(property: itemToRenderer, value: js.Object): Unit = js.native
  @JSName("set")
  def set_labelAttr(property: labelAttr, value: String): Unit = js.native
  @JSName("set")
  def set_labelThreshold(property: labelThreshold, value: Double): Unit = js.native
  @JSName("set")
  def set_query(property: query, value: js.Object): Unit = js.native
  @JSName("set")
  def set_queryOptions(property: queryOptions, value: js.Object): Unit = js.native
  @JSName("set")
  def set_rootItem(property: rootItem, value: js.Object): Unit = js.native
  @JSName("set")
  def set_selectedItem(property: selectedItem, value: js.Object): Unit = js.native
  @JSName("set")
  def set_selectedItems(property: selectedItems, value: js.Object): Unit = js.native
  @JSName("set")
  def set_selectionMode(property: selectionMode, value: String): Unit = js.native
  @JSName("set")
  def set_store(property: store, value: js.Object): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_tooltipAttr(property: tooltipAttr, value: String): Unit = js.native
  /**
    * Style the item renderer. This is called each time the treemap is refreshed.
    * For leaf items it colors them with the color computed from the color model.
    * For other items it does nothing.
    *
    * @param renderer The item renderer.
    * @param item The data item.
    * @param level The item depth level.
    * @param kind The specified kind. This can either be "leaf", "group", "header" or "content".
    */
  def styleRenderer(renderer: HTMLElement, item: js.Object, level: Double, kind: String): Unit = js.native
  /**
    * A function that returns the tooltip of cell from a store item.Default implementation is using tooltipAttr.
    *
    * @param item
    * @param store
    */
  def tooltipFunc(item: js.Object, store: Store): js.Any = js.native
  /**
    * Updates the renderer(s) that represent the specified item(s).
    *
    * @param items
    */
  def updateRenderers(items: js.Any): Unit = js.native
  /**
    * Immediately validate the rendering if it has been invalidated. You generally do not call that method yourself.
    *
    */
  def validateRendering(): Unit = js.native
  @JSName("watch")
  def watch_areaAttr(property: areaAttr, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_colorAttr(property: colorAttr, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_colorModel(property: colorModel, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_groupAttrs(property: groupAttrs, callback: Fn_NewValueOldValuePropertyAnyArray): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_groupFuncs(property: groupFuncs, callback: Fn_NewValueOldValuePropertyAnyArray): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_invalidRendering(property: invalidRendering, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_invalidatingProperties(property: invalidatingProperties, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_itemToRenderer(property: itemToRenderer, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_labelAttr(property: labelAttr, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_labelThreshold(property: labelThreshold, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_query(property: query, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_queryOptions(property: queryOptions, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_rootItem(property: rootItem, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_selectedItem(property: selectedItem, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_selectedItems(property: selectedItems, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_selectionMode(property: selectionMode, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_store(property: store, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_tooltipAttr(property: tooltipAttr, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}

