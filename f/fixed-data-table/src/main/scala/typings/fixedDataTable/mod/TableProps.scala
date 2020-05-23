package typings.fixedDataTable.mod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps extends Props[Table] {
  /**
    * Pixel height of the footer.
    *
    * defaultValue: 0
    */
  var footerHeight: js.UndefOr[Double] = js.undefined
  /**
    * Pixel height of the column group header.
    *
    * defaultValue: 0
    */
  var groupHeaderHeight: js.UndefOr[Double] = js.undefined
  /**
    * Pixel height of the header.
    *
    * defaultValue: 0
    */
  var headerHeight: js.UndefOr[Double] = js.undefined
  /**
    * Pixel height of table. If all rows do not fit, a
    * vertical scrollbar will appear.
    *
    * Either height or maxHeight must be specified.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Whether a column is currently being resized.
    */
  var isColumnResizing: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum pixel height of table. If all rows do not fit,
    * a vertical scrollbar will appear.
    *
    * Either height or maxHeight must be specified.
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /**
    * Callback that is called when resizer has been released
    * and column needs to be updated.
    *
    * Required if the isResizable property is true on any
    * column.
    */
  var onColumnResizeEndCallback: js.UndefOr[js.Function2[/* newColumnWidth */ Double, /* columnKey */ String, Unit]] = js.undefined
  /**
    * Callback that is called when rowHeightGetter returns a
    * different height for a row than the rowHeight prop. This
    *  is necessary because initially table estimates heights
    * of some parts of the content.
    */
  var onContentHeightChange: js.UndefOr[js.Function1[/* newHeight */ Double, Unit]] = js.undefined
  /**
    * Callback that is called when a row is clicked.
    */
  var onRowClick: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double, Unit]
  ] = js.undefined
  /**
    * Callback that is called when a row is double clicked.
    */
  var onRowDoubleClick: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double, Unit]
  ] = js.undefined
  /**
    * Callback that is called when a mouse-down event happens
    * on a row.
    */
  var onRowMouseDown: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double, Unit]
  ] = js.undefined
  /**
    * Callback that is called when a mouse-enter event happens
    * on a row.
    */
  var onRowMouseEnter: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double, Unit]
  ] = js.undefined
  /**
    * Callback that is called when a mouse-leave event happens
    * on a row.
    */
  var onRowMouseLeave: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double, Unit]
  ] = js.undefined
  /**
    * Callback that is called when scrolling ends or stops with
    * new horizontal and vertical scroll values.
    */
  var onScrollEnd: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.undefined
  /**
    * Callback that is called when scrolling starts with
    * current horizontal and vertical scroll values.
    */
  var onScrollStart: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.undefined
  /**
    * 'hidden'|'auto'
    */
  var overflowX: js.UndefOr[String] = js.undefined
  /**
    * 'hidden'|'auto'
    */
  var overflowY: js.UndefOr[String] = js.undefined
  /**
    * Pixel height of table's owner, this is used in a managed
    * scrolling situation when you want to slide the table up
    * from below the fold without having to constantly update
    * the height on every scroll tick. Instead, vary this
    * property on scroll. By using ownerHeight, we over-render
    * the table while making sure the footer and horizontal
    * scrollbar of the table are visible when the current space
    * for the table in view is smaller than the final,
    * over-flowing height of table. It allows us to avoid
    * resizing and reflowing table when it is moving in the
    * view.
    *
    * This is used if ownerHeight < height (or maxHeight).
    */
  var ownerHeight: js.UndefOr[Double] = js.undefined
  /**
    * To get any additional CSS classes that should be added to
    *  a row, rowClassNameGetter(index) is called.
    */
  var rowClassNameGetter: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
  /**
    * Pixel height of rows unless rowHeightGetter is specified
    * and returns different value.
    */
  var rowHeight: Double
  /**
    * If specified, rowHeightGetter(index) is called for each
    * row and the returned value overrides rowHeight for
    * particular row.
    */
  var rowHeightGetter: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.undefined
  /**
    * Number of rows in the table.
    */
  var rowsCount: Double
  /**
    * Value of horizontal scroll.
    *
    * defaultValue: 0
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
    *
    * defaultValue: 0
    */
  var scrollTop: js.UndefOr[Double] = js.undefined
  /**
    * Pixel width of table. If all columns do not fit, a
    * horizontal scrollbar will appear.
    */
  var width: Double
}

object TableProps {
  @scala.inline
  def apply(
    rowHeight: Double,
    rowsCount: Double,
    width: Double,
    children: ReactNode = null,
    footerHeight: js.UndefOr[Double] = js.undefined,
    groupHeaderHeight: js.UndefOr[Double] = js.undefined,
    headerHeight: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    isColumnResizing: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    maxHeight: js.UndefOr[Double] = js.undefined,
    onColumnResizeEndCallback: (/* newColumnWidth */ Double, /* columnKey */ String) => Unit = null,
    onContentHeightChange: /* newHeight */ Double => Unit = null,
    onRowClick: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit = null,
    onRowDoubleClick: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit = null,
    onRowMouseDown: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit = null,
    onRowMouseEnter: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit = null,
    onRowMouseLeave: (/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double) => Unit = null,
    onScrollEnd: (/* x */ Double, /* y */ Double) => Unit = null,
    onScrollStart: (/* x */ Double, /* y */ Double) => Unit = null,
    overflowX: String = null,
    overflowY: String = null,
    ownerHeight: js.UndefOr[Double] = js.undefined,
    ref: js.UndefOr[Null | LegacyRef[Table]] = js.undefined,
    rowClassNameGetter: /* index */ Double => String = null,
    rowHeightGetter: /* index */ Double => Double = null,
    scrollLeft: js.UndefOr[Double] = js.undefined,
    scrollToColumn: js.UndefOr[Double] = js.undefined,
    scrollToRow: js.UndefOr[Double] = js.undefined,
    scrollTop: js.UndefOr[Double] = js.undefined
  ): TableProps = {
    val __obj = js.Dynamic.literal(rowHeight = rowHeight.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(footerHeight)) __obj.updateDynamic("footerHeight")(footerHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupHeaderHeight)) __obj.updateDynamic("groupHeaderHeight")(groupHeaderHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(headerHeight)) __obj.updateDynamic("headerHeight")(headerHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isColumnResizing)) __obj.updateDynamic("isColumnResizing")(isColumnResizing.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (onColumnResizeEndCallback != null) __obj.updateDynamic("onColumnResizeEndCallback")(js.Any.fromFunction2(onColumnResizeEndCallback))
    if (onContentHeightChange != null) __obj.updateDynamic("onContentHeightChange")(js.Any.fromFunction1(onContentHeightChange))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2(onRowClick))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction2(onRowDoubleClick))
    if (onRowMouseDown != null) __obj.updateDynamic("onRowMouseDown")(js.Any.fromFunction2(onRowMouseDown))
    if (onRowMouseEnter != null) __obj.updateDynamic("onRowMouseEnter")(js.Any.fromFunction2(onRowMouseEnter))
    if (onRowMouseLeave != null) __obj.updateDynamic("onRowMouseLeave")(js.Any.fromFunction2(onRowMouseLeave))
    if (onScrollEnd != null) __obj.updateDynamic("onScrollEnd")(js.Any.fromFunction2(onScrollEnd))
    if (onScrollStart != null) __obj.updateDynamic("onScrollStart")(js.Any.fromFunction2(onScrollStart))
    if (overflowX != null) __obj.updateDynamic("overflowX")(overflowX.asInstanceOf[js.Any])
    if (overflowY != null) __obj.updateDynamic("overflowY")(overflowY.asInstanceOf[js.Any])
    if (!js.isUndefined(ownerHeight)) __obj.updateDynamic("ownerHeight")(ownerHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (rowClassNameGetter != null) __obj.updateDynamic("rowClassNameGetter")(js.Any.fromFunction1(rowClassNameGetter))
    if (rowHeightGetter != null) __obj.updateDynamic("rowHeightGetter")(js.Any.fromFunction1(rowHeightGetter))
    if (!js.isUndefined(scrollLeft)) __obj.updateDynamic("scrollLeft")(scrollLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToColumn)) __obj.updateDynamic("scrollToColumn")(scrollToColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToRow)) __obj.updateDynamic("scrollToRow")(scrollToRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollTop)) __obj.updateDynamic("scrollTop")(scrollTop.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
}

