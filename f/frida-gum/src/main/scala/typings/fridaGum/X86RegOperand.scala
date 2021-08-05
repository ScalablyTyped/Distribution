package typings.fridaGum

import typings.fridaGum.fridaGumStrings.reg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X86RegOperand
  extends StObject
     with X86BaseOperand
     with X86Operand {
  
  var `type`: reg
  
  var value: X86Register
}
object X86RegOperand {
  
  inline def apply(size: Double, value: X86Register): X86RegOperand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg")
    __obj.asInstanceOf[X86RegOperand]
  }
  
  extension [Self <: X86RegOperand](x: Self) {
    
    inline def setType(value: reg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: X86Register): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
