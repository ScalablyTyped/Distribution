package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.windows
  - fridaDashGumLib.fridaDashGumLibStrings.darwin
  - fridaDashGumLib.fridaDashGumLibStrings.linux
  - fridaDashGumLib.fridaDashGumLibStrings.qnx
*/
trait Platform extends js.Object

object Platform {
  @scala.inline
  def Darwin: fridaDashGumLib.fridaDashGumLibStrings.darwin = this.cast("darwin")
  @scala.inline
  def Linux: fridaDashGumLib.fridaDashGumLibStrings.linux = this.cast("linux")
  @scala.inline
  def Qnx: fridaDashGumLib.fridaDashGumLibStrings.qnx = this.cast("qnx")
  @scala.inline
  def Windows: fridaDashGumLib.fridaDashGumLibStrings.windows = this.cast("windows")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

