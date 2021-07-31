package typings.fridaGum

import typings.fridaGum.anon.Index
import typings.fridaGum.fridaGumStrings.mem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arm64MemOperand
  extends StObject
     with Arm64BaseOperand
     with Arm64Operand {
  
  var `type`: mem
  
  var value: Index
}
object Arm64MemOperand {
  
  @scala.inline
  def apply(value: Index): Arm64MemOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mem")
    __obj.asInstanceOf[Arm64MemOperand]
  }
  
  @scala.inline
  implicit class Arm64MemOperandMutableBuilder[Self <: Arm64MemOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: mem): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Index): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
