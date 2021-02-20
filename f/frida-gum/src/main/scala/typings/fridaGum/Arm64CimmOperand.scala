package typings.fridaGum

import typings.fridaGum.fridaGumStrings.cimm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arm64CimmOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: cimm = js.native
  
  var value: Int64 = js.native
}
object Arm64CimmOperand {
  
  @scala.inline
  def apply(`type`: cimm, value: Int64): Arm64CimmOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64CimmOperand]
  }
  
  @scala.inline
  implicit class Arm64CimmOperandMutableBuilder[Self <: Arm64CimmOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: cimm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Int64): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
