package typings.eventTargetShim.mod.EventTarget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eventTargetShim.eventTargetShimStrings.strict
  - typings.eventTargetShim.eventTargetShimStrings.standard
  - typings.eventTargetShim.eventTargetShimStrings.loose
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def loose: typings.eventTargetShim.eventTargetShimStrings.loose = this.cast("loose")
  @scala.inline
  def standard: typings.eventTargetShim.eventTargetShimStrings.standard = this.cast("standard")
  @scala.inline
  def strict: typings.eventTargetShim.eventTargetShimStrings.strict = this.cast("strict")
}

