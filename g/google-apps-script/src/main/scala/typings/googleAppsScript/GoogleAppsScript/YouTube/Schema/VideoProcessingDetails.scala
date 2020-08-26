package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoProcessingDetails extends js.Object {
  var editorSuggestionsAvailability: js.UndefOr[String] = js.native
  var fileDetailsAvailability: js.UndefOr[String] = js.native
  var processingFailureReason: js.UndefOr[String] = js.native
  var processingIssuesAvailability: js.UndefOr[String] = js.native
  var processingProgress: js.UndefOr[VideoProcessingDetailsProcessingProgress] = js.native
  var processingStatus: js.UndefOr[String] = js.native
  var tagSuggestionsAvailability: js.UndefOr[String] = js.native
  var thumbnailsAvailability: js.UndefOr[String] = js.native
}

object VideoProcessingDetails {
  @scala.inline
  def apply(): VideoProcessingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoProcessingDetails]
  }
  @scala.inline
  implicit class VideoProcessingDetailsOps[Self <: VideoProcessingDetails] (val x: Self) extends AnyVal {
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
    def setEditorSuggestionsAvailability(value: String): Self = this.set("editorSuggestionsAvailability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditorSuggestionsAvailability: Self = this.set("editorSuggestionsAvailability", js.undefined)
    @scala.inline
    def setFileDetailsAvailability(value: String): Self = this.set("fileDetailsAvailability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileDetailsAvailability: Self = this.set("fileDetailsAvailability", js.undefined)
    @scala.inline
    def setProcessingFailureReason(value: String): Self = this.set("processingFailureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessingFailureReason: Self = this.set("processingFailureReason", js.undefined)
    @scala.inline
    def setProcessingIssuesAvailability(value: String): Self = this.set("processingIssuesAvailability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessingIssuesAvailability: Self = this.set("processingIssuesAvailability", js.undefined)
    @scala.inline
    def setProcessingProgress(value: VideoProcessingDetailsProcessingProgress): Self = this.set("processingProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessingProgress: Self = this.set("processingProgress", js.undefined)
    @scala.inline
    def setProcessingStatus(value: String): Self = this.set("processingStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessingStatus: Self = this.set("processingStatus", js.undefined)
    @scala.inline
    def setTagSuggestionsAvailability(value: String): Self = this.set("tagSuggestionsAvailability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagSuggestionsAvailability: Self = this.set("tagSuggestionsAvailability", js.undefined)
    @scala.inline
    def setThumbnailsAvailability(value: String): Self = this.set("thumbnailsAvailability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailsAvailability: Self = this.set("thumbnailsAvailability", js.undefined)
  }
  
}

