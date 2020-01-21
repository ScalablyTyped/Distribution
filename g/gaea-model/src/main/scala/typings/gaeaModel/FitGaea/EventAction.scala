package typings.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventAction extends js.Object {
  var call: js.UndefOr[EventCallType] = js.undefined
  var name: String
  // 动作类型
  // call: 调用传进来的方法
  // jumpUrl: 跳转一个网址
  var `type`: String
}

object EventAction {
  @scala.inline
  def apply(name: String, `type`: String, call: EventCallType = null): EventAction = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (call != null) __obj.updateDynamic("call")(call.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAction]
  }
}

