package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeVideoResource extends js.Object {
  /**
    * The contentDetails object contains information about the video content, including the length of the video and its aspect ratio.
    */
  var contentDetails: AnonCaption
  /**
    * The ETag of the video resource.
    */
  var etag: String
  /**
    * The fileDetails object encapsulates information about the video file that was uploaded to YouTube, including the files resolution, duration, audio and video codecs, stream bitrates, and more. This data can only be retrieved by the video owner.
    */
  var fileDetails: AnonAudioStreams
  /**
    * The ID that YouTube uses to uniquely identify the video.
    */
  var id: String
  /**
    * The type of the API resource. For video resources, the value will be youtube#video.
    */
  var kind: String
  /**
    * The player object contains information that you would use to play the video in an embedded player.
    */
  var player: AnonEmbedHtml
  /**
    * The processingProgress object encapsulates information about YouTubes progress in processing the uploaded video file. The properties in the object identify the current processing status and an estimate of the time remaining until YouTube finishes processing the video. This part also indicates whether different types of data or content, such as file details or thumbnail images, are available for the video.
    * The processingProgress object is designed to be polled so that the video uploaded can track the progress that YouTube has made in processing the uploaded video file. This data can only be retrieved by the video owner.
    */
  var processingDetails: AnonEditorSuggestionsAvailability
  /**
    * The recordingDetails object encapsulates information about the location, date and address where the video was recorded. This object will only be returned for a video if the videos geolocation data or recording time has been set.
    */
  var recordingDetails: AnonLocation
  /**
    * The snippet object contains basic details about the video, such as its title, description, and category.
    */
  var snippet: AnonCategoryIdChannelId
  /**
    * The statistics object contains statistics about the video.
    */
  var statistics: AnonCommentCountDislikeCount
  /**
    * The status object contains information about the videos uploading, processing, and privacy statuses.
    */
  var status: AnonEmbeddable
  /**
    * The suggestions object encapsulates suggestions that identify opportunities to improve the video quality or the metadata for the uploaded video. This data can only be retrieved by the video owner.
    */
  var suggestions: AnonEditorSuggestions
  /**
    * The topicDetails object encapsulates information about Freebase topics associated with the video.
    */
  var topicDetails: AnonTopicIds
}

object GoogleApiYouTubeVideoResource {
  @scala.inline
  def apply(
    contentDetails: AnonCaption,
    etag: String,
    fileDetails: AnonAudioStreams,
    id: String,
    kind: String,
    player: AnonEmbedHtml,
    processingDetails: AnonEditorSuggestionsAvailability,
    recordingDetails: AnonLocation,
    snippet: AnonCategoryIdChannelId,
    statistics: AnonCommentCountDislikeCount,
    status: AnonEmbeddable,
    suggestions: AnonEditorSuggestions,
    topicDetails: AnonTopicIds
  ): GoogleApiYouTubeVideoResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], fileDetails = fileDetails.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any], processingDetails = processingDetails.asInstanceOf[js.Any], recordingDetails = recordingDetails.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any], topicDetails = topicDetails.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoogleApiYouTubeVideoResource]
  }
}

