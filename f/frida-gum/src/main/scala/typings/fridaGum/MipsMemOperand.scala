package typings.fridaGum

import typings.fridaGum.anon.BaseDisp
import typings.fridaGum.fridaGumStrings.mem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MipsMemOperand
  extends StObject
     with MipsOperand {
  
  var `type`: mem
  
  var value: BaseDisp
}
object MipsMemOperand {
  
  @scala.inline
  def apply(value: BaseDisp): MipsMemOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mem")
    __obj.asInstanceOf[MipsMemOperand]
  }
  
  @scala.inline
  implicit class MipsMemOperandMutableBuilder[Self <: MipsMemOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: mem): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: BaseDisp): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
