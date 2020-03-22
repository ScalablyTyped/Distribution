package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderColor0 extends js.Object {
  /**
    * Border color of bullish candle stick.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for
    * example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example
    * `'#ccc'`.
    * Gradient color and texture are also supported besides
    * single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick.data.emphasis.itemStyle)
    *
    *
    * @default
    * "#c23531"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.borderColor
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /**
    * Border color of bearish candle stick.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for
    * example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example
    * `'#ccc'`.
    * Gradient color and texture are also supported besides
    * single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick.data.emphasis.itemStyle)
    *
    *
    * @default
    * #314656
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.borderColor0
    */
  var borderColor0: js.UndefOr[String] = js.undefined
  /**
    * Border width of candlestick.
    * There is no border when it is `0`.
    *
    *
    * @default
    * 2
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.borderWidth
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * Fill color of bullish candle stick.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for
    * example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example
    * `'#ccc'`.
    * Gradient color and texture are also supported besides
    * single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick.data.emphasis.itemStyle)
    *
    *
    * @default
    * "#c23531"
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.color
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Fill color of bearish candle stick.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for
    * example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example
    * `'#ccc'`.
    * Gradient color and texture are also supported besides
    * single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick.data.emphasis.itemStyle)
    *
    *
    * @default
    * #314656
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.color0
    */
  var color0: js.UndefOr[String] = js.undefined
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will
    * not be drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-candlestick.candlestick.data.emphasis.itemStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.undefined
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.undefined
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.undefined
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-candlestick.data.emphasis.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.undefined
}

object AnonBorderColor0 {
  @scala.inline
  def apply(
    borderColor: String = null,
    borderColor0: String = null,
    borderWidth: Int | Double = null,
    color: String = null,
    color0: String = null,
    opacity: Int | Double = null,
    shadowBlur: Int | Double = null,
    shadowColor: String = null,
    shadowOffsetX: Int | Double = null,
    shadowOffsetY: Int | Double = null
  ): AnonBorderColor0 = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderColor0 != null) __obj.updateDynamic("borderColor0")(borderColor0.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (color0 != null) __obj.updateDynamic("color0")(color0.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shadowBlur != null) __obj.updateDynamic("shadowBlur")(shadowBlur.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (shadowOffsetX != null) __obj.updateDynamic("shadowOffsetX")(shadowOffsetX.asInstanceOf[js.Any])
    if (shadowOffsetY != null) __obj.updateDynamic("shadowOffsetY")(shadowOffsetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderColor0]
  }
}

