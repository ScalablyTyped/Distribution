package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotateImageResponse extends js.Object {
  /** If present, crop hints have completed successfully. */
  var cropHintsAnnotation: js.UndefOr[CropHintsAnnotation] = js.undefined
  /**
    * If set, represents the error message for the operation.
    * Note that filled-in image annotations are guaranteed to be
    * correct, even when `error` is set.
    */
  var error: js.UndefOr[Status] = js.undefined
  /** If present, face detection has completed successfully. */
  var faceAnnotations: js.UndefOr[js.Array[FaceAnnotation]] = js.undefined
  /**
    * If present, text (OCR) detection or document (OCR) text detection has
    * completed successfully.
    * This annotation provides the structural hierarchy for the OCR detected
    * text.
    */
  var fullTextAnnotation: js.UndefOr[TextAnnotation] = js.undefined
  /** If present, image properties were extracted successfully. */
  var imagePropertiesAnnotation: js.UndefOr[ImageProperties] = js.undefined
  /** If present, label detection has completed successfully. */
  var labelAnnotations: js.UndefOr[js.Array[EntityAnnotation]] = js.undefined
  /** If present, landmark detection has completed successfully. */
  var landmarkAnnotations: js.UndefOr[js.Array[EntityAnnotation]] = js.undefined
  /** If present, logo detection has completed successfully. */
  var logoAnnotations: js.UndefOr[js.Array[EntityAnnotation]] = js.undefined
  /** If present, safe-search annotation has completed successfully. */
  var safeSearchAnnotation: js.UndefOr[SafeSearchAnnotation] = js.undefined
  /** If present, text (OCR) detection has completed successfully. */
  var textAnnotations: js.UndefOr[js.Array[EntityAnnotation]] = js.undefined
  /** If present, web detection has completed successfully. */
  var webDetection: js.UndefOr[WebDetection] = js.undefined
}

object AnnotateImageResponse {
  @scala.inline
  def apply(
    cropHintsAnnotation: CropHintsAnnotation = null,
    error: Status = null,
    faceAnnotations: js.Array[FaceAnnotation] = null,
    fullTextAnnotation: TextAnnotation = null,
    imagePropertiesAnnotation: ImageProperties = null,
    labelAnnotations: js.Array[EntityAnnotation] = null,
    landmarkAnnotations: js.Array[EntityAnnotation] = null,
    logoAnnotations: js.Array[EntityAnnotation] = null,
    safeSearchAnnotation: SafeSearchAnnotation = null,
    textAnnotations: js.Array[EntityAnnotation] = null,
    webDetection: WebDetection = null
  ): AnnotateImageResponse = {
    val __obj = js.Dynamic.literal()
    if (cropHintsAnnotation != null) __obj.updateDynamic("cropHintsAnnotation")(cropHintsAnnotation)
    if (error != null) __obj.updateDynamic("error")(error)
    if (faceAnnotations != null) __obj.updateDynamic("faceAnnotations")(faceAnnotations)
    if (fullTextAnnotation != null) __obj.updateDynamic("fullTextAnnotation")(fullTextAnnotation)
    if (imagePropertiesAnnotation != null) __obj.updateDynamic("imagePropertiesAnnotation")(imagePropertiesAnnotation)
    if (labelAnnotations != null) __obj.updateDynamic("labelAnnotations")(labelAnnotations)
    if (landmarkAnnotations != null) __obj.updateDynamic("landmarkAnnotations")(landmarkAnnotations)
    if (logoAnnotations != null) __obj.updateDynamic("logoAnnotations")(logoAnnotations)
    if (safeSearchAnnotation != null) __obj.updateDynamic("safeSearchAnnotation")(safeSearchAnnotation)
    if (textAnnotations != null) __obj.updateDynamic("textAnnotations")(textAnnotations)
    if (webDetection != null) __obj.updateDynamic("webDetection")(webDetection)
    __obj.asInstanceOf[AnnotateImageResponse]
  }
}

