package typings.gapiDotClientDotTranslate.gapiNs.clientNs.translateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateTextRequest extends js.Object {
  /**
    * The format of the source text, in either HTML (default) or plain-text. A
    * value of "html" indicates HTML and a value of "text" indicates plain-text.
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * The `model` type requested for this translation. Valid values are
    * listed in public documentation.
    */
  var model: js.UndefOr[String] = js.undefined
  /**
    * The input text to translate. Repeat this parameter to perform translation
    * operations on multiple text inputs.
    */
  var q: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The language of the source text, set to one of the language codes listed in
    * Language Support. If the source language is not specified, the API will
    * attempt to identify the source language automatically and return it within
    * the response.
    */
  var source: js.UndefOr[String] = js.undefined
  /**
    * The language to use for translation of the input text, set to one of the
    * language codes listed in Language Support.
    */
  var target: js.UndefOr[String] = js.undefined
}

object TranslateTextRequest {
  @scala.inline
  def apply(
    format: String = null,
    model: String = null,
    q: js.Array[String] = null,
    source: String = null,
    target: String = null
  ): TranslateTextRequest = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (model != null) __obj.updateDynamic("model")(model)
    if (q != null) __obj.updateDynamic("q")(q)
    if (source != null) __obj.updateDynamic("source")(source)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[TranslateTextRequest]
  }
}

