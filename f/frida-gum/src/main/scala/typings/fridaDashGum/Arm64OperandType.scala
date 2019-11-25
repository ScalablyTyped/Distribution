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
  - typings.fridaDashGum.fridaDashGumStrings.`reg-mrs`
  - typings.fridaDashGum.fridaDashGumStrings.`reg-msr`
  - typings.fridaDashGum.fridaDashGumStrings.pstate
  - typings.fridaDashGum.fridaDashGumStrings.sys
  - typings.fridaDashGum.fridaDashGumStrings.prefetch
  - typings.fridaDashGum.fridaDashGumStrings.barrier
*/
trait Arm64OperandType extends js.Object

object Arm64OperandType {
  @scala.inline
  def barrier: typings.fridaDashGum.fridaDashGumStrings.barrier = this.cast("barrier")
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
  def prefetch: typings.fridaDashGum.fridaDashGumStrings.prefetch = this.cast("prefetch")
  @scala.inline
  def pstate: typings.fridaDashGum.fridaDashGumStrings.pstate = this.cast("pstate")
  @scala.inline
  def reg: typings.fridaDashGum.fridaDashGumStrings.reg = this.cast("reg")
  @scala.inline
  def `reg-mrs`: typings.fridaDashGum.fridaDashGumStrings.`reg-mrs` = this.cast("reg-mrs")
  @scala.inline
  def `reg-msr`: typings.fridaDashGum.fridaDashGumStrings.`reg-msr` = this.cast("reg-msr")
  @scala.inline
  def sys: typings.fridaDashGum.fridaDashGumStrings.sys = this.cast("sys")
}

