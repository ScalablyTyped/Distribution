package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxMin extends js.Object {
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

object AnonMaxMin {
  @scala.inline
  def apply(max: Int | Double = null, min: Int | Double = null): AnonMaxMin = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxMin]
  }
}

