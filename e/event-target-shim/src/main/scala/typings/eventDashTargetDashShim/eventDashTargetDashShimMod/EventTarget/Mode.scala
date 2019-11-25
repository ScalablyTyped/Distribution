package typings.eventDashTargetDashShim.eventDashTargetDashShimMod.EventTarget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.strict
  - typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.standard
  - typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.loose
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def loose: typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.loose = this.cast("loose")
  @scala.inline
  def standard: typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.standard = this.cast("standard")
  @scala.inline
  def strict: typings.eventDashTargetDashShim.eventDashTargetDashShimStrings.strict = this.cast("strict")
}

