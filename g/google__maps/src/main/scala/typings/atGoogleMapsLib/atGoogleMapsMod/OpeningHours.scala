package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpeningHours extends js.Object {
  /** is a boolean value indicating if the place is open at the current time. */
  var open_now: scala.Boolean
  /** is an array of opening periods covering seven days, starting from Sunday, in chronological order. */
  var periods: js.Array[OpeningPeriod]
}

object OpeningHours {
  @scala.inline
  def apply(open_now: scala.Boolean, periods: js.Array[OpeningPeriod]): OpeningHours = {
    val __obj = js.Dynamic.literal(open_now = open_now, periods = periods)
  
    __obj.asInstanceOf[OpeningHours]
  }
}

