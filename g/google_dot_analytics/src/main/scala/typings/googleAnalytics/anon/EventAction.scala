package typings.googleAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventAction extends js.Object {
  var eventAction: String = js.native
  var eventCategory: String = js.native
  var eventLabel: js.UndefOr[String] = js.native
  var eventValue: js.UndefOr[Double] = js.native
  var nonInteraction: js.UndefOr[Boolean] = js.native
}

object EventAction {
  @scala.inline
  def apply(eventAction: String, eventCategory: String): EventAction = {
    val __obj = js.Dynamic.literal(eventAction = eventAction.asInstanceOf[js.Any], eventCategory = eventCategory.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAction]
  }
  @scala.inline
  implicit class EventActionOps[Self <: EventAction] (val x: Self) extends AnyVal {
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
    def setEventAction(value: String): Self = this.set("eventAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventCategory(value: String): Self = this.set("eventCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventLabel(value: String): Self = this.set("eventLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventLabel: Self = this.set("eventLabel", js.undefined)
    @scala.inline
    def setEventValue(value: Double): Self = this.set("eventValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventValue: Self = this.set("eventValue", js.undefined)
    @scala.inline
    def setNonInteraction(value: Boolean): Self = this.set("nonInteraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonInteraction: Self = this.set("nonInteraction", js.undefined)
  }
  
}

