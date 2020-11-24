package typings.echarts.echarts.EChartOption.SeriesCustom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The second parameter of `renderItem`.
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api
  */
@js.native
trait RenderItemApi extends js.Object {
  
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
  var barLayout: js.UndefOr[js.Function] = js.native
  
  /**
    * Convert data to coordinate.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.coord
    */
  var coord: js.UndefOr[js.Function] = js.native
  
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
  var currentSeriesIndices: js.UndefOr[js.Function] = js.native
  
  /**
    * Obtain font string, which can be used on style setting
    * directly.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.font
    */
  var font: js.UndefOr[js.Function] = js.native
  
  /**
    * ```
    * @return {number} The current devicePixelRatio。
    *
    * ```
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.getDevicePixelRatio
    */
  var getDevicePixelRatio: js.UndefOr[js.Function] = js.native
  
  /**
    * ```
    * @return {number} Height of echarts container.
    *
    * ```
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.getHeight
    */
  var getHeight: js.UndefOr[js.Function] = js.native
  
  /**
    * ```
    * @return {number} Width of echarts containter.
    *
    * ```
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.getWidth
    */
  var getWidth: js.UndefOr[js.Function] = js.native
  
  /**
    * ```
    * @return {module:zrender} zrender instance.
    *
    * ```
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.getZr
    */
  var getZr: js.UndefOr[js.Function] = js.native
  
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
  var size: js.UndefOr[js.Function] = js.native
  
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
  var style: js.UndefOr[js.Function] = js.native
  
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
  var styleEmphasis: js.UndefOr[js.Function] = js.native
  
  /**
    * Get value on the given dimension.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.value
    */
  var value: js.UndefOr[js.Function] = js.native
  
  /**
    * Get the visual info. It is rarely be used.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-custom.custom.renderItem.arguments.api)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-custom.renderItem.arguments.api.visual
    */
  var visual: js.UndefOr[js.Function] = js.native
}
object RenderItemApi {
  
  @scala.inline
  def apply(): RenderItemApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderItemApi]
  }
  
  @scala.inline
  implicit class RenderItemApiOps[Self <: RenderItemApi] (val x: Self) extends AnyVal {
    
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
    def setBarLayout(value: js.Function): Self = this.set("barLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarLayout: Self = this.set("barLayout", js.undefined)
    
    @scala.inline
    def setCoord(value: js.Function): Self = this.set("coord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoord: Self = this.set("coord", js.undefined)
    
    @scala.inline
    def setCurrentSeriesIndices(value: js.Function): Self = this.set("currentSeriesIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentSeriesIndices: Self = this.set("currentSeriesIndices", js.undefined)
    
    @scala.inline
    def setFont(value: js.Function): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setGetDevicePixelRatio(value: js.Function): Self = this.set("getDevicePixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetDevicePixelRatio: Self = this.set("getDevicePixelRatio", js.undefined)
    
    @scala.inline
    def setGetHeight(value: js.Function): Self = this.set("getHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetHeight: Self = this.set("getHeight", js.undefined)
    
    @scala.inline
    def setGetWidth(value: js.Function): Self = this.set("getWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetWidth: Self = this.set("getWidth", js.undefined)
    
    @scala.inline
    def setGetZr(value: js.Function): Self = this.set("getZr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetZr: Self = this.set("getZr", js.undefined)
    
    @scala.inline
    def setSize(value: js.Function): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Function): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleEmphasis(value: js.Function): Self = this.set("styleEmphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleEmphasis: Self = this.set("styleEmphasis", js.undefined)
    
    @scala.inline
    def setValue(value: js.Function): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setVisual(value: js.Function): Self = this.set("visual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisual: Self = this.set("visual", js.undefined)
  }
}
