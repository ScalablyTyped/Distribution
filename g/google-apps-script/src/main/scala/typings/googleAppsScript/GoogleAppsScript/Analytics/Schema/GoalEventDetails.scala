package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoalEventDetails extends js.Object {
  var eventConditions: js.UndefOr[js.Array[GoalEventDetailsEventConditions]] = js.native
  var useEventValue: js.UndefOr[Boolean] = js.native
}

object GoalEventDetails {
  @scala.inline
  def apply(): GoalEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoalEventDetails]
  }
  @scala.inline
  implicit class GoalEventDetailsOps[Self <: GoalEventDetails] (val x: Self) extends AnyVal {
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
    def setEventConditionsVarargs(value: GoalEventDetailsEventConditions*): Self = this.set("eventConditions", js.Array(value :_*))
    @scala.inline
    def setEventConditions(value: js.Array[GoalEventDetailsEventConditions]): Self = this.set("eventConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventConditions: Self = this.set("eventConditions", js.undefined)
    @scala.inline
    def setUseEventValue(value: Boolean): Self = this.set("useEventValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseEventValue: Self = this.set("useEventValue", js.undefined)
  }
  
}

