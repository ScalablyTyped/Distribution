package typings.fridaGum

import typings.fridaGum.fridaGumStrings.fp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arm64FpOperand
  extends StObject
     with Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: fp
  
  var value: Double
}
object Arm64FpOperand {
  
  @scala.inline
  def apply(value: Double): Arm64FpOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fp")
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
