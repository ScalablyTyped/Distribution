package typings.fridaGum

import typings.fridaGum.fridaGumStrings.`reg-msr`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arm64RegMsrOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: `reg-msr` = js.native
  
  var value: Arm64Register = js.native
}
object Arm64RegMsrOperand {
  
  @scala.inline
  def apply(`type`: `reg-msr`, value: Arm64Register): Arm64RegMsrOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64RegMsrOperand]
  }
  
  @scala.inline
  implicit class Arm64RegMsrOperandMutableBuilder[Self <: Arm64RegMsrOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `reg-msr`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Arm64Register): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
