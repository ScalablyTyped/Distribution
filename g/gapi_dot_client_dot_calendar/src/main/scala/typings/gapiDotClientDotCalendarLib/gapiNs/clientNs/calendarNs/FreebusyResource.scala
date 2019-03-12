package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreebusyResource extends js.Object {
  /** Returns free/busy information for a set of calendars. */
  def query(request: gapiDotClientDotCalendarLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[FreeBusyResponse]
}

object FreebusyResource {
  @scala.inline
  def apply(
    query: gapiDotClientDotCalendarLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[FreeBusyResponse]
  ): FreebusyResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
  
    __obj.asInstanceOf[FreebusyResource]
  }
}

