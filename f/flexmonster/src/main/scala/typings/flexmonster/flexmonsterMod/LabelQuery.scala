package typings.flexmonster.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelQuery extends js.Object {
  var begin: js.UndefOr[String] = js.undefined
  var between: js.UndefOr[js.Array[String]] = js.undefined
  var contain: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[String] = js.undefined
  var equal: js.UndefOr[String] = js.undefined
  var greater: js.UndefOr[String] = js.undefined
  var greater_equal: js.UndefOr[String] = js.undefined
  var less: js.UndefOr[String] = js.undefined
  var less_equal: js.UndefOr[String] = js.undefined
  var not_begin: js.UndefOr[String] = js.undefined
  var not_between: js.UndefOr[js.Array[String]] = js.undefined
  var not_contain: js.UndefOr[String] = js.undefined
  var not_end: js.UndefOr[String] = js.undefined
  var not_equal: js.UndefOr[String] = js.undefined
}

object LabelQuery {
  @scala.inline
  def apply(
    begin: String = null,
    between: js.Array[String] = null,
    contain: String = null,
    end: String = null,
    equal: String = null,
    greater: String = null,
    greater_equal: String = null,
    less: String = null,
    less_equal: String = null,
    not_begin: String = null,
    not_between: js.Array[String] = null,
    not_contain: String = null,
    not_end: String = null,
    not_equal: String = null
  ): LabelQuery = {
    val __obj = js.Dynamic.literal()
    if (begin != null) __obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
    if (between != null) __obj.updateDynamic("between")(between.asInstanceOf[js.Any])
    if (contain != null) __obj.updateDynamic("contain")(contain.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (equal != null) __obj.updateDynamic("equal")(equal.asInstanceOf[js.Any])
    if (greater != null) __obj.updateDynamic("greater")(greater.asInstanceOf[js.Any])
    if (greater_equal != null) __obj.updateDynamic("greater_equal")(greater_equal.asInstanceOf[js.Any])
    if (less != null) __obj.updateDynamic("less")(less.asInstanceOf[js.Any])
    if (less_equal != null) __obj.updateDynamic("less_equal")(less_equal.asInstanceOf[js.Any])
    if (not_begin != null) __obj.updateDynamic("not_begin")(not_begin.asInstanceOf[js.Any])
    if (not_between != null) __obj.updateDynamic("not_between")(not_between.asInstanceOf[js.Any])
    if (not_contain != null) __obj.updateDynamic("not_contain")(not_contain.asInstanceOf[js.Any])
    if (not_end != null) __obj.updateDynamic("not_end")(not_end.asInstanceOf[js.Any])
    if (not_equal != null) __obj.updateDynamic("not_equal")(not_equal.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelQuery]
  }
}

