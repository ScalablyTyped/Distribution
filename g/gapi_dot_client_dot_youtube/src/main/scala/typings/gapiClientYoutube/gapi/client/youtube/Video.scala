package typings.gapiClientYoutube.gapi.client.youtube

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Video extends js.Object {
  /** Age restriction details related to a video. This data can only be retrieved by the video owner. */
  var ageGating: js.UndefOr[VideoAgeGating] = js.native
  /** The contentDetails object contains information about the video content, including the length of the video and its aspect ratio. */
  var contentDetails: js.UndefOr[VideoContentDetails] = js.native
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.native
  /**
    * The fileDetails object encapsulates information about the video file that was uploaded to YouTube, including the file's resolution, duration, audio and
    * video codecs, stream bitrates, and more. This data can only be retrieved by the video owner.
    */
  var fileDetails: js.UndefOr[VideoFileDetails] = js.native
  /** The ID that YouTube uses to uniquely identify the video. */
  var id: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#video". */
  var kind: js.UndefOr[String] = js.native
  /**
    * The liveStreamingDetails object contains metadata about a live video broadcast. The object will only be present in a video resource if the video is an
    * upcoming, live, or completed live broadcast.
    */
  var liveStreamingDetails: js.UndefOr[VideoLiveStreamingDetails] = js.native
  /** List with all localizations. */
  var localizations: js.UndefOr[Record[String, VideoLocalization]] = js.native
  /** The monetizationDetails object encapsulates information about the monetization status of the video. */
  var monetizationDetails: js.UndefOr[VideoMonetizationDetails] = js.native
  /** The player object contains information that you would use to play the video in an embedded player. */
  var player: js.UndefOr[VideoPlayer] = js.native
  /**
    * The processingProgress object encapsulates information about YouTube's progress in processing the uploaded video file. The properties in the object
    * identify the current processing status and an estimate of the time remaining until YouTube finishes processing the video. This part also indicates
    * whether different types of data or content, such as file details or thumbnail images, are available for the video.
    *
    * The processingProgress object is designed to be polled so that the video uploaded can track the progress that YouTube has made in processing the
    * uploaded video file. This data can only be retrieved by the video owner.
    */
  var processingDetails: js.UndefOr[VideoProcessingDetails] = js.native
  /** The projectDetails object contains information about the project specific video metadata. */
  var projectDetails: js.UndefOr[VideoProjectDetails] = js.native
  /** The recordingDetails object encapsulates information about the location, date and address where the video was recorded. */
  var recordingDetails: js.UndefOr[VideoRecordingDetails] = js.native
  /** The snippet object contains basic details about the video, such as its title, description, and category. */
  var snippet: js.UndefOr[VideoSnippet] = js.native
  /** The statistics object contains statistics about the video. */
  var statistics: js.UndefOr[VideoStatistics] = js.native
  /** The status object contains information about the video's uploading, processing, and privacy statuses. */
  var status: js.UndefOr[VideoStatus] = js.native
  /**
    * The suggestions object encapsulates suggestions that identify opportunities to improve the video quality or the metadata for the uploaded video. This
    * data can only be retrieved by the video owner.
    */
  var suggestions: js.UndefOr[VideoSuggestions] = js.native
  /** The topicDetails object encapsulates information about Freebase topics associated with the video. */
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
    def setLocalizations(value: Record[String, VideoLocalization]): Self = this.set("localizations", value.asInstanceOf[js.Any])
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

