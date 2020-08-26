package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationEasing extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-pie.markPoint.animation
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Delay before updating the first animation, which supports
    * callback function for different data to have different animation
    * effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.markPoint)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markPoint.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
  /**
    * Delay before updating animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.markPoint)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    * prefix
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markPoint.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.native
  /**
    * Duration of the first animation, which supports callback
    * function for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.markPoint)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-pie.markPoint.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.markPoint)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-pie.markPoint.animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[js.Function | Double] = js.native
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://echarts.apache.org/examples/en/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-pie.markPoint.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.native
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-pie.markPoint.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[String] = js.native
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger
    * than threshold.
    *
    *
    * @default
    * 2000
    * @see https://echarts.apache.org/en/option.html#series-pie.markPoint.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.native
  /**
    * Data array for mark points, each of which is an object.
    * Here are some ways to assign mark point position.
    *
    * 1. Assign coordinate according to container with
    * [x](https://echarts.apache.org/en/option.html#series-pie.markPoint.data.x)
    * ,
    * [y](https://echarts.apache.org/en/option.html#series-pie.markPoint.data.y)
    * attribute, in which pixel values and percentage are supported.
    *
    * When multiple attributes exist, priority is as the above
    * order.
    *
    * **For example:**
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.markPoint)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markPoint.data
    */
  var data: js.UndefOr[SymbolKeepAspect] = js.native
  /**
    * Mark point style.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markPoint.itemStyle
    */
  var itemStyle: js.UndefOr[Emphasis] = js.native
  /**
    * Label of mark point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markPoint.label
    */
  var label: js.UndefOr[BorderWidth] = js.native
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to
    * mouse events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markPoint.silent
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Symbol of .
    *
    * Icon types provided by ECharts includes `'circle'`, `'rect'`,
    * `'roundRect'`, `'triangle'`, `'diamond'`, `'pin'`, `'arrow'`,
    * `'none'`
    *
    * It can be set to an image with `'image://url'` , in which
    * URL is the link to an image, or `dataURI` of an image.
    *
    * An image URL example:
    *
    * ```
    * 'image://http://xxx.xxx.xxx/a/b.png'
    *
    * ```
    *
    * A `dataURI` example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.markPoint)
    *
    * Icons can be set to arbitrary vector path via `'path://'`
    * in ECharts.
    * As compared with raster image, vector paths prevent from
    * jagging and blurring when scaled, and have a better control
    * over changing colors.
    * Size of vectoer icon will be adapted automatically.
    * Refer to
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * for more information about format of path.
    * You may export vector paths from tools like Adobe Illustrator.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.markPoint)
    *
    *
    * @default
    * "pin"
    * @see https://echarts.apache.org/en/option.html#series-pie.markPoint.symbol
    */
  var symbol: js.UndefOr[String] = js.native
  /**
    * Whether to keep aspect for symbols in the form of `path://`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markPoint.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.native
  /**
    * Offset of symbol relative to original position.
    * By default, symbol will be put in the center position of
    * data.
    * But if symbol is from user-defined vector path or image,
    * you may not expect symbol to be in center.
    * In this case, you may use this attribute to set offset to
    * default position.
    * It can be in absolute pixel value, or in relative percentage
    * value.
    *
    * For example, `[0, '50%']` means to move upside side position
    * of symbol height.
    * It can be used to make the arrow in the bottom to be at data
    * position when symbol is pin.
    *
    *
    * @default
    * [0, 0]
    * @see https://echarts.apache.org/en/option.html#series-pie.markPoint.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.native
  /**
    * Rotate degree of symbol.
    * Note that when `symbol` is set to be `'arrow'` in `markLine`,
    * `symbolRotate` value will be ignored, and compulsively use
    * tangent angle.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.markPoint.symbolRotate
    */
  var symbolRotate: js.UndefOr[Double] = js.native
  /**
    * symbol size.
    * It can be set to single numbers like `10`, or use an array
    * to represent width and height.
    * For example, `[20, 10]` means symbol width is `20`, and height
    * is`10`.
    *
    * If size of symbols needs to be different, you can set with
    * callback function in the following format:
    *
    * ```
    * (value: Array|number, params: Object) => number|Array
    *
    * ```
    *
    * The first parameter `value` is the value in
    * [data](https://echarts.apache.org/en/option.html#series-.data)
    * , and the second parameter `params` is the rest parameters
    * of data item.
    *
    *
    * @default
    * 50
    * @see https://echarts.apache.org/en/option.html#series-pie.markPoint.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | js.Function | Double] = js.native
}

object AnimationEasing {
  @scala.inline
  def apply(): AnimationEasing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationEasing]
  }
  @scala.inline
  implicit class AnimationEasingOps[Self <: AnimationEasing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAnimationDelay(value: js.Function | Double): Self = this.set("animationDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDelay: Self = this.set("animationDelay", js.undefined)
    @scala.inline
    def setAnimationDelayUpdate(value: js.Function | Double): Self = this.set("animationDelayUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDelayUpdate: Self = this.set("animationDelayUpdate", js.undefined)
    @scala.inline
    def setAnimationDuration(value: js.Function | Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setAnimationDurationUpdate(value: js.Function | Double): Self = this.set("animationDurationUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDurationUpdate: Self = this.set("animationDurationUpdate", js.undefined)
    @scala.inline
    def setAnimationEasing(value: String): Self = this.set("animationEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationEasing: Self = this.set("animationEasing", js.undefined)
    @scala.inline
    def setAnimationEasingUpdate(value: String): Self = this.set("animationEasingUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationEasingUpdate: Self = this.set("animationEasingUpdate", js.undefined)
    @scala.inline
    def setAnimationThreshold(value: Double): Self = this.set("animationThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationThreshold: Self = this.set("animationThreshold", js.undefined)
    @scala.inline
    def setData(value: SymbolKeepAspect): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setItemStyle(value: Emphasis): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setLabel(value: BorderWidth): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setSymbolKeepAspect(value: Boolean): Self = this.set("symbolKeepAspect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolKeepAspect: Self = this.set("symbolKeepAspect", js.undefined)
    @scala.inline
    def setSymbolOffsetVarargs(value: js.Any*): Self = this.set("symbolOffset", js.Array(value :_*))
    @scala.inline
    def setSymbolOffset(value: js.Array[_]): Self = this.set("symbolOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolOffset: Self = this.set("symbolOffset", js.undefined)
    @scala.inline
    def setSymbolRotate(value: Double): Self = this.set("symbolRotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolRotate: Self = this.set("symbolRotate", js.undefined)
    @scala.inline
    def setSymbolSizeVarargs(value: js.Any*): Self = this.set("symbolSize", js.Array(value :_*))
    @scala.inline
    def setSymbolSize(value: js.Array[_] | js.Function | Double): Self = this.set("symbolSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolSize: Self = this.set("symbolSize", js.undefined)
  }
  
}

