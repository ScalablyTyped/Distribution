package typings.fridaGum

import typings.fridaGum.fridaGumStrings.imm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArmImmOperand
  extends StObject
     with ArmBaseOperand
     with ArmOperand {
  
  var `type`: imm
  
  var value: Double
}
object ArmImmOperand {
  
  inline def apply(access: OperandAccess, subtracted: Boolean, value: Double): ArmImmOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("imm")
    __obj.asInstanceOf[ArmImmOperand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArmImmOperand] (val x: Self) extends AnyVal {
    
    inline def setType(value: imm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
