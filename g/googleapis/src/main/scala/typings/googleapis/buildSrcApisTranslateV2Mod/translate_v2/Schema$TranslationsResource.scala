package typings.googleapis.buildSrcApisTranslateV2Mod.translate_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TranslationsResource extends js.Object {
  /**
    * The source language of the initial request, detected automatically, if no
    * source language was passed within the initial request. If the source
    * language was passed, auto-detection of the language will not occur and
    * this field will be empty.
    */
  var detectedSourceLanguage: js.UndefOr[String] = js.native
  /**
    * The `model` type used for this translation. Valid values are listed in
    * public documentation. Can be different from requested `model`. Present
    * only if specific model type was explicitly requested.
    */
  var model: js.UndefOr[String] = js.native
  /**
    * Text translated into the target language.
    */
  var translatedText: js.UndefOr[String] = js.native
}

object Schema$TranslationsResource {
  @scala.inline
  def apply(detectedSourceLanguage: String = null, model: String = null, translatedText: String = null): Schema$TranslationsResource = {
    val __obj = js.Dynamic.literal()
    if (detectedSourceLanguage != null) __obj.updateDynamic("detectedSourceLanguage")(detectedSourceLanguage.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (translatedText != null) __obj.updateDynamic("translatedText")(translatedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TranslationsResource]
  }
}

