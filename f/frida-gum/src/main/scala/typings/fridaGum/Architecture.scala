package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.ia32
  - typings.fridaGum.fridaGumStrings.x64
  - typings.fridaGum.fridaGumStrings.arm
  - typings.fridaGum.fridaGumStrings.arm64
  - typings.fridaGum.fridaGumStrings.mips
*/
trait Architecture extends js.Object

object Architecture {
  @scala.inline
  def arm: typings.fridaGum.fridaGumStrings.arm = this.cast("arm")
  @scala.inline
  def arm64: typings.fridaGum.fridaGumStrings.arm64 = this.cast("arm64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ia32: typings.fridaGum.fridaGumStrings.ia32 = this.cast("ia32")
  @scala.inline
  def mips: typings.fridaGum.fridaGumStrings.mips = this.cast("mips")
  @scala.inline
  def x64: typings.fridaGum.fridaGumStrings.x64 = this.cast("x64")
}

