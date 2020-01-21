package typings.gapiClientCalendar.gapi.client.calendar

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCalendar.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreebusyResource extends js.Object {
  /** Returns free/busy information for a set of calendars. */
  def query(request: AnonAltFieldsKey): Request_[FreeBusyResponse]
}

object FreebusyResource {
  @scala.inline
  def apply(query: AnonAltFieldsKey => Request_[FreeBusyResponse]): FreebusyResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
  
    __obj.asInstanceOf[FreebusyResource]
  }
}

