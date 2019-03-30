package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProcessingDetails extends js.Object {
  var editorSuggestionsAvailability: js.UndefOr[java.lang.String] = js.undefined
  var fileDetailsAvailability: js.UndefOr[java.lang.String] = js.undefined
  var processingFailureReason: js.UndefOr[java.lang.String] = js.undefined
  var processingIssuesAvailability: js.UndefOr[java.lang.String] = js.undefined
  var processingProgress: js.UndefOr[VideoProcessingDetailsProcessingProgress] = js.undefined
  var processingStatus: js.UndefOr[java.lang.String] = js.undefined
  var tagSuggestionsAvailability: js.UndefOr[java.lang.String] = js.undefined
  var thumbnailsAvailability: js.UndefOr[java.lang.String] = js.undefined
}

object VideoProcessingDetails {
  @scala.inline
  def apply(
    editorSuggestionsAvailability: java.lang.String = null,
    fileDetailsAvailability: java.lang.String = null,
    processingFailureReason: java.lang.String = null,
    processingIssuesAvailability: java.lang.String = null,
    processingProgress: VideoProcessingDetailsProcessingProgress = null,
    processingStatus: java.lang.String = null,
    tagSuggestionsAvailability: java.lang.String = null,
    thumbnailsAvailability: java.lang.String = null
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

