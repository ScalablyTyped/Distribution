package typings.flexmonster.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueQuery extends NumberQuery {
  var bottom: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object ValueQuery {
  @scala.inline
  def apply(
    between: js.Array[Double] = null,
    bottom: Int | Double = null,
    equal: Int | Double = null,
    greater: Int | Double = null,
    greater_equal: Int | Double = null,
    less: Int | Double = null,
    less_equal: Int | Double = null,
    not_between: js.Array[Double] = null,
    not_equal: Int | Double = null,
    top: Int | Double = null
  ): ValueQuery = {
    val __obj = js.Dynamic.literal()
    if (between != null) __obj.updateDynamic("between")(between.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (equal != null) __obj.updateDynamic("equal")(equal.asInstanceOf[js.Any])
    if (greater != null) __obj.updateDynamic("greater")(greater.asInstanceOf[js.Any])
    if (greater_equal != null) __obj.updateDynamic("greater_equal")(greater_equal.asInstanceOf[js.Any])
    if (less != null) __obj.updateDynamic("less")(less.asInstanceOf[js.Any])
    if (less_equal != null) __obj.updateDynamic("less_equal")(less_equal.asInstanceOf[js.Any])
    if (not_between != null) __obj.updateDynamic("not_between")(not_between.asInstanceOf[js.Any])
    if (not_equal != null) __obj.updateDynamic("not_equal")(not_equal.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueQuery]
  }
}

