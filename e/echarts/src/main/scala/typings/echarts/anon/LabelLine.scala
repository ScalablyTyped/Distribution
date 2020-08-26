package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelLine extends js.Object {
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.emphasis.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.emphasis.label
    */
  var label: js.UndefOr[FontStyle] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-funnel.emphasis.labelLine
    */
  var labelLine: js.UndefOr[Length] = js.native
}

object LabelLine {
  @scala.inline
  def apply(): LabelLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelLine]
  }
  @scala.inline
  implicit class LabelLineOps[Self <: LabelLine] (val x: Self) extends AnyVal {
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
    def setItemStyle(value: BorderType): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setLabel(value: FontStyle): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelLine(value: Length): Self = this.set("labelLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelLine: Self = this.set("labelLine", js.undefined)
  }
  
}

