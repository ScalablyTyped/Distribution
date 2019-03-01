package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeVideoResource extends js.Object {
  /**
    * The contentDetails object contains information about the video content, including the length of the video and its aspect ratio.
    */
  var contentDetails: Anon_Caption
  /**
    * The ETag of the video resource.
    */
  var etag: java.lang.String
  /**
    * The fileDetails object encapsulates information about the video file that was uploaded to YouTube, including the files resolution, duration, audio and video codecs, stream bitrates, and more. This data can only be retrieved by the video owner.
    */
  var fileDetails: Anon_AudioStreams
  /**
    * The ID that YouTube uses to uniquely identify the video.
    */
  var id: java.lang.String
  /**
    * The type of the API resource. For video resources, the value will be youtube#video.
    */
  var kind: java.lang.String
  /**
    * The player object contains information that you would use to play the video in an embedded player.
    */
  var player: Anon_EmbedHtml
  /**
    * The processingProgress object encapsulates information about YouTubes progress in processing the uploaded video file. The properties in the object identify the current processing status and an estimate of the time remaining until YouTube finishes processing the video. This part also indicates whether different types of data or content, such as file details or thumbnail images, are available for the video.
    * The processingProgress object is designed to be polled so that the video uploaded can track the progress that YouTube has made in processing the uploaded video file. This data can only be retrieved by the video owner.
    */
  var processingDetails: Anon_EditorSuggestionsAvailability
  /**
    * The recordingDetails object encapsulates information about the location, date and address where the video was recorded. This object will only be returned for a video if the videos geolocation data or recording time has been set.
    */
  var recordingDetails: Anon_Location
  /**
    * The snippet object contains basic details about the video, such as its title, description, and category.
    */
  var snippet: Anon_CategoryIdChannelId
  /**
    * The statistics object contains statistics about the video.
    */
  var statistics: Anon_CommentCountDislikeCount
  /**
    * The status object contains information about the videos uploading, processing, and privacy statuses.
    */
  var status: Anon_Embeddable
  /**
    * The suggestions object encapsulates suggestions that identify opportunities to improve the video quality or the metadata for the uploaded video. This data can only be retrieved by the video owner.
    */
  var suggestions: Anon_EditorSuggestions
  /**
    * The topicDetails object encapsulates information about Freebase topics associated with the video.
    */
  var topicDetails: Anon_TopicIds
}

object GoogleApiYouTubeVideoResource {
  @scala.inline
  def apply(
    contentDetails: Anon_Caption,
    etag: java.lang.String,
    fileDetails: Anon_AudioStreams,
    id: java.lang.String,
    kind: java.lang.String,
    player: Anon_EmbedHtml,
    processingDetails: Anon_EditorSuggestionsAvailability,
    recordingDetails: Anon_Location,
    snippet: Anon_CategoryIdChannelId,
    statistics: Anon_CommentCountDislikeCount,
    status: Anon_Embeddable,
    suggestions: Anon_EditorSuggestions,
    topicDetails: Anon_TopicIds
  ): GoogleApiYouTubeVideoResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentDetails")(contentDetails)
    __obj.updateDynamic("etag")(etag)
    __obj.updateDynamic("fileDetails")(fileDetails)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("player")(player)
    __obj.updateDynamic("processingDetails")(processingDetails)
    __obj.updateDynamic("recordingDetails")(recordingDetails)
    __obj.updateDynamic("snippet")(snippet)
    __obj.updateDynamic("statistics")(statistics)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("suggestions")(suggestions)
    __obj.updateDynamic("topicDetails")(topicDetails)
    __obj.asInstanceOf[GoogleApiYouTubeVideoResource]
  }
}

