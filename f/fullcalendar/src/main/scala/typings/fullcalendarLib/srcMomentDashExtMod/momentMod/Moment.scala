package typings
package fullcalendarLib.srcMomentDashExtMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Moment extends js.Object {
  def hasTime(): scala.Boolean
  def stripTime(): js.Any
  def stripZone(): js.Any
  def time(): fullcalendarLib.srcMomentDashExtMod.MomentExtDuration
}

object Moment {
  @scala.inline
  def apply(
    hasTime: () => scala.Boolean,
    stripTime: () => js.Any,
    stripZone: () => js.Any,
    time: () => fullcalendarLib.srcMomentDashExtMod.MomentExtDuration
  ): Moment = {
    val __obj = js.Dynamic.literal(hasTime = js.Any.fromFunction0(hasTime), stripTime = js.Any.fromFunction0(stripTime), stripZone = js.Any.fromFunction0(stripZone), time = js.Any.fromFunction0(time))
  
    __obj.asInstanceOf[Moment]
  }
}

