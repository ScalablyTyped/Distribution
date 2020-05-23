package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Min extends js.Object {
  /**
    * Maximum scaling
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.scaleLimit.max
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Minimum scaling
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-map.scaleLimit.min
    */
  var min: js.UndefOr[Double] = js.undefined
}

object Min {
  @scala.inline
  def apply(max: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double] = js.undefined): Min = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Min]
  }
}

