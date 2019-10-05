package typings.gapiDotClientDotVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageContext extends js.Object {
  /** Parameters for crop hints annotation request. */
  var cropHintsParams: js.UndefOr[CropHintsParams] = js.undefined
  /**
    * List of languages to use for TEXT_DETECTION. In most cases, an empty value
    * yields the best results since it enables automatic language detection. For
    * languages based on the Latin alphabet, setting `language_hints` is not
    * needed. In rare cases, when the language of the text in the image is known,
    * setting a hint will help get better results (although it will be a
    * significant hindrance if the hint is wrong). Text detection returns an
    * error if one or more of the specified languages is not one of the
    * [supported languages](/vision/docs/languages).
    */
  var languageHints: js.UndefOr[js.Array[String]] = js.undefined
  /** lat/long rectangle that specifies the location of the image. */
  var latLongRect: js.UndefOr[LatLongRect] = js.undefined
}

object ImageContext {
  @scala.inline
  def apply(
    cropHintsParams: CropHintsParams = null,
    languageHints: js.Array[String] = null,
    latLongRect: LatLongRect = null
  ): ImageContext = {
    val __obj = js.Dynamic.literal()
    if (cropHintsParams != null) __obj.updateDynamic("cropHintsParams")(cropHintsParams)
    if (languageHints != null) __obj.updateDynamic("languageHints")(languageHints)
    if (latLongRect != null) __obj.updateDynamic("latLongRect")(latLongRect)
    __obj.asInstanceOf[ImageContext]
  }
}

