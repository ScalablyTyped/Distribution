package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventAction extends js.Object {
  var call: js.UndefOr[EventCallType] = js.native
  var name: String = js.native
  // 动作类型
  // call: 调用传进来的方法
  // jumpUrl: 跳转一个网址
  var `type`: String = js.native
}

object EventAction {
  @scala.inline
  def apply(name: String, `type`: String): EventAction = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAction]
  }
  @scala.inline
  implicit class EventActionOps[Self <: EventAction] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCall(value: EventCallType): Self = this.set("call", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCall: Self = this.set("call", js.undefined)
  }
  
}

