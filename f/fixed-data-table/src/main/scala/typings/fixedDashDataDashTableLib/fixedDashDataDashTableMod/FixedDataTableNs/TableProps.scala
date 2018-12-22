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

