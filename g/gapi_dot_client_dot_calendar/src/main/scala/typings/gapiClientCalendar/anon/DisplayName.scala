package typings.gapiClientCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayName extends js.Object {
  /** The organizer's name, if available. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The organizer's email address, if available. It must be a valid email address as per RFC5322. */
  var email: js.UndefOr[String] = js.undefined
  /** The organizer's Profile ID, if available. It corresponds to the id field in the People collection of the Google+ API */
  var id: js.UndefOr[String] = js.undefined
  /** Whether the organizer corresponds to the calendar on which this copy of the event appears. Read-only. The default is False. */
  var self: js.UndefOr[Boolean] = js.undefined
}

object DisplayName {
  @scala.inline
  def apply(
    displayName: String = null,
    email: String = null,
    id: String = null,
    self: js.UndefOr[Boolean] = js.undefined
  ): DisplayName = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(self)) __obj.updateDynamic("self")(self.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayName]
  }
}

