package typings.googleDashAppsDashScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProcessingDetails extends js.Object {
  var editorSuggestionsAvailability: js.UndefOr[String] = js.undefined
  var fileDetailsAvailability: js.UndefOr[String] = js.undefined
  var processingFailureReason: js.UndefOr[String] = js.undefined
  var processingIssuesAvailability: js.UndefOr[String] = js.undefined
  var processingProgress: js.UndefOr[VideoProcessingDetailsProcessingProgress] = js.undefined
  var processingStatus: js.UndefOr[String] = js.undefined
  var tagSuggestionsAvailability: js.UndefOr[String] = js.undefined
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
    if (editorSuggestionsAvailability != null) __obj.updateDynamic("editorSuggestionsAvailability")(editorSuggestionsAvailability.asInstanceOf[js.Any])
    if (fileDetailsAvailability != null) __obj.updateDynamic("fileDetailsAvailability")(fileDetailsAvailability.asInstanceOf[js.Any])
    if (processingFailureReason != null) __obj.updateDynamic("processingFailureReason")(processingFailureReason.asInstanceOf[js.Any])
    if (processingIssuesAvailability != null) __obj.updateDynamic("processingIssuesAvailability")(processingIssuesAvailability.asInstanceOf[js.Any])
    if (processingProgress != null) __obj.updateDynamic("processingProgress")(processingProgress.asInstanceOf[js.Any])
    if (processingStatus != null) __obj.updateDynamic("processingStatus")(processingStatus.asInstanceOf[js.Any])
    if (tagSuggestionsAvailability != null) __obj.updateDynamic("tagSuggestionsAvailability")(tagSuggestionsAvailability.asInstanceOf[js.Any])
    if (thumbnailsAvailability != null) __obj.updateDynamic("thumbnailsAvailability")(thumbnailsAvailability.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoProcessingDetails]
  }
}

