package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeCustomEvent extends js.Object {
  /** Unique ID of this event used by DDM Reporting and Data Transfer. This is a read-only field. */
  var advertiserCustomEventId: js.UndefOr[String] = js.undefined
  /** User-entered name for the event. */
  var advertiserCustomEventName: js.UndefOr[String] = js.undefined
  /** Type of the event. This is a read-only field. */
  var advertiserCustomEventType: js.UndefOr[String] = js.undefined
  /** Artwork label column, used to link events in DCM back to events in Studio. This is a required field and should not be modified after insertion. */
  var artworkLabel: js.UndefOr[String] = js.undefined
  /** Artwork type used by the creative.This is a read-only field. */
  var artworkType: js.UndefOr[String] = js.undefined
  /** Exit URL of the event. This field is used only for exit events. */
  var exitUrl: js.UndefOr[String] = js.undefined
  /** ID of this event. This is a required field and should not be modified after insertion. */
  var id: js.UndefOr[String] = js.undefined
  /** Properties for rich media popup windows. This field is used only for exit events. */
  var popupWindowProperties: js.UndefOr[PopupWindowProperties] = js.undefined
  /** Target type used by the event. */
  var targetType: js.UndefOr[String] = js.undefined
  /** Video reporting ID, used to differentiate multiple videos in a single creative. This is a read-only field. */
  var videoReportingId: js.UndefOr[String] = js.undefined
}

object CreativeCustomEvent {
  @scala.inline
  def apply(
    advertiserCustomEventId: String = null,
    advertiserCustomEventName: String = null,
    advertiserCustomEventType: String = null,
    artworkLabel: String = null,
    artworkType: String = null,
    exitUrl: String = null,
    id: String = null,
    popupWindowProperties: PopupWindowProperties = null,
    targetType: String = null,
    videoReportingId: String = null
  ): CreativeCustomEvent = {
    val __obj = js.Dynamic.literal()
    if (advertiserCustomEventId != null) __obj.updateDynamic("advertiserCustomEventId")(advertiserCustomEventId.asInstanceOf[js.Any])
    if (advertiserCustomEventName != null) __obj.updateDynamic("advertiserCustomEventName")(advertiserCustomEventName.asInstanceOf[js.Any])
    if (advertiserCustomEventType != null) __obj.updateDynamic("advertiserCustomEventType")(advertiserCustomEventType.asInstanceOf[js.Any])
    if (artworkLabel != null) __obj.updateDynamic("artworkLabel")(artworkLabel.asInstanceOf[js.Any])
    if (artworkType != null) __obj.updateDynamic("artworkType")(artworkType.asInstanceOf[js.Any])
    if (exitUrl != null) __obj.updateDynamic("exitUrl")(exitUrl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (popupWindowProperties != null) __obj.updateDynamic("popupWindowProperties")(popupWindowProperties.asInstanceOf[js.Any])
    if (targetType != null) __obj.updateDynamic("targetType")(targetType.asInstanceOf[js.Any])
    if (videoReportingId != null) __obj.updateDynamic("videoReportingId")(videoReportingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeCustomEvent]
  }
}

