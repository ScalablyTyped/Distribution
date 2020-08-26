package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderColorSaturation extends js.Object {
  /**
    * The border color and gap color of a node.
    *
    *
    * @default
    * "#fff',"
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.borderColor
    */
  var borderColor: js.UndefOr[String] = js.native
  /**
    * The color saturation of a border or gap.
    * The value range is between 0 ~ 1.
    *
    * Tips:
    *
    * When `borderColorSaturation` is set, the `borderColor`
    * is disabled, and, instead, the final border color is
    * calculated based on the color of this node (this color
    * could be sepcified explicitly or inherited from its parent
    * node) and mixing with `borderColorSaturation`.
    *
    * In this way, a effect can be implemented: different sections
    * have different hue of gap color repectively, which makes
    * users easy to distinguish both sections and levels.
    *
    * **How to avoid confusion by setting border/gap of node**
    *
    * If all of the border/gaps are set with the same color,
    * confusion might occur when rectangulars in different
    * levels display at the same time.
    *
    * See the
    * [example](https://echarts.apache.org/examples/en/editor.html?c=doc-example/treemap-borderColor&edit=1&reset=1)
    *
    * Noticed that the child rectangles in the red area are
    * in the deeper level than rectangles that are saparated
    * by white gap.
    * So in the red area, basically we set gap color with red,
    * and use `borderColorSaturation` to lift the saturation.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.borderColorSaturation
    */
  var borderColorSaturation: js.UndefOr[String] = js.native
  /**
    * The border width of a node.
    * There is no border when it is set as `0`.
    *
    * Tip, gaps between child nodes are specified by
    * [gapWidth](https://echarts.apache.org/en/option.html#series-treemap.levels.gapWidth)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.borderWidth
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * The color of a node. It use global palette
    * [option.color](https://echarts.apache.org/en/option.html#color)
    * by default.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.color
    */
  var color: js.UndefOr[String] = js.native
  /**
    * The tranparent rate of a node, the range is between 0
    * ~ 1.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.colorAlpha
    */
  var colorAlpha: js.UndefOr[Double] = js.native
  /**
    * The color saturation of a node.
    * The range is between 0 ~ 1.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.colorSaturation
    */
  var colorSaturation: js.UndefOr[Double] = js.native
  /**
    * Gaps between child nodes.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.gapWidth
    */
  var gapWidth: js.UndefOr[Double] = js.native
  /**
    * Stroke color of each rect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.strokeColor
    */
  var strokeColor: js.UndefOr[String] = js.native
  /**
    * Stroke width of each rect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-treemap.data.itemStyle.strokeWidth
    */
  var strokeWidth: js.UndefOr[Double] = js.native
}

object BorderColorSaturation {
  @scala.inline
  def apply(): BorderColorSaturation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderColorSaturation]
  }
  @scala.inline
  implicit class BorderColorSaturationOps[Self <: BorderColorSaturation] (val x: Self) extends AnyVal {
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderColorSaturation(value: String): Self = this.set("borderColorSaturation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColorSaturation: Self = this.set("borderColorSaturation", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorAlpha(value: Double): Self = this.set("colorAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorAlpha: Self = this.set("colorAlpha", js.undefined)
    @scala.inline
    def setColorSaturation(value: Double): Self = this.set("colorSaturation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorSaturation: Self = this.set("colorSaturation", js.undefined)
    @scala.inline
    def setGapWidth(value: Double): Self = this.set("gapWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGapWidth: Self = this.set("gapWidth", js.undefined)
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
  }
  
}

