package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventAction extends js.Object {
  var call: js.UndefOr[EventCallType] = js.undefined
  var name: java.lang.String
  // 动作类型
  // call: 调用传进来的方法
  // jumpUrl: 跳转一个网址
  var `type`: java.lang.String
}

object EventAction {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String, call: EventCallType = null): EventAction = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (call != null) __obj.updateDynamic("call")(call)
    __obj.asInstanceOf[EventAction]
  }
}

