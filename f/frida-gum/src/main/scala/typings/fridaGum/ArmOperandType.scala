package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.reg
  - typings.fridaGum.fridaGumStrings.imm
  - typings.fridaGum.fridaGumStrings.mem
  - typings.fridaGum.fridaGumStrings.fp
  - typings.fridaGum.fridaGumStrings.cimm
  - typings.fridaGum.fridaGumStrings.pimm
  - typings.fridaGum.fridaGumStrings.setend
  - typings.fridaGum.fridaGumStrings.sysreg
*/
trait ArmOperandType extends js.Object

object ArmOperandType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cimm: typings.fridaGum.fridaGumStrings.cimm = this.cast("cimm")
  @scala.inline
  def fp: typings.fridaGum.fridaGumStrings.fp = this.cast("fp")
  @scala.inline
  def imm: typings.fridaGum.fridaGumStrings.imm = this.cast("imm")
  @scala.inline
  def mem: typings.fridaGum.fridaGumStrings.mem = this.cast("mem")
  @scala.inline
  def pimm: typings.fridaGum.fridaGumStrings.pimm = this.cast("pimm")
  @scala.inline
  def reg: typings.fridaGum.fridaGumStrings.reg = this.cast("reg")
  @scala.inline
  def setend: typings.fridaGum.fridaGumStrings.setend = this.cast("setend")
  @scala.inline
  def sysreg: typings.fridaGum.fridaGumStrings.sysreg = this.cast("sysreg")
}

