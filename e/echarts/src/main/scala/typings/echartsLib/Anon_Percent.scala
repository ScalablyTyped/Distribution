package typings
package echartsLib

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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_line.shape.percent
    */
  var percent: js.UndefOr[scala.Double] = js.undefined
  /**
    * x value of the start point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_line.shape.x1
    */
  var x1: js.UndefOr[scala.Double] = js.undefined
  /**
    * x value of the end point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_line.shape.x2
    */
  var x2: js.UndefOr[scala.Double] = js.undefined
  /**
    * y value of the start point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_line.shape.y1
    */
  var y1: js.UndefOr[scala.Double] = js.undefined
  /**
    * y value of the end point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_line.shape.y2
    */
  var y2: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Percent {
  @scala.inline
  def apply(
    percent: scala.Int | scala.Double = null,
    x1: scala.Int | scala.Double = null,
    x2: scala.Int | scala.Double = null,
    y1: scala.Int | scala.Double = null,
    y2: scala.Int | scala.Double = null
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

