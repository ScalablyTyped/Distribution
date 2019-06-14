package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.ia32
  - fridaDashGumLib.fridaDashGumLibStrings.x64
  - fridaDashGumLib.fridaDashGumLibStrings.arm
  - fridaDashGumLib.fridaDashGumLibStrings.arm64
  - fridaDashGumLib.fridaDashGumLibStrings.mips
*/
trait Architecture extends js.Object

object Architecture {
  @scala.inline
  def Arm: fridaDashGumLib.fridaDashGumLibStrings.arm = this.cast("arm")
  @scala.inline
  def Arm64: fridaDashGumLib.fridaDashGumLibStrings.arm64 = this.cast("arm64")
  @scala.inline
  def Ia32: fridaDashGumLib.fridaDashGumLibStrings.ia32 = this.cast("ia32")
  @scala.inline
  def Mips: fridaDashGumLib.fridaDashGumLibStrings.mips = this.cast("mips")
  @scala.inline
  def X64: fridaDashGumLib.fridaDashGumLibStrings.x64 = this.cast("x64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

