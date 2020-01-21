package typings.electronPackager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.electronPackager.electronPackagerStrings.linux
  - typings.electronPackager.electronPackagerStrings.win32
  - typings.electronPackager.electronPackagerStrings.darwin
  - typings.electronPackager.electronPackagerStrings.mas
  - typings.electronPackager.electronPackagerStrings.all
*/
trait platform extends js.Object

object platform {
  @scala.inline
  def all: typings.electronPackager.electronPackagerStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def darwin: typings.electronPackager.electronPackagerStrings.darwin = this.cast("darwin")
  @scala.inline
  def linux: typings.electronPackager.electronPackagerStrings.linux = this.cast("linux")
  @scala.inline
  def mas: typings.electronPackager.electronPackagerStrings.mas = this.cast("mas")
  @scala.inline
  def win32: typings.electronPackager.electronPackagerStrings.win32 = this.cast("win32")
}

