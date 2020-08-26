package typings.gapiYoutube

import typings.gapiYoutube.anon.AudioStreams
import typings.gapiYoutube.anon.Caption
import typings.gapiYoutube.anon.CategoryId
import typings.gapiYoutube.anon.DislikeCount
import typings.gapiYoutube.anon.EditorSuggestions
import typings.gapiYoutube.anon.EditorSuggestionsAvailability
import typings.gapiYoutube.anon.EmbedHtml
import typings.gapiYoutube.anon.Embeddable
import typings.gapiYoutube.anon.Location
import typings.gapiYoutube.anon.TopicIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiYouTubeVideoResource extends js.Object {
  /**
    * The contentDetails object contains information about the video content, including the length of the video and its aspect ratio.
    */
  var contentDetails: Caption = js.native
  /**
    * The ETag of the video resource.
    */
  var etag: String = js.native
  /**
    * The fileDetails object encapsulates information about the video file that was uploaded to YouTube, including the files resolution, duration, audio and video codecs, stream bitrates, and more. This data can only be retrieved by the video owner.
    */
  var fileDetails: AudioStreams = js.native
  /**
    * The ID that YouTube uses to uniquely identify the video.
    */
  var id: String = js.native
  /**
    * The type of the API resource. For video resources, the value will be youtube#video.
    */
  var kind: String = js.native
  /**
    * The player object contains information that you would use to play the video in an embedded player.
    */
  var player: EmbedHtml = js.native
  /**
    * The processingProgress object encapsulates information about YouTubes progress in processing the uploaded video file. The properties in the object identify the current processing status and an estimate of the time remaining until YouTube finishes processing the video. This part also indicates whether different types of data or content, such as file details or thumbnail images, are available for the video.
    * The processingProgress object is designed to be polled so that the video uploaded can track the progress that YouTube has made in processing the uploaded video file. This data can only be retrieved by the video owner.
    */
  var processingDetails: EditorSuggestionsAvailability = js.native
  /**
    * The recordingDetails object encapsulates information about the location, date and address where the video was recorded. This object will only be returned for a video if the videos geolocation data or recording time has been set.
    */
  var recordingDetails: Location = js.native
  /**
    * The snippet object contains basic details about the video, such as its title, description, and category.
    */
  var snippet: CategoryId = js.native
  /**
    * The statistics object contains statistics about the video.
    */
  var statistics: DislikeCount = js.native
  /**
    * The status object contains information about the videos uploading, processing, and privacy statuses.
    */
  var status: Embeddable = js.native
  /**
    * The suggestions object encapsulates suggestions that identify opportunities to improve the video quality or the metadata for the uploaded video. This data can only be retrieved by the video owner.
    */
  var suggestions: EditorSuggestions = js.native
  /**
    * The topicDetails object encapsulates information about Freebase topics associated with the video.
    */
  var topicDetails: TopicIds = js.native
}

object GoogleApiYouTubeVideoResource {
  @scala.inline
  def apply(
    contentDetails: Caption,
    etag: String,
    fileDetails: AudioStreams,
    id: String,
    kind: String,
    player: EmbedHtml,
    processingDetails: EditorSuggestionsAvailability,
    recordingDetails: Location,
    snippet: CategoryId,
    statistics: DislikeCount,
    status: Embeddable,
    suggestions: EditorSuggestions,
    topicDetails: TopicIds
  ): GoogleApiYouTubeVideoResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], fileDetails = fileDetails.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any], processingDetails = processingDetails.asInstanceOf[js.Any], recordingDetails = recordingDetails.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any], topicDetails = topicDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeVideoResource]
  }
  @scala.inline
  implicit class GoogleApiYouTubeVideoResourceOps[Self <: GoogleApiYouTubeVideoResource] (val x: Self) extends AnyVal {
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
    def setContentDetails(value: Caption): Self = this.set("contentDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileDetails(value: AudioStreams): Self = this.set("fileDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayer(value: EmbedHtml): Self = this.set("player", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessingDetails(value: EditorSuggestionsAvailability): Self = this.set("processingDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordingDetails(value: Location): Self = this.set("recordingDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnippet(value: CategoryId): Self = this.set("snippet", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatistics(value: DislikeCount): Self = this.set("statistics", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Embeddable): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestions(value: EditorSuggestions): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopicDetails(value: TopicIds): Self = this.set("topicDetails", value.asInstanceOf[js.Any])
  }
  
}

