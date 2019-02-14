package typings
package fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnGroupProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[ColumnGroup] {
  /**
    * The horizontal alignment of the table cell content.
    */
  var align: js.UndefOr[
    fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2LibStrings.left | fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2LibStrings.center | fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2LibStrings.right
  ] = js.undefined
  /**
    * Controls if the column group is fixed when scrolling in the X axis.
    *
    * defaultValue: false
    */
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This is the header cell for this column group.
    * This can either be a string or a React element. Passing in a string
    * will render a default footer cell with that string. By default, the React
    * element passed in can expect to receive the following props:
    *
    * ```
    * props: {
    *   height: number // (supplied from the groupHeaderHeight)
    *   width: number // (supplied from the Column)
    * }
    * ```
    *
    * Because you are passing in your own React element, you can feel free to
    * pass in whatever props you may want or need.
    *
    * You can also pass in a function that returns a react elemnt, with the
    * props object above passed in as the first parameter.
    */
  var header: js.UndefOr[
    java.lang.String | reactLib.reactMod.ReactNs.ReactElement | (js.Function1[
      /* props */ ColumnGroupHeaderProps, 
      java.lang.String | reactLib.reactMod.ReactNs.ReactElement
    ])
  ] = js.undefined
}

