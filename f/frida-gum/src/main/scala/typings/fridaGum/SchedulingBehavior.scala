package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.cooperative
  - typings.fridaGum.fridaGumStrings.exclusive
*/
trait SchedulingBehavior extends js.Object

object SchedulingBehavior {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cooperative: typings.fridaGum.fridaGumStrings.cooperative = this.cast("cooperative")
  @scala.inline
  def exclusive: typings.fridaGum.fridaGumStrings.exclusive = this.cast("exclusive")
}

