package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.windows
  - typings.fridaGum.fridaGumStrings.darwin
  - typings.fridaGum.fridaGumStrings.linux
  - typings.fridaGum.fridaGumStrings.qnx
*/
trait Platform extends js.Object

object Platform {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def darwin: typings.fridaGum.fridaGumStrings.darwin = this.cast("darwin")
  @scala.inline
  def linux: typings.fridaGum.fridaGumStrings.linux = this.cast("linux")
  @scala.inline
  def qnx: typings.fridaGum.fridaGumStrings.qnx = this.cast("qnx")
  @scala.inline
  def windows: typings.fridaGum.fridaGumStrings.windows = this.cast("windows")
}

