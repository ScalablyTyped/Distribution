package typings.flexmonster.mod

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
    bottom: js.UndefOr[Double] = js.undefined,
    equal: js.UndefOr[Double] = js.undefined,
    greater: js.UndefOr[Double] = js.undefined,
    greater_equal: js.UndefOr[Double] = js.undefined,
    less: js.UndefOr[Double] = js.undefined,
    less_equal: js.UndefOr[Double] = js.undefined,
    not_between: js.Array[Double] = null,
    not_equal: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): ValueQuery = {
    val __obj = js.Dynamic.literal()
    if (between != null) __obj.updateDynamic("between")(between.asInstanceOf[js.Any])
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(equal)) __obj.updateDynamic("equal")(equal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(greater)) __obj.updateDynamic("greater")(greater.get.asInstanceOf[js.Any])
    if (!js.isUndefined(greater_equal)) __obj.updateDynamic("greater_equal")(greater_equal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(less)) __obj.updateDynamic("less")(less.get.asInstanceOf[js.Any])
    if (!js.isUndefined(less_equal)) __obj.updateDynamic("less_equal")(less_equal.get.asInstanceOf[js.Any])
    if (not_between != null) __obj.updateDynamic("not_between")(not_between.asInstanceOf[js.Any])
    if (!js.isUndefined(not_equal)) __obj.updateDynamic("not_equal")(not_equal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueQuery]
  }
}

