package typings
package flexmonsterLib.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberQuery extends js.Object {
  var between: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var equal: js.UndefOr[scala.Double] = js.undefined
  var greater: js.UndefOr[scala.Double] = js.undefined
  var greater_equal: js.UndefOr[scala.Double] = js.undefined
  var less: js.UndefOr[scala.Double] = js.undefined
  var less_equal: js.UndefOr[scala.Double] = js.undefined
  var not_between: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var not_equal: js.UndefOr[scala.Double] = js.undefined
}

object NumberQuery {
  @scala.inline
  def apply(
    between: js.Array[scala.Double] = null,
    equal: scala.Int | scala.Double = null,
    greater: scala.Int | scala.Double = null,
    greater_equal: scala.Int | scala.Double = null,
    less: scala.Int | scala.Double = null,
    less_equal: scala.Int | scala.Double = null,
    not_between: js.Array[scala.Double] = null,
    not_equal: scala.Int | scala.Double = null
  ): NumberQuery = {
    val __obj = js.Dynamic.literal()
    if (between != null) __obj.updateDynamic("between")(between)
    if (equal != null) __obj.updateDynamic("equal")(equal.asInstanceOf[js.Any])
    if (greater != null) __obj.updateDynamic("greater")(greater.asInstanceOf[js.Any])
    if (greater_equal != null) __obj.updateDynamic("greater_equal")(greater_equal.asInstanceOf[js.Any])
    if (less != null) __obj.updateDynamic("less")(less.asInstanceOf[js.Any])
    if (less_equal != null) __obj.updateDynamic("less_equal")(less_equal.asInstanceOf[js.Any])
    if (not_between != null) __obj.updateDynamic("not_between")(not_between)
    if (not_equal != null) __obj.updateDynamic("not_equal")(not_equal.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberQuery]
  }
}

