package typings.emberComponent.targetActionSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetActionSupport extends js.Object {
  def triggerAction(opts: TriggerActionOptions): Boolean
}

object TargetActionSupport {
  @scala.inline
  def apply(triggerAction: TriggerActionOptions => Boolean): TargetActionSupport = {
    val __obj = js.Dynamic.literal(triggerAction = js.Any.fromFunction1(triggerAction))
  
    __obj.asInstanceOf[TargetActionSupport]
  }
}

