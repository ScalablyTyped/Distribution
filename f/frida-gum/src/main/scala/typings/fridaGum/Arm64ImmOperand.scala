package typings.fridaGum

import typings.fridaGum.fridaGumStrings.imm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arm64ImmOperand
  extends StObject
     with Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: imm
  
  var value: Int64
}
object Arm64ImmOperand {
  
  inline def apply(value: Int64): Arm64ImmOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("imm")
    __obj.asInstanceOf[Arm64ImmOperand]
  }
  
  extension [Self <: Arm64ImmOperand](x: Self) {
    
    inline def setType(value: imm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Int64): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
