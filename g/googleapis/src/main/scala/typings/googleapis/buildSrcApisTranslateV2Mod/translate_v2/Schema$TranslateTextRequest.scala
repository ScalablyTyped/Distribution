package typings.googleapis.buildSrcApisTranslateV2Mod.translate_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The main translation request message for the Cloud Translation API.
  */
@js.native
trait Schema$TranslateTextRequest extends js.Object {
  /**
    * The format of the source text, in either HTML (default) or plain-text. A
    * value of &quot;html&quot; indicates HTML and a value of &quot;text&quot;
    * indicates plain-text.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The `model` type requested for this translation. Valid values are listed
    * in public documentation.
    */
  var model: js.UndefOr[String] = js.native
  /**
    * The input text to translate. Repeat this parameter to perform translation
    * operations on multiple text inputs.
    */
  var q: js.UndefOr[js.Array[String]] = js.native
  /**
    * The language of the source text, set to one of the language codes listed
    * in Language Support. If the source language is not specified, the API
    * will attempt to identify the source language automatically and return it
    * within the response.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * The language to use for translation of the input text, set to one of the
    * language codes listed in Language Support.
    */
  var target: js.UndefOr[String] = js.native
}

object Schema$TranslateTextRequest {
  @scala.inline
  def apply(
    format: String = null,
    model: String = null,
    q: js.Array[String] = null,
    source: String = null,
    target: String = null
  ): Schema$TranslateTextRequest = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TranslateTextRequest]
  }
}

