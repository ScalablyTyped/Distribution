package typings.fridaGum

import typings.fridaGum.anon.Base
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.X86RegOperand
  - typings.fridaGum.X86ImmOperand
  - typings.fridaGum.X86MemOperand
*/
trait X86Operand extends StObject
object X86Operand {
  
  @scala.inline
  def X86ImmOperand(size: Double, value: Double | Int64): typings.fridaGum.X86ImmOperand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("imm")
    __obj.asInstanceOf[typings.fridaGum.X86ImmOperand]
  }
  
  @scala.inline
  def X86MemOperand(size: Double, value: Base): typings.fridaGum.X86MemOperand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mem")
    __obj.asInstanceOf[typings.fridaGum.X86MemOperand]
  }
  
  @scala.inline
  def X86RegOperand(size: Double, value: X86Register): typings.fridaGum.X86RegOperand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg")
    __obj.asInstanceOf[typings.fridaGum.X86RegOperand]
  }
}
