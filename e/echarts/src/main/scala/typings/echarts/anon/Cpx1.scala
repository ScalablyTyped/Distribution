package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cpx1 extends js.Object {
  /**
    * x of control point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.cpx1
    */
  var cpx1: js.UndefOr[Double] = js.undefined
  /**
    * x of the second control point.
    * If specified, cubic bezier is used.
    *
    * If both `cpx2` and `cpy2` are not set, quatratic
    * bezier is used.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.cpx2
    */
  var cpx2: js.UndefOr[Double] = js.undefined
  /**
    * y of control point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.cpy1
    */
  var cpy1: js.UndefOr[Double] = js.undefined
  /**
    * y of the second control point.
    * If specified, cubic bezier is used.
    *
    * If both `cpx2` and `cpy2` are not set, quatratic
    * bezier is used.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.cpy2
    */
  var cpy2: js.UndefOr[Double] = js.undefined
  /**
    * Specify the percentage of drawing, useful in animation.
    *
    * Value range: \[0, 1\].
    *
    *
    * @default
    * 1
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.percent
    */
  var percent: js.UndefOr[Double] = js.undefined
  /**
    * x value of the start point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.x1
    */
  var x1: js.UndefOr[Double] = js.undefined
  /**
    * x value of the end point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.x2
    */
  var x2: js.UndefOr[Double] = js.undefined
  /**
    * y value of the start point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.y1
    */
  var y1: js.UndefOr[Double] = js.undefined
  /**
    * y value of the end point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_bezierCurve.shape.y2
    */
  var y2: js.UndefOr[Double] = js.undefined
}

object Cpx1 {
  @scala.inline
  def apply(
    cpx1: js.UndefOr[Double] = js.undefined,
    cpx2: js.UndefOr[Double] = js.undefined,
    cpy1: js.UndefOr[Double] = js.undefined,
    cpy2: js.UndefOr[Double] = js.undefined,
    percent: js.UndefOr[Double] = js.undefined,
    x1: js.UndefOr[Double] = js.undefined,
    x2: js.UndefOr[Double] = js.undefined,
    y1: js.UndefOr[Double] = js.undefined,
    y2: js.UndefOr[Double] = js.undefined
  ): Cpx1 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cpx1)) __obj.updateDynamic("cpx1")(cpx1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cpx2)) __obj.updateDynamic("cpx2")(cpx2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cpy1)) __obj.updateDynamic("cpy1")(cpy1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cpy2)) __obj.updateDynamic("cpy2")(cpy2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x1)) __obj.updateDynamic("x1")(x1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x2)) __obj.updateDynamic("x2")(x2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y1)) __obj.updateDynamic("y1")(y1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y2)) __obj.updateDynamic("y2")(y2.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cpx1]
  }
}

