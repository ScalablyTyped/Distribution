package typings.dojo.dojox.calendar

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojo.store.api.Store
import typings.dojo.dojoStrings.allDayAttr
import typings.dojo.dojoStrings.allowResizeLessThan24H
import typings.dojo.dojoStrings.allowStartEndSwap
import typings.dojo.dojoStrings.allowSubColumnMove
import typings.dojo.dojoStrings.autoScroll
import typings.dojo.dojoStrings.createOnGridClick
import typings.dojo.dojoStrings.cssClassFunc
import typings.dojo.dojoStrings.datePackage
import typings.dojo.dojoStrings.decodeDate
import typings.dojo.dojoStrings.displayedItemsInvalidated
import typings.dojo.dojoStrings.doubleTapDelay
import typings.dojo.dojoStrings.editable
import typings.dojo.dojoStrings.encodeDate
import typings.dojo.dojoStrings.endTimeAttr
import typings.dojo.dojoStrings.formatItemTimeFunc
import typings.dojo.dojoStrings.hoveredItem
import typings.dojo.dojoStrings.invalidRendering
import typings.dojo.dojoStrings.invalidatingProperties
import typings.dojo.dojoStrings.itemToRenderer
import typings.dojo.dojoStrings.itemToRendererKindFunc
import typings.dojo.dojoStrings.layoutPriorityFunction
import typings.dojo.dojoStrings.liveLayout
import typings.dojo.dojoStrings.minDurationSteps
import typings.dojo.dojoStrings.minDurationUnit
import typings.dojo.dojoStrings.moveEnabled
import typings.dojo.dojoStrings.query
import typings.dojo.dojoStrings.queryOptions
import typings.dojo.dojoStrings.rendererList
import typings.dojo.dojoStrings.rendererPool
import typings.dojo.dojoStrings.resizeCursor
import typings.dojo.dojoStrings.resizeEnabled
import typings.dojo.dojoStrings.scrollMethod
import typings.dojo.dojoStrings.scrollable
import typings.dojo.dojoStrings.selectedItem
import typings.dojo.dojoStrings.selectedItems
import typings.dojo.dojoStrings.selectionMode
import typings.dojo.dojoStrings.snapSteps
import typings.dojo.dojoStrings.snapUnit
import typings.dojo.dojoStrings.startTimeAttr
import typings.dojo.dojoStrings.stayInView
import typings.dojo.dojoStrings.store
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.subColumnAttr
import typings.dojo.dojoStrings.summaryAttr
import typings.dojo.dojoStrings.viewKind
import typings.std.Date
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calendar/ViewBase.html
  *
  * The dojox.calendar.ViewBase widget is the base of calendar view widgets
  *
  * @param args
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojo.Stateful because Already inherited
- typings.dojo.dojox.widget.Selection because Inheritance from two classes. Inlined selectedItem, set_selectedItem, get_selectedItem, watch_selectedItem, selectedItems, set_selectedItems, get_selectedItems, watch_selectedItems, selectionMode, set_selectionMode, get_selectionMode, watch_selectionMode, dispatchChange, getIdentity, isItemSelected, selectFromEvent, setItemSelected, onChange
- typings.dojo.dojox.widget._Invalidating because Inheritance from two classes. Inlined invalidatingProperties, set_invalidatingProperties, get_invalidatingProperties, watch_invalidatingProperties, invalidRendering, set_invalidRendering, get_invalidRendering, watch_invalidRendering, addInvalidatingProperties, invalidateRendering, refreshRendering, validateRendering
- typings.dojo.dojox.calendar.StoreMixin because Inheritance from two classes. Inlined allDayAttr, set_allDayAttr, get_allDayAttr, watch_allDayAttr, cssClassFunc, set_cssClassFunc, get_cssClassFunc, watch_cssClassFunc, decodeDate, set_decodeDate, get_decodeDate, watch_decodeDate, displayedItemsInvalidated, set_displayedItemsInvalidated, get_displayedItemsInvalidated, watch_displayedItemsInvalidated, encodeDate, set_encodeDate, get_encodeDate, watch_encodeDate, endTimeAttr, set_endTimeAttr, get_endTimeAttr, watch_endTimeAttr, query, set_query, get_query, watch_query, queryOptions, set_queryOptions, get_queryOptions, watch_queryOptions, startTimeAttr, set_startTimeAttr, get_startTimeAttr, watch_startTimeAttr, store, set_store, get_store, watch_store, subColumnAttr, set_subColumnAttr, get_subColumnAttr, watch_subColumnAttr, summaryAttr, set_summaryAttr, get_summaryAttr, watch_summaryAttr, get, getItemStoreState, itemToRenderItem, postscript, renderItemToItem, set, watch */ @JSGlobal("dojox.calendar.ViewBase")
@js.native
class ViewBase protected () extends _WidgetBase {
  def this(args: js.Object) = this()
  /**
    * The attribute of the store item that contains the all day state of
    * the events represented by this item.    Default is "allDay".
    *
    */
  var allDayAttr: String = js.native
  /**
    * If an event has a duration greater than 24 hours, indicates if using a resize gesture, it can be resized to last less than 24 hours.
    * This flag is usually used when two different kind of renderers are used (MatrixView) to prevent changing the kind of renderer during an editing gesture.
    *
    */
  var allowResizeLessThan24H: Boolean = js.native
  /**
    * Specifies if the start and end time of an item can be swapped during an editing gesture. Note that using the keyboard this property is ignored.
    *
    */
  var allowStartEndSwap: Boolean = js.native
  /**
    * If several sub columns are displayed, indicated if the data item can be reassigned to another sub column by an editing gesture.
    *
    */
  var allowSubColumnMove: Boolean = js.native
  /**
    * Indicates whether the view can be scrolled automatically.
    * Auto scrolling is used when moving focus to a non visible renderer using keyboard
    * and while editing an item.
    *
    */
  var autoScroll: Boolean = js.native
  /**
    * Indicates whether the user can create new event by clicking and dragging the grid.
    * A createItem function must be defined on the view or the calendar object.
    *
    */
  var createOnGridClick: Boolean = js.native
  /**
    * Optional function that returns a css class name to apply to item renderers that are displaying the specified item in parameter.
    *
    */
  var cssClassFunc: js.Function = js.native
  /**
    * JavaScript namespace to find Calendar routines. Uses Gregorian Calendar routines at dojo.date by default.
    *
    */
  var datePackage: js.Object = js.native
  /**
    * An optional function to transform store date into Date objects. Default is null.
    *
    */
  var decodeDate: js.Object = js.native
  /**
    * Whether the data items displayed must be recomputed, usually after the displayed
    * time range has changed.
    *
    */
  var displayedItemsInvalidated: Boolean = js.native
  /**
    * The maximum delay between two taps needed to trigger an "itemDoubleClick" event, in touch context.
    *
    */
  var doubleTapDelay: Double = js.native
  /**
    * A flag that indicates whether or not the user can edit
    * items in the data provider.
    * If true, the item renderers in the control are editable.
    * The user can click on an item renderer, or use the keyboard or touch devices, to move or resize the associated event.
    *
    */
  var editable: Boolean = js.native
  /**
    * An optional function to transform Date objects into store date. Default is null.
    *
    */
  var encodeDate: js.Object = js.native
  /**
    * The attribute of the store item that contains the end time of
    * the events represented by this item.    Default is "endTime".
    *
    */
  var endTimeAttr: String = js.native
  /**
    * Optional function to format the time of day of the item renderers.
    * The function takes the date and render data object as arguments and returns a String.
    *
    */
  var formatItemTimeFunc: js.Function = js.native
  /**
    * The currently hovered data item.
    *
    */
  var hoveredItem: js.Object = js.native
  /**
    *
    */
  var invalidRendering: Boolean = js.native
  /**
    *
    */
  var invalidatingProperties: js.Object = js.native
  /**
    * The associated array item to renderer list.
    *
    */
  var itemToRenderer: js.Object = js.native
  /**
    * An optional function to associate a kind of renderer ("horizontal", "label" or null) with the specified item.
    * By default, if an item is lasting more that 24 hours an horizontal item is used, otherwise a label is used.
    *
    */
  var itemToRendererKindFunc: js.Function = js.native
  /**
    * An optional comparison function use to determine the order the item will be laid out
    * The function is used to sort an array and must, as any sorting function, take two items
    * as argument and must return an integer whose sign define order between arguments.
    * By default, a comparison by start time then end time is used.
    *
    */
  var layoutPriorityFunction: js.Function = js.native
  /**
    * If true, all the events are laid out during the editing gesture. If false, only the edited event is laid out.
    *
    */
  var liveLayout: Boolean = js.native
  /**
    * The number of units used to define the minimal duration of the edited item.
    *
    */
  var minDurationSteps: Double = js.native
  /**
    * The unit used to define the minimal duration of the edited item.
    * "day", "hour" and "minute" are valid values.
    *
    */
  var minDurationUnit: String = js.native
  /**
    * A flag that indicates whether the user can move items displayed.
    * If true, the user can move the items.
    *
    */
  var moveEnabled: Boolean = js.native
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
    * The list of used renderers
    *
    */
  var rendererList: js.Array[_] = js.native
  /**
    * The stack of recycled renderers available.
    *
    */
  var rendererPool: js.Array[_] = js.native
  /**
    * CSS value to apply to the cursor while resizing an item renderer.
    *
    */
  var resizeCursor: String = js.native
  /**
    * A flag that indicates whether the items can be resized.
    * If true, the control supports resizing of items.
    *
    */
  var resizeEnabled: Boolean = js.native
  /**
    * Method used to scroll the view, for example the scroll of column view.
    * Valid value are:
    *
    * "auto": let the view decide (default),
    * "css": use css 3d transform,
    * "dom": use the scrollTop property.
    *
    */
  var scrollMethod: String = js.native
  /**
    * Indicates whether the view can be scrolled or not.
    *
    */
  var scrollable: Boolean = js.native
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
    * The number of units used to compute the snapping of the edited item.
    *
    */
  var snapSteps: Double = js.native
  /**
    * The unit of the snapping to apply during the editing of an event.
    * "day", "hour" and "minute" are valid values.
    *
    */
  var snapUnit: String = js.native
  /**
    * The attribute of the store item that contains the start time of
    * the events represented by this item.    Default is "startTime".
    *
    */
  var startTimeAttr: String = js.native
  /**
    * Specifies during editing, if the item is already in view, if the item must stay in the time range defined by the view or not.
    *
    */
  var stayInView: Boolean = js.native
  /**
    * The store that contains the events to display.
    *
    */
  var store: js.Object = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_ViewBase: String = js.native
  /**
    * The attribute of the store item that contains the sub column name of
    * the events represented by this item.    Default is "calendar".
    *
    */
  var subColumnAttr: String = js.native
  /**
    * The attribute of the store item that contains the summary of
    * the events represented by this item.    Default is "summary".
    *
    */
  var summaryAttr: String = js.native
  /**
    * Kind of the view. Used by the calendar widget to determine how to configure the view.
    *
    */
  var viewKind: String = js.native
  /**
    * Add properties to the watched properties to trigger invalidation. This method must be called in
    * the constructor. It is typically used by subclasses of a _Invalidating class to add more properties
    * to watch for.
    *
    * @param properties The list of properties to watch for.
    */
  def addInvalidatingProperties(properties: js.Array[String]): Unit = js.native
  /**
    * Function invoked just after the view is displayed by the calendar.
    *
    */
  def afterActivate(): Unit = js.native
  /**
    * Function invoked just after the view is the view is hidden or removed by the calendar.
    *
    */
  def afterDeactivate(): Unit = js.native
  /**
    * Applies the z-index to the renderer based on the state of the item.
    * This methods is setting a z-index of 20 is the item is selected or edited
    * and the current lane value computed by the overlap layout (i.e. the renderers
    * are stacked according to their lane).
    *
    * @param item The render item.
    * @param renderer A renderer associated with the render item.
    * @param hovered Whether the item is hovered or not.
    * @param selected Whether the item is selected or not.
    * @param edited Whether the item is being edited not not.
    * @param focused Whether the item is focused not not.
    */
  def applyRendererZIndex(
    item: js.Object,
    renderer: js.Object,
    hovered: Boolean,
    selected: Boolean,
    edited: Boolean,
    focused: Boolean
  ): Unit = js.native
  /**
    * Function invoked just before the view is displayed by the calendar.
    *
    */
  def beforeActivate(): Unit = js.native
  /**
    * Function invoked just before the view is hidden or removed by the calendar.
    *
    */
  def beforeDeactivate(): Unit = js.native
  /**
    * Computes the overlap layout of a list of items. A lane and extent properties are added to each layout item.
    *
    * @param layoutItems List of layout items, each item must have a start and end properties.
    * @param func
    */
  def computeOverlapping(layoutItems: js.Array[js.Object], func: js.Any): js.Any = js.native
  /**
    * Computes the time to pixel projection in a day.
    *
    * @param renderData The render data.
    * @param refDate The reference date that defines the destination date.
    * @param date The reference dates (at least one).
    * @param max The size in pixels of the representation of a day.
    */
  def computeProjectionOnDate(renderData: js.Object, refDate: Date, date: js.Array[Date], max: Double): js.Any = js.native
  /**
    * Computes the overlap time range of the time ranges.
    * Returns a vector of Date with at index 0 the start time and at index 1 the end time.
    *
    * @param renderData The render data.
    * @param start1 The start time of the first time range.
    * @param end1 The end time of the first time range.
    * @param start2 The start time of the second time range.
    * @param end2 The end time of the second time range.
    * @param includeLimits Whether include the end time or not.
    */
  def computeRangeOverlap(renderData: js.Object, start1: Date, end1: Date, start2: Date, end2: Date, includeLimits: Boolean): js.Any = js.native
  /**
    * A user supplied function that creates a new event.
    *
    * @param view the current view,
    * @param d the date at the clicked location.
    * @param e the mouse event (can be used to return null for example)
    */
  def createItemFunc(view: ViewBase, d: Date, e: MouseEvent): Unit = js.native
  def destroy(preserveDom: js.Any): Unit = js.native
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
    * During the resize editing gesture, ensures that the item has the specified minimal duration.
    *
    * @param renderData The render data.
    * @param item The edited item.
    * @param unit The unit used to define the minimal duration.
    * @param steps The number of time units.
    * @param editKind The edit kind: "resizeStart" or "resizeEnd".
    */
  def ensureMinimalDuration(renderData: js.Object, item: js.Object, unit: String, steps: Double, editKind: String): Unit = js.native
  /**
    * Scrolls the view if the [start, end] time range is not visible or only partially visible.
    *
    * @param start Start time of the range of interest.
    * @param end End time of the range of interest.
    * @param margin Margin in minutes around the time range.
    * @param visibilityTarget The end(s) of the time range to make visible.Valid values are: "start", "end", "both".
    * @param duration Optional, the maximum duration of the scroll animation.
    */
  def ensureVisibility(start: Date, end: Date, margin: Double, visibilityTarget: String, duration: Double): Unit = js.native
  /**
    * floors the date to the unit.
    *
    * @param date The date/time to floor.
    * @param unit The unit. Valid values are "minute", "hour", "day".
    * @param steps For "day" only 1 is valid.
    * @param reuse Whether use the specified instance or create a new one. Default is false.
    */
  def floorDate(date: Date, unit: String, steps: Double, reuse: Boolean): js.Any = js.native
  /**
    * Floors the specified date to the start of day.
    *
    * @param date The date to floor.
    * @param reuse Whether use the specified instance or create a new one. Default is false.
    */
  def floorToDay(date: Date, reuse: Boolean): js.Any = js.native
  /**
    * Floors the specified date to the start of the date's month.
    *
    * @param date The date to floor.
    * @param reuse Whether use the specified instance or create a new one. Default is false.
    */
  def floorToMonth(date: Date, reuse: Boolean): js.Any = js.native
  /**
    * Utility method that return the specific CSS prefix
    * for non standard CSS properties. Ex: -moz-border-radius.
    *
    */
  def getCSSPrefix(): String = js.native
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
    * Returns the creation state of an item.
    * This state is changing during the interactive creation of an item.
    * Valid values are:
    * - "unstored": The event is being interactively created. It is not in the store yet.
    * - "storing": The creation gesture has ended, the event is being added to the store.
    * - "stored": The event is not in the two previous states, and is assumed to be in the store
    * (not checking because of performance reasons, use store API for testing existence in store).
    * item: Object
    * The item.
    * returns: String
    *
    * @param item
    */
  def getItemStoreState(item: js.Any): js.Any = js.native
  /**
    * Returns the renderers that are currently used to displayed the speficied item.
    * Returns an array of objects that contains two properties:
    * - container: The DOM node that contains the renderer.
    * - renderer: The dojox.calendar._RendererMixin instance.
    * Do not keep references on the renderers are they are recycled and reused for other items.
    *
    * @param item The data or render item.
    */
  def getRenderers(item: js.Object): js.Any = js.native
  /**
    * Returns the sub column at the specified point by this component.
    *
    * @param e Optional mouse event.
    * @param x Position along the x-axis with respect to the sheet container used if event is not defined.
    * @param y Position along the y-axis with respect to the sheet container (scroll included) used if event is not defined.
    * @param touchIndex If parameter 'e' is not null and a touch event, the index of the touch to use.
    */
  def getSubColumn(e: Event, x: Double, y: Double, touchIndex: Double): js.Any = js.native
  /**
    * Returns the sub column index that has the specified value, if any. -1 otherwise.
    *
    * @param value The sub column index.
    */
  def getSubColumnIndex(value: String): Double = js.native
  /**
    * Returns the time displayed at the specified point by this component.
    *
    * @param e Optional mouse event.
    * @param x Position along the x-axis with respect to the sheet container used if event is not defined.
    * @param y Position along the y-axis with respect to the sheet container (scroll included) used if event is not defined.
    * @param touchIndex If parameter 'e' is not null and a touch event, the index of the touch to use.
    */
  def getTime(e: Event, x: Double, y: Double, touchIndex: Double): js.Any = js.native
  /**
    * Returns the week number string from dojo.date.locale.format() method as
    * dojox.date.XXXX calendar are not supporting the "w" pattern.
    *
    * @param date The date to format.
    */
  def getWeekNumberLabel(date: Date): js.Any = js.native
  @JSName("get")
  def get_allDayAttr(property: allDayAttr): String = js.native
  @JSName("get")
  def get_allowResizeLessThan24H(property: allowResizeLessThan24H): Boolean = js.native
  @JSName("get")
  def get_allowStartEndSwap(property: allowStartEndSwap): Boolean = js.native
  @JSName("get")
  def get_allowSubColumnMove(property: allowSubColumnMove): Boolean = js.native
  @JSName("get")
  def get_autoScroll(property: autoScroll): Boolean = js.native
  @JSName("get")
  def get_createOnGridClick(property: createOnGridClick): Boolean = js.native
  @JSName("get")
  def get_cssClassFunc(property: cssClassFunc): js.Function = js.native
  @JSName("get")
  def get_datePackage(property: datePackage): js.Object = js.native
  @JSName("get")
  def get_decodeDate(property: decodeDate): js.Object = js.native
  @JSName("get")
  def get_displayedItemsInvalidated(property: displayedItemsInvalidated): Boolean = js.native
  @JSName("get")
  def get_doubleTapDelay(property: doubleTapDelay): Double = js.native
  @JSName("get")
  def get_editable(property: editable): Boolean = js.native
  @JSName("get")
  def get_encodeDate(property: encodeDate): js.Object = js.native
  @JSName("get")
  def get_endTimeAttr(property: endTimeAttr): String = js.native
  @JSName("get")
  def get_formatItemTimeFunc(property: formatItemTimeFunc): js.Function = js.native
  @JSName("get")
  def get_hoveredItem(property: hoveredItem): js.Object = js.native
  @JSName("get")
  def get_invalidRendering(property: invalidRendering): Boolean = js.native
  @JSName("get")
  def get_invalidatingProperties(property: invalidatingProperties): js.Object = js.native
  @JSName("get")
  def get_itemToRenderer(property: itemToRenderer): js.Object = js.native
  @JSName("get")
  def get_itemToRendererKindFunc(property: itemToRendererKindFunc): js.Function = js.native
  @JSName("get")
  def get_layoutPriorityFunction(property: layoutPriorityFunction): js.Function = js.native
  @JSName("get")
  def get_liveLayout(property: liveLayout): Boolean = js.native
  @JSName("get")
  def get_minDurationSteps(property: minDurationSteps): Double = js.native
  @JSName("get")
  def get_minDurationUnit(property: minDurationUnit): String = js.native
  @JSName("get")
  def get_moveEnabled(property: moveEnabled): Boolean = js.native
  @JSName("get")
  def get_query(property: query): js.Object = js.native
  @JSName("get")
  def get_queryOptions(property: queryOptions): js.Object = js.native
  @JSName("get")
  def get_rendererList(property: rendererList): js.Array[_] = js.native
  @JSName("get")
  def get_rendererPool(property: rendererPool): js.Array[_] = js.native
  @JSName("get")
  def get_resizeCursor(property: resizeCursor): String = js.native
  @JSName("get")
  def get_resizeEnabled(property: resizeEnabled): Boolean = js.native
  @JSName("get")
  def get_scrollMethod(property: scrollMethod): String = js.native
  @JSName("get")
  def get_scrollable(property: scrollable): Boolean = js.native
  @JSName("get")
  def get_selectedItem(property: selectedItem): js.Object = js.native
  @JSName("get")
  def get_selectedItems(property: selectedItems): js.Object = js.native
  @JSName("get")
  def get_selectionMode(property: selectionMode): String = js.native
  @JSName("get")
  def get_snapSteps(property: snapSteps): Double = js.native
  @JSName("get")
  def get_snapUnit(property: snapUnit): String = js.native
  @JSName("get")
  def get_startTimeAttr(property: startTimeAttr): String = js.native
  @JSName("get")
  def get_stayInView(property: stayInView): Boolean = js.native
  @JSName("get")
  def get_store(property: store): js.Object = js.native
  @JSName("get")
  def get_subColumnAttr(property: subColumnAttr): String = js.native
  @JSName("get")
  def get_summaryAttr(property: summaryAttr): String = js.native
  @JSName("get")
  def get_viewKind(property: viewKind): String = js.native
  /**
    * Triggers a re-layout of the renderers.
    *
    */
  def invalidateLayout(): Unit = js.native
  /**
    * Invalidating the rendering for the next executation frame.
    *
    */
  def invalidateRendering(): Unit = js.native
  /**
    * Determines if a node has an ascendant node that has the css class specified.
    *
    * @param node The DOM node.
    * @param ancestor The ancestor node used to limit the search in hierarchy.
    * @param className The css class name.
    */
  def isAscendantHasClass(node: HTMLElement, ancestor: HTMLElement, className: String): js.Any = js.native
  /**
    * Returns whether an item is being edited or not.
    *
    * @param item The item to test.
    */
  def isItemBeingEdited(item: js.Object): js.Any = js.native
  /**
    * Computes whether particular item renderer can be edited or not.
    * By default it is using the editable property value.
    *
    * @param item The item represented by the renderer.
    * @param rendererKind The kind of renderer.
    */
  def isItemEditable(item: js.Object, rendererKind: String): js.Any = js.native
  /**
    * Returns whether the specified item is focused or not.
    *
    * @param item The item.
    */
  def isItemFocused(item: js.Object): js.Any = js.native
  /**
    * Returns whether the specified item is hovered or not.
    *
    * @param item The item.
    */
  def isItemHovered(item: js.Object): js.Any = js.native
  /**
    * Computes whether particular item renderer can be moved.
    * By default it is using the moveEnabled property value.
    *
    * @param item The item represented by the renderer.
    * @param rendererKind The kind of renderer.
    */
  def isItemMoveEnabled(item: js.Object, rendererKind: String): js.Any = js.native
  /**
    * Computes whether particular item renderer can be resized.
    * By default it is using the resizedEnabled property value.
    *
    * @param item The item represented by the renderer.
    * @param rendererKind The kind of renderer.
    */
  def isItemResizeEnabled(item: js.Object, rendererKind: String): js.Any = js.native
  /**
    *
    * @param item
    */
  def isItemSelected(item: js.Any): js.Any = js.native
  /**
    * Returns wether an item is selected or not.
    *
    * @param item The item to test the selection for.
    */
  def isItemSelected(item: js.Object): js.Any = js.native
  /**
    * Computes if the first time range defined by the start1 and end1 parameters
    * is overlapping the second time range defined by the start2 and end2 parameters.
    *
    * @param renderData The render data.
    * @param start1 The start time of the first time range.
    * @param end1 The end time of the first time range.
    * @param start2 The start time of the second time range.
    * @param end2 The end time of the second time range.
    * @param includeLimits Whether include the end time or not.
    */
  def isOverlapping(renderData: js.Object, start1: Date, end1: Date, start2: Date, end2: Date, includeLimits: Boolean): js.Any = js.native
  /**
    * Tests if the specified dates are in the same day.
    *
    * @param date1 The first date.
    * @param date2 The second date.
    */
  def isSameDay(date1: Date, date2: Date): js.Any = js.native
  /**
    * Tests if the specified date represents the starts of day.
    *
    * @param d The date to test.
    */
  def isStartOfDay(d: Date): js.Any = js.native
  /**
    * Returns whether the specified date is in the current day.
    *
    * @param date The date to test.
    */
  def isToday(date: Date): js.Any = js.native
  /**
    * Determines whether the specified date is a week-end.
    * This method is using dojo.date.locale.isWeekend() method as
    * dojox.date.XXXX calendars are not supporting this method.
    *
    * @param date The date to test.
    */
  def isWeekEnd(date: Date): js.Any = js.native
  /**
    * Creates the render item based on the dojo.store item. It must be of the form:
    *
    * {
    *     id: Object,
    *     startTime: Date,
    *     endTime: Date,
    *     summary: String
    * }
    * By default it is building an object using the store id, the summaryAttr,
    *
    * startTimeAttr and endTimeAttr properties as well as decodeDate property if not null.
    * Other fields or way to query fields can be used if needed.
    *
    * @param item The store item.
    * @param store The store.
    */
  def itemToRenderItem(item: js.Object, store: Store): js.Any = js.native
  /**
    * Creates a new Date object.
    *
    * @param obj This object can have several values:the time in milliseconds since gregorian epoch.a Date instance
    */
  def newDate(obj: js.Object): js.Any = js.native
  /**
    * Called when the selection changed.
    *
    */
  def onChange(): Unit = js.native
  /**
    * Event dispatched when the grid has been clicked.
    *
    * @param e The event dispatched when the grid is clicked.
    */
  def onGridClick(e: js.Object): Unit = js.native
  /**
    * Event dispatched when the grid has been double-clicked.
    *
    * @param e The event dispatched when the grid is double-clicked.
    */
  def onGridDoubleClick(e: js.Object): Unit = js.native
  /**
    * Event dispatched when an item renderer has been clicked.
    *
    * @param e The event dispatched when an item is clicked.
    */
  def onItemClick(e: js.Object): Unit = js.native
  /**
    * Event dispatched when an item renderer has been context-clicked.
    *
    * @param e The event dispatched when an item is context-clicked.
    */
  def onItemContextMenu(e: js.Object): Unit = js.native
  /**
    * Event dispatched when an item renderer has been double-clicked.
    *
    * @param e The event dispatched when an item is double-clicked.
    */
  def onItemDoubleClick(e: js.Object): Unit = js.native
  /**
    * Event dispatched when the item is entering the editing mode.
    *
    * @param e
    */
  def onItemEditBegin(e: js.Any): Unit = js.native
  /**
    * Event dispatched when an editing gesture is beginning.
    *
    * @param e The editing event.
    */
  def onItemEditBeginGesture(e: js.Object): Unit = js.native
  /**
    * Event dispatched when the item is leaving the editing mode.
    *
    * @param e
    */
  def onItemEditEnd(e: js.Any): Unit = js.native
  /**
    * Event dispatched at the end of an editing gesture.
    *
    * @param e The editing event.
    */
  def onItemEditEndGesture(e: js.Object): Unit = js.native
  /**
    * Event dispatched during a move editing gesture.
    *
    * @param e The editing event.
    */
  def onItemEditMoveGesture(e: js.Object): Unit = js.native
  /**
    * Event dispatched during a resize editing gesture.
    *
    * @param e The editing event.
    */
  def onItemEditResizeGesture(e: js.Object): Unit = js.native
  /**
    * Event dispatched when an item renderer has been created.
    *
    * @param e The renderer lifecycle event.
    */
  def onRendererCreated(e: js.Object): Unit = js.native
  /**
    * Event dispatched when an item renderer is destroyed.
    *
    * @param e The renderer lifecycle event.
    */
  def onRendererDestroyed(e: js.Object): Unit = js.native
  /**
    * Event dispatched when an item renderer has been recycled.
    *
    * @param e The renderer lifecycle event.
    */
  def onRendererRecycled(e: js.Object): Unit = js.native
  /**
    * Event dispatched when an item renderer that was recycled is reused.
    *
    * @param e The renderer lifecycle event.
    */
  def onRendererReused(e: js.Object): Unit = js.native
  /**
    * Event triggered when item renderers layout has been done.
    *
    * @param view
    */
  def onRenderersLayoutDone(view: js.Any): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    * Actually refresh the rendering. Implementation should implement that method.
    *
    */
  def refreshRendering(): Unit = js.native
  /**
    * Create a store item based on the render item. It must be of the form:
    *
    * {
    *     id: Object
    *     startTime: Date,
    *     endTime: Date,
    *     summary: String
    * }
    * By default it is building an object using the summaryAttr, startTimeAttr and endTimeAttr properties
    *
    * and encodeDate property if not null. If the encodeDate property is null a Date object will be set in the start and end time.
    * When using a JsonRest store, for example, it is recommended to transfer dates using the ISO format (see dojo.date.stamp).
    * In that case, provide a custom function to the encodeDate property that is using the date ISO encoding provided by Dojo.
    *
    * @param renderItem The render item.
    * @param store The store.
    */
  def renderItemToItem(renderItem: js.Object, store: Store): js.Any = js.native
  /**
    *
    */
  def resize(): Unit = js.native
  /**
    * If the view is scrollable, scrolls it vertically to the specified direction.
    *
    * @param dir Direction of the scroll. Valid values are -1 and 1.
    */
  def scrollView(dir: Double): Unit = js.native
  /**
    *
    * @param e
    * @param item
    * @param renderer
    * @param dispatch
    */
  def selectFromEvent(e: js.Any, item: js.Any, renderer: js.Any, dispatch: js.Any): Unit = js.native
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
    *
    * @param item
    * @param value
    */
  def setItemSelected(item: js.Any, value: js.Any): Unit = js.native
  /**
    * Change the selection state of an item.
    *
    * @param item The item to change the selection state for.
    * @param value True to select the item, false to deselect it.
    */
  def setItemSelected(item: js.Object, value: Boolean): Unit = js.native
  @JSName("set")
  def set_allDayAttr(property: allDayAttr, value: String): Unit = js.native
  @JSName("set")
  def set_allowResizeLessThan24H(property: allowResizeLessThan24H, value: Boolean): Unit = js.native
  @JSName("set")
  def set_allowStartEndSwap(property: allowStartEndSwap, value: Boolean): Unit = js.native
  @JSName("set")
  def set_allowSubColumnMove(property: allowSubColumnMove, value: Boolean): Unit = js.native
  @JSName("set")
  def set_autoScroll(property: autoScroll, value: Boolean): Unit = js.native
  @JSName("set")
  def set_createOnGridClick(property: createOnGridClick, value: Boolean): Unit = js.native
  @JSName("set")
  def set_cssClassFunc(property: cssClassFunc, value: js.Function): Unit = js.native
  @JSName("set")
  def set_datePackage(property: datePackage, value: js.Object): Unit = js.native
  @JSName("set")
  def set_decodeDate(property: decodeDate, value: js.Object): Unit = js.native
  @JSName("set")
  def set_displayedItemsInvalidated(property: displayedItemsInvalidated, value: Boolean): Unit = js.native
  @JSName("set")
  def set_doubleTapDelay(property: doubleTapDelay, value: Double): Unit = js.native
  @JSName("set")
  def set_editable(property: editable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_encodeDate(property: encodeDate, value: js.Object): Unit = js.native
  @JSName("set")
  def set_endTimeAttr(property: endTimeAttr, value: String): Unit = js.native
  @JSName("set")
  def set_formatItemTimeFunc(property: formatItemTimeFunc, value: js.Function): Unit = js.native
  @JSName("set")
  def set_hoveredItem(property: hoveredItem, value: js.Object): Unit = js.native
  @JSName("set")
  def set_invalidRendering(property: invalidRendering, value: Boolean): Unit = js.native
  @JSName("set")
  def set_invalidatingProperties(property: invalidatingProperties, value: js.Object): Unit = js.native
  @JSName("set")
  def set_itemToRenderer(property: itemToRenderer, value: js.Object): Unit = js.native
  @JSName("set")
  def set_itemToRendererKindFunc(property: itemToRendererKindFunc, value: js.Function): Unit = js.native
  @JSName("set")
  def set_layoutPriorityFunction(property: layoutPriorityFunction, value: js.Function): Unit = js.native
  @JSName("set")
  def set_liveLayout(property: liveLayout, value: Boolean): Unit = js.native
  @JSName("set")
  def set_minDurationSteps(property: minDurationSteps, value: Double): Unit = js.native
  @JSName("set")
  def set_minDurationUnit(property: minDurationUnit, value: String): Unit = js.native
  @JSName("set")
  def set_moveEnabled(property: moveEnabled, value: Boolean): Unit = js.native
  @JSName("set")
  def set_query(property: query, value: js.Object): Unit = js.native
  @JSName("set")
  def set_queryOptions(property: queryOptions, value: js.Object): Unit = js.native
  @JSName("set")
  def set_rendererList(property: rendererList, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_rendererPool(property: rendererPool, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_resizeCursor(property: resizeCursor, value: String): Unit = js.native
  @JSName("set")
  def set_resizeEnabled(property: resizeEnabled, value: Boolean): Unit = js.native
  @JSName("set")
  def set_scrollMethod(property: scrollMethod, value: String): Unit = js.native
  @JSName("set")
  def set_scrollable(property: scrollable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_selectedItem(property: selectedItem, value: js.Object): Unit = js.native
  @JSName("set")
  def set_selectedItems(property: selectedItems, value: js.Object): Unit = js.native
  @JSName("set")
  def set_selectionMode(property: selectionMode, value: String): Unit = js.native
  @JSName("set")
  def set_snapSteps(property: snapSteps, value: Double): Unit = js.native
  @JSName("set")
  def set_snapUnit(property: snapUnit, value: String): Unit = js.native
  @JSName("set")
  def set_startTimeAttr(property: startTimeAttr, value: String): Unit = js.native
  @JSName("set")
  def set_stayInView(property: stayInView, value: Boolean): Unit = js.native
  @JSName("set")
  def set_store(property: store, value: js.Object): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_subColumnAttr(property: subColumnAttr, value: String): Unit = js.native
  @JSName("set")
  def set_summaryAttr(property: summaryAttr, value: String): Unit = js.native
  @JSName("set")
  def set_viewKind(property: viewKind, value: String): Unit = js.native
  /**
    * Updates all the renderers that represents the specified item(s).
    *
    * @param obj A render item or an array of render items.
    * @param stateOnly Whether only the state of the item has changed (selected, edited, edited, focused) or a more global change has occured.
    */
  def updateRenderers(obj: js.Object, stateOnly: Boolean): Unit = js.native
  /**
    * Immediately validate the rendering if it has been invalidated. You generally do not call that method yourself.
    *
    */
  def validateRendering(): Unit = js.native
  @JSName("watch")
  def watch_allDayAttr(
    property: allDayAttr,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_allowResizeLessThan24H(
    property: allowResizeLessThan24H,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_allowStartEndSwap(
    property: allowStartEndSwap,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_allowSubColumnMove(
    property: allowSubColumnMove,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_autoScroll(
    property: autoScroll,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_createOnGridClick(
    property: createOnGridClick,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_cssClassFunc(
    property: cssClassFunc,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[js.Function], js.UndefOr[js.Function], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_datePackage(
    property: datePackage,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_decodeDate(
    property: decodeDate,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[js.Object], js.UndefOr[js.Object], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_displayedItemsInvalidated(
    property: displayedItemsInvalidated,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_doubleTapDelay(
    property: doubleTapDelay,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_editable(
    property: editable,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_encodeDate(
    property: encodeDate,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[js.Object], js.UndefOr[js.Object], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_endTimeAttr(
    property: endTimeAttr,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_formatItemTimeFunc(
    property: formatItemTimeFunc,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Function], 
      /* newValue */ js.UndefOr[js.Function], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_hoveredItem(
    property: hoveredItem,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_invalidRendering(
    property: invalidRendering,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Boolean], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_invalidatingProperties(
    property: invalidatingProperties,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[js.Object], js.UndefOr[js.Object], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_itemToRenderer(
    property: itemToRenderer,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_itemToRendererKindFunc(
    property: itemToRendererKindFunc,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Function], 
      /* newValue */ js.UndefOr[js.Function], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_layoutPriorityFunction(
    property: layoutPriorityFunction,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Function], 
      /* newValue */ js.UndefOr[js.Function], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_liveLayout(
    property: liveLayout,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minDurationSteps(
    property: minDurationSteps,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minDurationUnit(
    property: minDurationUnit,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_moveEnabled(
    property: moveEnabled,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_query(
    property: query,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[js.Object], js.UndefOr[js.Object], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_queryOptions(
    property: queryOptions,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[js.Object], js.UndefOr[js.Object], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_rendererList(
    property: rendererList,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_rendererPool(
    property: rendererPool,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Array[_]], 
      /* newValue */ js.UndefOr[js.Array[_]], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_resizeCursor(
    property: resizeCursor,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_resizeEnabled(
    property: resizeEnabled,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_scrollMethod(
    property: scrollMethod,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_scrollable(
    property: scrollable,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_selectedItem(
    property: selectedItem,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[js.Object], js.UndefOr[js.Object], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_selectedItems(
    property: selectedItems,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[js.Object], js.UndefOr[js.Object], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_selectionMode(
    property: selectionMode,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_snapSteps(
    property: snapSteps,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_snapUnit(
    property: snapUnit,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_startTimeAttr(
    property: startTimeAttr,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_stayInView(
    property: stayInView,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_store(
    property: store,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[js.Object], js.UndefOr[js.Object], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_subColumnAttr(
    property: subColumnAttr,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_summaryAttr(
    property: summaryAttr,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_viewKind(
    property: viewKind,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

