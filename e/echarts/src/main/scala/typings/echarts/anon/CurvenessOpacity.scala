package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurvenessOpacity extends js.Object {
  /**
    * The color of the edge in sankey graphs.
    *
    *
    * @default
    * "'#314656"
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis.lineStyle.color
    */
  var color: js.UndefOr[String] = js.native
  /**
    * The curveness of the edge in sankey graph.
    *
    *
    * @default
    * 0.5
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis.lineStyle.curveness
    */
  var curveness: js.UndefOr[Double] = js.native
  /**
    * The opacity of the edge in sankey graph.
    *
    *
    * @default
    * 0.2
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis.lineStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-sankey.sankey.links.emphasis.lineStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis.lineStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis.lineStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.native
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis.lineStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-sankey.links.emphasis.lineStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
}

object CurvenessOpacity {
  @scala.inline
  def apply(): CurvenessOpacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurvenessOpacity]
  }
  @scala.inline
  implicit class CurvenessOpacityOps[Self <: CurvenessOpacity] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCurveness(value: Double): Self = this.set("curveness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurveness: Self = this.set("curveness", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setShadowBlur(value: Double): Self = this.set("shadowBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowBlur: Self = this.set("shadowBlur", js.undefined)
    @scala.inline
    def setShadowColor(value: String): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowColor: Self = this.set("shadowColor", js.undefined)
    @scala.inline
    def setShadowOffsetX(value: Double): Self = this.set("shadowOffsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowOffsetX: Self = this.set("shadowOffsetX", js.undefined)
    @scala.inline
    def setShadowOffsetY(value: Double): Self = this.set("shadowOffsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowOffsetY: Self = this.set("shadowOffsetY", js.undefined)
  }
  
}

