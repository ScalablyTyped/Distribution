package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.fridaDashGumStrings.byte
  - typings.fridaDashGum.fridaDashGumStrings.dword
  - typings.fridaDashGum.fridaDashGumStrings.qword
*/
trait X86PointerTarget extends js.Object

object X86PointerTarget {
  @scala.inline
  def byte: typings.fridaDashGum.fridaDashGumStrings.byte = this.cast("byte")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dword: typings.fridaDashGum.fridaDashGumStrings.dword = this.cast("dword")
  @scala.inline
  def qword: typings.fridaDashGum.fridaDashGumStrings.qword = this.cast("qword")
}

