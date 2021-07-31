package typings.fridaGum

import typings.fridaGum.fridaGumStrings.reg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arm64RegOperand
  extends StObject
     with Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: reg
  
  var value: Arm64Register
}
object Arm64RegOperand {
  
  @scala.inline
  def apply(value: Arm64Register): Arm64RegOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg")
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
