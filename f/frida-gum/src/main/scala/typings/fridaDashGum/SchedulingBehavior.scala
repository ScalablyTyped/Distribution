package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fridaDashGum.fridaDashGumStrings.cooperative
  - typings.fridaDashGum.fridaDashGumStrings.exclusive
*/
trait SchedulingBehavior extends js.Object

object SchedulingBehavior {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cooperative: typings.fridaDashGum.fridaDashGumStrings.cooperative = this.cast("cooperative")
  @scala.inline
  def exclusive: typings.fridaDashGum.fridaDashGumStrings.exclusive = this.cast("exclusive")
}

