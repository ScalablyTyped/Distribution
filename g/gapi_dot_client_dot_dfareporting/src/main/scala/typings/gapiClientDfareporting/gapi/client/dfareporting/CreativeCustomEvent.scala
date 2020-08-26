package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeCustomEvent extends js.Object {
  /** Unique ID of this event used by DDM Reporting and Data Transfer. This is a read-only field. */
  var advertiserCustomEventId: js.UndefOr[String] = js.native
  /** User-entered name for the event. */
  var advertiserCustomEventName: js.UndefOr[String] = js.native
  /** Type of the event. This is a read-only field. */
  var advertiserCustomEventType: js.UndefOr[String] = js.native
  /** Artwork label column, used to link events in DCM back to events in Studio. This is a required field and should not be modified after insertion. */
  var artworkLabel: js.UndefOr[String] = js.native
  /** Artwork type used by the creative.This is a read-only field. */
  var artworkType: js.UndefOr[String] = js.native
  /** Exit URL of the event. This field is used only for exit events. */
  var exitUrl: js.UndefOr[String] = js.native
  /** ID of this event. This is a required field and should not be modified after insertion. */
  var id: js.UndefOr[String] = js.native
  /** Properties for rich media popup windows. This field is used only for exit events. */
  var popupWindowProperties: js.UndefOr[PopupWindowProperties] = js.native
  /** Target type used by the event. */
  var targetType: js.UndefOr[String] = js.native
  /** Video reporting ID, used to differentiate multiple videos in a single creative. This is a read-only field. */
  var videoReportingId: js.UndefOr[String] = js.native
}

object CreativeCustomEvent {
  @scala.inline
  def apply(): CreativeCustomEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeCustomEvent]
  }
  @scala.inline
  implicit class CreativeCustomEventOps[Self <: CreativeCustomEvent] (val x: Self) extends AnyVal {
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
    def setAdvertiserCustomEventId(value: String): Self = this.set("advertiserCustomEventId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserCustomEventId: Self = this.set("advertiserCustomEventId", js.undefined)
    @scala.inline
    def setAdvertiserCustomEventName(value: String): Self = this.set("advertiserCustomEventName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserCustomEventName: Self = this.set("advertiserCustomEventName", js.undefined)
    @scala.inline
    def setAdvertiserCustomEventType(value: String): Self = this.set("advertiserCustomEventType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserCustomEventType: Self = this.set("advertiserCustomEventType", js.undefined)
    @scala.inline
    def setArtworkLabel(value: String): Self = this.set("artworkLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtworkLabel: Self = this.set("artworkLabel", js.undefined)
    @scala.inline
    def setArtworkType(value: String): Self = this.set("artworkType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtworkType: Self = this.set("artworkType", js.undefined)
    @scala.inline
    def setExitUrl(value: String): Self = this.set("exitUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExitUrl: Self = this.set("exitUrl", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setPopupWindowProperties(value: PopupWindowProperties): Self = this.set("popupWindowProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupWindowProperties: Self = this.set("popupWindowProperties", js.undefined)
    @scala.inline
    def setTargetType(value: String): Self = this.set("targetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetType: Self = this.set("targetType", js.undefined)
    @scala.inline
    def setVideoReportingId(value: String): Self = this.set("videoReportingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoReportingId: Self = this.set("videoReportingId", js.undefined)
  }
  
}

