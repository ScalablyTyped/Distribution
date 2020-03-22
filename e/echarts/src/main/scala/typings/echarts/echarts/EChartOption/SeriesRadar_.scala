package typings.echarts.echarts.EChartOption

import typings.echarts.AnonAreaStyle
import typings.echarts.AnonBorderRadius
import typings.echarts.AnonExtraCssText
import typings.echarts.AnonOpacity
import typings.echarts.AnonShadowBlur
import typings.echarts.AnonShadowOffsetY
import typings.echarts.echarts.EChartOption.SeriesRadar.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **radar chart**
  *
  * Radar chart is mainly used to show multi-variable data, such as the
  * analysis of a football player's varied attributes. It relies
  * [radar](https://echarts.apache.org/en/option.html#radar)
  * component.
  *
  * Here is the example of AQI data which is presented in radar chart.
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-radar)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-radar
  */
trait SeriesRadar_ extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-radar.animation
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-radar.radar)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-radar.radar)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-radar.radar)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-radar.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-radar.radar)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-radar.animationDurationUpdate
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
    * @see https://echarts.apache.org/en/option.html#series-radar.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-radar.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[String] = js.undefined
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger than
    * threshold.
    *
    *
    * @default
    * 2000
    * @see https://echarts.apache.org/en/option.html#series-radar.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Area filling style.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.areaStyle
    */
  var areaStyle: js.UndefOr[AnonOpacity] = js.undefined
  /**
    * The data in radar chart is multi-variable (dimension).
    * Here is an example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-radar.radar)
    *
    * Among them, `value` item array contains data that is corresponding
    * to
    * [radar.indicator](https://echarts.apache.org/en/option.html#radar.indicator)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.data
    */
  var data: js.UndefOr[js.Array[DataObject]] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.emphasis
    */
  var emphasis: js.UndefOr[AnonAreaStyle] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Item style of the inflection point of the lines.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.itemStyle
    */
  var itemStyle: js.UndefOr[AnonShadowOffsetY] = js.undefined
  /**
    * Text label of , to explain some data information about graphic
    * item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter, `label`is
    * taken to be at the same level with `itemStyle`, and has `emphasis`
    * as `itemStyle` does.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.label
    */
  var label: js.UndefOr[AnonBorderRadius] = js.undefined
  /**
    * Line style.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.lineStyle
    */
  var lineStyle: js.UndefOr[AnonShadowBlur] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Index of
    * [radar](https://echarts.apache.org/en/option.html#radar)
    * component that radar chart uses.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.radarIndex
    */
  var radarIndex: js.UndefOr[Double] = js.undefined
  /**
    * Whether to ignore mouse events.
    * Default value is false, for triggering and responding to mouse
    * events.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.silent
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Symbol of .
    *
    * Icon types provided by ECharts includes `'circle'`, `'rect'`,
    * `'roundRect'`, `'triangle'`, `'diamond'`, `'pin'`, `'arrow'`,
    * `'none'`
    *
    * It can be set to an image with `'image://url'` , in which URL
    * is the link to an image, or `dataURI` of an image.
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
    * [see doc](https://echarts.apache.org/en/option.html#series-radar.radar)
    *
    * Icons can be set to arbitrary vector path via `'path://'` in
    * ECharts.
    * As compared with raster image, vector paths prevent from jagging
    * and blurring when scaled, and have a better control over changing
    * colors.
    * Size of vectoer icon will be adapted automatically. Refer to
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * for more information about format of path.
    * You may export vector paths from tools like Adobe Illustrator.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-radar.radar)
    *
    *
    * @default
    * "circle"
    * @see https://echarts.apache.org/en/option.html#series-radar.symbol
    */
  var symbol: js.UndefOr[String] = js.undefined
  /**
    * Whether to keep aspect for symbols in the form of `path://`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.undefined
  /**
    * Offset of symbol relative to original position.
    * By default, symbol will be put in the center position of data.
    * But if symbol is from user-defined vector path or image, you
    * may not expect symbol to be in center.
    * In this case, you may use this attribute to set offset to default
    * position.
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
    * @see https://echarts.apache.org/en/option.html#series-radar.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Rotate degree of symbol.
    * Note that when `symbol` is set to be `'arrow'` in `markLine`,
    * `symbolRotate` value will be ignored, and compulsively use tangent
    * angle.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.symbolRotate
    */
  var symbolRotate: js.UndefOr[Double] = js.undefined
  /**
    * symbol size.
    * It can be set to single numbers like `10`, or use an array to
    * represent width and height.
    * For example, `[20, 10]` means symbol width is `20`, and height
    * is`10`.
    *
    * If size of symbols needs to be different, you can set with callback
    * function in the following format:
    *
    * ```
    * (value: Array|number, params: Object) => number|Array
    *
    * ```
    *
    * The first parameter `value` is the value in
    * [data](https://echarts.apache.org/en/option.html#series-radar.data)
    * , and the second parameter `params` is the rest parameters of
    * data item.
    *
    *
    * @default
    * 4
    * @see https://echarts.apache.org/en/option.html#series-radar.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | js.Function | Double] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.tooltip
    */
  var tooltip: js.UndefOr[AnonExtraCssText] = js.undefined
  /**
    * @default
    * "radar"
    * @see https://echarts.apache.org/en/option.html#series-radar.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * `z` value of all graghical elements in radar chart, which controls
    * order of drawing graphical components.
    * Components with smaller `z` values may be overwritten by those
    * with larger `z` values.
    *
    * `z` has a lower priority to `zlevel`, and will not create new
    * Canvas.
    *
    *
    * @default
    * 2
    * @see https://echarts.apache.org/en/option.html#series-radar.z
    */
  var z: js.UndefOr[Double] = js.undefined
  /**
    * `zlevel` value of all graghical elements in radar chart.
    *
    * `zlevel` is used to make layers with Canvas.
    * Graphical elements with different `zlevel` values will be placed
    * in different Canvases, which is a common optimization technique.
    * We can put those frequently changed elements (like those with
    * animations) to a seperate `zlevel`.
    * Notice that too many Canvases will increase memory cost, and
    * should be used carefully on mobile phones to avoid crash.
    *
    * Canvases with bigger `zlevel` will be placed on Canvases with
    * smaller `zlevel`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-radar.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.undefined
}

object SeriesRadar_ {
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    animationDelay: js.Function | Double = null,
    animationDelayUpdate: js.Function | Double = null,
    animationDuration: js.Function | Double = null,
    animationDurationUpdate: js.Function | Double = null,
    animationEasing: String = null,
    animationEasingUpdate: String = null,
    animationThreshold: Int | Double = null,
    areaStyle: AnonOpacity = null,
    data: js.Array[DataObject] = null,
    emphasis: AnonAreaStyle = null,
    id: String = null,
    itemStyle: AnonShadowOffsetY = null,
    label: AnonBorderRadius = null,
    lineStyle: AnonShadowBlur = null,
    name: String = null,
    radarIndex: Int | Double = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    symbol: String = null,
    symbolKeepAspect: js.UndefOr[Boolean] = js.undefined,
    symbolOffset: js.Array[_] = null,
    symbolRotate: Int | Double = null,
    symbolSize: js.Array[_] | js.Function | Double = null,
    tooltip: AnonExtraCssText = null,
    `type`: String = null,
    z: Int | Double = null,
    zlevel: Int | Double = null
  ): SeriesRadar_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate.asInstanceOf[js.Any])
    if (animationThreshold != null) __obj.updateDynamic("animationThreshold")(animationThreshold.asInstanceOf[js.Any])
    if (areaStyle != null) __obj.updateDynamic("areaStyle")(areaStyle.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (radarIndex != null) __obj.updateDynamic("radarIndex")(radarIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(symbolKeepAspect)) __obj.updateDynamic("symbolKeepAspect")(symbolKeepAspect.asInstanceOf[js.Any])
    if (symbolOffset != null) __obj.updateDynamic("symbolOffset")(symbolOffset.asInstanceOf[js.Any])
    if (symbolRotate != null) __obj.updateDynamic("symbolRotate")(symbolRotate.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesRadar_]
  }
}

