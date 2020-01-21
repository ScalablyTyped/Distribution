package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaConferenceSolutionKey extends js.Object {
  /**
    * The conference solution type. If a client encounters an unfamiliar or
    * empty type, it should still be able to display the entry points. However,
    * it should disallow modifications. The possible values are:   -
    * &quot;eventHangout&quot; for Hangouts for consumers
    * (http://hangouts.google.com) - &quot;eventNamedHangout&quot; for classic
    * Hangouts for G Suite users (http://hangouts.google.com) -
    * &quot;hangoutsMeet&quot; for Hangouts Meet (http://meet.google.com)
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaConferenceSolutionKey {
  @scala.inline
  def apply(`type`: String = null): SchemaConferenceSolutionKey = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConferenceSolutionKey]
  }
}

