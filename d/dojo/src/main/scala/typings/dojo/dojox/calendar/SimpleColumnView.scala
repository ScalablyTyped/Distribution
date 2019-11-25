package typings.dojo.dojox.calendar

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.columnCount
import typings.dojo.dojoStrings.columnHeaderDatePattern
import typings.dojo.dojoStrings.horizontalGap
import typings.dojo.dojoStrings.hourSize
import typings.dojo.dojoStrings.maxHours
import typings.dojo.dojoStrings.minColumnWidth
import typings.dojo.dojoStrings.minHours
import typings.dojo.dojoStrings.percentOverlap
import typings.dojo.dojoStrings.renderData
import typings.dojo.dojoStrings.rowHeaderFirstLabelOffset
import typings.dojo.dojoStrings.rowHeaderGridSlotDuration
import typings.dojo.dojoStrings.rowHeaderLabelOffset
import typings.dojo.dojoStrings.rowHeaderLabelSlotDuration
import typings.dojo.dojoStrings.rowHeaderTimePattern
import typings.dojo.dojoStrings.scrollBarRTLPosition
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.showTimeIndicator
import typings.dojo.dojoStrings.startDate
import typings.dojo.dojoStrings.startTimeOfDay
import typings.dojo.dojoStrings.styleGridCellFunc
import typings.dojo.dojoStrings.subColumns
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.timeIndicatorRefreshInterval
import typings.dojo.dojoStrings.timeSlotDuration
import typings.dojo.dojoStrings.verticalRenderer
import typings.std.Date
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calendar/SimpleColumnView.html
  *
  * The simple column view is displaying a day per column. Each cell of a column is a time slot.
  *
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.calendar.SimpleColumnView")
@js.native
class SimpleColumnView () extends ViewBase {
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * The number of column to display (from the startDate).
    *
    */
  var columnCount: Double = js.native
  /**
    * Custom date/time pattern for column header labels to override default one coming from the CLDR.
    * See dojo/date/locale documentation for format string.
    *
    */
  var columnHeaderDatePattern: String = js.native
  /**
    * The number of pixels between two item renderers that are overlapping each other if the percentOverlap property is 0.
    *
    */
  var horizontalGap: Double = js.native
  /**
    * The desired size in pixels of an hour on the screen.
    * Note that the effective size may be different as the time slot size must be an integer.
    *
    */
  var hourSize: Double = js.native
  /**
    * The maximum hour to be displayed. It must be in the [1,36] interval and must be greater than the minHours.
    *
    */
  var maxHours: Double = js.native
  /**
    * The minimum column width. If the number of columns and sub columns displayed makes the
    * width of a column greater than this property, a horizontal scroll bar is displayed.
    * If value <= 0, this constraint is ignored and the columns are using the available space.
    *
    */
  var minColumnWidth: Double = js.native
  /**
    * The minimum hour to be displayed. It must be in the [0,23] interval and must be lower than the maxHours.
    *
    */
  var minHours: Double = js.native
  /**
    * The percentage of the renderer width used to superimpose one item renderer on another
    * when two events are overlapping.
    *
    */
  var percentOverlap: Double = js.native
  /**
    * The render data is the object that contains all the properties needed to render the component.
    *
    */
  var renderData: js.Object = js.native
  /**
    * Offset of the first row label from the top of the first row header cell in pixels.
    *
    */
  var rowHeaderFirstLabelOffset: Double = js.native
  /**
    * Duration of the time slot in minutes in the row header. Must be a divisor of 60 and a multiple/divisor of timeSlotDuration.
    *
    */
  var rowHeaderGridSlotDuration: Double = js.native
  /**
    * Offset of the row label from the top of the row header cell in pixels.
    *
    */
  var rowHeaderLabelOffset: Double = js.native
  /**
    * Duration of the time slot in minutes in the row header labels. Must be a divisor of 60 and a multiple/divisor of timeSlotDuration.
    *
    */
  var rowHeaderLabelSlotDuration: Double = js.native
  /**
    * Custom date/time pattern for the row header labels to override default one coming from the CLDR.
    * See dojo/date/locale documentation for format string.
    *
    */
  var rowHeaderTimePattern: String = js.native
  /**
    * Position of the scroll bar in right-to-left display.
    * Valid values are "left" and "right", default value is "left".
    *
    */
  var scrollBarRTLPosition: String = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * Whether show or not an indicator (default a red line) at the current time.
    *
    */
  var showTimeIndicator: Boolean = js.native
  /**
    * The start date of the time interval displayed.
    * If not set at initialization time, will be set to current day.
    *
    */
  var startDate: Date = js.native
  /**
    * First time (hour/minute) of day displayed, if reachable.
    * An object containing "hours" and "minutes" properties.
    *
    */
  var startTimeOfDay: js.Object = js.native
  /**
    * Custom function to customize the appearance of a grid cell by installing custom CSS class on the node.
    * The signature of the function must be the same then the styleGridCell one.
    * By default the defaultStyleGridCell function is used.
    *
    */
  var styleGridCellFunc: js.Function = js.native
  /**
    *
    */
  var subColumns: js.Object = js.native
  /**
    * Path to template (HTML file) for this widget relative to dojo.baseUrl.
    * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
    *
    */
  var templatePath: String = js.native
  /**
    *
    */
  var templateString: String = js.native
  /**
    * Maximal interval between two refreshes of time indicator.
    *
    */
  var timeIndicatorRefreshInterval: Double = js.native
  /**
    * Duration of the time slot in minutes. Must be a divisor of 60.
    *
    */
  var timeSlotDuration: Double = js.native
  /**
    * The class use to create vertical renderers.
    *
    */
  var verticalRenderer: js.Object = js.native
  /**
    * Styles the CSS classes to the node that displays a cell.
    * By default this method is setting:
    * - "dojoxCalendarToday" class name if the date displayed is the current date,
    * - "dojoxCalendarWeekend" if the date represents a weekend,
    * - the CSS class corresponding of the displayed day of week ("Sun", "Mon" and so on),
    * - the CSS classes corresponfing to the time of day (e.g. "H14" and "M30" for for 2:30pm).
    *
    * @param node The DOM node that displays the cell in the grid.
    * @param date The date displayed by this cell.
    * @param hours The hours part of time of day displayed by the start of this cell.
    * @param minutes The minutes part of time of day displayed by the start of this cell.
    * @param renderData The render data object.
    */
  def defaultStyleGridCell(node: HTMLElement, date: Date, hours: Double, minutes: Double, renderData: js.Object): js.Any = js.native
  /**
    * Scrolls the view if the [start, end] time range is not visible or only partially visible.
    *
    * @param start Start time of the range of interest.
    * @param end End time of the range of interest.
    * @param visibilityTarget The end(s) of the time range to make visible.Valid values are: "start", "end", "both".
    * @param margin Margin in minutes around the time range.
    * @param duration Optional, the maximum duration of the scroll animation.
    */
  def ensureVisibility(start: Date, end: Date, visibilityTarget: String, margin: Double, duration: Double): Unit = js.native
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
    * Return the time of day associated to the specified position.
    *
    * @param pos The position in pixels.
    * @param rd The render data.
    */
  def getTimeOfDay(pos: Double, rd: js.Object): js.Object = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_columnCount(property: columnCount): Double = js.native
  @JSName("get")
  def get_columnHeaderDatePattern(property: columnHeaderDatePattern): String = js.native
  @JSName("get")
  def get_horizontalGap(property: horizontalGap): Double = js.native
  @JSName("get")
  def get_hourSize(property: hourSize): Double = js.native
  @JSName("get")
  def get_maxHours(property: maxHours): Double = js.native
  @JSName("get")
  def get_minColumnWidth(property: minColumnWidth): Double = js.native
  @JSName("get")
  def get_minHours(property: minHours): Double = js.native
  @JSName("get")
  def get_percentOverlap(property: percentOverlap): Double = js.native
  @JSName("get")
  def get_renderData(property: renderData): js.Object = js.native
  @JSName("get")
  def get_rowHeaderFirstLabelOffset(property: rowHeaderFirstLabelOffset): Double = js.native
  @JSName("get")
  def get_rowHeaderGridSlotDuration(property: rowHeaderGridSlotDuration): Double = js.native
  @JSName("get")
  def get_rowHeaderLabelOffset(property: rowHeaderLabelOffset): Double = js.native
  @JSName("get")
  def get_rowHeaderLabelSlotDuration(property: rowHeaderLabelSlotDuration): Double = js.native
  @JSName("get")
  def get_rowHeaderTimePattern(property: rowHeaderTimePattern): String = js.native
  @JSName("get")
  def get_scrollBarRTLPosition(property: scrollBarRTLPosition): String = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_showTimeIndicator(property: showTimeIndicator): Boolean = js.native
  @JSName("get")
  def get_startDate(property: startDate): Date = js.native
  @JSName("get")
  def get_startTimeOfDay(property: startTimeOfDay): js.Object = js.native
  @JSName("get")
  def get_styleGridCellFunc(property: styleGridCellFunc): js.Function = js.native
  @JSName("get")
  def get_subColumns(property: subColumns): js.Object = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  @JSName("get")
  def get_timeIndicatorRefreshInterval(property: timeIndicatorRefreshInterval): Double = js.native
  @JSName("get")
  def get_timeSlotDuration(property: timeSlotDuration): Double = js.native
  @JSName("get")
  def get_verticalRenderer(property: verticalRenderer): js.Object = js.native
  /**
    * Event dispatched when a column header cell is dispatched.
    *
    * @param e The event has the following properties
    */
  def onColumnHeaderClick(e: js.Object): Unit = js.native
  def resize(e: js.Any): Unit = js.native
  /**
    * Scrolls the view horizontally to the specified direction of one column or sub column (if set).
    *
    * @param dir Direction of the scroll. Valid values are -1 and 1.
    */
  def scrollViewHorizontal(dir: Double): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_columnCount(property: columnCount, value: Double): Unit = js.native
  @JSName("set")
  def set_columnHeaderDatePattern(property: columnHeaderDatePattern, value: String): Unit = js.native
  @JSName("set")
  def set_horizontalGap(property: horizontalGap, value: Double): Unit = js.native
  @JSName("set")
  def set_hourSize(property: hourSize, value: Double): Unit = js.native
  @JSName("set")
  def set_maxHours(property: maxHours, value: Double): Unit = js.native
  @JSName("set")
  def set_minColumnWidth(property: minColumnWidth, value: Double): Unit = js.native
  @JSName("set")
  def set_minHours(property: minHours, value: Double): Unit = js.native
  @JSName("set")
  def set_percentOverlap(property: percentOverlap, value: Double): Unit = js.native
  @JSName("set")
  def set_renderData(property: renderData, value: js.Object): Unit = js.native
  @JSName("set")
  def set_rowHeaderFirstLabelOffset(property: rowHeaderFirstLabelOffset, value: Double): Unit = js.native
  @JSName("set")
  def set_rowHeaderGridSlotDuration(property: rowHeaderGridSlotDuration, value: Double): Unit = js.native
  @JSName("set")
  def set_rowHeaderLabelOffset(property: rowHeaderLabelOffset, value: Double): Unit = js.native
  @JSName("set")
  def set_rowHeaderLabelSlotDuration(property: rowHeaderLabelSlotDuration, value: Double): Unit = js.native
  @JSName("set")
  def set_rowHeaderTimePattern(property: rowHeaderTimePattern, value: String): Unit = js.native
  @JSName("set")
  def set_scrollBarRTLPosition(property: scrollBarRTLPosition, value: String): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_showTimeIndicator(property: showTimeIndicator, value: Boolean): Unit = js.native
  @JSName("set")
  def set_startDate(property: startDate, value: Date): Unit = js.native
  @JSName("set")
  def set_startTimeOfDay(property: startTimeOfDay, value: js.Object): Unit = js.native
  @JSName("set")
  def set_styleGridCellFunc(property: styleGridCellFunc, value: js.Function): Unit = js.native
  @JSName("set")
  def set_subColumns(property: subColumns, value: js.Object): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("set")
  def set_timeIndicatorRefreshInterval(property: timeIndicatorRefreshInterval, value: Double): Unit = js.native
  @JSName("set")
  def set_timeSlotDuration(property: timeSlotDuration, value: Double): Unit = js.native
  @JSName("set")
  def set_verticalRenderer(property: verticalRenderer, value: js.Object): Unit = js.native
  /**
    * Styles the CSS classes to the node that displays a column header cell.
    * By default this method is setting:
    * - "dojoxCalendarToday" class name if the date displayed is the current date,
    * - "dojoxCalendarWeekend" if the date represents a weekend,
    * - the CSS class corresponding of the displayed day of week ("Sun", "Mon" and so on).
    *
    * @param node The DOM node that displays the column in the grid.
    * @param date The date displayed by this column
    * @param renderData The render data.
    */
  def styleColumnHeaderCell(node: HTMLElement, date: Date, renderData: js.Object): Unit = js.native
  /**
    * Styles the CSS classes to the node that displays a cell.
    * Delegates to styleGridCellFunc if defined or defaultStyleGridCell otherwise.
    *
    * @param node The DOM node that displays the cell in the grid.
    * @param date The date displayed by this column
    * @param hours
    * @param minutes
    * @param renderData The render data object.
    */
  def styleGridCell(node: HTMLElement, date: Date, hours: js.Any, minutes: js.Any, renderData: js.Object): Unit = js.native
  /**
    * Styles the CSS classes to the node that displays a row header cell.
    * By default this method is doing nothing.
    *
    * @param node The DOM node that displays the column in the grid.
    * @param h The time of day displayed by this row header cell.
    * @param m
    * @param renderData The render data.
    */
  def styleRowHeaderCell(node: HTMLElement, h: Double, m: js.Any, renderData: js.Object): Unit = js.native
  /**
    * Styles the CSS classes to the node that displays a sub column header cell.
    * By default this method is not setting anythin:
    *
    * @param node The DOM node that displays the column in the grid.
    * @param date
    * @param renderData The render data.
    */
  def styleSubColumnHeaderCell(node: HTMLElement, date: js.Any, renderData: js.Object): Unit = js.native
  /**
    * Computes the label for a sub column from the subColumns property.
    * By default, return the value.
    *
    * @param value
    */
  def subColumnLabelFunc(value: js.Any): js.Any = js.native
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
  def watch_columnCount(
    property: columnCount,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_columnHeaderDatePattern(
    property: columnHeaderDatePattern,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_horizontalGap(
    property: horizontalGap,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_hourSize(
    property: hourSize,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_maxHours(
    property: maxHours,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minColumnWidth(
    property: minColumnWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minHours(
    property: minHours,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_percentOverlap(
    property: percentOverlap,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_renderData(
    property: renderData,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_rowHeaderFirstLabelOffset(
    property: rowHeaderFirstLabelOffset,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_rowHeaderGridSlotDuration(
    property: rowHeaderGridSlotDuration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_rowHeaderLabelOffset(
    property: rowHeaderLabelOffset,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_rowHeaderLabelSlotDuration(
    property: rowHeaderLabelSlotDuration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_rowHeaderTimePattern(
    property: rowHeaderTimePattern,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_scrollBarRTLPosition(
    property: scrollBarRTLPosition,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
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
  def watch_showTimeIndicator(
    property: showTimeIndicator,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
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
  def watch_startTimeOfDay(
    property: startTimeOfDay,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_styleGridCellFunc(
    property: styleGridCellFunc,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Function], 
      /* newValue */ js.UndefOr[js.Function], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_subColumns(
    property: subColumns,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
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
  def watch_timeIndicatorRefreshInterval(
    property: timeIndicatorRefreshInterval,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_timeSlotDuration(
    property: timeSlotDuration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_verticalRenderer(
    property: verticalRenderer,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

