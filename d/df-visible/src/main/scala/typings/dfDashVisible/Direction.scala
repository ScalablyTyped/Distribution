package typings.dfDashVisible

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dfDashVisible.dfDashVisibleStrings.horizontal
  - typings.dfDashVisible.dfDashVisibleStrings.vertical
  - typings.dfDashVisible.dfDashVisibleStrings.both
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  def both: typings.dfDashVisible.dfDashVisibleStrings.both = this.cast("both")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typings.dfDashVisible.dfDashVisibleStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def vertical: typings.dfDashVisible.dfDashVisibleStrings.vertical = this.cast("vertical")
}

