package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBarLayout extends js.Object {
  /**
    * When `barLayout` is needed, (for example, when attaching
    * some extra graphic elements to bar chart), this method
    * can be used to obtain bar layout info.
    *
    * See a
    * [sample](https://echarts.apache.org/examples/en/editor.html?c=custom-bar-trend)
    * .
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.barLayout
    */
  var barLayout: js.UndefOr[js.Function] = js.undefined
  /**
    * Convert data to coordinate.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.coord
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
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.currentSeriesIndices
    */
  var currentSeriesIndices: js.UndefOr[js.Function] = js.undefined
  /**
    * Obtain font string, which can be used on style setting
    * directly.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.font
    */
  var font: js.UndefOr[js.Function] = js.undefined
  /**
    * ```
    * @return {number} The current devicePixelRatio。
    *
    * ```
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.getDevicePixelRatio
    */
  var getDevicePixelRatio: js.UndefOr[js.Function] = js.undefined
  /**
    * ```
    * @return {number} Height of echarts container.
    *
    * ```
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.getHeight
    */
  var getHeight: js.UndefOr[js.Function] = js.undefined
  /**
    * ```
    * @return {number} Width of echarts containter.
    *
    * ```
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.getWidth
    */
  var getWidth: js.UndefOr[js.Function] = js.undefined
  /**
    * ```
    * @return {module:zrender} zrender instance.
    *
    * ```
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.getZr
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
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.size
    */
  var size: js.UndefOr[js.Function] = js.undefined
  /**
    * The method obtains style info defined in
    * [series.itemStyle](https://echarts.apache.org/en/option.html#series-custom.itemStyle)
    * , and visual info obtained by visual mapping, and
    * return them.
    * Those returned info can be assigned to `style` attribute
    * of graphic element definition directly.
    * Developers can also override style info by calling
    * this method like this: `api.style({fill:
    * 'green', stroke: 'yellow'})`.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.style
    */
  var style: js.UndefOr[js.Function] = js.undefined
  /**
    * The method obtains style info defined in
    * [series.itemStyle.emphasis](https://echarts.apache.org/en/option.html#series-custom.itemStyle.emphasis)
    * , and visual info obtained by visual mapping, and
    * return them.
    * Those returned info can be assigned to `style` attribute
    * of graphic element definition directly.
    * Developers can also override style info by calling
    * this method like this: `api.style({fill:
    * 'green', stroke: 'yellow'})`.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.styleEmphasis
    */
  var styleEmphasis: js.UndefOr[js.Function] = js.undefined
  /**
    * Get value on the given dimension.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.value
    */
  var value: js.UndefOr[js.Function] = js.undefined
  /**
    * Get the visual info. It is rarely be used.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.visual
    */
  var visual: js.UndefOr[js.Function] = js.undefined
}

object AnonBarLayout {
  @scala.inline
  def apply(
    barLayout: js.Function = null,
    coord: js.Function = null,
    currentSeriesIndices: js.Function = null,
    font: js.Function = null,
    getDevicePixelRatio: js.Function = null,
    getHeight: js.Function = null,
    getWidth: js.Function = null,
    getZr: js.Function = null,
    size: js.Function = null,
    style: js.Function = null,
    styleEmphasis: js.Function = null,
    value: js.Function = null,
    visual: js.Function = null
  ): AnonBarLayout = {
    val __obj = js.Dynamic.literal()
    if (barLayout != null) __obj.updateDynamic("barLayout")(barLayout.asInstanceOf[js.Any])
    if (coord != null) __obj.updateDynamic("coord")(coord.asInstanceOf[js.Any])
    if (currentSeriesIndices != null) __obj.updateDynamic("currentSeriesIndices")(currentSeriesIndices.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (getDevicePixelRatio != null) __obj.updateDynamic("getDevicePixelRatio")(getDevicePixelRatio.asInstanceOf[js.Any])
    if (getHeight != null) __obj.updateDynamic("getHeight")(getHeight.asInstanceOf[js.Any])
    if (getWidth != null) __obj.updateDynamic("getWidth")(getWidth.asInstanceOf[js.Any])
    if (getZr != null) __obj.updateDynamic("getZr")(getZr.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styleEmphasis != null) __obj.updateDynamic("styleEmphasis")(styleEmphasis.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (visual != null) __obj.updateDynamic("visual")(visual.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBarLayout]
  }
}

