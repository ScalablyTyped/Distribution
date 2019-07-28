package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmphasisLength extends js.Object {
  /**
    * The style of visual guide line in emphasis status.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.data.labelLine.emphasis
    */
  var emphasis: js.UndefOr[Anon_LineStyle] = js.undefined
  /**
    * The length of the first part from visual guide line.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.data.labelLine.length
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.data.labelLine.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorOpacityShadowBlur] = js.undefined
  /**
    * Whether to show visual guide line.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-funnel.data.labelLine.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object Anon_EmphasisLength {
  @scala.inline
  def apply(
    emphasis: Anon_LineStyle = null,
    length: Int | Double = null,
    lineStyle: Anon_ColorOpacityShadowBlur = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): Anon_EmphasisLength = {
    val __obj = js.Dynamic.literal()
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_EmphasisLength]
  }
}

