package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Size extends js.Object {
  /**
    * When `barLayout` is needed, (for example, when attaching
    * some extra graphic elements to bar chart), this method
    * can be used to obtain bar layout info.
    *
    * See a
    * [sample](https://ecomfe.github.io/echarts-examples/public/editor.html?c=custom-bar-trend)
    * .
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.barLayout
    */
  var barLayout: js.UndefOr[js.Function] = js.undefined
  /**
    * Convert data to coordinate.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.coord
    */
  var coord: js.UndefOr[js.Function] = js.undefined
  /**
    * Obtain the current series index.
    * Notice that the `currentSeriesIndex` is different
    * from `seriesIndex` when legend is used to filter
    * some series.
    *
    * ```
    * @return {number}
    *
    * ```
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.currentSeriesIndices
    */
  var currentSeriesIndices: js.UndefOr[js.Function] = js.undefined
  /**
    * Obtain font string, which can be used on style setting
    * directly.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.font
    */
  var font: js.UndefOr[js.Function] = js.undefined
  /**
    * ```
    * @return {number} The current devicePixelRatio。
    *
    * ```
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.getDevicePixelRatio
    */
  var getDevicePixelRatio: js.UndefOr[js.Function] = js.undefined
  /**
    * ```
    * @return {number} Height of echarts container.
    *
    * ```
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.getHeight
    */
  var getHeight: js.UndefOr[js.Function] = js.undefined
  /**
    * ```
    * @return {number} Width of echarts containter.
    *
    * ```
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.getWidth
    */
  var getWidth: js.UndefOr[js.Function] = js.undefined
  /**
    * ```
    * @return {module:zrender} zrender instance.
    *
    * ```
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.getZr
    */
  var getZr: js.UndefOr[js.Function] = js.undefined
  /**
    * Get the size by the given data range.
    *
    * For example, in `cartesian2d`, suppose calling `api.size([2,
    * 4])` returns `[12.4,
    * 55]`.
    * It represents that on x axis, data range `2` corresponds
    * to size `12.4`,
    * and on y axis data range `4` corresponds to size
    * `55`.
    *
    * In some coordinate systems (for example, polar) or
    * when log axis is used, the size is different in different
    * point.
    * So the second parameter is necessary to calculate
    * size on the given point.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.size
    */
  var size: js.UndefOr[js.Function] = js.undefined
  /**
    * The method obtains style info defined in
    * [series.itemStyle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.itemStyle)
    * , and visual info obtained by visual mapping, and
    * return them.
    * Those returned info can be assigned to `style` attribute
    * of graphic element definition directly.
    * Developers can also override style info by calling
    * this method like this: `api.style({fill:
    * 'green', stroke: 'yellow'})`.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.style
    */
  var style: js.UndefOr[js.Function] = js.undefined
  /**
    * The method obtains style info defined in
    * [series.itemStyle.emphasis](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.itemStyle.emphasis)
    * , and visual info obtained by visual mapping, and
    * return them.
    * Those returned info can be assigned to `style` attribute
    * of graphic element definition directly.
    * Developers can also override style info by calling
    * this method like this: `api.style({fill:
    * 'green', stroke: 'yellow'})`.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.styleEmphasis
    */
  var styleEmphasis: js.UndefOr[js.Function] = js.undefined
  /**
    * Get value on the given dimension.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.value
    */
  var value: js.UndefOr[js.Function] = js.undefined
  /**
    * Get the visual info. It is rarely be used.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-custom.renderItem.arguments.api.visual
    */
  var visual: js.UndefOr[js.Function] = js.undefined
}

