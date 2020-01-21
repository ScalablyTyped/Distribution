package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLengthShow extends js.Object {
  /**
    * The length of pointer which could be absolute value and also
    * the percentage relative to
    * [radius](https://echarts.apache.org/en/option.html#series-gauge.radius)
    * .
    *
    *
    * @default
    * '80%'
    * @see https://echarts.apache.org/en/option.html#series-gauge.pointer.length
    */
  var length: js.UndefOr[Double | String] = js.undefined
  /**
    * Whether to show the pointer.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-gauge.pointer.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
  /**
    * The width of pointer.
    *
    *
    * @default
    * 8
    * @see https://echarts.apache.org/en/option.html#series-gauge.pointer.width
    */
  var width: js.UndefOr[Double] = js.undefined
}

object AnonLengthShow {
  @scala.inline
  def apply(
    length: Double | String = null,
    show: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): AnonLengthShow = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLengthShow]
  }
}

