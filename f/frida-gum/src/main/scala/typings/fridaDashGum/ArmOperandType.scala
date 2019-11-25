package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.fridaDashGumStrings.reg
  - typings.fridaDashGum.fridaDashGumStrings.imm
  - typings.fridaDashGum.fridaDashGumStrings.mem
  - typings.fridaDashGum.fridaDashGumStrings.fp
  - typings.fridaDashGum.fridaDashGumStrings.cimm
  - typings.fridaDashGum.fridaDashGumStrings.pimm
  - typings.fridaDashGum.fridaDashGumStrings.setend
  - typings.fridaDashGum.fridaDashGumStrings.sysreg
*/
trait ArmOperandType extends js.Object

object ArmOperandType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cimm: typings.fridaDashGum.fridaDashGumStrings.cimm = this.cast("cimm")
  @scala.inline
  def fp: typings.fridaDashGum.fridaDashGumStrings.fp = this.cast("fp")
  @scala.inline
  def imm: typings.fridaDashGum.fridaDashGumStrings.imm = this.cast("imm")
  @scala.inline
  def mem: typings.fridaDashGum.fridaDashGumStrings.mem = this.cast("mem")
  @scala.inline
  def pimm: typings.fridaDashGum.fridaDashGumStrings.pimm = this.cast("pimm")
  @scala.inline
  def reg: typings.fridaDashGum.fridaDashGumStrings.reg = this.cast("reg")
  @scala.inline
  def setend: typings.fridaDashGum.fridaDashGumStrings.setend = this.cast("setend")
  @scala.inline
  def sysreg: typings.fridaDashGum.fridaDashGumStrings.sysreg = this.cast("sysreg")
}

