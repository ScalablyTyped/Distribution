package typings
package flexmonsterLib.flexmonsterMod.FlexmonsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeQuery extends js.Object {
  var between: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var equal: js.UndefOr[java.lang.String] = js.undefined
  var greater: js.UndefOr[java.lang.String] = js.undefined
  var greater_equal: js.UndefOr[java.lang.String] = js.undefined
  var less: js.UndefOr[java.lang.String] = js.undefined
  var less_equal: js.UndefOr[java.lang.String] = js.undefined
  var not_between: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var not_equal: js.UndefOr[java.lang.String] = js.undefined
}

object TimeQuery {
  @scala.inline
  def apply(
    between: js.Array[java.lang.String] = null,
    equal: java.lang.String = null,
    greater: java.lang.String = null,
    greater_equal: java.lang.String = null,
    less: java.lang.String = null,
    less_equal: java.lang.String = null,
    not_between: js.Array[java.lang.String] = null,
    not_equal: java.lang.String = null
  ): TimeQuery = {
    val __obj = js.Dynamic.literal()
    if (between != null) __obj.updateDynamic("between")(between)
    if (equal != null) __obj.updateDynamic("equal")(equal)
    if (greater != null) __obj.updateDynamic("greater")(greater)
    if (greater_equal != null) __obj.updateDynamic("greater_equal")(greater_equal)
    if (less != null) __obj.updateDynamic("less")(less)
    if (less_equal != null) __obj.updateDynamic("less_equal")(less_equal)
    if (not_between != null) __obj.updateDynamic("not_between")(not_between)
    if (not_equal != null) __obj.updateDynamic("not_equal")(not_equal)
    __obj.asInstanceOf[TimeQuery]
  }
}

