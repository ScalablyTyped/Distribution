package typings.dojo.dojox.calendar

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojo.store.api.Store
import typings.dojo.dojoStrings.allDayAttr
import typings.dojo.dojoStrings.animateRange
import typings.dojo.dojoStrings.animationRangeDuration
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.columnView
import typings.dojo.dojoStrings.columnViewProps
import typings.dojo.dojoStrings.contextRequire
import typings.dojo.dojoStrings.createItemFunc
import typings.dojo.dojoStrings.createOnGridClick
import typings.dojo.dojoStrings.cssClassFunc
import typings.dojo.dojoStrings.currentView
import typings.dojo.dojoStrings.date
import typings.dojo.dojoStrings.dateInterval
import typings.dojo.dojoStrings.dateIntervalSteps
import typings.dojo.dojoStrings.datePackage
import typings.dojo.dojoStrings.decodeDate
import typings.dojo.dojoStrings.displayedItemsInvalidated
import typings.dojo.dojoStrings.editable
import typings.dojo.dojoStrings.encodeDate
import typings.dojo.dojoStrings.endDate
import typings.dojo.dojoStrings.endTimeAttr
import typings.dojo.dojoStrings.firstDayOfWeek
import typings.dojo.dojoStrings.formatItemTimeFunc
import typings.dojo.dojoStrings.hoveredItem
import typings.dojo.dojoStrings.invalidRendering
import typings.dojo.dojoStrings.invalidatingProperties
import typings.dojo.dojoStrings.matrixView
import typings.dojo.dojoStrings.matrixViewProps
import typings.dojo.dojoStrings.maxDate
import typings.dojo.dojoStrings.minDate
import typings.dojo.dojoStrings.moveEnabled
import typings.dojo.dojoStrings.query
import typings.dojo.dojoStrings.queryOptions
import typings.dojo.dojoStrings.resizeEnabled
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.selectedItem
import typings.dojo.dojoStrings.selectedItems
import typings.dojo.dojoStrings.selectionMode
import typings.dojo.dojoStrings.startDate
import typings.dojo.dojoStrings.startTimeAttr
import typings.dojo.dojoStrings.store
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.subColumnAttr
import typings.dojo.dojoStrings.summaryAttr
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.viewChangeDuration
import typings.dojo.dojoStrings.viewContainer
import typings.dojo.dojoStrings.views
import typings.dojo.dojoStrings.widgetsInTemplate
import typings.std.Date
import typings.std.Event
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calendar/CalendarBase.html
  *
  * This class defines a generic calendar widget that manages several views to display event in time.
  *
  * @param args
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojo.Stateful because Already inherited
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dojox.widget.Selection because Inheritance from two classes. Inlined selectedItem, set_selectedItem, get_selectedItem, watch_selectedItem, selectedItems, set_selectedItems, get_selectedItems, watch_selectedItems, selectionMode, set_selectionMode, get_selectionMode, watch_selectionMode, dispatchChange, getIdentity, isItemSelected, selectFromEvent, setItemSelected, onChange
- typings.dojo.dojox.widget._Invalidating because Inheritance from two classes. Inlined invalidatingProperties, set_invalidatingProperties, get_invalidatingProperties, watch_invalidatingProperties, invalidRendering, set_invalidRendering, get_invalidRendering, watch_invalidRendering, addInvalidatingProperties, invalidateRendering, refreshRendering, validateRendering
- typings.dojo.dojox.calendar.StoreMixin because Inheritance from two classes. Inlined allDayAttr, set_allDayAttr, get_allDayAttr, watch_allDayAttr, cssClassFunc, set_cssClassFunc, get_cssClassFunc, watch_cssClassFunc, decodeDate, set_decodeDate, get_decodeDate, watch_decodeDate, displayedItemsInvalidated, set_displayedItemsInvalidated, get_displayedItemsInvalidated, watch_displayedItemsInvalidated, encodeDate, set_encodeDate, get_encodeDate, watch_encodeDate, endTimeAttr, set_endTimeAttr, get_endTimeAttr, watch_endTimeAttr, query, set_query, get_query, watch_query, queryOptions, set_queryOptions, get_queryOptions, watch_queryOptions, startTimeAttr, set_startTimeAttr, get_startTimeAttr, watch_startTimeAttr, store, set_store, get_store, watch_store, subColumnAttr, set_subColumnAttr, get_subColumnAttr, watch_subColumnAttr, summaryAttr, set_summaryAttr, get_summaryAttr, watch_summaryAttr, get, getItemStoreState, itemToRenderItem, postscript, renderItemToItem, set, watch
- typings.dojo.dijit._WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.calendar.CalendarBase")
@js.native
class CalendarBase protected () extends _WidgetBase {
  def this(args: js.Object) = this()
  /**
    * The attribute of the store item that contains the all day state of
    * the events represented by this item.    Default is "allDay".
    *
    */
  var allDayAttr: String = js.native
  /**
    * Indicates that the previous/next range method will be animated.
    *
    */
  var animateRange: Boolean = js.native
  /**
    * The duration of the next/previous range animation.
    *
    */
  var animationRangeDuration: Double = js.native
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * The column view is displaying one day to seven days time intervals.
    *
    */
  var columnView: js.Object = js.native
  /**
    * Map of property/value passed to the constructor of the column view.
    *
    */
  var columnViewProps: js.Object = js.native
  /**
    * Used to provide a context require to the dojo/parser in order to be
    * able to use relative MIDs (e.g. ./Widget) in the widget's template.
    *
    */
  var contextRequire: js.Function = js.native
  /**
    * A user supplied function that creates a new event.
    * This function is used when createOnGridClick is set to true and the user is clicking and dragging on the grid.
    * This view takes two parameters:
    *
    * view: the current view,
    * d: the date at the clicked location.
    *
    */
  var createItemFunc: js.Function = js.native
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
    * The current view displayed by the Calendar object.
    * The currentViewChange event can be used to react on a view change.
    *
    */
  var currentView: js.Object = js.native
  /**
    * The reference date used to determine along with the dateInterval
    * and dateIntervalSteps properties the time interval to display.
    *
    */
  var date: Date = js.native
  /**
    * The date interval used to compute along with the date and
    * dateIntervalSteps the time interval to display.
    * Valid values are "day", "week" (default value) and "month".
    *
    */
  var dateInterval: String = js.native
  /**
    * The number of date intervals used to compute along with the date and
    * dateInterval the time interval to display.
    * Default value is 1.
    *
    */
  var dateIntervalSteps: Double = js.native
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
    * The end date of the displayed time interval (included).
    *
    */
  var endDate: Date = js.native
  /**
    * The attribute of the store item that contains the end time of
    * the events represented by this item.    Default is "endTime".
    *
    */
  var endTimeAttr: String = js.native
  /**
    * (Optional) The first day of week override. By default the first day of week is determined
    * for the current locale (extracted from the CLDR).
    * Special value -1 (default value), means use locale dependent value.
    *
    */
  var firstDayOfWeek: Double = js.native
  /**
    * Optional function to format the time of day of the item renderers.
    * The function takes the date and render data object as arguments and returns a String.
    *
    */
  var formatItemTimeFunc: js.Object = js.native
  /**
    * Current render item which is under the mouse cursor.
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
    * The column view is displaying time intervals that lasts more than seven days.
    *
    */
  var matrixView: js.Object = js.native
  /**
    * Map of property/value passed to the constructor of the matrix view.
    *
    */
  var matrixViewProps: js.Object = js.native
  /**
    * The maximum date.
    * If date is set, the displayed time interval the most in the future
    * will the time interval containing this date.
    * If endDate property is set, this mininum value of endDate.
    *
    */
  var maxDate: Date = js.native
  /**
    * The minimum date.
    * If date property is set, the displayed time interval the most in the past
    * will the time interval containing this date.
    * If startDate property is set, this mininum value of startDate.
    *
    */
  var minDate: Date = js.native
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
    * A flag that indicates whether the items can be resized.
    * If true, the control supports resizing of items.
    *
    */
  var resizeEnabled: Boolean = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
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
    * The start date of the displayed time interval.
    *
    */
  var startDate: Date = js.native
  /**
    * The attribute of the store item that contains the start time of
    * the events represented by this item.    Default is "startTime".
    *
    */
  var startTimeAttr: String = js.native
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
  var style_CalendarBase: String = js.native
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
    * Path to template (HTML file) for this widget relative to dojo.baseUrl.
    * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
    *
    */
  var templatePath: String = js.native
  /**
    * A string that represents the widget template.
    * Use in conjunction with dojo.cache() to load from a file.
    *
    */
  var templateString: String = js.native
  /**
    *
    */
  var viewChangeDuration: Double = js.native
  /**
    * The DOM node that will contains the views.
    *
    */
  var viewContainer: HTMLElement = js.native
  /**
    * The views displayed by the widget.
    * To add/remove only one view, prefer, respectively, the addView() or removeView() methods.
    *
    */
  var views: js.Object = js.native
  /**
    * Should we parse the template to find widgets that might be
    * declared in markup inside it?  (Remove for 2.0 and assume true)
    *
    */
  var widgetsInTemplate: Boolean = js.native
  /**
    * Add properties to the watched properties to trigger invalidation. This method must be called in
    * the constructor. It is typically used by subclasses of a _Invalidating class to add more properties
    * to watch for.
    *
    * @param properties The list of properties to watch for.
    */
  def addInvalidatingProperties(properties: js.Array[String]): Unit = js.native
  /**
    * Add a view to the calendar's view list.
    *
    * @param view The view to add to the calendar.
    * @param index Optional, the index where to insert the view in current view list.
    */
  def addView(view: ViewBase, index: Double): Unit = js.native
  /**
    * Function called when the cell of a column header of the column view is clicked.
    * Show the time range defined by the clicked date.
    *
    * @param e The column header click event.
    */
  def columnViewColumnHeaderClick(e: js.Object): Unit = js.native
  /**
    *
    */
  def computeTimeInterval(): js.Any = js.native
  /**
    * Set the localized labels of the buttons and the event handlers.
    *
    */
  def configureButtons(): Unit = js.native
  /**
    * The action triggerred when the day button is clicked.
    * By default, sets the dateInterval property to "day" and
    * the "dateIntervalSteps" to 1.
    *
    * @param e
    */
  def dayButtonClick(e: js.Any): Unit = js.native
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
    * @param date Date to floor.
    * @param reuse Whether use the specified instance or create a new one. Default is false.
    */
  def floorToDay(date: Date, reuse: Boolean): js.Any = js.native
  /**
    * Floors the specified date to the beginning of week.
    *
    * @param d
    */
  def floorToWeek(d: js.Any): js.Any = js.native
  /**
    * The action triggerred when the 4 days button is clicked.
    * By default, sets the dateInterval property to "day" and
    * the "dateIntervalSteps" to 4.
    *
    * @param e
    */
  def fourDaysButtonClick(e: js.Any): Unit = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    */
  def getCachedTemplate(): js.Any = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    * 
    * @param templateString The template             
    * @param alwaysUseString Don't cache the DOM tree for this template, even if it doesn't have any variables             
    * @param doc               OptionalThe target document.   Defaults to document global if unspecified.             
    */
  def getCachedTemplate(templateString: String, alwaysUseString: Boolean): js.Any = js.native
  def getCachedTemplate(templateString: String, alwaysUseString: Boolean, doc: HTMLDocument): js.Any = js.native
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
  @JSName("get")
  def get_allDayAttr(property: allDayAttr): String = js.native
  @JSName("get")
  def get_animateRange(property: animateRange): Boolean = js.native
  @JSName("get")
  def get_animationRangeDuration(property: animationRangeDuration): Double = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_columnView(property: columnView): js.Object = js.native
  @JSName("get")
  def get_columnViewProps(property: columnViewProps): js.Object = js.native
  @JSName("get")
  def get_contextRequire(property: contextRequire): js.Function = js.native
  @JSName("get")
  def get_createItemFunc(property: createItemFunc): js.Function = js.native
  @JSName("get")
  def get_createOnGridClick(property: createOnGridClick): Boolean = js.native
  @JSName("get")
  def get_cssClassFunc(property: cssClassFunc): js.Function = js.native
  @JSName("get")
  def get_currentView(property: currentView): js.Object = js.native
  @JSName("get")
  def get_date(property: date): Date = js.native
  @JSName("get")
  def get_dateInterval(property: dateInterval): String = js.native
  @JSName("get")
  def get_dateIntervalSteps(property: dateIntervalSteps): Double = js.native
  @JSName("get")
  def get_datePackage(property: datePackage): js.Object = js.native
  @JSName("get")
  def get_decodeDate(property: decodeDate): js.Object = js.native
  @JSName("get")
  def get_displayedItemsInvalidated(property: displayedItemsInvalidated): Boolean = js.native
  @JSName("get")
  def get_editable(property: editable): Boolean = js.native
  @JSName("get")
  def get_encodeDate(property: encodeDate): js.Object = js.native
  @JSName("get")
  def get_endDate(property: endDate): Date = js.native
  @JSName("get")
  def get_endTimeAttr(property: endTimeAttr): String = js.native
  @JSName("get")
  def get_firstDayOfWeek(property: firstDayOfWeek): Double = js.native
  @JSName("get")
  def get_formatItemTimeFunc(property: formatItemTimeFunc): js.Object = js.native
  @JSName("get")
  def get_hoveredItem(property: hoveredItem): js.Object = js.native
  @JSName("get")
  def get_invalidRendering(property: invalidRendering): Boolean = js.native
  @JSName("get")
  def get_invalidatingProperties(property: invalidatingProperties): js.Object = js.native
  @JSName("get")
  def get_matrixView(property: matrixView): js.Object = js.native
  @JSName("get")
  def get_matrixViewProps(property: matrixViewProps): js.Object = js.native
  @JSName("get")
  def get_maxDate(property: maxDate): Date = js.native
  @JSName("get")
  def get_minDate(property: minDate): Date = js.native
  @JSName("get")
  def get_moveEnabled(property: moveEnabled): Boolean = js.native
  @JSName("get")
  def get_query(property: query): js.Object = js.native
  @JSName("get")
  def get_queryOptions(property: queryOptions): js.Object = js.native
  @JSName("get")
  def get_resizeEnabled(property: resizeEnabled): Boolean = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_selectedItem(property: selectedItem): js.Object = js.native
  @JSName("get")
  def get_selectedItems(property: selectedItems): js.Object = js.native
  @JSName("get")
  def get_selectionMode(property: selectionMode): String = js.native
  @JSName("get")
  def get_startDate(property: startDate): Date = js.native
  @JSName("get")
  def get_startTimeAttr(property: startTimeAttr): String = js.native
  @JSName("get")
  def get_store(property: store): js.Object = js.native
  @JSName("get")
  def get_subColumnAttr(property: subColumnAttr): String = js.native
  @JSName("get")
  def get_summaryAttr(property: summaryAttr): String = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  @JSName("get")
  def get_viewChangeDuration(property: viewChangeDuration): Double = js.native
  @JSName("get")
  def get_viewContainer(property: viewContainer): HTMLElement = js.native
  @JSName("get")
  def get_views(property: views): js.Object = js.native
  @JSName("get")
  def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
  /**
    * Changes the displayed time interval to show the current day.
    * Sets the date property to the current day, the dateInterval property to "day" and
    * the "dateIntervalSteps" to 1.
    *
    */
  def goToday(): Unit = js.native
  /**
    * Invalidating the rendering for the next executation frame.
    *
    */
  def invalidateRendering(): Unit = js.native
  /**
    * Computes whether particular item renderer can be edited.
    * By default it is using the editable property value.
    *
    * @param item The data item represented by the renderer.
    * @param rendererKind The kind of renderer.
    */
  def isItemEditable(item: js.Object, rendererKind: String): js.Any = js.native
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
    * @param item The data item represented by the renderer.
    * @param rendererKind The kind of renderer.
    */
  def isItemMoveEnabled(item: js.Object, rendererKind: String): js.Any = js.native
  /**
    * Computes whether particular item renderer can be resized.
    * By default it is using the resizedEnabled property value.
    *
    * @param item The data item represented by the renderer.
    * @param rendererKind The kind of renderer.
    */
  def isItemResizeEnabled(item: js.Object, rendererKind: String): js.Any = js.native
  /**
    * Returns wether an item is selected or not.
    *
    * @param item The item to test the selection for.
    */
  def isItemSelected(item: js.Object): js.Any = js.native
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
    * Function called when the cell of a row header of the matrix view is clicked.
    * The implementation is doing the foolowing actions:
    * - If another row is already expanded, collapse it and then expand the clicked row.
    * - If the clicked row is already expadned, collapse it.
    * - If no row is expanded, expand the click row.
    *
    * @param e The row header click event.
    */
  def matrixViewRowHeaderClick(e: js.Object): Unit = js.native
  /**
    * The action triggered when the month button is clicked.
    * By default, sets the dateInterval property to "month" and
    * the "dateIntervalSteps" to 1.
    *
    * @param e
    */
  def monthButtonClick(e: js.Any): Unit = js.native
  /**
    * Creates a new Date object.
    *
    * @param obj This object can have several values:- the time in milliseconds since gregorian epoch.- a Date instance
    */
  def newDate(obj: js.Object): js.Any = js.native
  /**
    *
    */
  def nextRange(): Unit = js.native
  /**
    * Called when the selection changed.
    *
    */
  def onChange(): Unit = js.native
  /**
    * Event dispatched when a column header cell is dispatched.
    *
    * @param e Header click event.
    */
  def onColumnHeaderClick(e: js.Object): Unit = js.native
  /**
    * Event dispatched when the current view has changed.
    *
    * @param e Object that contains the oldView and newView properties.
    */
  def onCurrentViewChange(e: Event): Unit = js.native
  /**
    * Event dispatched when an expand renderer is clicked.
    *
    * @param e Expand renderer click event.
    */
  def onExpandRendererClick(e: js.Object): Unit = js.native
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
    * @param e The editing event.
    */
  def onItemEditBegin(e: js.Object): Unit = js.native
  /**
    * Event dispatched when an editing gesture is beginning.
    *
    * @param e The editing event.
    */
  def onItemEditBeginGesture(e: js.Object): Unit = js.native
  /**
    * Event dispatched when the item is leaving the editing mode.
    *
    * @param e The editing event.
    */
  def onItemEditEnd(e: js.Object): Unit = js.native
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
    *
    * @param e The event dispatched when the mouse cursor enters in the item renderer.
    */
  def onItemRollOut(e: js.Object): Unit = js.native
  /**
    *
    * @param e The event dispatched when the mouse cursor enters in the item renderer.
    */
  def onItemRollOver(e: js.Object): Unit = js.native
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
    * @param view The view that has been laid-out.
    */
  def onRenderersLayoutDone(view: ViewBase): Unit = js.native
  /**
    * Event dispatched when a row header cell is clicked.
    *
    * @param e Header click event.
    */
  def onRowHeaderClick(e: js.Object): Unit = js.native
  /**
    * Event dispatched when the displayed time interval has changed.
    *
    * @param e The time interval change event.
    */
  def onTimeIntervalChange(e: js.Object): Unit = js.native
  /**
    * Event dispatched when a view is added from the calendar.
    *
    * @param view The view that has been added to the calendar.
    */
  def onViewAdded(view: ViewBase): Unit = js.native
  /**
    * Event dispatched when the view has been configured after the queried
    * time range and before the current view is changed (if needed).
    *
    * @param view The view that has been configured.
    */
  def onViewConfigurationChange(view: ViewBase): Unit = js.native
  /**
    * Event dispatched when a view is removed from the calendar.
    *
    * @param view The view that has been removed from the calendar.
    */
  def onViewRemoved(view: ViewBase): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    *
    */
  def previousRange(): Unit = js.native
  /**
    * Refreshes all the visual rendering of the calendar.
    *
    */
  /**
    * Actually refresh the rendering. Implementation should implement that method.
    *
    */
  def refreshRendering(): Unit = js.native
  /**
    * Removes a view from the calendar's view list.
    *
    * @param view The view to remove from the calendar.
    */
  def removeView(view: ViewBase): Unit = js.native
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
  def set_allDayAttr(property: allDayAttr, value: String): Unit = js.native
  @JSName("set")
  def set_animateRange(property: animateRange, value: Boolean): Unit = js.native
  @JSName("set")
  def set_animationRangeDuration(property: animationRangeDuration, value: Double): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_columnView(property: columnView, value: js.Object): Unit = js.native
  @JSName("set")
  def set_columnViewProps(property: columnViewProps, value: js.Object): Unit = js.native
  @JSName("set")
  def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
  @JSName("set")
  def set_createItemFunc(property: createItemFunc, value: js.Function): Unit = js.native
  @JSName("set")
  def set_createOnGridClick(property: createOnGridClick, value: Boolean): Unit = js.native
  @JSName("set")
  def set_cssClassFunc(property: cssClassFunc, value: js.Function): Unit = js.native
  @JSName("set")
  def set_currentView(property: currentView, value: js.Object): Unit = js.native
  @JSName("set")
  def set_date(property: date, value: Date): Unit = js.native
  @JSName("set")
  def set_dateInterval(property: dateInterval, value: String): Unit = js.native
  @JSName("set")
  def set_dateIntervalSteps(property: dateIntervalSteps, value: Double): Unit = js.native
  @JSName("set")
  def set_datePackage(property: datePackage, value: js.Object): Unit = js.native
  @JSName("set")
  def set_decodeDate(property: decodeDate, value: js.Object): Unit = js.native
  @JSName("set")
  def set_displayedItemsInvalidated(property: displayedItemsInvalidated, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editable(property: editable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_encodeDate(property: encodeDate, value: js.Object): Unit = js.native
  @JSName("set")
  def set_endDate(property: endDate, value: Date): Unit = js.native
  @JSName("set")
  def set_endTimeAttr(property: endTimeAttr, value: String): Unit = js.native
  @JSName("set")
  def set_firstDayOfWeek(property: firstDayOfWeek, value: Double): Unit = js.native
  @JSName("set")
  def set_formatItemTimeFunc(property: formatItemTimeFunc, value: js.Object): Unit = js.native
  @JSName("set")
  def set_hoveredItem(property: hoveredItem, value: js.Object): Unit = js.native
  @JSName("set")
  def set_invalidRendering(property: invalidRendering, value: Boolean): Unit = js.native
  @JSName("set")
  def set_invalidatingProperties(property: invalidatingProperties, value: js.Object): Unit = js.native
  @JSName("set")
  def set_matrixView(property: matrixView, value: js.Object): Unit = js.native
  @JSName("set")
  def set_matrixViewProps(property: matrixViewProps, value: js.Object): Unit = js.native
  @JSName("set")
  def set_maxDate(property: maxDate, value: Date): Unit = js.native
  @JSName("set")
  def set_minDate(property: minDate, value: Date): Unit = js.native
  @JSName("set")
  def set_moveEnabled(property: moveEnabled, value: Boolean): Unit = js.native
  @JSName("set")
  def set_query(property: query, value: js.Object): Unit = js.native
  @JSName("set")
  def set_queryOptions(property: queryOptions, value: js.Object): Unit = js.native
  @JSName("set")
  def set_resizeEnabled(property: resizeEnabled, value: Boolean): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_selectedItem(property: selectedItem, value: js.Object): Unit = js.native
  @JSName("set")
  def set_selectedItems(property: selectedItems, value: js.Object): Unit = js.native
  @JSName("set")
  def set_selectionMode(property: selectionMode, value: String): Unit = js.native
  @JSName("set")
  def set_startDate(property: startDate, value: Date): Unit = js.native
  @JSName("set")
  def set_startTimeAttr(property: startTimeAttr, value: String): Unit = js.native
  @JSName("set")
  def set_store(property: store, value: js.Object): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_subColumnAttr(property: subColumnAttr, value: String): Unit = js.native
  @JSName("set")
  def set_summaryAttr(property: summaryAttr, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("set")
  def set_viewChangeDuration(property: viewChangeDuration, value: Double): Unit = js.native
  @JSName("set")
  def set_viewContainer(property: viewContainer, value: HTMLElement): Unit = js.native
  @JSName("set")
  def set_views(property: views, value: js.Object): Unit = js.native
  @JSName("set")
  def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
  /**
    * The action triggered when the today button is clicked.
    * By default, calls the goToday() method.
    *
    * @param e
    */
  def todayButtonClick(e: js.Any): Unit = js.native
  /**
    *
    * @param obj
    * @param stateOnly
    */
  def updateRenderers(obj: js.Any, stateOnly: js.Any): Unit = js.native
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
  def watch_animateRange(
    property: animateRange,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_animationRangeDuration(
    property: animationRangeDuration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_attachScope(
    property: attachScope,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_columnView(
    property: columnView,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_columnViewProps(
    property: columnViewProps,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_contextRequire(
    property: contextRequire,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Function], 
      /* newValue */ js.UndefOr[js.Function], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_createItemFunc(
    property: createItemFunc,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Function], 
      /* newValue */ js.UndefOr[js.Function], 
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
  def watch_currentView(
    property: currentView,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_date(
    property: date,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Date], 
      /* newValue */ js.UndefOr[Date], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_dateInterval(
    property: dateInterval,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_dateIntervalSteps(
    property: dateIntervalSteps,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
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
  def watch_endDate(
    property: endDate,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Date], 
      /* newValue */ js.UndefOr[Date], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_endTimeAttr(
    property: endTimeAttr,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_firstDayOfWeek(
    property: firstDayOfWeek,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_formatItemTimeFunc(
    property: formatItemTimeFunc,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
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
  def watch_matrixView(
    property: matrixView,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_matrixViewProps(
    property: matrixViewProps,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_maxDate(
    property: maxDate,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Date], 
      /* newValue */ js.UndefOr[Date], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minDate(
    property: minDate,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Date], 
      /* newValue */ js.UndefOr[Date], 
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
  def watch_searchContainerNode(
    property: searchContainerNode,
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
  def watch_startDate(
    property: startDate,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Date], 
      /* newValue */ js.UndefOr[Date], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_startTimeAttr(
    property: startTimeAttr,
    callback: js.Function3[js.UndefOr[String], js.UndefOr[String], js.UndefOr[String], Unit]
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
  def watch_templatePath(
    property: templatePath,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templateString(
    property: templateString,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_viewChangeDuration(
    property: viewChangeDuration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_viewContainer(
    property: viewContainer,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[HTMLElement], 
      /* newValue */ js.UndefOr[HTMLElement], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_views(
    property: views,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_widgetsInTemplate(
    property: widgetsInTemplate,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  /**
    * The action triggered when the week button is clicked.
    * By default, sets the dateInterval property to "week" and
    * the "dateIntervalSteps" to 1.
    *
    * @param e
    */
  def weekButtonClick(e: js.Any): Unit = js.native
}

