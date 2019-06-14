package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - fridaDashGumLib.fridaDashGumLibStrings.cooperative
  - fridaDashGumLib.fridaDashGumLibStrings.exclusive
*/
trait SchedulingBehavior extends js.Object

object SchedulingBehavior {
  @scala.inline
  def Cooperative: fridaDashGumLib.fridaDashGumLibStrings.cooperative = this.cast("cooperative")
  @scala.inline
  def Exclusive: fridaDashGumLib.fridaDashGumLibStrings.exclusive = this.cast("exclusive")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

