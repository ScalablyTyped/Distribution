package typings.fridaGum

import typings.fridaGum.fridaGumStrings.barrier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arm64BarrierOperand
  extends StObject
     with Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: barrier
  
  var value: Double
}
object Arm64BarrierOperand {
  
  inline def apply(access: OperandAccess, value: Double): Arm64BarrierOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("barrier")
    __obj.asInstanceOf[Arm64BarrierOperand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arm64BarrierOperand] (val x: Self) extends AnyVal {
    
    inline def setType(value: barrier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
