package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoLiveStreamingDetails extends js.Object {
  
  var activeLiveChatId: js.UndefOr[String] = js.native
  
  var actualEndTime: js.UndefOr[String] = js.native
  
  var actualStartTime: js.UndefOr[String] = js.native
  
  var concurrentViewers: js.UndefOr[String] = js.native
  
  var scheduledEndTime: js.UndefOr[String] = js.native
  
  var scheduledStartTime: js.UndefOr[String] = js.native
}
object VideoLiveStreamingDetails {
  
  @scala.inline
  def apply(): VideoLiveStreamingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoLiveStreamingDetails]
  }
  
  @scala.inline
  implicit class VideoLiveStreamingDetailsOps[Self <: VideoLiveStreamingDetails] (val x: Self) extends AnyVal {
    
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
    def setActiveLiveChatId(value: String): Self = this.set("activeLiveChatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveLiveChatId: Self = this.set("activeLiveChatId", js.undefined)
    
    @scala.inline
    def setActualEndTime(value: String): Self = this.set("actualEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActualEndTime: Self = this.set("actualEndTime", js.undefined)
    
    @scala.inline
    def setActualStartTime(value: String): Self = this.set("actualStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActualStartTime: Self = this.set("actualStartTime", js.undefined)
    
    @scala.inline
    def setConcurrentViewers(value: String): Self = this.set("concurrentViewers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrentViewers: Self = this.set("concurrentViewers", js.undefined)
    
    @scala.inline
    def setScheduledEndTime(value: String): Self = this.set("scheduledEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledEndTime: Self = this.set("scheduledEndTime", js.undefined)
    
    @scala.inline
    def setScheduledStartTime(value: String): Self = this.set("scheduledStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledStartTime: Self = this.set("scheduledStartTime", js.undefined)
  }
}
