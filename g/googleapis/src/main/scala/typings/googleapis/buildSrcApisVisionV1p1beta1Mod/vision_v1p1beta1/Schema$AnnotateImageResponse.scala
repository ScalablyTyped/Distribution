package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to an image annotation request.
  */
@js.native
trait Schema$AnnotateImageResponse extends js.Object {
  /**
    * If present, contextual information is needed to understand where this
    * image comes from.
    */
  var context: js.UndefOr[Schema$ImageAnnotationContext] = js.native
  /**
    * If present, crop hints have completed successfully.
    */
  var cropHintsAnnotation: js.UndefOr[Schema$CropHintsAnnotation] = js.native
  /**
    * If set, represents the error message for the operation. Note that
    * filled-in image annotations are guaranteed to be correct, even when
    * `error` is set.
    */
  var error: js.UndefOr[Schema$Status] = js.native
  /**
    * If present, face detection has completed successfully.
    */
  var faceAnnotations: js.UndefOr[js.Array[Schema$FaceAnnotation]] = js.native
  /**
    * If present, text (OCR) detection or document (OCR) text detection has
    * completed successfully. This annotation provides the structural hierarchy
    * for the OCR detected text.
    */
  var fullTextAnnotation: js.UndefOr[Schema$TextAnnotation] = js.native
  /**
    * If present, image properties were extracted successfully.
    */
  var imagePropertiesAnnotation: js.UndefOr[Schema$ImageProperties] = js.native
  /**
    * If present, label detection has completed successfully.
    */
  var labelAnnotations: js.UndefOr[js.Array[Schema$EntityAnnotation]] = js.native
  /**
    * If present, landmark detection has completed successfully.
    */
  var landmarkAnnotations: js.UndefOr[js.Array[Schema$EntityAnnotation]] = js.native
  /**
    * If present, localized object detection has completed successfully. This
    * will be sorted descending by confidence score.
    */
  var localizedObjectAnnotations: js.UndefOr[js.Array[Schema$LocalizedObjectAnnotation]] = js.native
  /**
    * If present, logo detection has completed successfully.
    */
  var logoAnnotations: js.UndefOr[js.Array[Schema$EntityAnnotation]] = js.native
  /**
    * If present, product search has completed successfully.
    */
  var productSearchResults: js.UndefOr[Schema$ProductSearchResults] = js.native
  /**
    * If present, safe-search annotation has completed successfully.
    */
  var safeSearchAnnotation: js.UndefOr[Schema$SafeSearchAnnotation] = js.native
  /**
    * If present, text (OCR) detection has completed successfully.
    */
  var textAnnotations: js.UndefOr[js.Array[Schema$EntityAnnotation]] = js.native
  /**
    * If present, web detection has completed successfully.
    */
  var webDetection: js.UndefOr[Schema$WebDetection] = js.native
}

object Schema$AnnotateImageResponse {
  @scala.inline
  def apply(
    context: Schema$ImageAnnotationContext = null,
    cropHintsAnnotation: Schema$CropHintsAnnotation = null,
    error: Schema$Status = null,
    faceAnnotations: js.Array[Schema$FaceAnnotation] = null,
    fullTextAnnotation: Schema$TextAnnotation = null,
    imagePropertiesAnnotation: Schema$ImageProperties = null,
    labelAnnotations: js.Array[Schema$EntityAnnotation] = null,
    landmarkAnnotations: js.Array[Schema$EntityAnnotation] = null,
    localizedObjectAnnotations: js.Array[Schema$LocalizedObjectAnnotation] = null,
    logoAnnotations: js.Array[Schema$EntityAnnotation] = null,
    productSearchResults: Schema$ProductSearchResults = null,
    safeSearchAnnotation: Schema$SafeSearchAnnotation = null,
    textAnnotations: js.Array[Schema$EntityAnnotation] = null,
    webDetection: Schema$WebDetection = null
  ): Schema$AnnotateImageResponse = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (cropHintsAnnotation != null) __obj.updateDynamic("cropHintsAnnotation")(cropHintsAnnotation.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (faceAnnotations != null) __obj.updateDynamic("faceAnnotations")(faceAnnotations.asInstanceOf[js.Any])
    if (fullTextAnnotation != null) __obj.updateDynamic("fullTextAnnotation")(fullTextAnnotation.asInstanceOf[js.Any])
    if (imagePropertiesAnnotation != null) __obj.updateDynamic("imagePropertiesAnnotation")(imagePropertiesAnnotation.asInstanceOf[js.Any])
    if (labelAnnotations != null) __obj.updateDynamic("labelAnnotations")(labelAnnotations.asInstanceOf[js.Any])
    if (landmarkAnnotations != null) __obj.updateDynamic("landmarkAnnotations")(landmarkAnnotations.asInstanceOf[js.Any])
    if (localizedObjectAnnotations != null) __obj.updateDynamic("localizedObjectAnnotations")(localizedObjectAnnotations.asInstanceOf[js.Any])
    if (logoAnnotations != null) __obj.updateDynamic("logoAnnotations")(logoAnnotations.asInstanceOf[js.Any])
    if (productSearchResults != null) __obj.updateDynamic("productSearchResults")(productSearchResults.asInstanceOf[js.Any])
    if (safeSearchAnnotation != null) __obj.updateDynamic("safeSearchAnnotation")(safeSearchAnnotation.asInstanceOf[js.Any])
    if (textAnnotations != null) __obj.updateDynamic("textAnnotations")(textAnnotations.asInstanceOf[js.Any])
    if (webDetection != null) __obj.updateDynamic("webDetection")(webDetection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AnnotateImageResponse]
  }
}

