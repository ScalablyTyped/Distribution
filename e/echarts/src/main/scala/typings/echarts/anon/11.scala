package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `11` extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.emphasis.label
    */
  var label: js.UndefOr[FontSize] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-lines.emphasis.lineStyle
    */
  var lineStyle: js.UndefOr[ShadowBlur] = js.native
}

object `11` {
  @scala.inline
  def apply(): `11` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`11`]
  }
  @scala.inline
  implicit class `11Ops`[Self <: `11`] (val x: Self) extends AnyVal {
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
    def setLabel(value: FontSize): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLineStyle(value: ShadowBlur): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
  }
  
}

