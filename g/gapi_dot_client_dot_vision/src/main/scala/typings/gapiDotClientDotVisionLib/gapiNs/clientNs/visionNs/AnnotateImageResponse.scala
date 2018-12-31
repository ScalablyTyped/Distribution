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

