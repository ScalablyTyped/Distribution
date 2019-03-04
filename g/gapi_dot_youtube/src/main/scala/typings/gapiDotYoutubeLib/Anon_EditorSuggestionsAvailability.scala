package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EditorSuggestionsAvailability extends js.Object {
  /**
    * This value indicates whether video editing suggestions, which might improve video quality or the playback experience, are available for the video. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.
    */
  var editorSuggestionsAvailability: java.lang.String
  /**
    * The reason that YouTube failed to process the video. This property will only have a value if the processingStatus propertys value is failed.
    */
  var fileDetailsAvailability: java.lang.String
  var processingFailureReason: java.lang.String
  /**
    * This value indicates whether file details are available for the uploaded video. You can retrieve a videos file details by requesting the fileDetails part in your videos.list() request.
    */
  var processingIssuesAvailability: java.lang.String
  /**
    * The processingProgress object contains information about the progress YouTube has made in processing the video. The values are really only relevant if the videos processing status is processing.
    */
  var processingProgress: Anon_PartsProcessed
  /**
    * The videos processing status. This value indicates whether YouTube was able to process the video or if the video is still being processed.
    */
  var processingStatus: java.lang.String
  /**
    * This value indicates whether keyword (tag) suggestions are available for the video. Tags can be added to a videos metadata to make it easier for other users to find the video. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.
    */
  var tagSuggestionsAvailability: java.lang.String
  /**
    * This value indicates whether thumbnail images have been generated for the video.
    */
  var thumbnailsAvailability: java.lang.String
}

object Anon_EditorSuggestionsAvailability {
  @scala.inline
  def apply(
    editorSuggestionsAvailability: java.lang.String,
    fileDetailsAvailability: java.lang.String,
    processingFailureReason: java.lang.String,
    processingIssuesAvailability: java.lang.String,
    processingProgress: Anon_PartsProcessed,
    processingStatus: java.lang.String,
    tagSuggestionsAvailability: java.lang.String,
    thumbnailsAvailability: java.lang.String
  ): Anon_EditorSuggestionsAvailability = {
    val __obj = js.Dynamic.literal(editorSuggestionsAvailability = editorSuggestionsAvailability, fileDetailsAvailability = fileDetailsAvailability, processingFailureReason = processingFailureReason, processingIssuesAvailability = processingIssuesAvailability, processingProgress = processingProgress, processingStatus = processingStatus, tagSuggestionsAvailability = tagSuggestionsAvailability, thumbnailsAvailability = thumbnailsAvailability)
  
    __obj.asInstanceOf[Anon_EditorSuggestionsAvailability]
  }
}

