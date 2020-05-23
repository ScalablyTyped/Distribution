package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.AttendeeResponseStatus
import typings.gapiCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var additionalGuests: js.UndefOr[integer] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var email: String
  var id: String
  var optional: js.UndefOr[Boolean] = js.undefined
  var organizer: Boolean
  var resource: Boolean
  var responseStatus: AttendeeResponseStatus
  var self: Boolean
}

object Comment {
  @scala.inline
  def apply(
    email: String,
    id: String,
    organizer: Boolean,
    resource: Boolean,
    responseStatus: AttendeeResponseStatus,
    self: Boolean,
    additionalGuests: js.UndefOr[integer] = js.undefined,
    comment: String = null,
    displayName: String = null,
    optional: js.UndefOr[Boolean] = js.undefined
  ): Comment = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], organizer = organizer.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    if (!js.isUndefined(additionalGuests)) __obj.updateDynamic("additionalGuests")(additionalGuests.get.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

