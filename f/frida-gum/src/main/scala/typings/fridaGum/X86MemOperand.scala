package typings.fridaGum

import typings.fridaGum.anon.Base
import typings.fridaGum.fridaGumStrings.mem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X86MemOperand
  extends StObject
     with X86BaseOperand
     with X86Operand {
  
  var `type`: mem
  
  var value: Base
}
object X86MemOperand {
  
  inline def apply(access: OperandAccess, size: Double, value: Base): X86MemOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mem")
    __obj.asInstanceOf[X86MemOperand]
  }
  
  extension [Self <: X86MemOperand](x: Self) {
    
    inline def setType(value: mem): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Base): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
