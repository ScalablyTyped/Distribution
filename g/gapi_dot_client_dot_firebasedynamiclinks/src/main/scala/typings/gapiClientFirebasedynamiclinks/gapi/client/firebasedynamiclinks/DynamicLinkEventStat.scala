package typings.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicLinkEventStat extends js.Object {
  /** The number of times this event occurred. */
  var count: js.UndefOr[String] = js.native
  /** Link event. */
  var event: js.UndefOr[String] = js.native
  /** Requested platform. */
  var platform: js.UndefOr[String] = js.native
}

object DynamicLinkEventStat {
  @scala.inline
  def apply(): DynamicLinkEventStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicLinkEventStat]
  }
  @scala.inline
  implicit class DynamicLinkEventStatOps[Self <: DynamicLinkEventStat] (val x: Self) extends AnyVal {
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
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
  }
  
}

