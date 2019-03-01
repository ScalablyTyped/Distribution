package typings
package fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[Column] {
  /**
    * The horizontal alignment of the table cell content.
    */
  var align: js.UndefOr[
    fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2LibStrings.left | fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2LibStrings.center | fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2LibStrings.right
  ] = js.undefined
  /**
    * Whether cells in this column can be removed from document when outside
    * of viewport as a result of horizontal scrolling.
    * Setting this property to true allows the table to not render cells in
    * particular column that are outside of viewport for visible rows. This
    * allows to create table with many columns and not have vertical scrolling
    * performance drop.
    * Setting the property to false will keep previous behaviour and keep
    * cell rendered if the row it belongs to is visible.
    *
    * defaultValue: false
    */
  var allowCellsRecycling: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This is the body cell that will be cloned for this column.
    * This can either be a string a React element, or a function that generates
    * a React Element. Passing in a string will render a default header cell
    * with that string. By default, the React element passed in can expect to
    * receive the following props:
    *
    * ```
    * props: {
    *   rowIndex; number // (the row index of the cell)
    *   columnKey: string // (of the column, if given)
    *   height: number // (supplied from the Table or rowHeightGetter)
    *   width: number // (supplied from the Column)
    * }
    * ```
    *
    * Because you are passing in your own React element, you can feel free to
    * pass in whatever props you may want or need.
    *
    * If you pass in a function, you will receive the same props object as the
    * first argument.
    */
  var cell: js.UndefOr[ElementOrFunc[ColumnCellProps]] = js.undefined
  /**
    * This is used to uniquely identify the column, and is not required unless
    * you a resizing columns. This will be the key given in the
    * `onColumnResizeEndCallback` on the Table.
    */
  var columnKey: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Controls if the column is fixed when scrolling in the X axis.
    *
    * defaultValue: false
    */
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls if the column is fixed to the right side of the table
    * when scrolling in the X axis.
    *
    * defaultValue: false
    */
  var fixedRight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The grow factor relative to other columns. Same as the flex-grow API
    * from http://www.w3.org/TR/css3-flexbox/. Basically, take any available
    * extra width and distribute it proportionally according to all columns'
    * flexGrow values. Defaults to zero (no-flexing).
    */
  var flexGrow: js.UndefOr[scala.Double] = js.undefined
  /**
    * This is the footer cell for this column.
    * This can either be a string a React element, or a function that generates
    * a React Element. Passing in a string will render a default header cell
    * with that string. By default, the React element passed in can expect to
    * receive the following props:
    *
    * ```
    * props: {
    *   columnKey: string // (of the column, if given)
    *   height: number // (supplied from the Table or rowHeightGetter)
    *   width: number // (supplied from the Column)
    * }
    * ```
    *
    * Because you are passing in your own React element, you can feel free to
    * pass in whatever props you may want or need.
    *
    * If you pass in a function, you will receive the same props object as the
    * first argument.
    */
  var footer: js.UndefOr[ElementOrFunc[ColumnHeaderProps]] = js.undefined
  /**
    * The header cell for this column.
    * This can either be a string a React element, or a function that generates
    * a React Element. Passing in a string will render a default header cell
    * with that string. By default, the React element passed in can expect to
    * receive the following props:
    *
    * ```
    * props: {
    *   columnKey: string // (of the column, if given)
    *   height: number // (supplied from the Table or rowHeightGetter)
    *   width: number // (supplied from the Column)
    * }
    * ```
    *
    * Because you are passing in your own React element, you can feel free to
    * pass in whatever props you may want or need.
    *
    * If you pass in a function, you will receive the same props object as the
    * first argument.
    */
  var header: js.UndefOr[ElementOrFunc[ColumnHeaderProps]] = js.undefined
  /**
    * Whether the column can be dragged to reorder.
    */
  var isReorderable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the column can be resized with the
    * FixedDataTableColumnResizeHandle. Please note that if a column
    * has a flex grow, once you resize the column this will be set to 0.
    *
    * This property only provides the UI for the column resizing. If this
    * is set to true, you will need to set the onColumnResizeEndCallback table
    * property and render your columns appropriately.
    */
  var isResizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If this is a resizable column this is its maximum pixel width.
    */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * If this is a resizable column this is its minimum pixel width.
    */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Flag to enable performance check when rendering. Stops the component from
    * rendering if none of it's passed in props have changed
    */
  var pureRendering: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The pixel width of the column.
    */
  var width: scala.Double
}

object ColumnProps {
  @scala.inline
  def apply(
    width: scala.Double,
    align: fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2LibStrings.left | fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2LibStrings.center | fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2LibStrings.right = null,
    allowCellsRecycling: js.UndefOr[scala.Boolean] = js.undefined,
    cell: ElementOrFunc[ColumnCellProps] = null,
    columnKey: java.lang.String | scala.Double = null,
    fixed: js.UndefOr[scala.Boolean] = js.undefined,
    fixedRight: js.UndefOr[scala.Boolean] = js.undefined,
    flexGrow: scala.Int | scala.Double = null,
    footer: ElementOrFunc[ColumnHeaderProps] = null,
    header: ElementOrFunc[ColumnHeaderProps] = null,
    isReorderable: js.UndefOr[scala.Boolean] = js.undefined,
    isResizable: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.ReactNs.Key = null,
    maxWidth: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    pureRendering: js.UndefOr[scala.Boolean] = js.undefined,
    ref: reactLib.reactMod.ReactNs.LegacyRef[Column] = null
  ): ColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("width")(width)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCellsRecycling)) __obj.updateDynamic("allowCellsRecycling")(allowCellsRecycling)
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (!js.isUndefined(fixedRight)) __obj.updateDynamic("fixedRight")(fixedRight)
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(isReorderable)) __obj.updateDynamic("isReorderable")(isReorderable)
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(pureRendering)) __obj.updateDynamic("pureRendering")(pureRendering)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps]
  }
}

