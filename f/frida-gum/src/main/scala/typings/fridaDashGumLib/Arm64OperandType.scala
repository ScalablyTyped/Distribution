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
  - fridaDashGumLib.fridaDashGumLibStrings.`reg-mrs`
  - fridaDashGumLib.fridaDashGumLibStrings.`reg-msr`
  - fridaDashGumLib.fridaDashGumLibStrings.pstate
  - fridaDashGumLib.fridaDashGumLibStrings.sys
  - fridaDashGumLib.fridaDashGumLibStrings.prefetch
  - fridaDashGumLib.fridaDashGumLibStrings.barrier
*/
trait Arm64OperandType extends js.Object

object Arm64OperandType {
  @scala.inline
  def Barrier: fridaDashGumLib.fridaDashGumLibStrings.barrier = this.cast("barrier")
  @scala.inline
  def Cimm: fridaDashGumLib.fridaDashGumLibStrings.cimm = this.cast("cimm")
  @scala.inline
  def Fp: fridaDashGumLib.fridaDashGumLibStrings.fp = this.cast("fp")
  @scala.inline
  def Imm: fridaDashGumLib.fridaDashGumLibStrings.imm = this.cast("imm")
  @scala.inline
  def Mem: fridaDashGumLib.fridaDashGumLibStrings.mem = this.cast("mem")
  @scala.inline
  def Prefetch: fridaDashGumLib.fridaDashGumLibStrings.prefetch = this.cast("prefetch")
  @scala.inline
  def Pstate: fridaDashGumLib.fridaDashGumLibStrings.pstate = this.cast("pstate")
  @scala.inline
  def Reg: fridaDashGumLib.fridaDashGumLibStrings.reg = this.cast("reg")
  @scala.inline
  def RegMrs: fridaDashGumLib.fridaDashGumLibStrings.`reg-mrs` = this.cast("reg-mrs")
  @scala.inline
  def RegMsr: fridaDashGumLib.fridaDashGumLibStrings.`reg-msr` = this.cast("reg-msr")
  @scala.inline
  def Sys: fridaDashGumLib.fridaDashGumLibStrings.sys = this.cast("sys")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

