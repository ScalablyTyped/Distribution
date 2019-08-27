package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmphasisLengthLineStyle extends js.Object {
  /**
    * The style of visual guide line in emphasis status.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.data.emphasis.labelLine.emphasis
    */
  var emphasis: js.UndefOr[Anon_LineStyleShow] = js.undefined
  /**
    * The length of the first part from visual guide line.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.data.emphasis.labelLine.length
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.data.emphasis.labelLine.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorOpacityShadowBlur] = js.undefined
  /**
    * Whether to show visual guide line.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.data.emphasis.labelLine.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object Anon_EmphasisLengthLineStyle {
  @scala.inline
  def apply(
    emphasis: Anon_LineStyleShow = null,
    length: Int | Double = null,
    lineStyle: Anon_ColorOpacityShadowBlur = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): Anon_EmphasisLengthLineStyle = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_EmphasisLengthLineStyle]
  }
}

