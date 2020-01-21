package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.reg
  - typings.fridaGum.fridaGumStrings.imm
  - typings.fridaGum.fridaGumStrings.mem
*/
trait MipsOperandType extends js.Object

object MipsOperandType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def imm: typings.fridaGum.fridaGumStrings.imm = this.cast("imm")
  @scala.inline
  def mem: typings.fridaGum.fridaGumStrings.mem = this.cast("mem")
  @scala.inline
  def reg: typings.fridaGum.fridaGumStrings.reg = this.cast("reg")
}

