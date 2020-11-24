package typings.fridaGum

import typings.fridaGum.fridaGumStrings.sysreg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArmSysregOperand
  extends ArmBaseOperand
     with ArmOperand {
  
  var `type`: sysreg = js.native
  
  var value: ArmRegister = js.native
}
object ArmSysregOperand {
  
  @scala.inline
  def apply(subtracted: Boolean, `type`: sysreg, value: ArmRegister): ArmSysregOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmSysregOperand]
  }
  
  @scala.inline
  implicit class ArmSysregOperandOps[Self <: ArmSysregOperand] (val x: Self) extends AnyVal {
    
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
    def setType(value: sysreg): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ArmRegister): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
