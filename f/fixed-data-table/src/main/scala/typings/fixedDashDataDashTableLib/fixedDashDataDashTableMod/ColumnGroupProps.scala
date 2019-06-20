package typings
package fixedDashDataDashTableLib.fixedDashDataDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnGroupProps
  extends reactLib.reactMod.Props[ColumnGroup] {
  /**
  	     * The horizontal alignment of the table cell content.
    * 'left', 'center', 'right'
  	     */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
  	     * Controls if the column group is fixed when scrolling in the X
  	     * axis.
  	     *
  	     * defaultValue: false
  	     */
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The header cell for this column group. This can either be
    * a string. a React element, or a function that generates a
    * React Element. Passing in a string will render a default
    * header cell with that string. By default, the React
    * element passed in can expect to receive the following
    * props:
    *
    * props: {
    *   height: number // (supplied from the groupHeaderHeight)
    *   width: number // (supplied from the Column)
    * }
    *
    * Because you are passing in your own React element, you
    * can feel free to pass in whatever props you may want or
    * need.
    *
    * If you pass in a function, you will receive the same props
    * object as the first argument.
    */
  var header: java.lang.String | reactLib.reactMod.ReactElement | (js.Function1[/* props */ CellProps, java.lang.String | reactLib.reactMod.ReactElement])
}

object ColumnGroupProps {
  @scala.inline
  def apply(
    header: java.lang.String | reactLib.reactMod.ReactElement | (js.Function1[/* props */ CellProps, java.lang.String | reactLib.reactMod.ReactElement]),
    align: java.lang.String = null,
    children: reactLib.reactMod.ReactNode = null,
    fixed: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.Key = null,
    ref: reactLib.reactMod.LegacyRef[ColumnGroup] = null
  ): ColumnGroupProps = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupProps]
  }
}

