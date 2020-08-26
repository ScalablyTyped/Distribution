package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTriggerCondition extends js.Object {
  var name: String = js.native
  // 是否由自己的生命周期触发
  var selfCallback: js.UndefOr[Boolean] = js.native
  // 触发类型
  var `type`: String = js.native
}

object EventTriggerCondition {
  @scala.inline
  def apply(name: String, `type`: String): EventTriggerCondition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTriggerCondition]
  }
  @scala.inline
  implicit class EventTriggerConditionOps[Self <: EventTriggerCondition] (val x: Self) extends AnyVal {
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
    def setSelfCallback(value: Boolean): Self = this.set("selfCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfCallback: Self = this.set("selfCallback", js.undefined)
  }
  
}

