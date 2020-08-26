package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogUserEventRequest extends js.Object {
  /** The action that occurred. */
  var eventAction: js.UndefOr[String] = js.native
  /** The category the action belongs to. */
  var eventCategory: js.UndefOr[String] = js.native
  /** List of event data for the event. */
  var eventDatas: js.UndefOr[js.Array[EventData]] = js.native
  /** The scope of the event. */
  var eventScope: js.UndefOr[String] = js.native
  /** Advertiser lead information. */
  var lead: js.UndefOr[Lead] = js.native
  /** Current request metadata. */
  var requestMetadata: js.UndefOr[RequestMetadata] = js.native
  /** The URL where the event occurred. */
  var url: js.UndefOr[String] = js.native
}

object LogUserEventRequest {
  @scala.inline
  def apply(): LogUserEventRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogUserEventRequest]
  }
  @scala.inline
  implicit class LogUserEventRequestOps[Self <: LogUserEventRequest] (val x: Self) extends AnyVal {
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
    def deleteEventAction: Self = this.set("eventAction", js.undefined)
    @scala.inline
    def setEventCategory(value: String): Self = this.set("eventCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventCategory: Self = this.set("eventCategory", js.undefined)
    @scala.inline
    def setEventDatasVarargs(value: EventData*): Self = this.set("eventDatas", js.Array(value :_*))
    @scala.inline
    def setEventDatas(value: js.Array[EventData]): Self = this.set("eventDatas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventDatas: Self = this.set("eventDatas", js.undefined)
    @scala.inline
    def setEventScope(value: String): Self = this.set("eventScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventScope: Self = this.set("eventScope", js.undefined)
    @scala.inline
    def setLead(value: Lead): Self = this.set("lead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLead: Self = this.set("lead", js.undefined)
    @scala.inline
    def setRequestMetadata(value: RequestMetadata): Self = this.set("requestMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestMetadata: Self = this.set("requestMetadata", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

