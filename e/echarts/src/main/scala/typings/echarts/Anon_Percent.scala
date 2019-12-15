package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Percent extends js.Object {
  /**
    * Specify the percentage of drawing, useful in animation.
    *
    * Value range: \[0, 1\].
    *
    *
    * @default
    * 1
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line.shape.percent
    */
  var percent: js.UndefOr[Double] = js.undefined
  /**
    * x value of the start point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line.shape.x1
    */
  var x1: js.UndefOr[Double] = js.undefined
  /**
    * x value of the end point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line.shape.x2
    */
  var x2: js.UndefOr[Double] = js.undefined
  /**
    * y value of the start point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line.shape.y1
    */
  var y1: js.UndefOr[Double] = js.undefined
  /**
    * y value of the end point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_line.shape.y2
    */
  var y2: js.UndefOr[Double] = js.undefined
}

object Anon_Percent {
  @scala.inline
  def apply(
    percent: Int | Double = null,
    x1: Int | Double = null,
    x2: Int | Double = null,
    y1: Int | Double = null,
    y2: Int | Double = null
  ): Anon_Percent = {
    val __obj = js.Dynamic.literal()
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Percent]
  }
}

