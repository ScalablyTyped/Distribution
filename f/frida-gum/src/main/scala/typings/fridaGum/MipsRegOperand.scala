package typings.fridaGum

import typings.fridaGum.fridaGumStrings.reg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MipsRegOperand
  extends StObject
     with MipsOperand {
  
  var `type`: reg
  
  var value: MipsRegister
}
object MipsRegOperand {
  
  @scala.inline
  def apply(value: MipsRegister): MipsRegOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg")
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
