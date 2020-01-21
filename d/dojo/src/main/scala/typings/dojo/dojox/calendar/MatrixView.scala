package typings.dojo.dojox.calendar

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.cellHeaderLongPattern
import typings.dojo.dojoStrings.cellHeaderShortPattern
import typings.dojo.dojoStrings.cellPaddingTop
import typings.dojo.dojoStrings.columnCount
import typings.dojo.dojoStrings.expandDuration
import typings.dojo.dojoStrings.expandEasing
import typings.dojo.dojoStrings.expandRenderer
import typings.dojo.dojoStrings.expandRendererHeight
import typings.dojo.dojoStrings.horizontalRenderer
import typings.dojo.dojoStrings.horizontalRendererHeight
import typings.dojo.dojoStrings.labelRenderer
import typings.dojo.dojoStrings.labelRendererHeight
import typings.dojo.dojoStrings.layoutDuringResize
import typings.dojo.dojoStrings.naturalRowsHeight
import typings.dojo.dojoStrings.percentOverlap
import typings.dojo.dojoStrings.refEndTime
import typings.dojo.dojoStrings.refStartTime
import typings.dojo.dojoStrings.renderData
import typings.dojo.dojoStrings.resizeAnimationDuration
import typings.dojo.dojoStrings.roundToDay
import typings.dojo.dojoStrings.rowCount
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.showCellLabel
import typings.dojo.dojoStrings.startDate
import typings.dojo.dojoStrings.styleGridCellFunc
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.triggerExtent
import typings.dojo.dojoStrings.verticalGap
import typings.std.Date
import typings.std.Event_
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calendar/MatrixView.html
  *
  * The matrix view is a calendar view that displaying a matrix where each cell is a day.
  *
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dijit.TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.calendar.MatrixView")
@js.native
class MatrixView () extends ViewBase {
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * Custom date/time pattern for grid cell label to override default one coming from the CLDR.
    * The long pattern is used for the first day of month or the first displayed day of a month.
    * See dojo/date/locale documentation for format string.
    *
    */
  var cellHeaderLongPattern: String = js.native
  /**
    * Custom date/time pattern for grid cell label to override default one coming from the CLDR.
    * See dojo/date/locale documentation for format string.
    *
    */
  var cellHeaderShortPattern: String = js.native
  /**
    * The top offset in pixels of each cell applied by the layout.
    *
    */
  var cellPaddingTop: Double = js.native
  /**
    * The number of column to display (from the startDate).
    *
    */
  var columnCount: Double = js.native
  /**
    * Duration of the animation when expanding or collapsing a row.
    *
    */
  var expandDuration: Double = js.native
  /**
    * Easing function of the animation when expanding or collapsing a row (null by default).
    *
    */
  var expandEasing: js.Function = js.native
  /**
    * The class use to create drill down renderers.
    *
    */
  var expandRenderer: js.Object = js.native
  /**
    * The height in pixels of the expand/collapse renderers that is applied by the layout.
    *
    */
  var expandRendererHeight: Double = js.native
  /**
    * The class use to create horizontal renderers.
    *
    */
  var horizontalRenderer: js.Object = js.native
  /**
    * The height in pixels of the horizontal and label renderers that is applied by the layout.
    *
    */
  var horizontalRendererHeight: Double = js.native
  /**
    * The class use to create label renderers.
    *
    */
  var labelRenderer: js.Object = js.native
  /**
    *
    */
  var labelRendererHeight: Double = js.native
  /**
    * Indicates if the item renderers' position and size is updated or if they are hidden during a resize of the widget.
    *
    */
  var layoutDuringResize: Boolean = js.native
  /**
    *
    */
  var naturalRowsHeight: js.Object = js.native
  /**
    * The percentage of the renderer width used to superimpose one item renderers on another
    * when two events are overlapping. By default 0.
    *
    */
  var percentOverlap: Double = js.native
  /**
    *
    */
  var refEndTime: js.Object = js.native
  /**
    * (Optional) Start of the time interval of interest.
    * It is used to style differently the displayed rows out of the
    * time interval of interest.
    *
    */
  var refStartTime: js.Object = js.native
  /**
    * The render data object contains all the data needed to render the widget.
    *
    */
  var renderData: js.Object = js.native
  /**
    * Duration, in milliseconds, of the fade animation showing the item renderers after a widget resize.
    *
    */
  var resizeAnimationDuration: Double = js.native
  /**
    * For horizontal renderers that are not filling entire days, whether fill the day or not.
    *
    */
  var roundToDay: Boolean = js.native
  /**
    * The number of rows to display (from the startDate).
    *
    */
  var rowCount: Double = js.native
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
    *
    */
  var triggerExtent: Double = js.native
  /**
    * The number of pixels between two item renderers that are overlapping each other if the percentOverlap property is 0.
    *
    */
  var verticalGap: Double = js.native
  /**
    * Collapses the expanded row, if any.
    *
    * @param duration Duration in milliseconds of the optional animation.
    * @param easing Easing function of the optional animation.
    * @param apply
    */
  def collapseRow(duration: Double, easing: js.Function, apply: js.Any): Unit = js.native
  /**
    * Styles the CSS classes to the node that displays a cell.
    * By default this method is setting the following CSS classes:
    * - "dojoxCalendarToday" class name if the date displayed is the current date,
    * - "dojoxCalendarWeekend" if the date represents a weekend or
    * - "dojoxCalendarDayDisabled" if the date is out of the [refStartTime, refEndTime] interval.
    * - the CSS class corresponding of the displayed day of week ("Sun", "Mon" and so on).
    *
    * @param node The DOM node that displays the cell in the grid.
    * @param date The date displayed by this cell.
    * @param renderData The render data.
    */
  def defaultStyleGridCell(node: HTMLElement, date: Date, renderData: js.Object): Unit = js.native
  /**
    * Default action when an expand renderer is clicked.
    *
    * @param e The mouse event.
    * @param renderer The expand renderer.
    */
  def expandRendererClickHandler(e: Event_, renderer: js.Object): Unit = js.native
  /**
    * Expands the specified row.
    *
    * @param rowIndex The index of the row to expand.
    * @param colIndex               OptionalThe column index of the expand renderer that triggers the action, optional.
    * @param duration               OptionalDuration in milliseconds of the optional animation.
    * @param easing               OptionalEasing function of the optional animation.
    * @param apply
    */
  def expandRow(rowIndex: Double, colIndex: Double, duration: Double, easing: js.Function, apply: js.Any): Double = js.native
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
    * Returns the index of the expanded row or -1 if there's no row expanded.
    *
    */
  def getExpandedRowIndex(): Double = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_cellHeaderLongPattern(property: cellHeaderLongPattern): String = js.native
  @JSName("get")
  def get_cellHeaderShortPattern(property: cellHeaderShortPattern): String = js.native
  @JSName("get")
  def get_cellPaddingTop(property: cellPaddingTop): Double = js.native
  @JSName("get")
  def get_columnCount(property: columnCount): Double = js.native
  @JSName("get")
  def get_expandDuration(property: expandDuration): Double = js.native
  @JSName("get")
  def get_expandEasing(property: expandEasing): js.Function = js.native
  @JSName("get")
  def get_expandRenderer(property: expandRenderer): js.Object = js.native
  @JSName("get")
  def get_expandRendererHeight(property: expandRendererHeight): Double = js.native
  @JSName("get")
  def get_horizontalRenderer(property: horizontalRenderer): js.Object = js.native
  @JSName("get")
  def get_horizontalRendererHeight(property: horizontalRendererHeight): Double = js.native
  @JSName("get")
  def get_labelRenderer(property: labelRenderer): js.Object = js.native
  @JSName("get")
  def get_labelRendererHeight(property: labelRendererHeight): Double = js.native
  @JSName("get")
  def get_layoutDuringResize(property: layoutDuringResize): Boolean = js.native
  @JSName("get")
  def get_naturalRowsHeight(property: naturalRowsHeight): js.Object = js.native
  @JSName("get")
  def get_percentOverlap(property: percentOverlap): Double = js.native
  @JSName("get")
  def get_refEndTime(property: refEndTime): js.Object = js.native
  @JSName("get")
  def get_refStartTime(property: refStartTime): js.Object = js.native
  @JSName("get")
  def get_renderData(property: renderData): js.Object = js.native
  @JSName("get")
  def get_resizeAnimationDuration(property: resizeAnimationDuration): Double = js.native
  @JSName("get")
  def get_roundToDay(property: roundToDay): Boolean = js.native
  @JSName("get")
  def get_rowCount(property: rowCount): Double = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_showCellLabel(property: showCellLabel): Boolean = js.native
  @JSName("get")
  def get_startDate(property: startDate): Date = js.native
  @JSName("get")
  def get_styleGridCellFunc(property: styleGridCellFunc): js.Function = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  @JSName("get")
  def get_triggerExtent(property: triggerExtent): Double = js.native
  @JSName("get")
  def get_verticalGap(property: verticalGap): Double = js.native
  /**
    * Event dispatched at the end of an expand or collapse animation.
    *
    * @param expand Whether the finished animation was an expand or a collapse animation.
    */
  def onExpandAnimationEnd(expand: Boolean): Unit = js.native
  /**
    * Event dispatched when an expand renderer is clicked.
    *
    * @param e Expand renderer click event.
    */
  def onExpandRendererClick(e: js.Object): Unit = js.native
  /**
    * Event dispatched when a row header cell is clicked.
    *
    * @param e Header click event.
    */
  def onRowHeaderClick(e: js.Object): Unit = js.native
  def resize(e: js.Any): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_cellHeaderLongPattern(property: cellHeaderLongPattern, value: String): Unit = js.native
  @JSName("set")
  def set_cellHeaderShortPattern(property: cellHeaderShortPattern, value: String): Unit = js.native
  @JSName("set")
  def set_cellPaddingTop(property: cellPaddingTop, value: Double): Unit = js.native
  @JSName("set")
  def set_columnCount(property: columnCount, value: Double): Unit = js.native
  @JSName("set")
  def set_expandDuration(property: expandDuration, value: Double): Unit = js.native
  @JSName("set")
  def set_expandEasing(property: expandEasing, value: js.Function): Unit = js.native
  @JSName("set")
  def set_expandRenderer(property: expandRenderer, value: js.Object): Unit = js.native
  @JSName("set")
  def set_expandRendererHeight(property: expandRendererHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_horizontalRenderer(property: horizontalRenderer, value: js.Object): Unit = js.native
  @JSName("set")
  def set_horizontalRendererHeight(property: horizontalRendererHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_labelRenderer(property: labelRenderer, value: js.Object): Unit = js.native
  @JSName("set")
  def set_labelRendererHeight(property: labelRendererHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_layoutDuringResize(property: layoutDuringResize, value: Boolean): Unit = js.native
  @JSName("set")
  def set_naturalRowsHeight(property: naturalRowsHeight, value: js.Object): Unit = js.native
  @JSName("set")
  def set_percentOverlap(property: percentOverlap, value: Double): Unit = js.native
  @JSName("set")
  def set_refEndTime(property: refEndTime, value: js.Object): Unit = js.native
  @JSName("set")
  def set_refStartTime(property: refStartTime, value: js.Object): Unit = js.native
  @JSName("set")
  def set_renderData(property: renderData, value: js.Object): Unit = js.native
  @JSName("set")
  def set_resizeAnimationDuration(property: resizeAnimationDuration, value: Double): Unit = js.native
  @JSName("set")
  def set_roundToDay(property: roundToDay, value: Boolean): Unit = js.native
  @JSName("set")
  def set_rowCount(property: rowCount, value: Double): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_showCellLabel(property: showCellLabel, value: Boolean): Unit = js.native
  @JSName("set")
  def set_startDate(property: startDate, value: Date): Unit = js.native
  @JSName("set")
  def set_styleGridCellFunc(property: styleGridCellFunc, value: js.Function): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("set")
  def set_triggerExtent(property: triggerExtent, value: Double): Unit = js.native
  @JSName("set")
  def set_verticalGap(property: verticalGap, value: Double): Unit = js.native
  /**
    * Styles the CSS classes to the node that displays a column header cell.
    * By default this method is setting the "dojoxCalendarWeekend" if the day of week represents a weekend.
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
    * @param date The date displayed by this cell.
    * @param renderData The render data.
    */
  def styleGridCell(node: HTMLElement, date: Date, renderData: js.Object): Unit = js.native
  /**
    * Styles the CSS classes to the node that displays a row header cell.
    * By default this method is doing nothing.
    *
    * @param node The DOM node that displays the column in the grid.
    * @param date The date in the week.
    * @param renderData The render data.
    */
  def styleRowHeaderCell(node: HTMLElement, date: Date, renderData: js.Object): Unit = js.native
  @JSName("watch")
  def watch_attachScope(
    property: attachScope,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_cellHeaderLongPattern(
    property: cellHeaderLongPattern,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_cellHeaderShortPattern(
    property: cellHeaderShortPattern,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_cellPaddingTop(
    property: cellPaddingTop,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_columnCount(
    property: columnCount,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_expandDuration(
    property: expandDuration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_expandEasing(
    property: expandEasing,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Function], 
      /* newValue */ js.UndefOr[js.Function], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_expandRenderer(
    property: expandRenderer,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_expandRendererHeight(
    property: expandRendererHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_horizontalRenderer(
    property: horizontalRenderer,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_horizontalRendererHeight(
    property: horizontalRendererHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_labelRenderer(
    property: labelRenderer,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_labelRendererHeight(
    property: labelRendererHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_layoutDuringResize(
    property: layoutDuringResize,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_naturalRowsHeight(
    property: naturalRowsHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_percentOverlap(
    property: percentOverlap,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_refEndTime(
    property: refEndTime,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_refStartTime(
    property: refStartTime,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_renderData(
    property: renderData,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_resizeAnimationDuration(
    property: resizeAnimationDuration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_roundToDay(
    property: roundToDay,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_rowCount(
    property: rowCount,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(
    property: searchContainerNode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_showCellLabel(
    property: showCellLabel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_startDate(
    property: startDate,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Date], 
      /* newValue */ js.UndefOr[Date], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_styleGridCellFunc(
    property: styleGridCellFunc,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Function], 
      /* newValue */ js.UndefOr[js.Function], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_templatePath(
    property: templatePath,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_templateString(
    property: templateString,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_triggerExtent(
    property: triggerExtent,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_verticalGap(
    property: verticalGap,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

