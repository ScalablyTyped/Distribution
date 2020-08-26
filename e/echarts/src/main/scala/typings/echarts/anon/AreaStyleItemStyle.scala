package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaStyleItemStyle extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.areaStyle
    */
  var areaStyle: js.UndefOr[Opacity] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BarBorderWidth] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.label
    */
  var label: js.UndefOr[Distance] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-radar.data.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.native
}

object AreaStyleItemStyle {
  @scala.inline
  def apply(): AreaStyleItemStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaStyleItemStyle]
  }
  @scala.inline
  implicit class AreaStyleItemStyleOps[Self <: AreaStyleItemStyle] (val x: Self) extends AnyVal {
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
    def setAreaStyle(value: Opacity): Self = this.set("areaStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAreaStyle: Self = this.set("areaStyle", js.undefined)
    @scala.inline
    def setItemStyle(value: BarBorderWidth): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setLabel(value: Distance): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLineStyle(value: ShadowBlur): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
  }
  
}

