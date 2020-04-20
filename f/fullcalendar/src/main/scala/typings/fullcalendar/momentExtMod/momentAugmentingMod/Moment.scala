package typings.fullcalendar.momentExtMod.momentAugmentingMod

import typings.fullcalendar.momentExtMod.MomentExtDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Moment extends js.Object {
  def hasTime(): Boolean
  def stripTime(): js.Any
  def stripZone(): js.Any
  def time(): MomentExtDuration
}

object Moment {
  @scala.inline
  def apply(
    hasTime: () => Boolean,
    stripTime: () => js.Any,
    stripZone: () => js.Any,
    time: () => MomentExtDuration
  ): Moment = {
    val __obj = js.Dynamic.literal(hasTime = js.Any.fromFunction0(hasTime), stripTime = js.Any.fromFunction0(stripTime), stripZone = js.Any.fromFunction0(stripZone), time = js.Any.fromFunction0(time))
    __obj.asInstanceOf[Moment]
  }
}

