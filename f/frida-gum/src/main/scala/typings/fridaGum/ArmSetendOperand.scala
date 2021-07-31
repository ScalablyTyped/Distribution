package typings.fridaGum

import typings.fridaGum.fridaGumStrings.setend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArmSetendOperand
  extends StObject
     with ArmBaseOperand
     with ArmOperand {
  
  var `type`: setend
  
  var value: Endian
}
object ArmSetendOperand {
  
  @scala.inline
  def apply(subtracted: Boolean, value: Endian): ArmSetendOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("setend")
    __obj.asInstanceOf[ArmSetendOperand]
  }
  
  @scala.inline
  implicit class ArmSetendOperandMutableBuilder[Self <: ArmSetendOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: setend): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Endian): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
