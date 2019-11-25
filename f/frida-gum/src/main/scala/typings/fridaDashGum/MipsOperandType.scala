package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.fridaDashGumStrings.reg
  - typings.fridaDashGum.fridaDashGumStrings.imm
  - typings.fridaDashGum.fridaDashGumStrings.mem
*/
trait MipsOperandType extends js.Object

object MipsOperandType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def imm: typings.fridaDashGum.fridaDashGumStrings.imm = this.cast("imm")
  @scala.inline
  def mem: typings.fridaDashGum.fridaDashGumStrings.mem = this.cast("mem")
  @scala.inline
  def reg: typings.fridaDashGum.fridaDashGumStrings.reg = this.cast("reg")
}

