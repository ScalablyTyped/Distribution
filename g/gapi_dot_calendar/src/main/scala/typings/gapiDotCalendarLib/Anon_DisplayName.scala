package typings
package gapiDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayName extends js.Object {
  // The organizer's name, if available.
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // The organizer's email address, if available.
  var email: js.UndefOr[java.lang.String] = js.undefined
  // The organizer's Profile ID, if available.
  var id: js.UndefOr[java.lang.String] = js.undefined
  // Whether the organizer corresponds to the calendar on which this copy of the event appears. Read-only. The default is False.
  var self: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DisplayName {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    email: java.lang.String = null,
    id: java.lang.String = null,
    self: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DisplayName = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(self)) __obj.updateDynamic("self")(self)
    __obj.asInstanceOf[Anon_DisplayName]
  }
}

