package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxMin extends js.Object {
  /**
    * Maximum scaling
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.scaleLimit.max
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Minimum scaling
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-map.scaleLimit.min
    */
  var min: js.UndefOr[Double] = js.undefined
}

object Anon_MaxMin {
  @scala.inline
  def apply(max: Int | Double = null, min: Int | Double = null): Anon_MaxMin = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxMin]
  }
}

