package typings
package flexmonsterLib.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateQuery extends js.Object {
  var after: js.UndefOr[java.lang.String] = js.undefined
  var after_equal: js.UndefOr[java.lang.String] = js.undefined
  var before: js.UndefOr[java.lang.String] = js.undefined
  var before_equal: js.UndefOr[java.lang.String] = js.undefined
  var between: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var current: js.UndefOr[java.lang.String] = js.undefined
  var equal: js.UndefOr[java.lang.String] = js.undefined
  var last: js.UndefOr[java.lang.String] = js.undefined
  var next: js.UndefOr[java.lang.String] = js.undefined
  var not_between: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var not_equal: js.UndefOr[java.lang.String] = js.undefined
}

object DateQuery {
  @scala.inline
  def apply(
    after: java.lang.String = null,
    after_equal: java.lang.String = null,
    before: java.lang.String = null,
    before_equal: java.lang.String = null,
    between: js.Array[java.lang.String] = null,
    current: java.lang.String = null,
    equal: java.lang.String = null,
    last: java.lang.String = null,
    next: java.lang.String = null,
    not_between: js.Array[java.lang.String] = null,
    not_equal: java.lang.String = null
  ): DateQuery = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (after_equal != null) __obj.updateDynamic("after_equal")(after_equal)
    if (before != null) __obj.updateDynamic("before")(before)
    if (before_equal != null) __obj.updateDynamic("before_equal")(before_equal)
    if (between != null) __obj.updateDynamic("between")(between)
    if (current != null) __obj.updateDynamic("current")(current)
    if (equal != null) __obj.updateDynamic("equal")(equal)
    if (last != null) __obj.updateDynamic("last")(last)
    if (next != null) __obj.updateDynamic("next")(next)
    if (not_between != null) __obj.updateDynamic("not_between")(not_between)
    if (not_equal != null) __obj.updateDynamic("not_equal")(not_equal)
    __obj.asInstanceOf[DateQuery]
  }
}

