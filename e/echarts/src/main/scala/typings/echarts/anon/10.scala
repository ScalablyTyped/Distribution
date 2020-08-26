package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `10` extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-line.data.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BarBorderWidth] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-line.data.emphasis.label
    */
  var label: js.UndefOr[Distance] = js.native
}

object `10` {
  @scala.inline
  def apply(): `10` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`10`]
  }
  @scala.inline
  implicit class `10Ops`[Self <: `10`] (val x: Self) extends AnyVal {
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
    def setItemStyle(value: BarBorderWidth): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setLabel(value: Distance): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
  
}

