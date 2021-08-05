package typings.fridaGum

import typings.fridaGum.fridaGumStrings.`reg-msr`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arm64RegMsrOperand
  extends StObject
     with Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: `reg-msr`
  
  var value: Arm64Register
}
object Arm64RegMsrOperand {
  
  inline def apply(value: Arm64Register): Arm64RegMsrOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg-msr")
    __obj.asInstanceOf[Arm64RegMsrOperand]
  }
  
  extension [Self <: Arm64RegMsrOperand](x: Self) {
    
    inline def setType(value: `reg-msr`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Arm64Register): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
