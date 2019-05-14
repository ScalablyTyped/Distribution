package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Length extends js.Object {
  /**
    * The length of split line, can be a pecentage value relative
    * to radius.
    *
    *
    * @default
    * 30
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.splitLine.length
    */
  var length: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.splitLine.lineStyle
    */
  var lineStyle: js.UndefOr[Anon_ColorOpacityShadowBlur] = js.undefined
  /**
    * Whether to show the split line.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.splitLine.show
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Length {
  @scala.inline
  def apply(
    length: scala.Double | java.lang.String = null,
    lineStyle: Anon_ColorOpacityShadowBlur = null,
    show: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Length = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_Length]
  }
}

