package typings.findJavaHome.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.findJavaHome.findJavaHomeStrings.x86
  - typings.findJavaHome.findJavaHomeStrings.x64
*/
trait RegArch extends js.Object

object RegArch {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def x64: typings.findJavaHome.findJavaHomeStrings.x64 = this.cast("x64")
  @scala.inline
  def x86: typings.findJavaHome.findJavaHomeStrings.x86 = this.cast("x86")
}

