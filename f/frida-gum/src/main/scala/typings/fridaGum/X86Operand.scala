package typings.fridaGum

import typings.fridaGum.anon.Base
import typings.fridaGum.fridaGumStrings.imm
import typings.fridaGum.fridaGumStrings.mem
import typings.fridaGum.fridaGumStrings.reg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.X86RegOperand
  - typings.fridaGum.X86ImmOperand
  - typings.fridaGum.X86MemOperand
*/
trait X86Operand extends StObject
object X86Operand {
  
  @scala.inline
  def X86ImmOperand(size: Double, `type`: imm, value: Double | Int64): typings.fridaGum.X86ImmOperand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.X86ImmOperand]
  }
  
  @scala.inline
  def X86MemOperand(size: Double, `type`: mem, value: Base): typings.fridaGum.X86MemOperand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.X86MemOperand]
  }
  
  @scala.inline
  def X86RegOperand(size: Double, `type`: reg, value: X86Register): typings.fridaGum.X86RegOperand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fridaGum.X86RegOperand]
  }
}
