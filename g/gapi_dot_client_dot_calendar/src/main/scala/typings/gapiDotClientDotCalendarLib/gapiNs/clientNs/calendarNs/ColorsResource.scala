package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorsResource extends js.Object {
  /** Returns the color definitions for calendars and events. */
  def get(request: gapiDotClientDotCalendarLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Colors]
}

object ColorsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotCalendarLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Colors]
    ]
  ): ColorsResource = {
    val __obj = js.Dynamic.literal(get = get)
  
    __obj.asInstanceOf[ColorsResource]
  }
}

