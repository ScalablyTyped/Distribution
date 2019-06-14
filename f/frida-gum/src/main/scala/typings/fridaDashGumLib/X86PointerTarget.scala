package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.byte
  - fridaDashGumLib.fridaDashGumLibStrings.dword
  - fridaDashGumLib.fridaDashGumLibStrings.qword
*/
trait X86PointerTarget extends js.Object

object X86PointerTarget {
  @scala.inline
  def Byte: fridaDashGumLib.fridaDashGumLibStrings.byte = this.cast("byte")
  @scala.inline
  def Dword: fridaDashGumLib.fridaDashGumLibStrings.dword = this.cast("dword")
  @scala.inline
  def Qword: fridaDashGumLib.fridaDashGumLibStrings.qword = this.cast("qword")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

