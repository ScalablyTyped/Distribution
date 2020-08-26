package typings.fixedDataTable.mod

import typings.react.mod.Props
import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableProps extends Props[Table] {
  /**
    * Pixel height of the footer.
    *
    * defaultValue: 0
    */
  var footerHeight: js.UndefOr[Double] = js.native
  /**
    * Pixel height of the column group header.
    *
    * defaultValue: 0
    */
  var groupHeaderHeight: js.UndefOr[Double] = js.native
  /**
    * Pixel height of the header.
    *
    * defaultValue: 0
    */
  var headerHeight: js.UndefOr[Double] = js.native
  /**
    * Pixel height of table. If all rows do not fit, a
    * vertical scrollbar will appear.
    *
    * Either height or maxHeight must be specified.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Whether a column is currently being resized.
    */
  var isColumnResizing: js.UndefOr[Boolean] = js.native
  /**
    * Maximum pixel height of table. If all rows do not fit,
    * a vertical scrollbar will appear.
    *
    * Either height or maxHeight must be specified.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    * Callback that is called when resizer has been released
    * and column needs to be updated.
    *
    * Required if the isResizable property is true on any
    * column.
    */
  var onColumnResizeEndCallback: js.UndefOr[js.Function2[/* newColumnWidth */ Double, /* columnKey */ String, Unit]] = js.native
  /**
    * Callback that is called when rowHeightGetter returns a
    * different height for a row than the rowHeight prop. This
    *  is necessary because initially table estimates heights
    * of some parts of the content.
    */
  var onContentHeightChange: js.UndefOr[js.Function1[/* newHeight */ Double, Unit]] = js.native
  /**
    * Callback that is called when a row is clicked.
    */
  var onRowClick: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double, Unit]
  ] = js.native
  /**
    * Callback that is called when a row is double clicked.
    */
  var onRowDoubleClick: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double, Unit]
  ] = js.native
  /**
    * Callback that is called when a mouse-down event happens
    * on a row.
    */
  var onRowMouseDown: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double, Unit]
  ] = js.native
  /**
    * Callback that is called when a mouse-enter event happens
    * on a row.
    */
  var onRowMouseEnter: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double, Unit]
  ] = js.native
  /**
    * Callback that is called when a mouse-leave event happens
    * on a row.
    */
  var onRowMouseLeave: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[Table, Event], /* rowIndex */ Double, Unit]
  ] = js.native
  /**
    * Callback that is called when scrolling ends or stops with
    * new horizontal and vertical scroll values.
    */
  var onScrollEnd: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.native
  /**
    * Callback that is called when scrolling starts with
    * current horizontal and vertical scroll values.
    */
  var onScrollStart: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.native
  /**
    * 'hidden'|'auto'
    */
  var overflowX: js.UndefOr[String] = js.native
  /**
    * 'hidden'|'auto'
    */
  var overflowY: js.UndefOr[String] = js.native
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
  var ownerHeight: js.UndefOr[Double] = js.native
  /**
    * To get any additional CSS classes that should be added to
    *  a row, rowClassNameGetter(index) is called.
    */
  var rowClassNameGetter: js.UndefOr[js.Function1[/* index */ Double, String]] = js.native
  /**
    * Pixel height of rows unless rowHeightGetter is specified
    * and returns different value.
    */
  var rowHeight: Double = js.native
  /**
    * If specified, rowHeightGetter(index) is called for each
    * row and the returned value overrides rowHeight for
    * particular row.
    */
  var rowHeightGetter: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.native
  /**
    * Number of rows in the table.
    */
  var rowsCount: Double = js.native
  /**
    * Value of horizontal scroll.
    *
    * defaultValue: 0
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
    *
    * defaultValue: 0
    */
  var scrollTop: js.UndefOr[Double] = js.native
  /**
    * Pixel width of table. If all columns do not fit, a
    * horizontal scrollbar will appear.
    */
  var width: Double = js.native
}

object TableProps {
  @scala.inline
  def apply(rowHeight: Double, rowsCount: Double, width: Double): TableProps = {
    val __obj = js.Dynamic.literal(rowHeight = rowHeight.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
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
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsCount(value: Double): Self = this.set("rowsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooterHeight(value: Double): Self = this.set("footerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterHeight: Self = this.set("footerHeight", js.undefined)
    @scala.inline
    def setGroupHeaderHeight(value: Double): Self = this.set("groupHeaderHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupHeaderHeight: Self = this.set("groupHeaderHeight", js.undefined)
    @scala.inline
    def setHeaderHeight(value: Double): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderHeight: Self = this.set("headerHeight", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIsColumnResizing(value: Boolean): Self = this.set("isColumnResizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsColumnResizing: Self = this.set("isColumnResizing", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setOnColumnResizeEndCallback(value: (/* newColumnWidth */ Double, /* columnKey */ String) => Unit): Self = this.set("onColumnResizeEndCallback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnColumnResizeEndCallback: Self = this.set("onColumnResizeEndCallback", js.undefined)
    @scala.inline
    def setOnContentHeightChange(value: /* newHeight */ Double => Unit): Self = this.set("onContentHeightChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContentHeightChange: Self = this.set("onContentHeightChange", js.undefined)
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
    def setOnScrollEnd(value: (/* x */ Double, /* y */ Double) => Unit): Self = this.set("onScrollEnd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnScrollEnd: Self = this.set("onScrollEnd", js.undefined)
    @scala.inline
    def setOnScrollStart(value: (/* x */ Double, /* y */ Double) => Unit): Self = this.set("onScrollStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnScrollStart: Self = this.set("onScrollStart", js.undefined)
    @scala.inline
    def setOverflowX(value: String): Self = this.set("overflowX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowX: Self = this.set("overflowX", js.undefined)
    @scala.inline
    def setOverflowY(value: String): Self = this.set("overflowY", value.asInstanceOf[js.Any])
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
    def setRowHeightGetter(value: /* index */ Double => Double): Self = this.set("rowHeightGetter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowHeightGetter: Self = this.set("rowHeightGetter", js.undefined)
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
  }
  
}

