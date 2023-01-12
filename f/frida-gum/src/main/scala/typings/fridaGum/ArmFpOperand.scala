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
  
  inline def apply(access: OperandAccess, subtracted: Boolean, value: Double): ArmFpOperand = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fp")
    __obj.asInstanceOf[ArmFpOperand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArmFpOperand] (val x: Self) extends AnyVal {
    
    inline def setType(value: fp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
