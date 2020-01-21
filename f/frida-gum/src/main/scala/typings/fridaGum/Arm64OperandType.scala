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
  - typings.fridaGum.fridaGumStrings.`reg-mrs`
  - typings.fridaGum.fridaGumStrings.`reg-msr`
  - typings.fridaGum.fridaGumStrings.pstate
  - typings.fridaGum.fridaGumStrings.sys
  - typings.fridaGum.fridaGumStrings.prefetch
  - typings.fridaGum.fridaGumStrings.barrier
*/
trait Arm64OperandType extends js.Object

object Arm64OperandType {
  @scala.inline
  def barrier: typings.fridaGum.fridaGumStrings.barrier = this.cast("barrier")
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
  def prefetch: typings.fridaGum.fridaGumStrings.prefetch = this.cast("prefetch")
  @scala.inline
  def pstate: typings.fridaGum.fridaGumStrings.pstate = this.cast("pstate")
  @scala.inline
  def reg: typings.fridaGum.fridaGumStrings.reg = this.cast("reg")
  @scala.inline
  def `reg-mrs`: typings.fridaGum.fridaGumStrings.`reg-mrs` = this.cast("reg-mrs")
  @scala.inline
  def `reg-msr`: typings.fridaGum.fridaGumStrings.`reg-msr` = this.cast("reg-msr")
  @scala.inline
  def sys: typings.fridaGum.fridaGumStrings.sys = this.cast("sys")
}

