package typings.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var `type`: js.UndefOr[String] = js.native
}

object ConferenceSolutionKey {
  @scala.inline
  def apply(): ConferenceSolutionKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceSolutionKey]
  }
  @scala.inline
  implicit class ConferenceSolutionKeyOps[Self <: ConferenceSolutionKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

