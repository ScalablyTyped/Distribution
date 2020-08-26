package typings.echarts.echarts.EChartOption.SeriesGraph

import typings.echarts.anon.BorderRadius
import typings.echarts.anon.BorderType
import typings.echarts.anon.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CategoryObject extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-graph.categories.emphasis
    */
  var emphasis: js.UndefOr[`7`] = js.native
  /**
    * The style of node in this category.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.categories.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.native
  /**
    * The label style of node in this category.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.categories.label
    */
  var label: js.UndefOr[BorderRadius] = js.native
  /**
    * Name of category, which is used to correspond with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * and the content of
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.categories.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Symbol of node of this category.
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
    * [see doc](https://echarts.apache.org/en/option.html#series-graph.graph.categories)
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
    * [see doc](https://echarts.apache.org/en/option.html#series-graph.graph.categories)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.categories.symbol
    */
  var symbol: js.UndefOr[String] = js.native
  /**
    * Whether to keep aspect for symbols in the form of `path://`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.categories.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.native
  /**
    * Offset of node of this category symbol relative to original
    * position.
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
    * @see https://echarts.apache.org/en/option.html#series-graph.categories.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.native
  /**
    * Rotate degree of node of this category symbol.
    * Note that when `symbol` is set to be `'arrow'` in `markLine`,
    * `symbolRotate` value will be ignored, and compulsively use
    * tangent angle.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.categories.symbolRotate
    */
  var symbolRotate: js.UndefOr[Double] = js.native
  /**
    * node of this category symbol size.
    * It can be set to single numbers like `10`, or use an array
    * to represent width and height.
    * For example, `[20, 10]` means symbol width is `20`, and height
    * is`10`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-graph.categories.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | Double] = js.native
}

object CategoryObject {
  @scala.inline
  def apply(): CategoryObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoryObject]
  }
  @scala.inline
  implicit class CategoryObjectOps[Self <: CategoryObject] (val x: Self) extends AnyVal {
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
    def setEmphasis(value: `7`): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    @scala.inline
    def setItemStyle(value: BorderType): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setLabel(value: BorderRadius): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
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
    def setSymbolSize(value: js.Array[_] | Double): Self = this.set("symbolSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolSize: Self = this.set("symbolSize", js.undefined)
  }
  
}

