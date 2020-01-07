package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Image context and/or feature-specific parameters.
  */
@js.native
trait Schema$GoogleCloudVisionV1p1beta1ImageContext extends js.Object {
  /**
    * Parameters for crop hints annotation request.
    */
  var cropHintsParams: js.UndefOr[Schema$GoogleCloudVisionV1p1beta1CropHintsParams] = js.native
  /**
    * List of languages to use for TEXT_DETECTION. In most cases, an empty
    * value yields the best results since it enables automatic language
    * detection. For languages based on the Latin alphabet, setting
    * `language_hints` is not needed. In rare cases, when the language of the
    * text in the image is known, setting a hint will help get better results
    * (although it will be a significant hindrance if the hint is wrong). Text
    * detection returns an error if one or more of the specified languages is
    * not one of the [supported languages](/vision/docs/languages).
    */
  var languageHints: js.UndefOr[js.Array[String]] = js.native
  /**
    * Not used.
    */
  var latLongRect: js.UndefOr[Schema$GoogleCloudVisionV1p1beta1LatLongRect] = js.native
  /**
    * Parameters for product search.
    */
  var productSearchParams: js.UndefOr[Schema$GoogleCloudVisionV1p1beta1ProductSearchParams] = js.native
  /**
    * Parameters for web detection.
    */
  var webDetectionParams: js.UndefOr[Schema$GoogleCloudVisionV1p1beta1WebDetectionParams] = js.native
}

object Schema$GoogleCloudVisionV1p1beta1ImageContext {
  @scala.inline
  def apply(
    cropHintsParams: Schema$GoogleCloudVisionV1p1beta1CropHintsParams = null,
    languageHints: js.Array[String] = null,
    latLongRect: Schema$GoogleCloudVisionV1p1beta1LatLongRect = null,
    productSearchParams: Schema$GoogleCloudVisionV1p1beta1ProductSearchParams = null,
    webDetectionParams: Schema$GoogleCloudVisionV1p1beta1WebDetectionParams = null
  ): Schema$GoogleCloudVisionV1p1beta1ImageContext = {
    val __obj = js.Dynamic.literal()
    if (cropHintsParams != null) __obj.updateDynamic("cropHintsParams")(cropHintsParams.asInstanceOf[js.Any])
    if (languageHints != null) __obj.updateDynamic("languageHints")(languageHints.asInstanceOf[js.Any])
    if (latLongRect != null) __obj.updateDynamic("latLongRect")(latLongRect.asInstanceOf[js.Any])
    if (productSearchParams != null) __obj.updateDynamic("productSearchParams")(productSearchParams.asInstanceOf[js.Any])
    if (webDetectionParams != null) __obj.updateDynamic("webDetectionParams")(webDetectionParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p1beta1ImageContext]
  }
}

