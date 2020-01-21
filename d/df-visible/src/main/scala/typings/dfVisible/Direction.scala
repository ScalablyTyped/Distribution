package typings.dfVisible

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dfVisible.dfVisibleStrings.horizontal
  - typings.dfVisible.dfVisibleStrings.vertical
  - typings.dfVisible.dfVisibleStrings.both
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  def both: typings.dfVisible.dfVisibleStrings.both = this.cast("both")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typings.dfVisible.dfVisibleStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def vertical: typings.dfVisible.dfVisibleStrings.vertical = this.cast("vertical")
}

