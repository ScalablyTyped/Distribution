package typings.fixedDataTable2.mod

import typings.fixedDataTable2.fixedDataTable2Strings.auto
import typings.fixedDataTable2.fixedDataTable2Strings.hidden
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactElement
import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableProps extends ClassAttributes[Table] {
  
  /**
    * The number of rows outside the viewport to prerender. Defaults to roughly
    * half of the number of visible rows.
    */
  var bufferRowCount: js.UndefOr[Double] = js.native
  
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
  var cellGroupWrapperHeight: js.UndefOr[Double] = js.native
  
  /**
    * Class name to be passed into parent container
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Pixel height of footer.
    */
  var footerHeight: js.UndefOr[Double] = js.native
  
  /**
    * Pixel height of the column group header.
    */
  var groupHeaderHeight: js.UndefOr[Double] = js.native
  
  /**
    * Pixel height of header.
    */
  var headerHeight: Double = js.native
  
  /**
    * Pixel height of table. If all rows do not fit,
    * a vertical scrollbar will appear.
    *
    * Either `height` or `maxHeight` must be specified.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Whether columns are currently being reordered.
    */
  var isColumnReordering: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether a column is currently being resized.
    */
  var isColumnResizing: js.UndefOr[Boolean] = js.native
  
  /** Boolean flags to control if scrolling with keys is enabled */
  var keyboardPageEnabled: js.UndefOr[Boolean] = js.native
  
  /** Boolean flags to control if scrolling with keys is enabled */
  var keyboardScrollEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum pixel height of table. If all rows do not fit,
    * a vertical scrollbar will appear.
    *
    * Either `height` or `maxHeight` must be specified.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  
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
  var onColumnReorderEndCallback: js.UndefOr[js.Function1[/* event */ ColumnReorderEndEvent, Unit]] = js.native
  
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
  var onColumnResizeEndCallback: js.UndefOr[js.Function2[/* newColumnWidth */ Double, /* columnKey */ String, Unit]] = js.native
  
  /**
    * Callback that is called when `rowHeightGetter` returns a different height
    * for a row than the `rowHeight` prop. This is necessary because initially
    * table estimates heights of some parts of the content.
    */
  var onContentHeightChange: js.UndefOr[js.Function1[/* newHeight */ Double, Unit]] = js.native
  
  /**
    * Callback when horizontally scrolling the grid.
    *
    * Return false to stop propagation.
    */
  var onHorizontalScroll: js.UndefOr[js.Function1[/* scrollPos */ Double, Boolean]] = js.native
  
  /**
    * Callback that is called when a row is clicked.
    */
  var onRowClick: js.UndefOr[TableRowEventHandler] = js.native
  
  /**
    * Callback that is called when a row is double clicked.
    */
  var onRowDoubleClick: js.UndefOr[TableRowEventHandler] = js.native
  
  /**
    * Callback that is called when a mouse-down event happens on a row.
    */
  var onRowMouseDown: js.UndefOr[TableRowEventHandler] = js.native
  
  /**
    * Callback that is called when a mouse-enter event happens on a row.
    */
  var onRowMouseEnter: js.UndefOr[TableRowEventHandler] = js.native
  
  /**
    * Callback that is called when a mouse-leave event happens on a row.
    */
  var onRowMouseLeave: js.UndefOr[TableRowEventHandler] = js.native
  
  /**
    * Callback that is called when a mouse-up event happens on a row.
    */
  var onRowMouseUp: js.UndefOr[TableRowEventHandler] = js.native
  
  /**
    * Callback that is called when a touch-end event happens on a row.
    */
  var onRowTouchEnd: js.UndefOr[TableRowEventHandler] = js.native
  
  /**
    * Callback that is called when a touch-move event happens on a row.
    */
  var onRowTouchMove: js.UndefOr[TableRowEventHandler] = js.native
  
  /**
    * Callback that is called when a touch-start event happens on a row.
    */
  var onRowTouchStart: js.UndefOr[TableRowEventHandler] = js.native
  
  /**
    * Callback that is called when scrolling ends or stops with new horizontal
    * and vertical scroll values.
    */
  var onScrollEnd: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.native
  
  /**
    * Callback that is called when scrolling starts with current horizontal
    * and vertical scroll values.
    */
  var onScrollStart: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.native
  
  /**
    * Callback when vertically scrolling the grid.
    *
    * Return false to stop propagation.
    */
  var onVerticalScroll: js.UndefOr[js.Function1[/* scrollPos */ Double, Boolean]] = js.native
  
  var overflowX: js.UndefOr[hidden | auto] = js.native
  
  var overflowY: js.UndefOr[hidden | auto] = js.native
  
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
  var ownerHeight: js.UndefOr[Double] = js.native
  
  /**
    * To get any additional CSS classes that should be added to a row,
    * `rowClassNameGetter(index)` is called.
    */
  var rowClassNameGetter: js.UndefOr[js.Function1[/* index */ Double, String]] = js.native
  
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
  var rowExpanded: js.UndefOr[ElementOrFunc[RowProps]] = js.native
  
  /**
    * Pixel height of rows unless `rowHeightGetter` is specified and returns
    * different value.
    */
  var rowHeight: Double = js.native
  
  /**
    * If specified, `rowHeightGetter(index)` is called for each row and the
    * returned value overrides `rowHeight` for particular row.
    */
  var rowHeightGetter: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.native
  
  /**
    * If specified, `rowKeyGetter(index)` is called for each row and the
    * returned value overrides `key` for the particular row.
    */
  var rowKeyGetter: js.UndefOr[js.Function1[/* index */ Double, String]] = js.native
  
  /**
    * Number of rows in the table.
    */
  var rowsCount: Double = js.native
  
  /**
    * Value of horizontal scroll.
    */
  var scrollLeft: js.UndefOr[Double] = js.native
  
  /**
    * Index of column to scroll to.
    */
  var scrollToColumn: js.UndefOr[Double] = js.native
  
  /**
    * Index of row to scroll to.
    */
  var scrollToRow: js.UndefOr[Double] = js.native
  
  /**
    * Value of vertical scroll.
    */
  var scrollTop: js.UndefOr[Double] = js.native
  
  /** Hide the scrollbar but still enable scroll functionality */
  var showScrollbarX: js.UndefOr[Boolean] = js.native
  
  /** Hide the scrollbar but still enable scroll functionality */
  var showScrollbarY: js.UndefOr[Boolean] = js.native
  
  /**
    * If enabled scroll events will not be propagated outside of the table.
    */
  var stopScrollPropagation: js.UndefOr[Boolean] = js.native
  
  /**
    * Pixel height of sub-row unless `subRowHeightGetter` is specified and returns
    * different value.  Defaults to 0 and no sub-row being displayed.
    */
  var subRowHeight: js.UndefOr[Double] = js.native
  
  /**
    * If specified, `subRowHeightGetter(index)` is called for each row and the
    * returned value overrides `subRowHeight` for particular row.
    */
  var subRowHeightGetter: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.native
  
  /**
    * Boolean flag indicating of touch scrolling should be enabled
    * This feature is current in beta and may have bugs
    */
  var touchScrollEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Pixel width of table. If all columns do not fit,
    * a horizontal scrollbar will appear.
    */
  var width: Double = js.native
}
object TableProps {
  
  @scala.inline
  def apply(headerHeight: Double, rowHeight: Double, rowsCount: Double, width: Double): TableProps = {
    val __obj = js.Dynamic.literal(headerHeight = headerHeight.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
  
  @scala.inline
  implicit class TablePropsOps[Self <: TableProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHeaderHeight(value: Double): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsCount(value: Double): Self = this.set("rowsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferRowCount(value: Double): Self = this.set("bufferRowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferRowCount: Self = this.set("bufferRowCount", js.undefined)
    
    @scala.inline
    def setCellGroupWrapperHeight(value: Double): Self = this.set("cellGroupWrapperHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellGroupWrapperHeight: Self = this.set("cellGroupWrapperHeight", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setFooterHeight(value: Double): Self = this.set("footerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterHeight: Self = this.set("footerHeight", js.undefined)
    
    @scala.inline
    def setGroupHeaderHeight(value: Double): Self = this.set("groupHeaderHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupHeaderHeight: Self = this.set("groupHeaderHeight", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIsColumnReordering(value: Boolean): Self = this.set("isColumnReordering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsColumnReordering: Self = this.set("isColumnReordering", js.undefined)
    
    @scala.inline
    def setIsColumnResizing(value: Boolean): Self = this.set("isColumnResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsColumnResizing: Self = this.set("isColumnResizing", js.undefined)
    
    @scala.inline
    def setKeyboardPageEnabled(value: Boolean): Self = this.set("keyboardPageEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardPageEnabled: Self = this.set("keyboardPageEnabled", js.undefined)
    
    @scala.inline
    def setKeyboardScrollEnabled(value: Boolean): Self = this.set("keyboardScrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardScrollEnabled: Self = this.set("keyboardScrollEnabled", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setOnColumnReorderEndCallback(value: /* event */ ColumnReorderEndEvent => Unit): Self = this.set("onColumnReorderEndCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnColumnReorderEndCallback: Self = this.set("onColumnReorderEndCallback", js.undefined)
    
    @scala.inline
    def setOnColumnResizeEndCallback(value: (/* newColumnWidth */ Double, /* columnKey */ String) => Unit): Self = this.set("onColumnResizeEndCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnColumnResizeEndCallback: Self = this.set("onColumnResizeEndCallback", js.undefined)
    
    @scala.inline
    def setOnContentHeightChange(value: /* newHeight */ Double => Unit): Self = this.set("onContentHeightChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentHeightChange: Self = this.set("onContentHeightChange", js.undefined)
    
    @scala.inline
    def setOnHorizontalScroll(value: /* scrollPos */ Double => Boolean): Self = this.set("onHorizontalScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHorizontalScroll: Self = this.set("onHorizontalScroll", js.undefined)
    
    @scala.inline
    def setOnRowClick(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = this.set("onRowClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRowClick: Self = this.set("onRowClick", js.undefined)
    
    @scala.inline
    def setOnRowDoubleClick(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = this.set("onRowDoubleClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRowDoubleClick: Self = this.set("onRowDoubleClick", js.undefined)
    
    @scala.inline
    def setOnRowMouseDown(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = this.set("onRowMouseDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRowMouseDown: Self = this.set("onRowMouseDown", js.undefined)
    
    @scala.inline
    def setOnRowMouseEnter(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = this.set("onRowMouseEnter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRowMouseEnter: Self = this.set("onRowMouseEnter", js.undefined)
    
    @scala.inline
    def setOnRowMouseLeave(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = this.set("onRowMouseLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRowMouseLeave: Self = this.set("onRowMouseLeave", js.undefined)
    
    @scala.inline
    def setOnRowMouseUp(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = this.set("onRowMouseUp", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRowMouseUp: Self = this.set("onRowMouseUp", js.undefined)
    
    @scala.inline
    def setOnRowTouchEnd(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = this.set("onRowTouchEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRowTouchEnd: Self = this.set("onRowTouchEnd", js.undefined)
    
    @scala.inline
    def setOnRowTouchMove(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = this.set("onRowTouchMove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRowTouchMove: Self = this.set("onRowTouchMove", js.undefined)
    
    @scala.inline
    def setOnRowTouchStart(value: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit): Self = this.set("onRowTouchStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRowTouchStart: Self = this.set("onRowTouchStart", js.undefined)
    
    @scala.inline
    def setOnScrollEnd(value: (/* x */ Double, /* y */ Double) => Unit): Self = this.set("onScrollEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnScrollEnd: Self = this.set("onScrollEnd", js.undefined)
    
    @scala.inline
    def setOnScrollStart(value: (/* x */ Double, /* y */ Double) => Unit): Self = this.set("onScrollStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnScrollStart: Self = this.set("onScrollStart", js.undefined)
    
    @scala.inline
    def setOnVerticalScroll(value: /* scrollPos */ Double => Boolean): Self = this.set("onVerticalScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnVerticalScroll: Self = this.set("onVerticalScroll", js.undefined)
    
    @scala.inline
    def setOverflowX(value: hidden | auto): Self = this.set("overflowX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowX: Self = this.set("overflowX", js.undefined)
    
    @scala.inline
    def setOverflowY(value: hidden | auto): Self = this.set("overflowY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowY: Self = this.set("overflowY", js.undefined)
    
    @scala.inline
    def setOwnerHeight(value: Double): Self = this.set("ownerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerHeight: Self = this.set("ownerHeight", js.undefined)
    
    @scala.inline
    def setRowClassNameGetter(value: /* index */ Double => String): Self = this.set("rowClassNameGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowClassNameGetter: Self = this.set("rowClassNameGetter", js.undefined)
    
    @scala.inline
    def setRowExpandedFunction1(value: RowProps => String | ReactElement): Self = this.set("rowExpanded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRowExpanded(value: ElementOrFunc[RowProps]): Self = this.set("rowExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowExpanded: Self = this.set("rowExpanded", js.undefined)
    
    @scala.inline
    def setRowHeightGetter(value: /* index */ Double => Double): Self = this.set("rowHeightGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowHeightGetter: Self = this.set("rowHeightGetter", js.undefined)
    
    @scala.inline
    def setRowKeyGetter(value: /* index */ Double => String): Self = this.set("rowKeyGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowKeyGetter: Self = this.set("rowKeyGetter", js.undefined)
    
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollLeft: Self = this.set("scrollLeft", js.undefined)
    
    @scala.inline
    def setScrollToColumn(value: Double): Self = this.set("scrollToColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToColumn: Self = this.set("scrollToColumn", js.undefined)
    
    @scala.inline
    def setScrollToRow(value: Double): Self = this.set("scrollToRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToRow: Self = this.set("scrollToRow", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollTop: Self = this.set("scrollTop", js.undefined)
    
    @scala.inline
    def setShowScrollbarX(value: Boolean): Self = this.set("showScrollbarX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowScrollbarX: Self = this.set("showScrollbarX", js.undefined)
    
    @scala.inline
    def setShowScrollbarY(value: Boolean): Self = this.set("showScrollbarY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowScrollbarY: Self = this.set("showScrollbarY", js.undefined)
    
    @scala.inline
    def setStopScrollPropagation(value: Boolean): Self = this.set("stopScrollPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopScrollPropagation: Self = this.set("stopScrollPropagation", js.undefined)
    
    @scala.inline
    def setSubRowHeight(value: Double): Self = this.set("subRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubRowHeight: Self = this.set("subRowHeight", js.undefined)
    
    @scala.inline
    def setSubRowHeightGetter(value: /* index */ Double => Double): Self = this.set("subRowHeightGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSubRowHeightGetter: Self = this.set("subRowHeightGetter", js.undefined)
    
    @scala.inline
    def setTouchScrollEnabled(value: Boolean): Self = this.set("touchScrollEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchScrollEnabled: Self = this.set("touchScrollEnabled", js.undefined)
  }
}
