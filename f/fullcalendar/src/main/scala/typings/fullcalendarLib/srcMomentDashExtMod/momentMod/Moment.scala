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
    hasTime: js.Function0[scala.Boolean],
    stripTime: js.Function0[js.Any],
    stripZone: js.Function0[js.Any],
    time: js.Function0[fullcalendarLib.srcMomentDashExtMod.MomentExtDuration]
  ): Moment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasTime")(hasTime)
    __obj.updateDynamic("stripTime")(stripTime)
    __obj.updateDynamic("stripZone")(stripZone)
    __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[Moment]
  }
}

