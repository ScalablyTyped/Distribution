package typings.fixedDashDataDashTableDash2.fixedDashDataDashTableDash2Mod

import typings.fixedDashDataDashTableDash2.fixedDashDataDashTableDash2Strings.auto
import typings.fixedDashDataDashTableDash2.fixedDashDataDashTableDash2Strings.hidden
import typings.react.Event
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps extends ClassAttributes[Table] {
  /**
    * The number of rows outside the viewport to prerender. Defaults to roughly
    * half of the number of visible rows.
    */
  var bufferRowCount: js.UndefOr[Double] = js.undefined
  /**
    * Pixel height of fixedDataTableCellGroupLayout/cellGroupWrapper.
    * Default is headerHeight and groupHeaderHeight.
    *
    * This can be used with CSS to make a header cell span both the group & normal header row.
    * Setting this to a value larger than height will cause the content to
    * overflow the height. This is useful when adding a 2nd table as the group
    * header and vertically merging the 2 headers when a column is not part
    * of a group. Here are the necessary CSS changes:
    *
    * Both headers:
    *  - cellGroupWrapper needs overflow-x: hidden and pointer-events: none
    *  - cellGroup needs pointer-events: auto to reenable them on child els
    * Group header:
    *  - Layout/main needs overflow: visible and a higher z-index
    *  - CellLayout/main needs overflow-y: visible
    *  - cellGroup needs overflow: visible
    */
  var cellGroupWrapperHeight: js.UndefOr[Double] = js.undefined
  /**
    * Class name to be passed into parent container
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Pixel height of footer.
    */
  var footerHeight: js.UndefOr[Double] = js.undefined
  /**
    * Pixel height of the column group header.
    */
  var groupHeaderHeight: js.UndefOr[Double] = js.undefined
  /**
    * Pixel height of header.
    */
  var headerHeight: Double
  /**
    * Pixel height of table. If all rows do not fit,
    * a vertical scrollbar will appear.
    *
    * Either `height` or `maxHeight` must be specified.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Whether columns are currently being reordered.
    */
  var isColumnReordering: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether a column is currently being resized.
    */
  var isColumnResizing: js.UndefOr[Boolean] = js.undefined
  /** Boolean flags to control if scrolling with keys is enabled */
  var keyboardPageEnabled: js.UndefOr[Boolean] = js.undefined
  /** Boolean flags to control if scrolling with keys is enabled */
  var keyboardScrollEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum pixel height of table. If all rows do not fit,
    * a vertical scrollbar will appear.
    *
    * Either `height` or `maxHeight` must be specified.
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /**
    * Callback that is called when reordering has been completed
    * and columns need to be updated.
    *
    * ```
    * function(
    *   event {
    *     columnBefore: string|undefined, // the column before the new location of this one
    *     columnAfter: string|undefined,  // the column after the new location of this one
    *     reorderColumn: string,          // the column key that was just reordered
    *   }
    * )
    * ```
    */
  var onColumnReorderEndCallback: js.UndefOr[js.Function1[/* event */ ColumnReorderEndEvent, Unit]] = js.undefined
  /**
    * Callback that is called when resizer has been released
    * and column needs to be updated.
    *
    * Required if the isResizable property is true on any column.
    *
    * ```
    * function(
    *   newColumnWidth: number,
    *   columnKey: string,
    * )
    * ```
    */
  var onColumnResizeEndCallback: js.UndefOr[js.Function2[/* newColumnWidth */ Double, /* columnKey */ String, Unit]] = js.undefined
  /**
    * Callback that is called when `rowHeightGetter` returns a different height
    * for a row than the `rowHeight` prop. This is necessary because initially
    * table estimates heights of some parts of the content.
    */
  var onContentHeightChange: js.UndefOr[js.Function1[/* newHeight */ Double, Unit]] = js.undefined
  /**
    * Callback when horizontally scrolling the grid.
    *
    * Return false to stop propagation.
    */
  var onHorizontalScroll: js.UndefOr[js.Function1[/* scrollPos */ Double, Boolean]] = js.undefined
  /**
    * Callback that is called when a row is clicked.
    */
  var onRowClick: js.UndefOr[TableRowEventHandler] = js.undefined
  /**
    * Callback that is called when a row is double clicked.
    */
  var onRowDoubleClick: js.UndefOr[TableRowEventHandler] = js.undefined
  /**
    * Callback that is called when a mouse-down event happens on a row.
    */
  var onRowMouseDown: js.UndefOr[TableRowEventHandler] = js.undefined
  /**
    * Callback that is called when a mouse-enter event happens on a row.
    */
  var onRowMouseEnter: js.UndefOr[TableRowEventHandler] = js.undefined
  /**
    * Callback that is called when a mouse-leave event happens on a row.
    */
  var onRowMouseLeave: js.UndefOr[TableRowEventHandler] = js.undefined
  /**
    * Callback that is called when a mouse-up event happens on a row.
    */
  var onRowMouseUp: js.UndefOr[TableRowEventHandler] = js.undefined
  /**
    * Callback that is called when a touch-end event happens on a row.
    */
  var onRowTouchEnd: js.UndefOr[TableRowEventHandler] = js.undefined
  /**
    * Callback that is called when a touch-move event happens on a row.
    */
  var onRowTouchMove: js.UndefOr[TableRowEventHandler] = js.undefined
  /**
    * Callback that is called when a touch-start event happens on a row.
    */
  var onRowTouchStart: js.UndefOr[TableRowEventHandler] = js.undefined
  /**
    * Callback that is called when scrolling ends or stops with new horizontal
    * and vertical scroll values.
    */
  var onScrollEnd: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.undefined
  /**
    * Callback that is called when scrolling starts with current horizontal
    * and vertical scroll values.
    */
  var onScrollStart: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.undefined
  /**
    * Callback when vertically scrolling the grid.
    *
    * Return false to stop propagation.
    */
  var onVerticalScroll: js.UndefOr[js.Function1[/* scrollPos */ Double, Boolean]] = js.undefined
  var overflowX: js.UndefOr[hidden | auto] = js.undefined
  var overflowY: js.UndefOr[hidden | auto] = js.undefined
  /**
    * Pixel height of table's owner, this is used in a managed scrolling
    * situation when you want to slide the table up from below the fold
    * without having to constantly update the height on every scroll tick.
    * Instead, vary this property on scroll. By using `ownerHeight`, we
    * over-render the table while making sure the footer and horizontal
    * scrollbar of the table are visible when the current space for the table
    * in view is smaller than the final, over-flowing height of table. It
    * allows us to avoid resizing and reflowing table when it is moving in the
    * view.
    *
    * This is used if `ownerHeight < height` (or `maxHeight`).
    */
  var ownerHeight: js.UndefOr[Double] = js.undefined
  /**
    * To get any additional CSS classes that should be added to a row,
    * `rowClassNameGetter(index)` is called.
    */
  var rowClassNameGetter: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
  /**
    * The row expanded for table row.
    * This can either be a React element, or a function that generates
    * a React Element. By default, the React element passed in can expect to
    * receive the following props:
    *
    * ```
    * props: {
    *   rowIndex; number // (the row index)
    *   height: number // (supplied from the Table or rowHeightGetter)
    *   width: number // (supplied from the Table)
    * }
    * ```
    *
    * Because you are passing in your own React element, you can feel free to
    * pass in whatever props you may want or need.
    *
    * If you pass in a function, you will receive the same props object as the
    * first argument.
    */
  var rowExpanded: js.UndefOr[ElementOrFunc[RowProps]] = js.undefined
  /**
    * Pixel height of rows unless `rowHeightGetter` is specified and returns
    * different value.
    */
  var rowHeight: Double
  /**
    * If specified, `rowHeightGetter(index)` is called for each row and the
    * returned value overrides `rowHeight` for particular row.
    */
  var rowHeightGetter: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.undefined
  /**
    * If specified, `rowKeyGetter(index)` is called for each row and the
    * returned value overrides `key` for the particular row.
    */
  var rowKeyGetter: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
  /**
    * Number of rows in the table.
    */
  var rowsCount: Double
  /**
    * Value of horizontal scroll.
    */
  var scrollLeft: js.UndefOr[Double] = js.undefined
  /**
    * Index of column to scroll to.
    */
  var scrollToColumn: js.UndefOr[Double] = js.undefined
  /**
    * Index of row to scroll to.
    */
  var scrollToRow: js.UndefOr[Double] = js.undefined
  /**
    * Value of vertical scroll.
    */
  var scrollTop: js.UndefOr[Double] = js.undefined
  /** Hide the scrollbar but still enable scroll functionality */
  var showScrollbarX: js.UndefOr[Boolean] = js.undefined
  /** Hide the scrollbar but still enable scroll functionality */
  var showScrollbarY: js.UndefOr[Boolean] = js.undefined
  /**
    * If enabled scroll events will not be propagated outside of the table.
    */
  var stopScrollPropagation: js.UndefOr[Boolean] = js.undefined
  /**
    * Pixel height of sub-row unless `subRowHeightGetter` is specified and returns
    * different value.  Defaults to 0 and no sub-row being displayed.
    */
  var subRowHeight: js.UndefOr[Double] = js.undefined
  /**
    * If specified, `subRowHeightGetter(index)` is called for each row and the
    * returned value overrides `subRowHeight` for particular row.
    */
  var subRowHeightGetter: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.undefined
  /**
    * Boolean flag indicating of touch scrolling should be enabled
    * This feature is current in beta and may have bugs
    */
  var touchScrollEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Pixel width of table. If all columns do not fit,
    * a horizontal scrollbar will appear.
    */
  var width: Double
}

object TableProps {
  @scala.inline
  def apply(
    headerHeight: Double,
    rowHeight: Double,
    rowsCount: Double,
    width: Double,
    bufferRowCount: Int | Double = null,
    cellGroupWrapperHeight: Int | Double = null,
    className: String = null,
    footerHeight: Int | Double = null,
    groupHeaderHeight: Int | Double = null,
    height: Int | Double = null,
    isColumnReordering: js.UndefOr[Boolean] = js.undefined,
    isColumnResizing: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    keyboardPageEnabled: js.UndefOr[Boolean] = js.undefined,
    keyboardScrollEnabled: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Int | Double = null,
    onColumnReorderEndCallback: /* event */ ColumnReorderEndEvent => Unit = null,
    onColumnResizeEndCallback: (/* newColumnWidth */ Double, /* columnKey */ String) => Unit = null,
    onContentHeightChange: /* newHeight */ Double => Unit = null,
    onHorizontalScroll: /* scrollPos */ Double => Boolean = null,
    onRowClick: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit = null,
    onRowDoubleClick: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit = null,
    onRowMouseDown: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit = null,
    onRowMouseEnter: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit = null,
    onRowMouseLeave: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit = null,
    onRowMouseUp: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit = null,
    onRowTouchEnd: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit = null,
    onRowTouchMove: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit = null,
    onRowTouchStart: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit = null,
    onScrollEnd: (/* x */ Double, /* y */ Double) => Unit = null,
    onScrollStart: (/* x */ Double, /* y */ Double) => Unit = null,
    onVerticalScroll: /* scrollPos */ Double => Boolean = null,
    overflowX: hidden | auto = null,
    overflowY: hidden | auto = null,
    ownerHeight: Int | Double = null,
    ref: LegacyRef[Table] = null,
    rowClassNameGetter: /* index */ Double => String = null,
    rowExpanded: ElementOrFunc[RowProps] = null,
    rowHeightGetter: /* index */ Double => Double = null,
    rowKeyGetter: /* index */ Double => String = null,
    scrollLeft: Int | Double = null,
    scrollToColumn: Int | Double = null,
    scrollToRow: Int | Double = null,
    scrollTop: Int | Double = null,
    showScrollbarX: js.UndefOr[Boolean] = js.undefined,
    showScrollbarY: js.UndefOr[Boolean] = js.undefined,
    stopScrollPropagation: js.UndefOr[Boolean] = js.undefined,
    subRowHeight: Int | Double = null,
    subRowHeightGetter: /* index */ Double => Double = null,
    touchScrollEnabled: js.UndefOr[Boolean] = js.undefined
  ): TableProps = {
    val __obj = js.Dynamic.literal(headerHeight = headerHeight, rowHeight = rowHeight, rowsCount = rowsCount, width = width)
    if (bufferRowCount != null) __obj.updateDynamic("bufferRowCount")(bufferRowCount.asInstanceOf[js.Any])
    if (cellGroupWrapperHeight != null) __obj.updateDynamic("cellGroupWrapperHeight")(cellGroupWrapperHeight.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (footerHeight != null) __obj.updateDynamic("footerHeight")(footerHeight.asInstanceOf[js.Any])
    if (groupHeaderHeight != null) __obj.updateDynamic("groupHeaderHeight")(groupHeaderHeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isColumnReordering)) __obj.updateDynamic("isColumnReordering")(isColumnReordering)
    if (!js.isUndefined(isColumnResizing)) __obj.updateDynamic("isColumnResizing")(isColumnResizing)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardPageEnabled)) __obj.updateDynamic("keyboardPageEnabled")(keyboardPageEnabled)
    if (!js.isUndefined(keyboardScrollEnabled)) __obj.updateDynamic("keyboardScrollEnabled")(keyboardScrollEnabled)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (onColumnReorderEndCallback != null) __obj.updateDynamic("onColumnReorderEndCallback")(js.Any.fromFunction1(onColumnReorderEndCallback))
    if (onColumnResizeEndCallback != null) __obj.updateDynamic("onColumnResizeEndCallback")(js.Any.fromFunction2(onColumnResizeEndCallback))
    if (onContentHeightChange != null) __obj.updateDynamic("onContentHeightChange")(js.Any.fromFunction1(onContentHeightChange))
    if (onHorizontalScroll != null) __obj.updateDynamic("onHorizontalScroll")(js.Any.fromFunction1(onHorizontalScroll))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2(onRowClick))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction2(onRowDoubleClick))
    if (onRowMouseDown != null) __obj.updateDynamic("onRowMouseDown")(js.Any.fromFunction2(onRowMouseDown))
    if (onRowMouseEnter != null) __obj.updateDynamic("onRowMouseEnter")(js.Any.fromFunction2(onRowMouseEnter))
    if (onRowMouseLeave != null) __obj.updateDynamic("onRowMouseLeave")(js.Any.fromFunction2(onRowMouseLeave))
    if (onRowMouseUp != null) __obj.updateDynamic("onRowMouseUp")(js.Any.fromFunction2(onRowMouseUp))
    if (onRowTouchEnd != null) __obj.updateDynamic("onRowTouchEnd")(js.Any.fromFunction2(onRowTouchEnd))
    if (onRowTouchMove != null) __obj.updateDynamic("onRowTouchMove")(js.Any.fromFunction2(onRowTouchMove))
    if (onRowTouchStart != null) __obj.updateDynamic("onRowTouchStart")(js.Any.fromFunction2(onRowTouchStart))
    if (onScrollEnd != null) __obj.updateDynamic("onScrollEnd")(js.Any.fromFunction2(onScrollEnd))
    if (onScrollStart != null) __obj.updateDynamic("onScrollStart")(js.Any.fromFunction2(onScrollStart))
    if (onVerticalScroll != null) __obj.updateDynamic("onVerticalScroll")(js.Any.fromFunction1(onVerticalScroll))
    if (overflowX != null) __obj.updateDynamic("overflowX")(overflowX.asInstanceOf[js.Any])
    if (overflowY != null) __obj.updateDynamic("overflowY")(overflowY.asInstanceOf[js.Any])
    if (ownerHeight != null) __obj.updateDynamic("ownerHeight")(ownerHeight.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (rowClassNameGetter != null) __obj.updateDynamic("rowClassNameGetter")(js.Any.fromFunction1(rowClassNameGetter))
    if (rowExpanded != null) __obj.updateDynamic("rowExpanded")(rowExpanded.asInstanceOf[js.Any])
    if (rowHeightGetter != null) __obj.updateDynamic("rowHeightGetter")(js.Any.fromFunction1(rowHeightGetter))
    if (rowKeyGetter != null) __obj.updateDynamic("rowKeyGetter")(js.Any.fromFunction1(rowKeyGetter))
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollToColumn != null) __obj.updateDynamic("scrollToColumn")(scrollToColumn.asInstanceOf[js.Any])
    if (scrollToRow != null) __obj.updateDynamic("scrollToRow")(scrollToRow.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (!js.isUndefined(showScrollbarX)) __obj.updateDynamic("showScrollbarX")(showScrollbarX)
    if (!js.isUndefined(showScrollbarY)) __obj.updateDynamic("showScrollbarY")(showScrollbarY)
    if (!js.isUndefined(stopScrollPropagation)) __obj.updateDynamic("stopScrollPropagation")(stopScrollPropagation)
    if (subRowHeight != null) __obj.updateDynamic("subRowHeight")(subRowHeight.asInstanceOf[js.Any])
    if (subRowHeightGetter != null) __obj.updateDynamic("subRowHeightGetter")(js.Any.fromFunction1(subRowHeightGetter))
    if (!js.isUndefined(touchScrollEnabled)) __obj.updateDynamic("touchScrollEnabled")(touchScrollEnabled)
    __obj.asInstanceOf[TableProps]
  }
}

