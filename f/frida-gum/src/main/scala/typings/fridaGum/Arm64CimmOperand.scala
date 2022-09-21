package typings.fridaGum

import typings.fridaGum.fridaGumStrings.cimm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arm64CimmOperand
  extends StObject
     with Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: cimm
  
  var value: Int64
}
object Arm64CimmOperand {
  
  inline def apply(access: OperandAccess, value: Int64): Arm64CimmOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cimm")
    __obj.asInstanceOf[Arm64CimmOperand]
  }
  
  extension [Self <: Arm64CimmOperand](x: Self) {
    
    inline def setType(value: cimm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Int64): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
