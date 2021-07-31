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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiYouTubeVideoResource extends StObject {
  
  /**
    * The contentDetails object contains information about the video content, including the length of the video and its aspect ratio.
    */
  var contentDetails: Caption
  
  /**
    * The ETag of the video resource.
    */
  var etag: String
  
  /**
    * The fileDetails object encapsulates information about the video file that was uploaded to YouTube, including the files resolution, duration, audio and video codecs, stream bitrates, and more. This data can only be retrieved by the video owner.
    */
  var fileDetails: AudioStreams
  
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
  var player: EmbedHtml
  
  /**
    * The processingProgress object encapsulates information about YouTubes progress in processing the uploaded video file. The properties in the object identify the current processing status and an estimate of the time remaining until YouTube finishes processing the video. This part also indicates whether different types of data or content, such as file details or thumbnail images, are available for the video.
    * The processingProgress object is designed to be polled so that the video uploaded can track the progress that YouTube has made in processing the uploaded video file. This data can only be retrieved by the video owner.
    */
  var processingDetails: EditorSuggestionsAvailability
  
  /**
    * The recordingDetails object encapsulates information about the location, date and address where the video was recorded. This object will only be returned for a video if the videos geolocation data or recording time has been set.
    */
  var recordingDetails: Location
  
  /**
    * The snippet object contains basic details about the video, such as its title, description, and category.
    */
  var snippet: CategoryId
  
  /**
    * The statistics object contains statistics about the video.
    */
  var statistics: DislikeCount
  
  /**
    * The status object contains information about the videos uploading, processing, and privacy statuses.
    */
  var status: Embeddable
  
  /**
    * The suggestions object encapsulates suggestions that identify opportunities to improve the video quality or the metadata for the uploaded video. This data can only be retrieved by the video owner.
    */
  var suggestions: EditorSuggestions
  
  /**
    * The topicDetails object encapsulates information about Freebase topics associated with the video.
    */
  var topicDetails: TopicIds
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
  implicit class GoogleApiYouTubeVideoResourceMutableBuilder[Self <: GoogleApiYouTubeVideoResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentDetails(value: Caption): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileDetails(value: AudioStreams): Self = StObject.set(x, "fileDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayer(value: EmbedHtml): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingDetails(value: EditorSuggestionsAvailability): Self = StObject.set(x, "processingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordingDetails(value: Location): Self = StObject.set(x, "recordingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippet(value: CategoryId): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatistics(value: DislikeCount): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Embeddable): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestions(value: EditorSuggestions): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicDetails(value: TopicIds): Self = StObject.set(x, "topicDetails", value.asInstanceOf[js.Any])
  }
}
