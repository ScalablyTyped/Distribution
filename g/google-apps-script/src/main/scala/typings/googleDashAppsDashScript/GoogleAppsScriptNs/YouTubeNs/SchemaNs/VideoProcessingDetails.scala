package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

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

