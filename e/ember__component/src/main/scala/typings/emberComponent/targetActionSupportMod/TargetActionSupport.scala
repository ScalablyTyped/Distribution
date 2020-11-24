package typings.emberComponent.targetActionSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetActionSupport extends js.Object {
  
  def triggerAction(opts: TriggerActionOptions): Boolean = js.native
}
object TargetActionSupport {
  
  @scala.inline
  def apply(triggerAction: TriggerActionOptions => Boolean): TargetActionSupport = {
    val __obj = js.Dynamic.literal(triggerAction = js.Any.fromFunction1(triggerAction))
    __obj.asInstanceOf[TargetActionSupport]
  }
  
  @scala.inline
  implicit class TargetActionSupportOps[Self <: TargetActionSupport] (val x: Self) extends AnyVal {
    
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
    def setTriggerAction(value: TriggerActionOptions => Boolean): Self = this.set("triggerAction", js.Any.fromFunction1(value))
  }
}
