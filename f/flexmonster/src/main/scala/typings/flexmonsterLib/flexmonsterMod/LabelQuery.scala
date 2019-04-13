package typings
package flexmonsterLib.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelQuery extends js.Object {
  var begin: js.UndefOr[java.lang.String] = js.undefined
  var between: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var contain: js.UndefOr[java.lang.String] = js.undefined
  var end: js.UndefOr[java.lang.String] = js.undefined
  var equal: js.UndefOr[java.lang.String] = js.undefined
  var greater: js.UndefOr[java.lang.String] = js.undefined
  var greater_equal: js.UndefOr[java.lang.String] = js.undefined
  var less: js.UndefOr[java.lang.String] = js.undefined
  var less_equal: js.UndefOr[java.lang.String] = js.undefined
  var not_begin: js.UndefOr[java.lang.String] = js.undefined
  var not_between: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var not_contain: js.UndefOr[java.lang.String] = js.undefined
  var not_end: js.UndefOr[java.lang.String] = js.undefined
  var not_equal: js.UndefOr[java.lang.String] = js.undefined
}

object LabelQuery {
  @scala.inline
  def apply(
    begin: java.lang.String = null,
    between: js.Array[java.lang.String] = null,
    contain: java.lang.String = null,
    end: java.lang.String = null,
    equal: java.lang.String = null,
    greater: java.lang.String = null,
    greater_equal: java.lang.String = null,
    less: java.lang.String = null,
    less_equal: java.lang.String = null,
    not_begin: java.lang.String = null,
    not_between: js.Array[java.lang.String] = null,
    not_contain: java.lang.String = null,
    not_end: java.lang.String = null,
    not_equal: java.lang.String = null
  ): LabelQuery = {
    val __obj = js.Dynamic.literal()
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (between != null) __obj.updateDynamic("between")(between)
    if (contain != null) __obj.updateDynamic("contain")(contain)
    if (end != null) __obj.updateDynamic("end")(end)
    if (equal != null) __obj.updateDynamic("equal")(equal)
    if (greater != null) __obj.updateDynamic("greater")(greater)
    if (greater_equal != null) __obj.updateDynamic("greater_equal")(greater_equal)
    if (less != null) __obj.updateDynamic("less")(less)
    if (less_equal != null) __obj.updateDynamic("less_equal")(less_equal)
    if (not_begin != null) __obj.updateDynamic("not_begin")(not_begin)
    if (not_between != null) __obj.updateDynamic("not_between")(not_between)
    if (not_contain != null) __obj.updateDynamic("not_contain")(not_contain)
    if (not_end != null) __obj.updateDynamic("not_end")(not_end)
    if (not_equal != null) __obj.updateDynamic("not_equal")(not_equal)
    __obj.asInstanceOf[LabelQuery]
  }
}

