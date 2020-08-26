package typings.echarts.echarts.EChartOption

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseTextStyleWithRich extends js.Object {
  var rich: js.UndefOr[RichStyle] = js.native
}

object BaseTextStyleWithRich {
  @scala.inline
  def apply(): BaseTextStyleWithRich = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseTextStyleWithRich]
  }
  @scala.inline
  implicit class BaseTextStyleWithRichOps[Self <: BaseTextStyleWithRich] (val x: Self) extends AnyVal {
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
    def setRich(value: RichStyle): Self = this.set("rich", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRich: Self = this.set("rich", js.undefined)
  }
  
}

