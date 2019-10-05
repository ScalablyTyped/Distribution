package typings.dojo.dojox.calendar

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyDate
import typings.dojo.Fn_NewValueOldValuePropertyFunction
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.columnCount
import typings.dojo.dojoStrings.columnHeaderFormatLength
import typings.dojo.dojoStrings.daySize
import typings.dojo.dojoStrings.gridCellDatePattern
import typings.dojo.dojoStrings.horizontalGap
import typings.dojo.dojoStrings.percentOverlap
import typings.dojo.dojoStrings.renderData
import typings.dojo.dojoStrings.roundToDay
import typings.dojo.dojoStrings.scrollBarRTLPosition
import typings.dojo.dojoStrings.scrollPosition
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.showCellLabel
import typings.dojo.dojoStrings.showHiddenItems
import typings.dojo.dojoStrings.startDate
import typings.dojo.dojoStrings.styleGridCellFunc
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.verticalRenderer
import typings.std.Date
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calendar/MonthColumnView.html
  *
  * The month column view is a calendar view used to display a month per column where each cell of the column is a day.
  *
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.calendar.MonthColumnView")
@js.native
class MonthColumnView () extends ViewBase {
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
    * Length of the column labels. Valid values are "wide" or "abbr".
    *
    */
  var columnHeaderFormatLength: String = js.native
  /**
    * The desired size in pixels of an hour on the screen.
    * Note that the effective size may be different as the time slot size must be an integer.
    *
    */
  var daySize: Double = js.native
  /**
    * Custom date/time pattern for cell labels to override default one coming from the CLDR.
    * See dojo/date/locale documentation for format string.
    *
    */
  var gridCellDatePattern: String = js.native
  /**
    * The number of pixels between two item renderers.
    *
    */
  var horizontalGap: Double = js.native
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
    *
    */
  var roundToDay: Boolean = js.native
  /**
    * Position of the scroll bar in right-to-left display.
    * Valid values are "left" and "right", default value is "left".
    *
    */
  var scrollBarRTLPosition: String = js.native
  /**
    * The scroll position of the view.
    *
    */
  var scrollPosition: Double = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * Whether display or not the grid cells label (usually the day of month).
    *
    */
  var showCellLabel: Boolean = js.native
  /**
    * Whether show or not the hidden items.
    * By default the events that are shorter than a day are not displayed using vertical renderers by this widget.
    * But the grid cells that contains one or several hidden items display a decoration.
    *
    */
  var showHiddenItems: Boolean = js.native
  /**
    * The start date of the time interval displayed.
    * If not set at initialization time, will be set to current day.
    *
    */
  var startDate: Date = js.native
  /**
    * Custom function to customize the appearance of a grid cell by installing custom CSS class on the node.
    * The signature of the function must be the same then the styleGridCell one.
    * By default the defaultStyleGridCell function is used.
    *
    */
  var styleGridCellFunc: js.Function = js.native
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
    * The class use to create vertical renderers.
    *
    */
  var verticalRenderer: js.Object = js.native
  /**
    * Styles the CSS classes to the node that displays a column.
    * By default this method is setting the following CSS classes:
    * - "dojoxCalendarToday" class name if the date displayed is the current date,
    * - "dojoxCalendarWeekend" if the date represents a weekend,
    * - the CSS class corresponding of the displayed day of week ("Sun", "Mon" and so on),
    *
    * @param node The DOM node that displays the cell in the grid.
    * @param date The date displayed by this cell.
    * @param col The column index of this cell.
    * @param row The row index of this cell.
    * @param renderData The render data.
    */
  def defaultStyleGridCell(node: HTMLElement, date: Date, col: Double, row: Double, renderData: js.Object): Unit = js.native
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
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_columnCount(property: columnCount): Double = js.native
  @JSName("get")
  def get_columnHeaderFormatLength(property: columnHeaderFormatLength): String = js.native
  @JSName("get")
  def get_daySize(property: daySize): Double = js.native
  @JSName("get")
  def get_gridCellDatePattern(property: gridCellDatePattern): String = js.native
  @JSName("get")
  def get_horizontalGap(property: horizontalGap): Double = js.native
  @JSName("get")
  def get_percentOverlap(property: percentOverlap): Double = js.native
  @JSName("get")
  def get_renderData(property: renderData): js.Object = js.native
  @JSName("get")
  def get_roundToDay(property: roundToDay): Boolean = js.native
  @JSName("get")
  def get_scrollBarRTLPosition(property: scrollBarRTLPosition): String = js.native
  @JSName("get")
  def get_scrollPosition(property: scrollPosition): Double = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_showCellLabel(property: showCellLabel): Boolean = js.native
  @JSName("get")
  def get_showHiddenItems(property: showHiddenItems): Boolean = js.native
  @JSName("get")
  def get_startDate(property: startDate): Date = js.native
  @JSName("get")
  def get_styleGridCellFunc(property: styleGridCellFunc): js.Function = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  @JSName("get")
  def get_verticalRenderer(property: verticalRenderer): js.Object = js.native
  /**
    * Event dispatched when a column header cell is dispatched.
    *
    * @param e An object with the following properties:index (Integer): The column index. date (Date): The date displayed by the column.triggerEvent (Event): The origin event.
    */
  def onColumnHeaderClick(e: js.Object): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_columnCount(property: columnCount, value: Double): Unit = js.native
  @JSName("set")
  def set_columnHeaderFormatLength(property: columnHeaderFormatLength, value: String): Unit = js.native
  @JSName("set")
  def set_daySize(property: daySize, value: Double): Unit = js.native
  @JSName("set")
  def set_gridCellDatePattern(property: gridCellDatePattern, value: String): Unit = js.native
  @JSName("set")
  def set_horizontalGap(property: horizontalGap, value: Double): Unit = js.native
  @JSName("set")
  def set_percentOverlap(property: percentOverlap, value: Double): Unit = js.native
  @JSName("set")
  def set_renderData(property: renderData, value: js.Object): Unit = js.native
  @JSName("set")
  def set_roundToDay(property: roundToDay, value: Boolean): Unit = js.native
  @JSName("set")
  def set_scrollBarRTLPosition(property: scrollBarRTLPosition, value: String): Unit = js.native
  @JSName("set")
  def set_scrollPosition(property: scrollPosition, value: Double): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_showCellLabel(property: showCellLabel, value: Boolean): Unit = js.native
  @JSName("set")
  def set_showHiddenItems(property: showHiddenItems, value: Boolean): Unit = js.native
  @JSName("set")
  def set_startDate(property: startDate, value: Date): Unit = js.native
  @JSName("set")
  def set_styleGridCellFunc(property: styleGridCellFunc, value: js.Function): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("set")
  def set_verticalRenderer(property: verticalRenderer, value: js.Object): Unit = js.native
  /**
    * Styles the CSS classes to the node that displays a column header cell.
    * By default this method is does nothing and is designed to be overridden.
    *
    * @param node The DOM node that displays the column in the grid.
    * @param date The date displayed by this column
    * @param renderData The render data.
    */
  def styleColumnHeaderCell(node: HTMLElement, date: Date, renderData: js.Object): Unit = js.native
  /**
    * Styles the CSS classes to the node that displays a column.
    * Delegates to styleGridCellFunc if defined or defaultStyleGridCell otherwise.
    *
    * @param node The DOM node that displays the cell in the grid.
    * @param date The date displayed by this cell.
    * @param col The column index of this cell.
    * @param row The row index of this cell.
    * @param renderData The render data.
    */
  def styleGridCell(node: HTMLElement, date: Date, col: Double, row: Double, renderData: js.Object): Unit = js.native
  @JSName("watch")
  def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_columnCount(property: columnCount, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_columnHeaderFormatLength(property: columnHeaderFormatLength, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_daySize(property: daySize, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_gridCellDatePattern(property: gridCellDatePattern, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_horizontalGap(property: horizontalGap, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_percentOverlap(property: percentOverlap, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_renderData(property: renderData, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_roundToDay(property: roundToDay, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_scrollBarRTLPosition(property: scrollBarRTLPosition, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_scrollPosition(property: scrollPosition, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_showCellLabel(property: showCellLabel, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_showHiddenItems(property: showHiddenItems, callback: Fn_NewValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_startDate(property: startDate, callback: Fn_NewValueOldValuePropertyDate): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_styleGridCellFunc(property: styleGridCellFunc, callback: Fn_NewValueOldValuePropertyFunction): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_verticalRenderer(property: verticalRenderer, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
}

