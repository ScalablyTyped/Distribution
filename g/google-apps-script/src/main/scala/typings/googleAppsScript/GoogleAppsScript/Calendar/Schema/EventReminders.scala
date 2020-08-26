package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventReminders extends js.Object {
  var overrides: js.UndefOr[js.Array[EventReminder]] = js.native
  var useDefault: js.UndefOr[Boolean] = js.native
}

object EventReminders {
  @scala.inline
  def apply(): EventReminders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventReminders]
  }
  @scala.inline
  implicit class EventRemindersOps[Self <: EventReminders] (val x: Self) extends AnyVal {
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

