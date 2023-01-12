package typings.fridaGum

import typings.fridaGum.fridaGumStrings.imm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X86ImmOperand
  extends StObject
     with X86BaseOperand
     with X86Operand {
  
  var `type`: imm
  
  var value: Double | Int64
}
object X86ImmOperand {
  
  inline def apply(access: OperandAccess, size: Double, value: Double | Int64): X86ImmOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("imm")
    __obj.asInstanceOf[X86ImmOperand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X86ImmOperand] (val x: Self) extends AnyVal {
    
    inline def setType(value: imm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double | Int64): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
