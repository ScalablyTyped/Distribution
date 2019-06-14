package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.reg
  - fridaDashGumLib.fridaDashGumLibStrings.imm
  - fridaDashGumLib.fridaDashGumLibStrings.mem
*/
trait X86OperandType extends js.Object

object X86OperandType {
  @scala.inline
  def Imm: fridaDashGumLib.fridaDashGumLibStrings.imm = this.cast("imm")
  @scala.inline
  def Mem: fridaDashGumLib.fridaDashGumLibStrings.mem = this.cast("mem")
  @scala.inline
  def Reg: fridaDashGumLib.fridaDashGumLibStrings.reg = this.cast("reg")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

