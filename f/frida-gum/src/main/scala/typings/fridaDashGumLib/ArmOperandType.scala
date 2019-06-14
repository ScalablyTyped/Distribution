package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.reg
  - fridaDashGumLib.fridaDashGumLibStrings.imm
  - fridaDashGumLib.fridaDashGumLibStrings.mem
  - fridaDashGumLib.fridaDashGumLibStrings.fp
  - fridaDashGumLib.fridaDashGumLibStrings.cimm
  - fridaDashGumLib.fridaDashGumLibStrings.pimm
  - fridaDashGumLib.fridaDashGumLibStrings.setend
  - fridaDashGumLib.fridaDashGumLibStrings.sysreg
*/
trait ArmOperandType extends js.Object

object ArmOperandType {
  @scala.inline
  def Cimm: fridaDashGumLib.fridaDashGumLibStrings.cimm = this.cast("cimm")
  @scala.inline
  def Fp: fridaDashGumLib.fridaDashGumLibStrings.fp = this.cast("fp")
  @scala.inline
  def Imm: fridaDashGumLib.fridaDashGumLibStrings.imm = this.cast("imm")
  @scala.inline
  def Mem: fridaDashGumLib.fridaDashGumLibStrings.mem = this.cast("mem")
  @scala.inline
  def Pimm: fridaDashGumLib.fridaDashGumLibStrings.pimm = this.cast("pimm")
  @scala.inline
  def Reg: fridaDashGumLib.fridaDashGumLibStrings.reg = this.cast("reg")
  @scala.inline
  def Setend: fridaDashGumLib.fridaDashGumLibStrings.setend = this.cast("setend")
  @scala.inline
  def Sysreg: fridaDashGumLib.fridaDashGumLibStrings.sysreg = this.cast("sysreg")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

