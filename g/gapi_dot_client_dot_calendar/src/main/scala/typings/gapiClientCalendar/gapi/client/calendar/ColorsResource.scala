package typings.gapiClientCalendar.gapi.client.calendar

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCalendar.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorsResource extends js.Object {
  /** Returns the color definitions for calendars and events. */
  def get(request: AnonPrettyPrint): Request_[Colors]
}

object ColorsResource {
  @scala.inline
  def apply(get: AnonPrettyPrint => Request_[Colors]): ColorsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[ColorsResource]
  }
}

