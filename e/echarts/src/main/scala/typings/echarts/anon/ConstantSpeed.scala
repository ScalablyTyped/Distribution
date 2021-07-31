package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstantSpeed extends StObject {
  
  /**
    * The color of special effect symbol, which defaults to be
    * same with
    * [lineStyle.color](https://echarts.apache.org/en/option.html#series-lines.lineStyle.color)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.effect.color
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * If symbol movement of special effect has a constant speed,
    * which unit is pixel per second.
    * [period](https://echarts.apache.org/en/option.html#series-lines.effect.period)
    * will be ignored if `constantSpeed` is larger than 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.effect.constantSpeed
    */
  var constantSpeed: js.UndefOr[Double] = js.undefined
  
  /**
    * Effect animation delay.
    * Can be number or callback function.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.effect.delay
    */
  var delay: js.UndefOr[js.Function | Double] = js.undefined
  
  /**
    * Whether to loop the special effect animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-lines.effect.loop
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The duration of special effect, which unit is second.
    *
    *
    * @default
    * 4
    * @see https://echarts.apache.org/en/option.html#series-lines.effect.period
    */
  var period: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to show special effect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-lines.effect.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The symbol of special effect.
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
    * [see doc](https://echarts.apache.org/en/option.html#series-lines.lines.effect)
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
    * [see doc](https://echarts.apache.org/en/option.html#series-lines.lines.effect)
    *
    * The above example uses a custom path of plane shape.
    *
    * **Tip:** Ahe angle of symbol changes as the tangent of track
    * changes.
    * If you use a custom path, you should make sure that the path
    * shape are upward oriented.
    * It would ensure that the symbol will always move toward the
    * right moving direction when the symbol moves along the track.
    *
    *
    * @default
    * "circle"
    * @see https://echarts.apache.org/en/option.html#series-lines.effect.symbol
    */
  var symbol: js.UndefOr[String] = js.undefined
  
  /**
    * The symbol size of special effect, which could be set as
    * single number such as `10`.
    * What's more, arrays could be used to decribe the width and
    * height respectively.
    * For instance, `[20, 10]` indicates `20` for width and `10`
    * for height.
    *
    *
    * @default
    * 3
    * @see https://echarts.apache.org/en/option.html#series-lines.effect.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[js.Any] | Double] = js.undefined
  
  /**
    * The length of trail of special effect.
    * The values from 0 to 1 could be set.
    * Trail would be longer as the the value becomes larger.
    *
    *
    * @default
    * 0.2
    * @see https://echarts.apache.org/en/option.html#series-lines.effect.trailLength
    */
  var trailLength: js.UndefOr[Double] = js.undefined
}
object ConstantSpeed {
  
  @scala.inline
  def apply(): ConstantSpeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstantSpeed]
  }
  
  @scala.inline
  implicit class ConstantSpeedMutableBuilder[Self <: ConstantSpeed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setConstantSpeed(value: Double): Self = StObject.set(x, "constantSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstantSpeedUndefined: Self = StObject.set(x, "constantSpeed", js.undefined)
    
    @scala.inline
    def setDelay(value: js.Function | Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolSize(value: js.Array[js.Any] | Double): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolSizeUndefined: Self = StObject.set(x, "symbolSize", js.undefined)
    
    @scala.inline
    def setSymbolSizeVarargs(value: js.Any*): Self = StObject.set(x, "symbolSize", js.Array(value :_*))
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setTrailLength(value: Double): Self = StObject.set(x, "trailLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailLengthUndefined: Self = StObject.set(x, "trailLength", js.undefined)
  }
}
