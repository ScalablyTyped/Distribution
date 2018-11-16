package typings
package fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TableProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[Table] {
  /**
       * The number of rows outside the viewport to prerender. Defaults to roughly
       * half of the number of visible rows.
       */
  var bufferRowCount: js.UndefOr[scala.Double] = js.undefined
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
  var cellGroupWrapperHeight: js.UndefOr[scala.Double] = js.undefined
  /**
       * Class name to be passed into parent container
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Pixel height of footer.
       */
  var footerHeight: js.UndefOr[scala.Double] = js.undefined
  /**
       * Pixel height of the column group header.
       */
  var groupHeaderHeight: js.UndefOr[scala.Double] = js.undefined
  /**
       * Pixel height of header.
       */
  var headerHeight: scala.Double
  /**
       * Pixel height of table. If all rows do not fit,
       * a vertical scrollbar will appear.
       *
       * Either `height` or `maxHeight` must be specified.
       */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
       * Whether columns are currently being reordered.
       */
  var isColumnReordering: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether a column is currently being resized.
       */
  var isColumnResizing: js.UndefOr[scala.Boolean] = js.undefined
  /** Boolean flags to control if scrolling with keys is enabled */
  var keyboardPageEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Boolean flags to control if scrolling with keys is enabled */
  var keyboardScrollEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Maximum pixel height of table. If all rows do not fit,
       * a vertical scrollbar will appear.
       *
       * Either `height` or `maxHeight` must be specified.
       */
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
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
  var onColumnReorderEndCallback: js.UndefOr[js.Function1[/* event */ ColumnReorderEndEvent, scala.Unit]] = js.undefined
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
  var onColumnResizeEndCallback: js.UndefOr[
    js.Function2[/* newColumnWidth */ scala.Double, /* columnKey */ java.lang.String, scala.Unit]
  ] = js.undefined
  /**
       * Callback that is called when `rowHeightGetter` returns a different height
       * for a row than the `rowHeight` prop. This is necessary because initially
       * table estimates heights of some parts of the content.
       */
  var onContentHeightChange: js.UndefOr[js.Function1[/* newHeight */ scala.Double, scala.Unit]] = js.undefined
  /**
       * Callback when horizontally scrolling the grid.
       *
       * Return false to stop propagation.
       */
  var onHorizontalScroll: js.UndefOr[js.Function1[/* scrollPos */ scala.Double, scala.Boolean]] = js.undefined
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
  var onScrollEnd: js.UndefOr[js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Unit]] = js.undefined
  /**
       * Callback that is called when scrolling starts with current horizontal
       * and vertical scroll values.
       */
  var onScrollStart: js.UndefOr[js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Unit]] = js.undefined
  /**
       * Callback when vertically scrolling the grid.
       *
       * Return false to stop propagation.
       */
  var onVerticalScroll: js.UndefOr[js.Function1[/* scrollPos */ scala.Double, scala.Boolean]] = js.undefined
  var overflowX: js.UndefOr[
    fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2LibStrings.hidden | fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2LibStrings.auto
  ] = js.undefined
  var overflowY: js.UndefOr[
    fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2LibStrings.hidden | fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2LibStrings.auto
  ] = js.undefined
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
  var ownerHeight: js.UndefOr[scala.Double] = js.undefined
  /**
       * To get any additional CSS classes that should be added to a row,
       * `rowClassNameGetter(index)` is called.
       */
  var rowClassNameGetter: js.UndefOr[js.Function1[/* index */ scala.Double, java.lang.String]] = js.undefined
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
  var rowHeight: scala.Double
  /**
       * If specified, `rowHeightGetter(index)` is called for each row and the
       * returned value overrides `rowHeight` for particular row.
       */
  var rowHeightGetter: js.UndefOr[js.Function1[/* index */ scala.Double, scala.Double]] = js.undefined
  /**
       * If specified, `rowKeyGetter(index)` is called for each row and the
       * returned value overrides `key` for the particular row.
       */
  var rowKeyGetter: js.UndefOr[js.Function1[/* index */ scala.Double, java.lang.String]] = js.undefined
  /**
       * Number of rows in the table.
       */
  var rowsCount: scala.Double
  /**
       * Value of horizontal scroll.
       */
  var scrollLeft: js.UndefOr[scala.Double] = js.undefined
  /**
       * Index of column to scroll to.
       */
  var scrollToColumn: js.UndefOr[scala.Double] = js.undefined
  /**
       * Index of row to scroll to.
       */
  var scrollToRow: js.UndefOr[scala.Double] = js.undefined
  /**
       * Value of vertical scroll.
       */
  var scrollTop: js.UndefOr[scala.Double] = js.undefined
  /** Hide the scrollbar but still enable scroll functionality */
  var showScrollbarX: js.UndefOr[scala.Boolean] = js.undefined
  /** Hide the scrollbar but still enable scroll functionality */
  var showScrollbarY: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If enabled scroll events will not be propagated outside of the table.
       */
  var stopScrollPropagation: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Pixel height of sub-row unless `subRowHeightGetter` is specified and returns
       * different value.  Defaults to 0 and no sub-row being displayed.
       */
  var subRowHeight: js.UndefOr[scala.Double] = js.undefined
  /**
       * If specified, `subRowHeightGetter(index)` is called for each row and the
       * returned value overrides `subRowHeight` for particular row.
       */
  var subRowHeightGetter: js.UndefOr[js.Function1[/* index */ scala.Double, scala.Double]] = js.undefined
  /**
       * Boolean flag indicating of touch scrolling should be enabled
       * This feature is current in beta and may have bugs
       */
  var touchScrollEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Pixel width of table. If all columns do not fit,
       * a horizontal scrollbar will appear.
       */
  var width: scala.Double
}

