package typings.fridaGum

import typings.fridaGum.fridaGumStrings.reg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArmRegOperand
  extends ArmBaseOperand
     with ArmOperand {
  
  var `type`: reg = js.native
  
  var value: ArmRegister = js.native
}
object ArmRegOperand {
  
  @scala.inline
  def apply(subtracted: Boolean, `type`: reg, value: ArmRegister): ArmRegOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmRegOperand]
  }
  
  @scala.inline
  implicit class ArmRegOperandMutableBuilder[Self <: ArmRegOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: reg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ArmRegister): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
