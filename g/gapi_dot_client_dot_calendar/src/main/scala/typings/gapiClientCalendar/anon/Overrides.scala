package typings.gapiClientCalendar.anon

import typings.gapiClientCalendar.gapi.client.calendar.EventReminder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Overrides extends js.Object {
  /**
    * If the event doesn't use the default reminders, this lists the reminders specific to the event, or, if not set, indicates that no reminders are set for
    * this event. The maximum number of override reminders is 5.
    */
  var overrides: js.UndefOr[js.Array[EventReminder]] = js.native
  /** Whether the default reminders of the calendar apply to the event. */
  var useDefault: js.UndefOr[Boolean] = js.native
}

object Overrides {
  @scala.inline
  def apply(): Overrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Overrides]
  }
  @scala.inline
  implicit class OverridesOps[Self <: Overrides] (val x: Self) extends AnyVal {
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
    def setOverridesVarargs(value: EventReminder*): Self = this.set("overrides", js.Array(value :_*))
    @scala.inline
    def setOverrides(value: js.Array[EventReminder]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setUseDefault(value: Boolean): Self = this.set("useDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseDefault: Self = this.set("useDefault", js.undefined)
  }
  
}

