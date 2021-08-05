package typings.fridaGum

import typings.fridaGum.fridaGumStrings.pstate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arm64PstateOperand
  extends StObject
     with Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: pstate
  
  var value: Double
}
object Arm64PstateOperand {
  
  inline def apply(value: Double): Arm64PstateOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pstate")
    __obj.asInstanceOf[Arm64PstateOperand]
  }
  
  extension [Self <: Arm64PstateOperand](x: Self) {
    
    inline def setType(value: pstate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
