package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fill extends js.Object {
  /**
    * Color filled in this element.
    *
    *
    * @default
    * '#000'
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_bezierCurve.style.fill
    */
  var fill: js.UndefOr[String] = js.undefined
  /**
    * Width of stroke.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_bezierCurve.style.lineWidth
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * Width of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_bezierCurve.style.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  /**
    * color of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_bezierCurve.style.shadowColor
    */
  var shadowColor: js.UndefOr[Double] = js.undefined
  /**
    * X offset of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_bezierCurve.style.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * Y offset of shadow.
    *
    *
    * @default
    * "undefined"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_bezierCurve.style.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
  /**
    * Color of stroke.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.return_bezierCurve.style.stroke
    */
  var stroke: js.UndefOr[String] = js.undefined
}

object Anon_Fill {
  @scala.inline
  def apply(
    fill: String = null,
    lineWidth: Int | Double = null,
    shadowBlur: Int | Double = null,
    shadowColor: Int | Double = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null,
    stroke: String = null
  ): Anon_Fill = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[Anon_Fill]
  }
}

