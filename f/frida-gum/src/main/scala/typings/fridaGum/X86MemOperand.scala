package typings.fridaGum

import typings.fridaGum.anon.Base
import typings.fridaGum.fridaGumStrings.mem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X86MemOperand
  extends X86BaseOperand
     with X86Operand {
  
  var `type`: mem = js.native
  
  var value: Base = js.native
}
object X86MemOperand {
  
  @scala.inline
  def apply(size: Double, `type`: mem, value: Base): X86MemOperand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86MemOperand]
  }
  
  @scala.inline
  implicit class X86MemOperandMutableBuilder[Self <: X86MemOperand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: mem): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Base): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
