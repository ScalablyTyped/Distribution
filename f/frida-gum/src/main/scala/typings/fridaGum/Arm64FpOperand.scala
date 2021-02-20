package typings.fridaGum

import typings.fridaGum.fridaGumStrings.fp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arm64FpOperand
  extends Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: fp = js.native
  
  var value: Double = js.native
}
object Arm64FpOperand {
  
  @scala.inline
  def apply(`type`: fp, value: Double): Arm64FpOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64FpOperand]
  }
  
  @scala.inline
  implicit class Arm64FpOperandMutableBuilder[Self <: Arm64FpOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: fp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
