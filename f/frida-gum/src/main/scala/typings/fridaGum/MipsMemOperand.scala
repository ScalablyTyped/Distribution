package typings.fridaGum

import typings.fridaGum.anon.BaseDisp
import typings.fridaGum.fridaGumStrings.mem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MipsMemOperand extends MipsOperand {
  
  var `type`: mem = js.native
  
  var value: BaseDisp = js.native
}
object MipsMemOperand {
  
  @scala.inline
  def apply(`type`: mem, value: BaseDisp): MipsMemOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
