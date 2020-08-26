package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudVideointelligenceV1beta2VideoAnnotationResults extends js.Object {
  /**
    * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
    * some videos may succeed and some may fail.
    */
  var error: js.UndefOr[GoogleRpcStatus] = js.native
  /** Explicit content annotation. */
  var explicitAnnotation: js.UndefOr[GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation] = js.native
  /**
    * Label annotations on frame level.
    * There is exactly one element for each unique label.
    */
  var frameLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.native
  /**
    * Video file location in
    * [Google Cloud Storage](https://cloud.google.com/storage/).
    */
  var inputUri: js.UndefOr[String] = js.native
  /**
    * Label annotations on video level or user specified segment level.
    * There is exactly one element for each unique label.
    */
  var segmentLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.native
  /** Shot annotations. Each shot is represented as a video segment. */
  var shotAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2VideoSegment]] = js.native
  /**
    * Label annotations on shot level.
    * There is exactly one element for each unique label.
    */
  var shotLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.native
}

object GoogleCloudVideointelligenceV1beta2VideoAnnotationResults {
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2VideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2VideoAnnotationResults]
  }
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2VideoAnnotationResultsOps[Self <: GoogleCloudVideointelligenceV1beta2VideoAnnotationResults] (val x: Self) extends AnyVal {
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
    def setExplicitAnnotation(value: GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation): Self = this.set("explicitAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplicitAnnotation: Self = this.set("explicitAnnotation", js.undefined)
    @scala.inline
    def setFrameLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1beta2LabelAnnotation*): Self = this.set("frameLabelAnnotations", js.Array(value :_*))
    @scala.inline
    def setFrameLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = this.set("frameLabelAnnotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameLabelAnnotations: Self = this.set("frameLabelAnnotations", js.undefined)
    @scala.inline
    def setInputUri(value: String): Self = this.set("inputUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputUri: Self = this.set("inputUri", js.undefined)
    @scala.inline
    def setSegmentLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1beta2LabelAnnotation*): Self = this.set("segmentLabelAnnotations", js.Array(value :_*))
    @scala.inline
    def setSegmentLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = this.set("segmentLabelAnnotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentLabelAnnotations: Self = this.set("segmentLabelAnnotations", js.undefined)
    @scala.inline
    def setShotAnnotationsVarargs(value: GoogleCloudVideointelligenceV1beta2VideoSegment*): Self = this.set("shotAnnotations", js.Array(value :_*))
    @scala.inline
    def setShotAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2VideoSegment]): Self = this.set("shotAnnotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShotAnnotations: Self = this.set("shotAnnotations", js.undefined)
    @scala.inline
    def setShotLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1beta2LabelAnnotation*): Self = this.set("shotLabelAnnotations", js.Array(value :_*))
    @scala.inline
    def setShotLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = this.set("shotLabelAnnotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShotLabelAnnotations: Self = this.set("shotLabelAnnotations", js.undefined)
  }
  
}

