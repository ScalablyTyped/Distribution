package typings.fridaGum

import typings.fridaGum.fridaGumStrings.imm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MipsImmOperand
  extends StObject
     with MipsOperand {
  
  var `type`: imm
  
  var value: Double
}
object MipsImmOperand {
  
  inline def apply(value: Double): MipsImmOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("imm")
    __obj.asInstanceOf[MipsImmOperand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MipsImmOperand] (val x: Self) extends AnyVal {
    
    inline def setType(value: imm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
