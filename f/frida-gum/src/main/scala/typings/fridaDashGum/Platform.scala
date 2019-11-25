package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.fridaDashGumStrings.windows
  - typings.fridaDashGum.fridaDashGumStrings.darwin
  - typings.fridaDashGum.fridaDashGumStrings.linux
  - typings.fridaDashGum.fridaDashGumStrings.qnx
*/
trait Platform extends js.Object

object Platform {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def darwin: typings.fridaDashGum.fridaDashGumStrings.darwin = this.cast("darwin")
  @scala.inline
  def linux: typings.fridaDashGum.fridaDashGumStrings.linux = this.cast("linux")
  @scala.inline
  def qnx: typings.fridaDashGum.fridaDashGumStrings.qnx = this.cast("qnx")
  @scala.inline
  def windows: typings.fridaDashGum.fridaDashGumStrings.windows = this.cast("windows")
}

