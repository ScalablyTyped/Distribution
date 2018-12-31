package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TextBorderWidth extends js.Object {
  /**
    * text color.
    *
    *
    * @default
    * "#fff"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data.tooltip.textStyle.color
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * font family
    *
    * Can also be 'serif' , 'monospace', ...
    *
    *
    * @default
    * "sans-serif"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data.tooltip.textStyle.fontFamily
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
    * font size
    *
    *
    * @default
    * 14
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data.tooltip.textStyle.fontSize
    */
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * font style
    *
    * Options are:
    *
    * + `'normal'`
    * + `'italic'`
    * + `'oblique'`
    *
    *
    * @default
    * "normal"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data.tooltip.textStyle.fontStyle
    */
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * font thick weight
    *
    * Options are:
    *
    * + `'normal'`
    * + `'bold'`
    * + `'bolder'`
    * + `'lighter'`
    * + 100 | 200 | 300 | 400...
    *
    *
    * @default
    * "normal"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data.tooltip.textStyle.fontWeight
    */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Height of the text block.
    * It is the width of the text by default.
    * You may want to use it in some cases like using background
    * image (see `backgroundColor`).
    *
    * Notice, `width` and `height` specifies the width
    * and height of the content, without `padding`.
    *
    * Notice, `width` and `height` only work when `rich`
    * specified.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data.tooltip.textStyle.height
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Line height of the text fregment.
    *
    * If `lineHeight` is not set in `rich`, `lineHeight`
    * in parent level will be used. For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom.data.tooltip.textStyle)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data.tooltip.textStyle.lineHeight
    */
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Storke color of the text.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data.tooltip.textStyle.textBorderColor
    */
  var textBorderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Storke line width of the text.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data.tooltip.textStyle.textBorderWidth
    */
  var textBorderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow blue of the text itself.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data.tooltip.textStyle.textShadowBlur
    */
  var textShadowBlur: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow color of the text itself.
    *
    *
    * @default
    * "transparent"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data.tooltip.textStyle.textShadowColor
    */
  var textShadowColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Shadow X offset of the text itself.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data.tooltip.textStyle.textShadowOffsetX
    */
  var textShadowOffsetX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Shadow Y offset of the text itself.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data.tooltip.textStyle.textShadowOffsetY
    */
  var textShadowOffsetY: js.UndefOr[scala.Double] = js.undefined
  /**
    * Width of the text block.
    * It is the width of the text by default.
    * In most cases, there is no need to specify it.
    * You may want to use it in some cases like make simple
    * table or using background image (see `backgroundColor`).
    *
    * Notice, `width` and `height` specifies the width
    * and height of the content, without `padding`.
    *
    * `width` can also be percent string, like `'100%'`,
    * which represents the percent of `contentWidth` (that
    * is, the width without `padding`) of its container
    * box.
    * It is based on `contentWidth` because that each text
    * fregment is layout based on the `content box`, where
    * it makes no sense that calculating width based on
    * `outerWith` in prectice.
    *
    * Notice, `width` and `height` only work when `rich`
    * specified.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.data.tooltip.textStyle.width
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

