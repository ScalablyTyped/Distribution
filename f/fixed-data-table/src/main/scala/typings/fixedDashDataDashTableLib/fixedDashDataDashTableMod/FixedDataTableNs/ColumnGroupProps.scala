package typings
package fixedDashDataDashTableLib.fixedDashDataDashTableMod.FixedDataTableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ColumnGroupProps
  extends reactLib.reactMod.ReactNs.Props[ColumnGroup] {
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
  var header: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] | (js.Function1[
    /* props */ CellProps, 
    java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]
  ])
}

