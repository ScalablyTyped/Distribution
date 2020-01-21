package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateQuery extends js.Object {
  var after: js.UndefOr[String] = js.undefined
  var after_equal: js.UndefOr[String] = js.undefined
  var before: js.UndefOr[String] = js.undefined
  var before_equal: js.UndefOr[String] = js.undefined
  var between: js.UndefOr[js.Array[String]] = js.undefined
  var current: js.UndefOr[String] = js.undefined
  var equal: js.UndefOr[String] = js.undefined
  var last: js.UndefOr[String] = js.undefined
  var next: js.UndefOr[String] = js.undefined
  var not_between: js.UndefOr[js.Array[String]] = js.undefined
  var not_equal: js.UndefOr[String] = js.undefined
}

object DateQuery {
  @scala.inline
  def apply(
    after: String = null,
    after_equal: String = null,
    before: String = null,
    before_equal: String = null,
    between: js.Array[String] = null,
    current: String = null,
    equal: String = null,
    last: String = null,
    next: String = null,
    not_between: js.Array[String] = null,
    not_equal: String = null
  ): DateQuery = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (after_equal != null) __obj.updateDynamic("after_equal")(after_equal.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (before_equal != null) __obj.updateDynamic("before_equal")(before_equal.asInstanceOf[js.Any])
    if (between != null) __obj.updateDynamic("between")(between.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (equal != null) __obj.updateDynamic("equal")(equal.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (not_between != null) __obj.updateDynamic("not_between")(not_between.asInstanceOf[js.Any])
    if (not_equal != null) __obj.updateDynamic("not_equal")(not_equal.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateQuery]
  }
}

