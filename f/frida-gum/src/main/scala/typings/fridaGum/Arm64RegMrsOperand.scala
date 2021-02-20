package typings.fridaGum

import typings.fridaGum.fridaGumStrings.`reg-mrs`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arm64RegMrsOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: `reg-mrs` = js.native
  
  var value: Arm64Register = js.native
}
object Arm64RegMrsOperand {
  
  @scala.inline
  def apply(`type`: `reg-mrs`, value: Arm64Register): Arm64RegMrsOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64RegMrsOperand]
  }
  
  @scala.inline
  implicit class Arm64RegMrsOperandMutableBuilder[Self <: Arm64RegMrsOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `reg-mrs`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Arm64Register): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
