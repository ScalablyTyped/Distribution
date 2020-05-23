package typings.gapiClientCalendar.gapi.client.calendar

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCalendar.anon.FieldsKey
import typings.gapiClientCalendar.anon.OauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreebusyResource extends js.Object {
  def query(request: FieldsKey, body: FreeBusyRequest): Request[FreeBusyResponse] = js.native
  /** Returns free/busy information for a set of calendars. */
  def query(request: OauthtokenPrettyPrint): Request[FreeBusyResponse] = js.native
}

