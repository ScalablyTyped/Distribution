package typings.gapiClientCalendar.gapi.client.calendar

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCalendar.anon.FieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorsResource extends js.Object {
  /** Returns the color definitions for calendars and events. */
  def get(): Request[Colors] = js.native
  def get(request: FieldsKey): Request[Colors] = js.native
}

