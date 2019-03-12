package typings
package fixedDashDataDashTableLib.fixedDashDataDashTableMod.FixedDataTableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps
  extends reactLib.reactMod.ReactNs.Props[Table] {
  /**
    * Pixel height of the footer.
    *
    * defaultValue: 0
    */
  var footerHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Pixel height of the column group header.
    *
    * defaultValue: 0
    */
  var groupHeaderHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Pixel height of the header.
    *
    * defaultValue: 0
    */
  var headerHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Pixel height of table. If all rows do not fit, a
    * vertical scrollbar will appear.
    *
    * Either height or maxHeight must be specified.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether a column is currently being resized.
    */
  var isColumnResizing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Maximum pixel height of table. If all rows do not fit,
    * a vertical scrollbar will appear.
    *
    * Either height or maxHeight must be specified.
    */
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Callback that is called when resizer has been released
    * and column needs to be updated.
    *
    * Required if the isResizable property is true on any
    * column.
    */
  var onColumnResizeEndCallback: js.UndefOr[
    js.Function2[/* newColumnWidth */ scala.Double, /* columnKey */ java.lang.String, scala.Unit]
  ] = js.undefined
  /**
    * Callback that is called when rowHeightGetter returns a
    * different height for a row than the rowHeight prop. This
    *  is necessary because initially table estimates heights
    * of some parts of the content.
    */
  var onContentHeightChange: js.UndefOr[js.Function1[/* newHeight */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Callback that is called when a row is clicked.
    */
  var onRowClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[Table, reactLib.Event], 
      /* rowIndex */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback that is called when a row is double clicked.
    */
  var onRowDoubleClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[Table, reactLib.Event], 
      /* rowIndex */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback that is called when a mouse-down event happens
    * on a row.
    */
  var onRowMouseDown: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[Table, reactLib.Event], 
      /* rowIndex */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback that is called when a mouse-enter event happens
    * on a row.
    */
  var onRowMouseEnter: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[Table, reactLib.Event], 
      /* rowIndex */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback that is called when a mouse-leave event happens
    * on a row.
    */
  var onRowMouseLeave: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[Table, reactLib.Event], 
      /* rowIndex */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback that is called when scrolling ends or stops with
    * new horizontal and vertical scroll values.
    */
  var onScrollEnd: js.UndefOr[js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Callback that is called when scrolling starts with
    * current horizontal and vertical scroll values.
    */
  var onScrollStart: js.UndefOr[js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Unit]] = js.undefined
  /**
    * 'hidden'|'auto'
    */
  var overflowX: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 'hidden'|'auto'
    */
  var overflowY: js.UndefOr[java.lang.String] = js.undefined
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
  var ownerHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * To get any additional CSS classes that should be added to
    *  a row, rowClassNameGetter(index) is called.
    */
  var rowClassNameGetter: js.UndefOr[js.Function1[/* index */ scala.Double, java.lang.String]] = js.undefined
  /**
    * Pixel height of rows unless rowHeightGetter is specified
    * and returns different value.
    */
  var rowHeight: scala.Double
  /**
    * If specified, rowHeightGetter(index) is called for each
    * row and the returned value overrides rowHeight for
    * particular row.
    */
  var rowHeightGetter: js.UndefOr[js.Function1[/* index */ scala.Double, scala.Double]] = js.undefined
  /**
    * Number of rows in the table.
    */
  var rowsCount: scala.Double
  /**
    * Value of horizontal scroll.
    *
    * defaultValue: 0
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
    *
    * defaultValue: 0
    */
  var scrollTop: js.UndefOr[scala.Double] = js.undefined
  /**
    * Pixel width of table. If all columns do not fit, a
    * horizontal scrollbar will appear.
    */
  var width: scala.Double
}

object TableProps {
  @scala.inline
  def apply(
    rowHeight: scala.Double,
    rowsCount: scala.Double,
    width: scala.Double,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    footerHeight: scala.Int | scala.Double = null,
    groupHeaderHeight: scala.Int | scala.Double = null,
    headerHeight: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    isColumnResizing: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.ReactNs.Key = null,
    maxHeight: scala.Int | scala.Double = null,
    onColumnResizeEndCallback: (/* newColumnWidth */ scala.Double, /* columnKey */ java.lang.String) => scala.Unit = null,
    onContentHeightChange: /* newHeight */ scala.Double => scala.Unit = null,
    onRowClick: (/* event */ reactLib.reactMod.ReactNs.SyntheticEvent[Table, reactLib.Event], /* rowIndex */ scala.Double) => scala.Unit = null,
    onRowDoubleClick: (/* event */ reactLib.reactMod.ReactNs.SyntheticEvent[Table, reactLib.Event], /* rowIndex */ scala.Double) => scala.Unit = null,
    onRowMouseDown: (/* event */ reactLib.reactMod.ReactNs.SyntheticEvent[Table, reactLib.Event], /* rowIndex */ scala.Double) => scala.Unit = null,
    onRowMouseEnter: (/* event */ reactLib.reactMod.ReactNs.SyntheticEvent[Table, reactLib.Event], /* rowIndex */ scala.Double) => scala.Unit = null,
    onRowMouseLeave: (/* event */ reactLib.reactMod.ReactNs.SyntheticEvent[Table, reactLib.Event], /* rowIndex */ scala.Double) => scala.Unit = null,
    onScrollEnd: (/* x */ scala.Double, /* y */ scala.Double) => scala.Unit = null,
    onScrollStart: (/* x */ scala.Double, /* y */ scala.Double) => scala.Unit = null,
    overflowX: java.lang.String = null,
    overflowY: java.lang.String = null,
    ownerHeight: scala.Int | scala.Double = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[Table] = null,
    rowClassNameGetter: /* index */ scala.Double => java.lang.String = null,
    rowHeightGetter: /* index */ scala.Double => scala.Double = null,
    scrollLeft: scala.Int | scala.Double = null,
    scrollToColumn: scala.Int | scala.Double = null,
    scrollToRow: scala.Int | scala.Double = null,
    scrollTop: scala.Int | scala.Double = null
  ): TableProps = {
    val __obj = js.Dynamic.literal(rowHeight = rowHeight, rowsCount = rowsCount, width = width)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (footerHeight != null) __obj.updateDynamic("footerHeight")(footerHeight.asInstanceOf[js.Any])
    if (groupHeaderHeight != null) __obj.updateDynamic("groupHeaderHeight")(groupHeaderHeight.asInstanceOf[js.Any])
    if (headerHeight != null) __obj.updateDynamic("headerHeight")(headerHeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isColumnResizing)) __obj.updateDynamic("isColumnResizing")(isColumnResizing)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (onColumnResizeEndCallback != null) __obj.updateDynamic("onColumnResizeEndCallback")(js.Any.fromFunction2(onColumnResizeEndCallback))
    if (onContentHeightChange != null) __obj.updateDynamic("onContentHeightChange")(js.Any.fromFunction1(onContentHeightChange))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2(onRowClick))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction2(onRowDoubleClick))
    if (onRowMouseDown != null) __obj.updateDynamic("onRowMouseDown")(js.Any.fromFunction2(onRowMouseDown))
    if (onRowMouseEnter != null) __obj.updateDynamic("onRowMouseEnter")(js.Any.fromFunction2(onRowMouseEnter))
    if (onRowMouseLeave != null) __obj.updateDynamic("onRowMouseLeave")(js.Any.fromFunction2(onRowMouseLeave))
    if (onScrollEnd != null) __obj.updateDynamic("onScrollEnd")(js.Any.fromFunction2(onScrollEnd))
    if (onScrollStart != null) __obj.updateDynamic("onScrollStart")(js.Any.fromFunction2(onScrollStart))
    if (overflowX != null) __obj.updateDynamic("overflowX")(overflowX)
    if (overflowY != null) __obj.updateDynamic("overflowY")(overflowY)
    if (ownerHeight != null) __obj.updateDynamic("ownerHeight")(ownerHeight.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (rowClassNameGetter != null) __obj.updateDynamic("rowClassNameGetter")(js.Any.fromFunction1(rowClassNameGetter))
    if (rowHeightGetter != null) __obj.updateDynamic("rowHeightGetter")(js.Any.fromFunction1(rowHeightGetter))
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollToColumn != null) __obj.updateDynamic("scrollToColumn")(scrollToColumn.asInstanceOf[js.Any])
    if (scrollToRow != null) __obj.updateDynamic("scrollToRow")(scrollToRow.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
}

