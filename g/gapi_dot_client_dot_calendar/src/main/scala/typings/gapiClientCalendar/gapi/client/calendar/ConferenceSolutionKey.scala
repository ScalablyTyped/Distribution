package typings.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceSolutionKey extends js.Object {
  /**
    * The conference solution type.
    * If a client encounters an unfamiliar or empty type, it should still be able to display the entry points. However, it should disallow modifications.
    * The possible values are:
    * - "eventHangout" for Hangouts for consumers (http://hangouts.google.com)
    * - "eventNamedHangout" for classic Hangouts for G Suite users (http://hangouts.google.com)
    * - "hangoutsMeet" for Google Meet (http://meet.google.com)
    * - "addOn" for 3P conference providers
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ConferenceSolutionKey {
  @scala.inline
  def apply(`type`: String = null): ConferenceSolutionKey = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConferenceSolutionKey]
  }
}

