package typings.fridaGum

import typings.fridaGum.fridaGumStrings.barrier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arm64BarrierOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: barrier = js.native
  
  var value: Double = js.native
}
object Arm64BarrierOperand {
  
  @scala.inline
  def apply(`type`: barrier, value: Double): Arm64BarrierOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64BarrierOperand]
  }
  
  @scala.inline
  implicit class Arm64BarrierOperandMutableBuilder[Self <: Arm64BarrierOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: barrier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
