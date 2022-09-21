package typings.fridaGum

import typings.fridaGum.fridaGumStrings.sys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arm64SysOperand
  extends StObject
     with Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: sys
  
  var value: Double
}
object Arm64SysOperand {
  
  inline def apply(access: OperandAccess, value: Double): Arm64SysOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sys")
    __obj.asInstanceOf[Arm64SysOperand]
  }
  
  extension [Self <: Arm64SysOperand](x: Self) {
    
    inline def setType(value: sys): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
