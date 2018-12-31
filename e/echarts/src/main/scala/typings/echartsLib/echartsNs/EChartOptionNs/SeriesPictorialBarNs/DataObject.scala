package typings
package echartsLib.echartsNs.EChartOptionNs.SeriesPictorialBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.animation
    */
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify the delay time before animation start.
    * Callback function can be used, where different delay time
    * can be used on different element.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Specify the delay time before update animation.
    * Callback function can be used, where different delay time
    * can be used on different element.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback
    * function for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    *
    * @default
    * 1000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    *
    * @default
    * 300
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.animationEasing
    */
  var animationEasing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger
    * than threshold.
    *
    *
    * @default
    * 2000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.animationThreshold
    */
  var animationThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.emphasis
    */
  var emphasis: js.UndefOr[echartsLib.Anon_ItemStyleLabelAnonShadowOffsetXBorderType] = js.undefined
  /**
    * Whether to enable hover animation.
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.hoverAnimation)
    * , where all data items in the series will be affected by
    * this attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.hoverAnimation)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.hoverAnimation
    */
  var hoverAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.itemStyle
    */
  var itemStyle: js.UndefOr[echartsLib.Anon_ShadowOffsetXBorderTypeShadowBlurBorderWidth] = js.undefined
  /**
    * The style setting of the text label in a single bar.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.label
    */
  var label: js.UndefOr[
    echartsLib.Anon_ShadowOffsetXBackgroundColorShowAlignTextBorderWidthVerticalAlignShadowBlur
  ] = js.undefined
  /**
    * The name of data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify the type of graphic elements.
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
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
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    * Example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbol)
    * , where all data items in the series will be affected by
    * this attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbol)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    *
    * @default
    * "circle"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbol
    */
  var symbol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines a bounding area availble for the graphic elements.
    * This setting gives a data, which will then be translated
    * to a coordinate on the coordinate system.
    * The coordinate specifies the bounding.
    * Namely, if `symbolBoundingData` is set, the final size (or
    * layout) of the graphic elements depend on the `symbolBoundingData`.
    *
    * When reference bar is horizontal, `symbolBoundingData` is
    * coresponding to x axis, while reference bar is vertical,
    * `symbolBoundingData` is coresponding to y axis.
    *
    * Rule:
    *
    * + If
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is not used:
    *
    * `symbolBoundingData` is the same as the size of reference
    * bar by default.
    * The size of the graphic element is detemined by `symbolBoundingData`.
    * For example, if reference bar is vertical, its data is `24`,
    * `symbolSize` is set as `[30, '50%']`, `symbolBoundingData`
    * is set as `124`, the final size of the graphic element will
    * be `124 * 50% = 62`.
    * If `symbolBoundingData` is not set, the final size will be
    * `24 * 50% = 12`.
    *
    * + If
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is used:
    *
    * `symbolBoundingData` is the extreme value of the coordinate
    * system.
    * `symbolBoundingData` defines a bounding area, where repeated
    * graphic elements layout according to
    * [symbolMargin](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolMargin)
    * and
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * and
    * [symbolSize](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolSize)
    *
    *
    * Both these settings determine the gap size of the repeated
    * graphic elements.
    *
    * `symbolBoundingData` is usually used in these cases:
    *
    * + When
    * [symbolCilp](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolClip)
    * is used:
    *
    * And a series is used to display "amont value", while another
    * series is used to display "current value".
    * `symbolBoundingData` can be used to ensure that the graphic
    * elements of these two series are at the same size.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    * + When
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is used:
    *
    * `symbolBoundingData` can be use to ensure the gaps of the
    * elements in different bars are the same.
    * Of cource, you can do not set `symbolBoundingData`, whose
    * default value is a stable value (extreme value of the coordinate
    * system).
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    * `symbolBoundingData` can also be an array, such as `[-40,
    * 60]`, which specifies both negative and positive symbolBoundingData.
    *
    * Check this example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolBoundingData)
    * , where all data items in the series will be affected by
    * this attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolBoundingData)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolBoundingData
    */
  var symbolBoundingData: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to clip graphic elements.
    *
    * + `false`/null/undefined: The whole graphic elements represent
    * the size of value.
    * + `true`: The clipped graphic elements reperent the size
    * of value.
    *
    * `symbolClip` is usually used in this case: both "amont value"
    * and "current value" should be displayed.
    * In this case, tow series can be used.
    * One for background, using complete graphic elements, while
    * another for current value, using clipped graphic elements.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    * Notice, in the example above,
    *
    * + The same
    * [symbolBoundingData](https://ecomfe.github.io/echarts-doc/public/en/option.html#series.pictorialBar.symbolBoundingData)
    * is used in "background series" and "current value seires",
    * which makes their graphic elements are the same size.
    * + A bigger
    * [z](https://ecomfe.github.io/echarts-doc/public/en/option.html#series.pictorialBar.z)
    * is set on "current value series", which makes it is over
    * "background series".
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolClip)
    * , where all data items in the series will be affected by
    * this attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolClip)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolClip
    */
  var symbolClip: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify margin of both sides of a graphic element.
    * ("both sides" means the two sides in the direction of its
    * value axis). It works only when
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is used.
    *
    * Absolute value can be used (like `20`), or percent value
    * can be used (like `'-30%'`), which is based on its
    * [symbolSize](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolSize)
    * .
    *
    * `symbolMargin` can be positive value or negative value, which
    * enables overlap of graphic elements when
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is used.
    *
    * A `"!"` can be appended on the end of the value, like `"30%!"`
    * or `25!`, which means a extra blank will be added on the
    * both ends, otherwise the graphic elements on both ends will
    * reach the boundary by default.
    *
    * Notice:
    *
    * + When
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is `true`/`'fixed'`: The given `symbolMargin` is just a reference
    * value.
    * The final gap of graphic elements will be calculated according
    * to
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * , `symbolMargin` and
    * [symbolBoundingData](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolBoundingData)
    * .
    * + When
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is set as a number: `symbolMargin` does not work any more.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolMargin)
    * , where all data items in the series will be affected by
    * this attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolMargin)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolMargin
    */
  var symbolMargin: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Specify the offset of graphic element according to its original
    * position.
    * Adopting `symbolOffset` is the final step in layout, which
    * enables adjustment of graphic element position.
    *
    * A absolute value can be set (like `10`), or a percent value
    * can be set (like `'120%'`、`['55%', 23]`), which is based
    * on its
    * [symbolSize](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolSize)
    * .
    *
    * For example, `[0, '-50%']` means the graphic element will
    * be adjusted upward half of the size of itself.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolOffset)
    * , where all data items in the series will be affected by
    * this attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolOffset)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    *
    * @default
    * [0, 0]
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Image can be used as the pattern of graphic elements.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    * `symbolPatternSize` specifies the size of pattern image.
    * For example, if `symbolPatternSize` is `400`, the pattern
    * image will be displayed at the size of `400px * 400px`.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolPatternSize)
    * , where all data items in the series will be affected by
    * this attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolPatternSize)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    *
    * @default
    * 400
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolPatternSize
    */
  var symbolPatternSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify the location of the graphic elements.
    * Optional values:
    *
    * + `'start'`: The edge of graphic element inscribes with the
    * start of the reference bar.
    * + `'end'`: The edge of graphic element inscribes with the
    * end of the reference bar.
    * + `'center'`: The graphic element is at the center of the
    * reference bar.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolPosition)
    * , where all data items in the series will be affected by
    * this attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolPosition)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    *
    * @default
    * "start"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolPosition
    */
  var symbolPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to repeat a graphic element. Optional values:
    *
    * + `false`/`null`/`undefined`: Do not repeat, that is, each
    * graphic element represents a data item.
    * + `true`: Repeat, that is, a group of repeated graphic elements
    * represent a data item.
    * The repeat times is calculated according to
    * [data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data)
    * .
    * + a number: Repeat, that is a group of repeated graphic elements
    * represent a data item.
    * The repeat times is always the given number.
    * + `'fixed'`: Repeat, that is a group of repeated graphic
    * elements represent a data item.
    * The repeat times is calcuated according to
    * [symbolBoundingData](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolBoundingData)
    * , that is, the repeat times has nothing to do with
    * [data](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data)
    *
    *
    * The setting is useful when graphic elements are used as background.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * , where all data items in the series will be affected by
    * this attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolRepeat)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolRepeat
    */
  var symbolRepeat: js.UndefOr[scala.Boolean | scala.Double | java.lang.String] = js.undefined
  /**
    * When
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is used, `symbolRepeatDirection` specifies the render order
    * of the repeatd graphic elements.
    * The setting is useful in these cases below:
    *
    * + If
    * [symbolMargin](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolMargin)
    * is set as a negative value, repeated elements will overlap
    * with each other.
    * `symbolRepeatDirection` can be used to specify the order
    * of overlap.
    *
    * + If
    * [animationDelay](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.animationDelay)
    * or
    * [animationDelayUpdate](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.animationDelayUpdate)
    * is used, `symbolRepeatDirection` specifies the order of index.
    *
    * Optional values can be `'start'` and `'end'`.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeatDirection)
    * , where all data items in the series will be affected by
    * this attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolRepeatDirection)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    *
    * @default
    * "start"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolRepeatDirection
    */
  var symbolRepeatDirection: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The degree of the rotation of a graphic element.
    *
    * Notice, `symbolRotate` will not affect the position of the
    * graphic element, but just rotating by its center.
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRotate)
    * , where all data items in the series will be affected by
    * this attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolRotate)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolRotate
    */
  var symbolRotate: js.UndefOr[scala.Double] = js.undefined
  /**
    * Symbol size.
    *
    * It can be set as a array, which means \[width, height\].
    * For example, `[20, 10]` means width `20` and height `10`.
    * It can also be set as a single number, like `10`, which is
    * equivalent to `[10, 10]`.
    *
    * Absolute value can be used (like `10`), or percent value
    * can be used (like `'120%'`, `['55%', 23]`).
    *
    * When percent value is used, final size of the graphic element
    * is calculated based on its
    * [reference bar](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar)
    * .
    *
    * For example, there is a reference bar based on x axis (that
    * is, it is a vertical bar), and
    * [symbolSize](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolSize)
    * is set as `['30%', '50%']`, the final size of its graphic
    * elements is:
    *
    * + width: `<width of reference bar> * 30%`。
    * + height:
    * + If
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is used: `<height of reference bar> * 50%`.
    * + If
    * [symbolRepeat](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolRepeat)
    * is not used: `<height of reference bar> * 50%`.
    *
    * Analogously, the case that based on y axis can be obtained
    * by exchanging them.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    * This attribute can be set at the
    * [root level of a series](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.symbolSize)
    * , where all data items in the series will be affected by
    * this attribute. And this attribute can also be set at
    * [each data item](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolSize)
    * in
    * [series-pictorialBar.data](https://ecomfe.github.io/echarts-doc/public/en/option.htmlseries-pictorialBar.data)
    * , where only the data item is affected by this attribute.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.data)
    *
    *
    * @default
    * ['100%', '100%']
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | scala.Double] = js.undefined
  /**
    * tooltip settings in this series data.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.tooltip
    */
  var tooltip: js.UndefOr[echartsLib.Anon_BackgroundColor] = js.undefined
  /**
    * The value of a single data item.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.value
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify the relationship of overlap between gaphic elements.
    * A bigger value means higher.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.data.z
    */
  var z: js.UndefOr[scala.Double] = js.undefined
}

