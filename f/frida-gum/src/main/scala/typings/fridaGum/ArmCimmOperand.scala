package typings.fridaGum

import typings.fridaGum.fridaGumStrings.cimm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArmCimmOperand
  extends StObject
     with ArmBaseOperand
     with ArmOperand {
  
  var `type`: cimm
  
  var value: Double
}
object ArmCimmOperand {
  
  inline def apply(access: OperandAccess, subtracted: Boolean, value: Double): ArmCimmOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cimm")
    __obj.asInstanceOf[ArmCimmOperand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArmCimmOperand] (val x: Self) extends AnyVal {
    
    inline def setType(value: cimm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
