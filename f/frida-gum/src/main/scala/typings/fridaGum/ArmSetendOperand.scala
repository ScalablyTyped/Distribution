package typings.fridaGum

import typings.fridaGum.fridaGumStrings.setend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArmSetendOperand
  extends ArmBaseOperand
     with ArmOperand {
  
  var `type`: setend = js.native
  
  var value: Endian = js.native
}
object ArmSetendOperand {
  
  @scala.inline
  def apply(subtracted: Boolean, `type`: setend, value: Endian): ArmSetendOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
