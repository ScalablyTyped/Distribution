package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeCustomEvent extends js.Object {
  var advertiserCustomEventId: js.UndefOr[String] = js.undefined
  var advertiserCustomEventName: js.UndefOr[String] = js.undefined
  var advertiserCustomEventType: js.UndefOr[String] = js.undefined
  var artworkLabel: js.UndefOr[String] = js.undefined
  var artworkType: js.UndefOr[String] = js.undefined
  var exitClickThroughUrl: js.UndefOr[CreativeClickThroughUrl] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var popupWindowProperties: js.UndefOr[PopupWindowProperties] = js.undefined
  var targetType: js.UndefOr[String] = js.undefined
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
    exitClickThroughUrl: CreativeClickThroughUrl = null,
    id: String = null,
    popupWindowProperties: PopupWindowProperties = null,
    targetType: String = null,
    videoReportingId: String = null
  ): CreativeCustomEvent = {
    val __obj = js.Dynamic.literal()
    if (advertiserCustomEventId != null) __obj.updateDynamic("advertiserCustomEventId")(advertiserCustomEventId)
    if (advertiserCustomEventName != null) __obj.updateDynamic("advertiserCustomEventName")(advertiserCustomEventName)
    if (advertiserCustomEventType != null) __obj.updateDynamic("advertiserCustomEventType")(advertiserCustomEventType)
    if (artworkLabel != null) __obj.updateDynamic("artworkLabel")(artworkLabel)
    if (artworkType != null) __obj.updateDynamic("artworkType")(artworkType)
    if (exitClickThroughUrl != null) __obj.updateDynamic("exitClickThroughUrl")(exitClickThroughUrl)
    if (id != null) __obj.updateDynamic("id")(id)
    if (popupWindowProperties != null) __obj.updateDynamic("popupWindowProperties")(popupWindowProperties)
    if (targetType != null) __obj.updateDynamic("targetType")(targetType)
    if (videoReportingId != null) __obj.updateDynamic("videoReportingId")(videoReportingId)
    __obj.asInstanceOf[CreativeCustomEvent]
  }
}

