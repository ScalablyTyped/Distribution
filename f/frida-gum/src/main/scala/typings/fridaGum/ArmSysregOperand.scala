package typings.fridaGum

import typings.fridaGum.fridaGumStrings.sysreg
import org.scalablytyped.runtime.StObject
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
  implicit class ArmSysregOperandMutableBuilder[Self <: ArmSysregOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: sysreg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ArmRegister): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
