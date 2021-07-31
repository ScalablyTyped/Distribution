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
  
  @scala.inline
  def apply(subtracted: Boolean, value: Double): ArmFpOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fp")
    __obj.asInstanceOf[ArmFpOperand]
  }
  
  @scala.inline
  implicit class ArmFpOperandMutableBuilder[Self <: ArmFpOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: fp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
