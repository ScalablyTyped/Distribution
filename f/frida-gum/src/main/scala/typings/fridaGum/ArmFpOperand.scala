package typings.fridaGum

import typings.fridaGum.fridaGumStrings.fp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArmFpOperand
  extends StObject
     with ArmBaseOperand
     with ArmOperand {
  
  var `type`: fp
  
  var value: Double
}
object ArmFpOperand {
  
  inline def apply(subtracted: Boolean, value: Double): ArmFpOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fp")
    __obj.asInstanceOf[ArmFpOperand]
  }
  
  extension [Self <: ArmFpOperand](x: Self) {
    
    inline def setType(value: fp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
