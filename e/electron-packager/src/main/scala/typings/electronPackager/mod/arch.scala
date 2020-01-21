package typings.electronPackager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.electronPackager.electronPackagerStrings.ia32
  - typings.electronPackager.electronPackagerStrings.x64
  - typings.electronPackager.electronPackagerStrings.armv7l
  - typings.electronPackager.electronPackagerStrings.arm64
  - typings.electronPackager.electronPackagerStrings.mips64el
  - typings.electronPackager.electronPackagerStrings.all
*/
trait arch extends js.Object

object arch {
  @scala.inline
  def all: typings.electronPackager.electronPackagerStrings.all = this.cast("all")
  @scala.inline
  def arm64: typings.electronPackager.electronPackagerStrings.arm64 = this.cast("arm64")
  @scala.inline
  def armv7l: typings.electronPackager.electronPackagerStrings.armv7l = this.cast("armv7l")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ia32: typings.electronPackager.electronPackagerStrings.ia32 = this.cast("ia32")
  @scala.inline
  def mips64el: typings.electronPackager.electronPackagerStrings.mips64el = this.cast("mips64el")
  @scala.inline
  def x64: typings.electronPackager.electronPackagerStrings.x64 = this.cast("x64")
}

