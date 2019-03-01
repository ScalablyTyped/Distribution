package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cpx1 extends js.Object {
  /**
    * x of control point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_bezierCurve.shape.cpx1
    */
  var cpx1: js.UndefOr[scala.Double] = js.undefined
  /**
    * x of the second control point.
    * If specified, cubic bezier is used.
    *
    * If both `cpx2` and `cpy2` are not set, quatratic
    * bezier is used.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_bezierCurve.shape.cpx2
    */
  var cpx2: js.UndefOr[scala.Double] = js.undefined
  /**
    * y of control point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_bezierCurve.shape.cpy1
    */
  var cpy1: js.UndefOr[scala.Double] = js.undefined
  /**
    * y of the second control point.
    * If specified, cubic bezier is used.
    *
    * If both `cpx2` and `cpy2` are not set, quatratic
    * bezier is used.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_bezierCurve.shape.cpy2
    */
  var cpy2: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify the percentage of drawing, useful in animation.
    *
    * Value range: \[0, 1\].
    *
    *
    * @default
    * 1
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_bezierCurve.shape.percent
    */
  var percent: js.UndefOr[scala.Double] = js.undefined
  /**
    * x value of the start point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_bezierCurve.shape.x1
    */
  var x1: js.UndefOr[scala.Double] = js.undefined
  /**
    * x value of the end point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_bezierCurve.shape.x2
    */
  var x2: js.UndefOr[scala.Double] = js.undefined
  /**
    * y value of the start point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_bezierCurve.shape.y1
    */
  var y1: js.UndefOr[scala.Double] = js.undefined
  /**
    * y value of the end point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_bezierCurve.shape.y2
    */
  var y2: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Cpx1 {
  @scala.inline
  def apply(
    cpx1: scala.Int | scala.Double = null,
    cpx2: scala.Int | scala.Double = null,
    cpy1: scala.Int | scala.Double = null,
    cpy2: scala.Int | scala.Double = null,
    percent: scala.Int | scala.Double = null,
    x1: scala.Int | scala.Double = null,
    x2: scala.Int | scala.Double = null,
    y1: scala.Int | scala.Double = null,
    y2: scala.Int | scala.Double = null
  ): Anon_Cpx1 = {
    val __obj = js.Dynamic.literal()
    if (cpx1 != null) __obj.updateDynamic("cpx1")(cpx1.asInstanceOf[js.Any])
    if (cpx2 != null) __obj.updateDynamic("cpx2")(cpx2.asInstanceOf[js.Any])
    if (cpy1 != null) __obj.updateDynamic("cpy1")(cpy1.asInstanceOf[js.Any])
    if (cpy2 != null) __obj.updateDynamic("cpy2")(cpy2.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cpx1]
  }
}

