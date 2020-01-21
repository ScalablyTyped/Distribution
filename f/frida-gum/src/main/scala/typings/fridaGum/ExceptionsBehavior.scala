package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.steal
  - typings.fridaGum.fridaGumStrings.propagate
*/
trait ExceptionsBehavior extends js.Object

object ExceptionsBehavior {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def propagate: typings.fridaGum.fridaGumStrings.propagate = this.cast("propagate")
  @scala.inline
  def steal: typings.fridaGum.fridaGumStrings.steal = this.cast("steal")
}

