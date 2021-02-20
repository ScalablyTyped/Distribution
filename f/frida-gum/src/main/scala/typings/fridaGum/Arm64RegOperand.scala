package typings.fridaGum

import typings.fridaGum.fridaGumStrings.reg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arm64RegOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: reg = js.native
  
  var value: Arm64Register = js.native
}
object Arm64RegOperand {
  
  @scala.inline
  def apply(`type`: reg, value: Arm64Register): Arm64RegOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64RegOperand]
  }
  
  @scala.inline
  implicit class Arm64RegOperandMutableBuilder[Self <: Arm64RegOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: reg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Arm64Register): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
