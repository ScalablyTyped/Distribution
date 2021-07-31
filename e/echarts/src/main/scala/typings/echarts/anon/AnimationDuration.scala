package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationDuration extends StObject {
  
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.animation
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Delay before updating the first animation, which supports
    * callback function for different data to have different animation
    * effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markPoint)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  
  /**
    * Delay before updating animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markPoint)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    * prefix
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.undefined
  
  /**
    * Duration of the first animation, which supports callback
    * function for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markPoint)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
  
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markPoint)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[js.Function | Double] = js.undefined
  
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://echarts.apache.org/examples/en/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.undefined
  
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger
    * than threshold.
    *
    *
    * @default
    * 2000
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Data array for mark points, each of which is an object.
    * Here are some ways to assign mark point position.
    *
    * 1. Assign coordinate according to container with
    * [x](https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.x)
    * ,
    * [y](https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.y)
    * attribute, in which pixel values and percentage are supported.
    *
    * 2. Assign coordinate position with
    * [coord](https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.coord)
    * attribute, in which `'min'`, `'max'`, `'average'` are supported
    * for each dimension.
    *
    * 3. Use
    * [type](https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.type)
    * attribute to mark the maximum and minimum values in the series,
    * in which
    * [valueIndex](https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.valueIndex)
    * or
    * [valueDim](https://echarts.apache.org/en/option.html#series-scatter.markPoint.data.valueDim)
    * can be used to assign the dimension.
    *
    * When multiple attributes exist, priority is as the above
    * order.
    *
    * **For example:**
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markPoint)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.data
    */
  var data: js.UndefOr[Coord] = js.undefined
  
  /**
    * Mark point style.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.itemStyle
    */
  var itemStyle: js.UndefOr[Emphasis] = js.undefined
  
  /**
    * Label of mark point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.label
    */
  var label: js.UndefOr[BorderWidth] = js.undefined
  
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to
    * mouse events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.silent
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  
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
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markPoint)
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
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markPoint)
    *
    *
    * @default
    * "pin"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.symbol
    */
  var symbol: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to keep aspect for symbols in the form of `path://`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.undefined
  
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
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Rotate degree of symbol.
    * Note that when `symbol` is set to be `'arrow'` in `markLine`,
    * `symbolRotate` value will be ignored, and compulsively use
    * tangent angle.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.symbolRotate
    */
  var symbolRotate: js.UndefOr[Double] = js.undefined
  
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
    * @see https://echarts.apache.org/en/option.html#series-scatter.markPoint.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[js.Any] | js.Function | Double] = js.undefined
}
object AnimationDuration {
  
  @scala.inline
  def apply(): AnimationDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationDuration]
  }
  
  @scala.inline
  implicit class AnimationDurationMutableBuilder[Self <: AnimationDuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDelay(value: js.Function | Double): Self = StObject.set(x, "animationDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDelayUndefined: Self = StObject.set(x, "animationDelay", js.undefined)
    
    @scala.inline
    def setAnimationDelayUpdate(value: js.Function | Double): Self = StObject.set(x, "animationDelayUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDelayUpdateUndefined: Self = StObject.set(x, "animationDelayUpdate", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: js.Function | Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationDurationUpdate(value: js.Function | Double): Self = StObject.set(x, "animationDurationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUpdateUndefined: Self = StObject.set(x, "animationDurationUpdate", js.undefined)
    
    @scala.inline
    def setAnimationEasing(value: String): Self = StObject.set(x, "animationEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
    
    @scala.inline
    def setAnimationEasingUpdate(value: String): Self = StObject.set(x, "animationEasingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEasingUpdateUndefined: Self = StObject.set(x, "animationEasingUpdate", js.undefined)
    
    @scala.inline
    def setAnimationThreshold(value: Double): Self = StObject.set(x, "animationThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationThresholdUndefined: Self = StObject.set(x, "animationThreshold", js.undefined)
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setData(value: Coord): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setItemStyle(value: Emphasis): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: BorderWidth): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolKeepAspect(value: Boolean): Self = StObject.set(x, "symbolKeepAspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolKeepAspectUndefined: Self = StObject.set(x, "symbolKeepAspect", js.undefined)
    
    @scala.inline
    def setSymbolOffset(value: js.Array[js.Any]): Self = StObject.set(x, "symbolOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolOffsetUndefined: Self = StObject.set(x, "symbolOffset", js.undefined)
    
    @scala.inline
    def setSymbolOffsetVarargs(value: js.Any*): Self = StObject.set(x, "symbolOffset", js.Array(value :_*))
    
    @scala.inline
    def setSymbolRotate(value: Double): Self = StObject.set(x, "symbolRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolRotateUndefined: Self = StObject.set(x, "symbolRotate", js.undefined)
    
    @scala.inline
    def setSymbolSize(value: js.Array[js.Any] | js.Function | Double): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolSizeUndefined: Self = StObject.set(x, "symbolSize", js.undefined)
    
    @scala.inline
    def setSymbolSizeVarargs(value: js.Any*): Self = StObject.set(x, "symbolSize", js.Array(value :_*))
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
