package typings.fridaGum

import typings.fridaGum.fridaGumStrings.imm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arm64ImmOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: imm = js.native
  
  var value: Int64 = js.native
}
object Arm64ImmOperand {
  
  @scala.inline
  def apply(`type`: imm, value: Int64): Arm64ImmOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64ImmOperand]
  }
  
  @scala.inline
  implicit class Arm64ImmOperandMutableBuilder[Self <: Arm64ImmOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: imm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Int64): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
