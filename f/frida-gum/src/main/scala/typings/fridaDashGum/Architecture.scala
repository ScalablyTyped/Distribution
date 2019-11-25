package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.fridaDashGumStrings.ia32
  - typings.fridaDashGum.fridaDashGumStrings.x64
  - typings.fridaDashGum.fridaDashGumStrings.arm
  - typings.fridaDashGum.fridaDashGumStrings.arm64
  - typings.fridaDashGum.fridaDashGumStrings.mips
*/
trait Architecture extends js.Object

object Architecture {
  @scala.inline
  def arm: typings.fridaDashGum.fridaDashGumStrings.arm = this.cast("arm")
  @scala.inline
  def arm64: typings.fridaDashGum.fridaDashGumStrings.arm64 = this.cast("arm64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ia32: typings.fridaDashGum.fridaDashGumStrings.ia32 = this.cast("ia32")
  @scala.inline
  def mips: typings.fridaDashGum.fridaDashGumStrings.mips = this.cast("mips")
  @scala.inline
  def x64: typings.fridaDashGum.fridaDashGumStrings.x64 = this.cast("x64")
}

