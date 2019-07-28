package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProcessingDetails extends js.Object {
  /**
    * This value indicates whether video editing suggestions, which might improve video quality or the playback experience, are available for the video. You
    * can retrieve these suggestions by requesting the suggestions part in your videos.list() request.
    */
  var editorSuggestionsAvailability: js.UndefOr[String] = js.undefined
  /**
    * This value indicates whether file details are available for the uploaded video. You can retrieve a video's file details by requesting the fileDetails
    * part in your videos.list() request.
    */
  var fileDetailsAvailability: js.UndefOr[String] = js.undefined
  /** The reason that YouTube failed to process the video. This property will only have a value if the processingStatus property's value is failed. */
  var processingFailureReason: js.UndefOr[String] = js.undefined
  /**
    * This value indicates whether the video processing engine has generated suggestions that might improve YouTube's ability to process the the video,
    * warnings that explain video processing problems, or errors that cause video processing problems. You can retrieve these suggestions by requesting the
    * suggestions part in your videos.list() request.
    */
  var processingIssuesAvailability: js.UndefOr[String] = js.undefined
  /**
    * The processingProgress object contains information about the progress YouTube has made in processing the video. The values are really only relevant if
    * the video's processing status is processing.
    */
  var processingProgress: js.UndefOr[VideoProcessingDetailsProcessingProgress] = js.undefined
  /** The video's processing status. This value indicates whether YouTube was able to process the video or if the video is still being processed. */
  var processingStatus: js.UndefOr[String] = js.undefined
  /**
    * This value indicates whether keyword (tag) suggestions are available for the video. Tags can be added to a video's metadata to make it easier for other
    * users to find the video. You can retrieve these suggestions by requesting the suggestions part in your videos.list() request.
    */
  var tagSuggestionsAvailability: js.UndefOr[String] = js.undefined
  /** This value indicates whether thumbnail images have been generated for the video. */
  var thumbnailsAvailability: js.UndefOr[String] = js.undefined
}

object VideoProcessingDetails {
  @scala.inline
  def apply(
    editorSuggestionsAvailability: String = null,
    fileDetailsAvailability: String = null,
    processingFailureReason: String = null,
    processingIssuesAvailability: String = null,
    processingProgress: VideoProcessingDetailsProcessingProgress = null,
    processingStatus: String = null,
    tagSuggestionsAvailability: String = null,
    thumbnailsAvailability: String = null
  ): VideoProcessingDetails = {
    val __obj = js.Dynamic.literal()
    if (editorSuggestionsAvailability != null) __obj.updateDynamic("editorSuggestionsAvailability")(editorSuggestionsAvailability)
    if (fileDetailsAvailability != null) __obj.updateDynamic("fileDetailsAvailability")(fileDetailsAvailability)
    if (processingFailureReason != null) __obj.updateDynamic("processingFailureReason")(processingFailureReason)
    if (processingIssuesAvailability != null) __obj.updateDynamic("processingIssuesAvailability")(processingIssuesAvailability)
    if (processingProgress != null) __obj.updateDynamic("processingProgress")(processingProgress)
    if (processingStatus != null) __obj.updateDynamic("processingStatus")(processingStatus)
    if (tagSuggestionsAvailability != null) __obj.updateDynamic("tagSuggestionsAvailability")(tagSuggestionsAvailability)
    if (thumbnailsAvailability != null) __obj.updateDynamic("thumbnailsAvailability")(thumbnailsAvailability)
    __obj.asInstanceOf[VideoProcessingDetails]
  }
}

