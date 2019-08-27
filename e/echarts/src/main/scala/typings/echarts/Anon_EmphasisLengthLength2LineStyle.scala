package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmphasisLengthLength2LineStyle extends js.Object {
  /**
    * The style of visual guide line in emphasis status.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.data.labelLine.emphasis
    */
  var emphasis: js.UndefOr[Anon_LineStyleShow] = js.undefined
  /**
    * The length of the first segment of visual guide line.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.data.labelLine.length
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * The length of the second segment of visual guide line.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.data.labelLine.length2
    */
  var length2: js.UndefOr[Double] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.data.labelLine.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorOpacityShadowBlur] = js.undefined
  /**
    * Whether to show the visual guide ine.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.data.labelLine.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to smooth the visual guide line.
    * It defaults to be `false` and can be set as `true` or
    * the values from 0 to 1 which indicating the smoothness.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pie.data.labelLine.smooth
    */
  var smooth: js.UndefOr[Boolean | Double] = js.undefined
}

object Anon_EmphasisLengthLength2LineStyle {
  @scala.inline
  def apply(
    emphasis: Anon_LineStyleShow = null,
    length: Int | Double = null,
    length2: Int | Double = null,
    lineStyle: Anon_ColorOpacityShadowBlur = null,
    show: js.UndefOr[Boolean] = js.undefined,
    smooth: Boolean | Double = null
  ): Anon_EmphasisLengthLength2LineStyle = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (length2 != null) __obj.updateDynamic("length2")(length2.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (smooth != null) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EmphasisLengthLength2LineStyle]
  }
}

