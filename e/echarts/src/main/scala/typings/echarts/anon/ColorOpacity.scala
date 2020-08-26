package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorOpacity extends js.Object {
  /**
    * Fill color.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for example
    * `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example `'#ccc'`.
    * Gradient color and texture are also supported besides single
    * colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-line.line.areaStyle)
    *
    *
    * @default
    * "#000"
    * @see https://echarts.apache.org/en/option.html#series-line.areaStyle.color
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will not be
    * drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.areaStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * Origin position of area.
    *
    * By default, the area between axis line and data will be the
    * area to be filled.
    * This config enables you to fill data to the max or min of
    * the axis data.
    *
    * Valid values include: `'auto'` (default), `'start'`, `'end'`.
    *
    * + `'auto'` to fill between axis line to data;
    * + `'start'` to fill between min axis value (when not `inverse`)
    * to data;
    * + `'end'` to fill between max axis value (when not `inverse`)
    * to data;
    *
    *
    * @default
    * "auto"
    * @see https://echarts.apache.org/en/option.html#series-line.areaStyle.origin
    */
  var origin: js.UndefOr[String] = js.native
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-line.line.areaStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.areaStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.areaStyle.shadowColor
    */
  var shadowColor: js.UndefOr[String] = js.native
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.areaStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-line.areaStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
}

object ColorOpacity {
  @scala.inline
  def apply(): ColorOpacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorOpacity]
  }
  @scala.inline
  implicit class ColorOpacityOps[Self <: ColorOpacity] (val x: Self) extends AnyVal {
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
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
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

