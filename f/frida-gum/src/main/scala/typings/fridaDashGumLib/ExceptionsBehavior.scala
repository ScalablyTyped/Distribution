package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.steal
  - fridaDashGumLib.fridaDashGumLibStrings.propagate
*/
trait ExceptionsBehavior extends js.Object

object ExceptionsBehavior {
  @scala.inline
  def Propagate: fridaDashGumLib.fridaDashGumLibStrings.propagate = this.cast("propagate")
  @scala.inline
  def Steal: fridaDashGumLib.fridaDashGumLibStrings.steal = this.cast("steal")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

