package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudVideointelligenceV1beta1VideoAnnotationResults extends js.Object {
  /**
    * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
    * some videos may succeed and some may fail.
    */
  var error: js.UndefOr[GoogleRpcStatus] = js.native
  /**
    * Video file location in
    * [Google Cloud Storage](https://cloud.google.com/storage/).
    */
  var inputUri: js.UndefOr[String] = js.native
  /** Label annotations. There is exactly one element for each unique label. */
  var labelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta1LabelAnnotation]] = js.native
  /** Safe search annotations. */
  var safeSearchAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation]] = js.native
  /** Shot annotations. Each shot is represented as a video segment. */
  var shotAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta1VideoSegment]] = js.native
}

object GoogleCloudVideointelligenceV1beta1VideoAnnotationResults {
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta1VideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1VideoAnnotationResults]
  }
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta1VideoAnnotationResultsOps[Self <: GoogleCloudVideointelligenceV1beta1VideoAnnotationResults] (val x: Self) extends AnyVal {
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
    def setError(value: GoogleRpcStatus): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setInputUri(value: String): Self = this.set("inputUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputUri: Self = this.set("inputUri", js.undefined)
    @scala.inline
    def setLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1beta1LabelAnnotation*): Self = this.set("labelAnnotations", js.Array(value :_*))
    @scala.inline
    def setLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta1LabelAnnotation]): Self = this.set("labelAnnotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelAnnotations: Self = this.set("labelAnnotations", js.undefined)
    @scala.inline
    def setSafeSearchAnnotationsVarargs(value: GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation*): Self = this.set("safeSearchAnnotations", js.Array(value :_*))
    @scala.inline
    def setSafeSearchAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta1SafeSearchAnnotation]): Self = this.set("safeSearchAnnotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafeSearchAnnotations: Self = this.set("safeSearchAnnotations", js.undefined)
    @scala.inline
    def setShotAnnotationsVarargs(value: GoogleCloudVideointelligenceV1beta1VideoSegment*): Self = this.set("shotAnnotations", js.Array(value :_*))
    @scala.inline
    def setShotAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta1VideoSegment]): Self = this.set("shotAnnotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShotAnnotations: Self = this.set("shotAnnotations", js.undefined)
  }
  
}

