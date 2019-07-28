package typings.gapiDotClientDotTranslate.gapiNs.clientNs.translateNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotTranslate.Anon_AccesstokenAlt
import typings.gapiDotClientDotTranslate.Anon_AccesstokenAltBearertoken
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
  var detectedSourceLanguage: js.UndefOr[String] = js.undefined
  /**
    * The `model` type used for this translation. Valid values are
    * listed in public documentation. Can be different from requested `model`.
    * Present only if specific model type was explicitly requested.
    */
  var model: js.UndefOr[String] = js.undefined
  /** Text translated into the target language. */
  var translatedText: js.UndefOr[String] = js.undefined
  /** Translates input text, returning translated text. */
  def list(request: Anon_AccesstokenAlt): Request[TranslationsListResponse]
  /** Translates input text, returning translated text. */
  def translate(request: Anon_AccesstokenAltBearertoken): Request[TranslationsListResponse]
}

object TranslationsResource {
  @scala.inline
  def apply(
    list: Anon_AccesstokenAlt => Request[TranslationsListResponse],
    translate: Anon_AccesstokenAltBearertoken => Request[TranslationsListResponse],
    detectedSourceLanguage: String = null,
    model: String = null,
    translatedText: String = null
  ): TranslationsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), translate = js.Any.fromFunction1(translate))
    if (detectedSourceLanguage != null) __obj.updateDynamic("detectedSourceLanguage")(detectedSourceLanguage)
    if (model != null) __obj.updateDynamic("model")(model)
    if (translatedText != null) __obj.updateDynamic("translatedText")(translatedText)
    __obj.asInstanceOf[TranslationsResource]
  }
}

