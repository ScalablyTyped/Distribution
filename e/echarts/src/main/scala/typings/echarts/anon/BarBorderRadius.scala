package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarBorderRadius extends js.Object {
  /**
    * The bodrder color of bar.
    *
    *
    * @default
    * '#000'
    * @see https://echarts.apache.org/en/option.html#series-bar.data.itemStyle.barBorderColor
    */
  var barBorderColor: js.UndefOr[String] = js.native
  /**
    * The radius of rounded corner.
    * Its unit is px.
    * And it supports use array to respectively specify the
    * 4 corner radiuses.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-bar.bar.data.itemStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.data.itemStyle.barBorderRadius
    */
  var barBorderRadius: js.UndefOr[js.Array[_] | Double] = js.native
  /**
    * The bodrder width of bar. defaults to have no border.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.data.itemStyle.barBorderWidth
    */
  var barBorderWidth: js.UndefOr[Double] = js.native
  /**
    * Bar color..
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-bar.data.itemStyle.color
    */
  var color: js.UndefOr[String] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-bar.data.itemStyle.emphasis
    */
  var emphasis: js.UndefOr[BarBorderWidth] = js.native
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will not
    * be drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.data.itemStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-bar.bar.data.itemStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.data.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.data.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.native
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.data.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-bar.data.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
}

object BarBorderRadius {
  @scala.inline
  def apply(): BarBorderRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarBorderRadius]
  }
  @scala.inline
  implicit class BarBorderRadiusOps[Self <: BarBorderRadius] (val x: Self) extends AnyVal {
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
    def setBarBorderColor(value: String): Self = this.set("barBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarBorderColor: Self = this.set("barBorderColor", js.undefined)
    @scala.inline
    def setBarBorderRadiusVarargs(value: js.Any*): Self = this.set("barBorderRadius", js.Array(value :_*))
    @scala.inline
    def setBarBorderRadius(value: js.Array[_] | Double): Self = this.set("barBorderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarBorderRadius: Self = this.set("barBorderRadius", js.undefined)
    @scala.inline
    def setBarBorderWidth(value: Double): Self = this.set("barBorderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarBorderWidth: Self = this.set("barBorderWidth", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setEmphasis(value: BarBorderWidth): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
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

