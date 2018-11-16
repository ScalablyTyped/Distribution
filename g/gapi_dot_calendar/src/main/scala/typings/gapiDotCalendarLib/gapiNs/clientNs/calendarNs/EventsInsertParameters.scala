package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EventsInsertParameters extends js.Object {
  var calendarId: java.lang.String
  var maxAttendees: js.UndefOr[integer] = js.undefined
  // Event resource
  var resource: EventInput
  var sendNotifications: js.UndefOr[scala.Boolean] = js.undefined
  var supportsAttachments: js.UndefOr[scala.Boolean] = js.undefined
}

