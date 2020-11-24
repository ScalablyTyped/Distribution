package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Video extends js.Object {
  
  var ageGating: js.UndefOr[VideoAgeGating] = js.native
  
  var contentDetails: js.UndefOr[VideoContentDetails] = js.native
  
  var etag: js.UndefOr[String] = js.native
  
  var fileDetails: js.UndefOr[VideoFileDetails] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var liveStreamingDetails: js.UndefOr[VideoLiveStreamingDetails] = js.native
  
  var localizations: js.UndefOr[js.Object] = js.native
  
  var monetizationDetails: js.UndefOr[VideoMonetizationDetails] = js.native
  
  var player: js.UndefOr[VideoPlayer] = js.native
  
  var processingDetails: js.UndefOr[VideoProcessingDetails] = js.native
  
  var projectDetails: js.UndefOr[VideoProjectDetails] = js.native
  
  var recordingDetails: js.UndefOr[VideoRecordingDetails] = js.native
  
  var snippet: js.UndefOr[VideoSnippet] = js.native
  
  var statistics: js.UndefOr[VideoStatistics] = js.native
  
  var status: js.UndefOr[VideoStatus] = js.native
  
  var suggestions: js.UndefOr[VideoSuggestions] = js.native
  
  var topicDetails: js.UndefOr[VideoTopicDetails] = js.native
}
object Video {
  
  @scala.inline
  def apply(): Video = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Video]
  }
  
  @scala.inline
  implicit class VideoOps[Self <: Video] (val x: Self) extends AnyVal {
    
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
    def setAgeGating(value: VideoAgeGating): Self = this.set("ageGating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgeGating: Self = this.set("ageGating", js.undefined)
    
    @scala.inline
    def setContentDetails(value: VideoContentDetails): Self = this.set("contentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentDetails: Self = this.set("contentDetails", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setFileDetails(value: VideoFileDetails): Self = this.set("fileDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileDetails: Self = this.set("fileDetails", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLiveStreamingDetails(value: VideoLiveStreamingDetails): Self = this.set("liveStreamingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiveStreamingDetails: Self = this.set("liveStreamingDetails", js.undefined)
    
    @scala.inline
    def setLocalizations(value: js.Object): Self = this.set("localizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalizations: Self = this.set("localizations", js.undefined)
    
    @scala.inline
    def setMonetizationDetails(value: VideoMonetizationDetails): Self = this.set("monetizationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonetizationDetails: Self = this.set("monetizationDetails", js.undefined)
    
    @scala.inline
    def setPlayer(value: VideoPlayer): Self = this.set("player", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayer: Self = this.set("player", js.undefined)
    
    @scala.inline
    def setProcessingDetails(value: VideoProcessingDetails): Self = this.set("processingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingDetails: Self = this.set("processingDetails", js.undefined)
    
    @scala.inline
    def setProjectDetails(value: VideoProjectDetails): Self = this.set("projectDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectDetails: Self = this.set("projectDetails", js.undefined)
    
    @scala.inline
    def setRecordingDetails(value: VideoRecordingDetails): Self = this.set("recordingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordingDetails: Self = this.set("recordingDetails", js.undefined)
    
    @scala.inline
    def setSnippet(value: VideoSnippet): Self = this.set("snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
    
    @scala.inline
    def setStatistics(value: VideoStatistics): Self = this.set("statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatistics: Self = this.set("statistics", js.undefined)
    
    @scala.inline
    def setStatus(value: VideoStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSuggestions(value: VideoSuggestions): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
    
    @scala.inline
    def setTopicDetails(value: VideoTopicDetails): Self = this.set("topicDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicDetails: Self = this.set("topicDetails", js.undefined)
  }
}
