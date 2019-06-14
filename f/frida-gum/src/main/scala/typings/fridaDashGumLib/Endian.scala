package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.be
  - fridaDashGumLib.fridaDashGumLibStrings.le
*/
trait Endian extends js.Object

object Endian {
  @scala.inline
  def Big: fridaDashGumLib.fridaDashGumLibStrings.be = this.cast("be")
  @scala.inline
  def Little: fridaDashGumLib.fridaDashGumLibStrings.le = this.cast("le")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

