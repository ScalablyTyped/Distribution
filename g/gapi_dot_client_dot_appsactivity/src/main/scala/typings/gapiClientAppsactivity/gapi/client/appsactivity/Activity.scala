package typings.gapiClientAppsactivity.gapi.client.appsactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activity extends js.Object {
  /** The fields common to all of the singleEvents that make up the Activity. */
  var combinedEvent: js.UndefOr[Event] = js.native
  /** A list of all the Events that make up the Activity. */
  var singleEvents: js.UndefOr[js.Array[Event]] = js.native
}

object Activity {
  @scala.inline
  def apply(): Activity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activity]
  }
  @scala.inline
  implicit class ActivityOps[Self <: Activity] (val x: Self) extends AnyVal {
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
    def setCombinedEvent(value: Event): Self = this.set("combinedEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCombinedEvent: Self = this.set("combinedEvent", js.undefined)
    @scala.inline
    def setSingleEventsVarargs(value: Event*): Self = this.set("singleEvents", js.Array(value :_*))
    @scala.inline
    def setSingleEvents(value: js.Array[Event]): Self = this.set("singleEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleEvents: Self = this.set("singleEvents", js.undefined)
  }
  
}

