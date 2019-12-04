package typings.atEmberComponent.dashPrivateActionDashSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSupport extends js.Object {
  def sendAction(action: String, params: js.Any*): Unit
}

object ActionSupport {
  @scala.inline
  def apply(sendAction: (String, /* repeated */ js.Any) => Unit): ActionSupport = {
    val __obj = js.Dynamic.literal(sendAction = js.Any.fromFunction2(sendAction))
  
    __obj.asInstanceOf[ActionSupport]
  }
}

