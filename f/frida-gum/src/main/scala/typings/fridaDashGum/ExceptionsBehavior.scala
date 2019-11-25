package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.fridaDashGumStrings.steal
  - typings.fridaDashGum.fridaDashGumStrings.propagate
*/
trait ExceptionsBehavior extends js.Object

object ExceptionsBehavior {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def propagate: typings.fridaDashGum.fridaDashGumStrings.propagate = this.cast("propagate")
  @scala.inline
  def steal: typings.fridaDashGum.fridaDashGumStrings.steal = this.cast("steal")
}

