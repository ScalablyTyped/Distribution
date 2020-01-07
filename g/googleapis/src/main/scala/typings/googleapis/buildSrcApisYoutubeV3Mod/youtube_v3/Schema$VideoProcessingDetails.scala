package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes processing status and progress and availability of some other
  * Video resource parts.
  */
@js.native
trait Schema$VideoProcessingDetails extends js.Object {
  /**
    * This value indicates whether video editing suggestions, which might
    * improve video quality or the playback experience, are available for the
    * video. You can retrieve these suggestions by requesting the suggestions
    * part in your videos.list() request.
    */
  var editorSuggestionsAvailability: js.UndefOr[String] = js.native
  /**
    * This value indicates whether file details are available for the uploaded
    * video. You can retrieve a video&#39;s file details by requesting the
    * fileDetails part in your videos.list() request.
    */
  var fileDetailsAvailability: js.UndefOr[String] = js.native
  /**
    * The reason that YouTube failed to process the video. This property will
    * only have a value if the processingStatus property&#39;s value is failed.
    */
  var processingFailureReason: js.UndefOr[String] = js.native
  /**
    * This value indicates whether the video processing engine has generated
    * suggestions that might improve YouTube&#39;s ability to process the the
    * video, warnings that explain video processing problems, or errors that
    * cause video processing problems. You can retrieve these suggestions by
    * requesting the suggestions part in your videos.list() request.
    */
  var processingIssuesAvailability: js.UndefOr[String] = js.native
  /**
    * The processingProgress object contains information about the progress
    * YouTube has made in processing the video. The values are really only
    * relevant if the video&#39;s processing status is processing.
    */
  var processingProgress: js.UndefOr[Schema$VideoProcessingDetailsProcessingProgress] = js.native
  /**
    * The video&#39;s processing status. This value indicates whether YouTube
    * was able to process the video or if the video is still being processed.
    */
  var processingStatus: js.UndefOr[String] = js.native
  /**
    * This value indicates whether keyword (tag) suggestions are available for
    * the video. Tags can be added to a video&#39;s metadata to make it easier
    * for other users to find the video. You can retrieve these suggestions by
    * requesting the suggestions part in your videos.list() request.
    */
  var tagSuggestionsAvailability: js.UndefOr[String] = js.native
  /**
    * This value indicates whether thumbnail images have been generated for the
    * video.
    */
  var thumbnailsAvailability: js.UndefOr[String] = js.native
}

object Schema$VideoProcessingDetails {
  @scala.inline
  def apply(
    editorSuggestionsAvailability: String = null,
    fileDetailsAvailability: String = null,
    processingFailureReason: String = null,
    processingIssuesAvailability: String = null,
    processingProgress: Schema$VideoProcessingDetailsProcessingProgress = null,
    processingStatus: String = null,
    tagSuggestionsAvailability: String = null,
    thumbnailsAvailability: String = null
  ): Schema$VideoProcessingDetails = {
    val __obj = js.Dynamic.literal()
    if (editorSuggestionsAvailability != null) __obj.updateDynamic("editorSuggestionsAvailability")(editorSuggestionsAvailability.asInstanceOf[js.Any])
    if (fileDetailsAvailability != null) __obj.updateDynamic("fileDetailsAvailability")(fileDetailsAvailability.asInstanceOf[js.Any])
    if (processingFailureReason != null) __obj.updateDynamic("processingFailureReason")(processingFailureReason.asInstanceOf[js.Any])
    if (processingIssuesAvailability != null) __obj.updateDynamic("processingIssuesAvailability")(processingIssuesAvailability.asInstanceOf[js.Any])
    if (processingProgress != null) __obj.updateDynamic("processingProgress")(processingProgress.asInstanceOf[js.Any])
    if (processingStatus != null) __obj.updateDynamic("processingStatus")(processingStatus.asInstanceOf[js.Any])
    if (tagSuggestionsAvailability != null) __obj.updateDynamic("tagSuggestionsAvailability")(tagSuggestionsAvailability.asInstanceOf[js.Any])
    if (thumbnailsAvailability != null) __obj.updateDynamic("thumbnailsAvailability")(thumbnailsAvailability.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoProcessingDetails]
  }
}

