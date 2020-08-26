package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotateImageResponse extends js.Object {
  /** If present, crop hints have completed successfully. */
  var cropHintsAnnotation: js.UndefOr[CropHintsAnnotation] = js.native
  /**
    * If set, represents the error message for the operation.
    * Note that filled-in image annotations are guaranteed to be
    * correct, even when `error` is set.
    */
  var error: js.UndefOr[Status] = js.native
  /** If present, face detection has completed successfully. */
  var faceAnnotations: js.UndefOr[js.Array[FaceAnnotation]] = js.native
  /**
    * If present, text (OCR) detection or document (OCR) text detection has
    * completed successfully.
    * This annotation provides the structural hierarchy for the OCR detected
    * text.
    */
  var fullTextAnnotation: js.UndefOr[TextAnnotation] = js.native
  /** If present, image properties were extracted successfully. */
  var imagePropertiesAnnotation: js.UndefOr[ImageProperties] = js.native
  /** If present, label detection has completed successfully. */
  var labelAnnotations: js.UndefOr[js.Array[EntityAnnotation]] = js.native
  /** If present, landmark detection has completed successfully. */
  var landmarkAnnotations: js.UndefOr[js.Array[EntityAnnotation]] = js.native
  /** If present, logo detection has completed successfully. */
  var logoAnnotations: js.UndefOr[js.Array[EntityAnnotation]] = js.native
  /** If present, safe-search annotation has completed successfully. */
  var safeSearchAnnotation: js.UndefOr[SafeSearchAnnotation] = js.native
  /** If present, text (OCR) detection has completed successfully. */
  var textAnnotations: js.UndefOr[js.Array[EntityAnnotation]] = js.native
  /** If present, web detection has completed successfully. */
  var webDetection: js.UndefOr[WebDetection] = js.native
}

object AnnotateImageResponse {
  @scala.inline
  def apply(): AnnotateImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotateImageResponse]
  }
  @scala.inline
  implicit class AnnotateImageResponseOps[Self <: AnnotateImageResponse] (val x: Self) extends AnyVal {
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
    def setCropHintsAnnotation(value: CropHintsAnnotation): Self = this.set("cropHintsAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCropHintsAnnotation: Self = this.set("cropHintsAnnotation", js.undefined)
    @scala.inline
    def setError(value: Status): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFaceAnnotationsVarargs(value: FaceAnnotation*): Self = this.set("faceAnnotations", js.Array(value :_*))
    @scala.inline
    def setFaceAnnotations(value: js.Array[FaceAnnotation]): Self = this.set("faceAnnotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceAnnotations: Self = this.set("faceAnnotations", js.undefined)
    @scala.inline
    def setFullTextAnnotation(value: TextAnnotation): Self = this.set("fullTextAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullTextAnnotation: Self = this.set("fullTextAnnotation", js.undefined)
    @scala.inline
    def setImagePropertiesAnnotation(value: ImageProperties): Self = this.set("imagePropertiesAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagePropertiesAnnotation: Self = this.set("imagePropertiesAnnotation", js.undefined)
    @scala.inline
    def setLabelAnnotationsVarargs(value: EntityAnnotation*): Self = this.set("labelAnnotations", js.Array(value :_*))
    @scala.inline
    def setLabelAnnotations(value: js.Array[EntityAnnotation]): Self = this.set("labelAnnotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelAnnotations: Self = this.set("labelAnnotations", js.undefined)
    @scala.inline
    def setLandmarkAnnotationsVarargs(value: EntityAnnotation*): Self = this.set("landmarkAnnotations", js.Array(value :_*))
    @scala.inline
    def setLandmarkAnnotations(value: js.Array[EntityAnnotation]): Self = this.set("landmarkAnnotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLandmarkAnnotations: Self = this.set("landmarkAnnotations", js.undefined)
    @scala.inline
    def setLogoAnnotationsVarargs(value: EntityAnnotation*): Self = this.set("logoAnnotations", js.Array(value :_*))
    @scala.inline
    def setLogoAnnotations(value: js.Array[EntityAnnotation]): Self = this.set("logoAnnotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogoAnnotations: Self = this.set("logoAnnotations", js.undefined)
    @scala.inline
    def setSafeSearchAnnotation(value: SafeSearchAnnotation): Self = this.set("safeSearchAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafeSearchAnnotation: Self = this.set("safeSearchAnnotation", js.undefined)
    @scala.inline
    def setTextAnnotationsVarargs(value: EntityAnnotation*): Self = this.set("textAnnotations", js.Array(value :_*))
    @scala.inline
    def setTextAnnotations(value: js.Array[EntityAnnotation]): Self = this.set("textAnnotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAnnotations: Self = this.set("textAnnotations", js.undefined)
    @scala.inline
    def setWebDetection(value: WebDetection): Self = this.set("webDetection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebDetection: Self = this.set("webDetection", js.undefined)
  }
  
}

