package typings.gapiDotClientDotCalendar.gapi.client.calendar

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCalendar.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreebusyResource extends js.Object {
  /** Returns free/busy information for a set of calendars. */
  def query(request: Anon_AltFieldsKey): Request[FreeBusyResponse]
}

object FreebusyResource {
  @scala.inline
  def apply(query: Anon_AltFieldsKey => Request[FreeBusyResponse]): FreebusyResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
  
    __obj.asInstanceOf[FreebusyResource]
  }
}

