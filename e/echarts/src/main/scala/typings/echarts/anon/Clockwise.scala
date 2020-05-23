package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clockwise extends js.Object {
  /**
    * Whether draw clockwise.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.clockwise
    */
  var clockwise: js.UndefOr[Boolean] = js.undefined
  /**
    * The x value of the center of the element in the coordinate
    * system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.cx
    */
  var cx: js.UndefOr[Double] = js.undefined
  /**
    * The y value of the center of the element in the coordinate
    * system of its parent.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.cy
    */
  var cy: js.UndefOr[Double] = js.undefined
  /**
    * end anble, in radian.
    *
    *
    * @default
    * "Math.PI * 2"
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.endAngle
    */
  var endAngle: js.UndefOr[Double] = js.undefined
  /**
    * Outside radius.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.r
    */
  var r: js.UndefOr[Double] = js.undefined
  /**
    * Inside radius.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.r0
    */
  var r0: js.UndefOr[Double] = js.undefined
  /**
    * start angle, in radian.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.return_arc.shape.startAngle
    */
  var startAngle: js.UndefOr[Double] = js.undefined
}

object Clockwise {
  @scala.inline
  def apply(
    clockwise: js.UndefOr[Boolean] = js.undefined,
    cx: js.UndefOr[Double] = js.undefined,
    cy: js.UndefOr[Double] = js.undefined,
    endAngle: js.UndefOr[Double] = js.undefined,
    r: js.UndefOr[Double] = js.undefined,
    r0: js.UndefOr[Double] = js.undefined,
    startAngle: js.UndefOr[Double] = js.undefined
  ): Clockwise = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clockwise)) __obj.updateDynamic("clockwise")(clockwise.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cx)) __obj.updateDynamic("cx")(cx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cy)) __obj.updateDynamic("cy")(cy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endAngle)) __obj.updateDynamic("endAngle")(endAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(r)) __obj.updateDynamic("r")(r.get.asInstanceOf[js.Any])
    if (!js.isUndefined(r0)) __obj.updateDynamic("r0")(r0.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startAngle)) __obj.updateDynamic("startAngle")(startAngle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clockwise]
  }
}

