package typings.googleapis.buildSrcApisLanguageV1beta1Mod.language_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The syntax analysis response message.
  */
@js.native
trait Schema$AnalyzeSyntaxResponse extends js.Object {
  /**
    * The language of the text, which will be the same as the language
    * specified in the request or, if not specified, the automatically-detected
    * language. See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Sentences in the input document.
    */
  var sentences: js.UndefOr[js.Array[Schema$Sentence]] = js.native
  /**
    * Tokens, along with their syntactic information, in the input document.
    */
  var tokens: js.UndefOr[js.Array[Schema$Token]] = js.native
}

object Schema$AnalyzeSyntaxResponse {
  @scala.inline
  def apply(
    language: String = null,
    sentences: js.Array[Schema$Sentence] = null,
    tokens: js.Array[Schema$Token] = null
  ): Schema$AnalyzeSyntaxResponse = {
    val __obj = js.Dynamic.literal()
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (sentences != null) __obj.updateDynamic("sentences")(sentences.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AnalyzeSyntaxResponse]
  }
}

