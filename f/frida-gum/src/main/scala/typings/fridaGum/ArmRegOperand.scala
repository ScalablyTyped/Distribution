package typings.fridaGum

import typings.fridaGum.fridaGumStrings.reg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArmRegOperand
  extends StObject
     with ArmBaseOperand
     with ArmOperand {
  
  var `type`: reg
  
  var value: ArmRegister
}
object ArmRegOperand {
  
  inline def apply(access: OperandAccess, subtracted: Boolean, value: ArmRegister): ArmRegOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg")
    __obj.asInstanceOf[ArmRegOperand]
  }
  
  extension [Self <: ArmRegOperand](x: Self) {
    
    inline def setType(value: reg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ArmRegister): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
