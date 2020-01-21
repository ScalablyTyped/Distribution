package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.byte
  - typings.fridaGum.fridaGumStrings.dword
  - typings.fridaGum.fridaGumStrings.qword
*/
trait X86PointerTarget extends js.Object

object X86PointerTarget {
  @scala.inline
  def byte: typings.fridaGum.fridaGumStrings.byte = this.cast("byte")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dword: typings.fridaGum.fridaGumStrings.dword = this.cast("dword")
  @scala.inline
  def qword: typings.fridaGum.fridaGumStrings.qword = this.cast("qword")
}

