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
  
  @scala.inline
  def apply(subtracted: Boolean, value: Double): ArmPimmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pimm")
    __obj.asInstanceOf[ArmPimmOperand]
  }
  
  @scala.inline
  implicit class ArmPimmOperandMutableBuilder[Self <: ArmPimmOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: pimm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
