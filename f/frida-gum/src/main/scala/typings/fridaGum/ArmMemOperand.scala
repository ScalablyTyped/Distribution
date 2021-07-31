package typings.fridaGum

import typings.fridaGum.anon.Disp
import typings.fridaGum.fridaGumStrings.mem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArmMemOperand
  extends StObject
     with ArmBaseOperand
     with ArmOperand {
  
  var `type`: mem
  
  var value: Disp
}
object ArmMemOperand {
  
  @scala.inline
  def apply(subtracted: Boolean, value: Disp): ArmMemOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mem")
    __obj.asInstanceOf[ArmMemOperand]
  }
  
  @scala.inline
  implicit class ArmMemOperandMutableBuilder[Self <: ArmMemOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: mem): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Disp): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
