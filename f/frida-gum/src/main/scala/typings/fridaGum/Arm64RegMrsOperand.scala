package typings.fridaGum

import typings.fridaGum.fridaGumStrings.`reg-mrs`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arm64RegMrsOperand
  extends StObject
     with Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: `reg-mrs`
  
  var value: Arm64Register
}
object Arm64RegMrsOperand {
  
  inline def apply(access: OperandAccess, value: Arm64Register): Arm64RegMrsOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg-mrs")
    __obj.asInstanceOf[Arm64RegMrsOperand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arm64RegMrsOperand] (val x: Self) extends AnyVal {
    
    inline def setType(value: `reg-mrs`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Arm64Register): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
