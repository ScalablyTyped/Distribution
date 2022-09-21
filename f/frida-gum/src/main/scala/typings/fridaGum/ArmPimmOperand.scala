package typings.fridaGum

import typings.fridaGum.fridaGumStrings.pimm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArmPimmOperand
  extends StObject
     with ArmBaseOperand
     with ArmOperand {
  
  var `type`: pimm
  
  var value: Double
}
object ArmPimmOperand {
  
  inline def apply(access: OperandAccess, subtracted: Boolean, value: Double): ArmPimmOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pimm")
    __obj.asInstanceOf[ArmPimmOperand]
  }
  
  extension [Self <: ArmPimmOperand](x: Self) {
    
    inline def setType(value: pimm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
