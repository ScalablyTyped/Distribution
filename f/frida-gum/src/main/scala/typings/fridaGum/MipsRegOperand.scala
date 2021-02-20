package typings.fridaGum

import typings.fridaGum.fridaGumStrings.reg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MipsRegOperand extends MipsOperand {
  
  var `type`: reg = js.native
  
  var value: MipsRegister = js.native
}
object MipsRegOperand {
  
  @scala.inline
  def apply(`type`: reg, value: MipsRegister): MipsRegOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MipsRegOperand]
  }
  
  @scala.inline
  implicit class MipsRegOperandMutableBuilder[Self <: MipsRegOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: reg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: MipsRegister): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
