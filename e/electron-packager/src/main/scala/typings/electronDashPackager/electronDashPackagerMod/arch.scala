package typings.electronDashPackager.electronDashPackagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.electronDashPackager.electronDashPackagerStrings.ia32
  - typings.electronDashPackager.electronDashPackagerStrings.x64
  - typings.electronDashPackager.electronDashPackagerStrings.armv7l
  - typings.electronDashPackager.electronDashPackagerStrings.arm64
  - typings.electronDashPackager.electronDashPackagerStrings.mips64el
  - typings.electronDashPackager.electronDashPackagerStrings.all
*/
trait arch extends js.Object

object arch {
  @scala.inline
  def all: typings.electronDashPackager.electronDashPackagerStrings.all = this.cast("all")
  @scala.inline
  def arm64: typings.electronDashPackager.electronDashPackagerStrings.arm64 = this.cast("arm64")
  @scala.inline
  def armv7l: typings.electronDashPackager.electronDashPackagerStrings.armv7l = this.cast("armv7l")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ia32: typings.electronDashPackager.electronDashPackagerStrings.ia32 = this.cast("ia32")
  @scala.inline
  def mips64el: typings.electronDashPackager.electronDashPackagerStrings.mips64el = this.cast("mips64el")
  @scala.inline
  def x64: typings.electronDashPackager.electronDashPackagerStrings.x64 = this.cast("x64")
}

