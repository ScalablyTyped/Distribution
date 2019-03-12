package typings
package gapiDotClientDotTranslateLib.gapiNs.clientNs.translateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslationsResource extends js.Object {
  /**
    * The source language of the initial request, detected automatically, if
    * no source language was passed within the initial request. If the
    * source language was passed, auto-detection of the language will not
    * occur and this field will be empty.
    */
  var detectedSourceLanguage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The `model` type used for this translation. Valid values are
    * listed in public documentation. Can be different from requested `model`.
    * Present only if specific model type was explicitly requested.
    */
  var model: js.UndefOr[java.lang.String] = js.undefined
  /** Text translated into the target language. */
  var translatedText: js.UndefOr[java.lang.String] = js.undefined
  /** Translates input text, returning translated text. */
  def list(request: gapiDotClientDotTranslateLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[TranslationsListResponse]
  /** Translates input text, returning translated text. */
  def translate(request: gapiDotClientDotTranslateLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[TranslationsListResponse]
}

object TranslationsResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotTranslateLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[TranslationsListResponse],
    translate: gapiDotClientDotTranslateLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[TranslationsListResponse],
    detectedSourceLanguage: java.lang.String = null,
    model: java.lang.String = null,
    translatedText: java.lang.String = null
  ): TranslationsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), translate = js.Any.fromFunction1(translate))
    if (detectedSourceLanguage != null) __obj.updateDynamic("detectedSourceLanguage")(detectedSourceLanguage)
    if (model != null) __obj.updateDynamic("model")(model)
    if (translatedText != null) __obj.updateDynamic("translatedText")(translatedText)
    __obj.asInstanceOf[TranslationsResource]
  }
}

