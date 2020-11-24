package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeCustomEvent extends js.Object {
  
  var advertiserCustomEventId: js.UndefOr[String] = js.native
  
  var advertiserCustomEventName: js.UndefOr[String] = js.native
  
  var advertiserCustomEventType: js.UndefOr[String] = js.native
  
  var artworkLabel: js.UndefOr[String] = js.native
  
  var artworkType: js.UndefOr[String] = js.native
  
  var exitClickThroughUrl: js.UndefOr[CreativeClickThroughUrl] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var popupWindowProperties: js.UndefOr[PopupWindowProperties] = js.native
  
  var targetType: js.UndefOr[String] = js.native
  
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
    def setExitClickThroughUrl(value: CreativeClickThroughUrl): Self = this.set("exitClickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitClickThroughUrl: Self = this.set("exitClickThroughUrl", js.undefined)
    
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
