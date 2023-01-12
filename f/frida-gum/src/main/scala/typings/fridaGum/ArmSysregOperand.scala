package typings.fridaGum

import typings.fridaGum.fridaGumStrings.sysreg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArmSysregOperand
  extends StObject
     with ArmBaseOperand
     with ArmOperand {
  
  var `type`: sysreg
  
  var value: ArmRegister
}
object ArmSysregOperand {
  
  inline def apply(access: OperandAccess, subtracted: Boolean, value: ArmRegister): ArmSysregOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sysreg")
    __obj.asInstanceOf[ArmSysregOperand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArmSysregOperand] (val x: Self) extends AnyVal {
    
    inline def setType(value: sysreg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ArmRegister): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
