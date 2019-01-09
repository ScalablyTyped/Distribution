package typings
package gapiDotClientDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayName extends js.Object {
  /** The organizer's name, if available. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The organizer's email address, if available. It must be a valid email address as per RFC5322. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** The organizer's Profile ID, if available. It corresponds to theid field in the People collection of the Google+ API */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the organizer corresponds to the calendar on which this copy of the event appears. Read-only. The default is False. */
  var self: js.UndefOr[scala.Boolean] = js.undefined
}

