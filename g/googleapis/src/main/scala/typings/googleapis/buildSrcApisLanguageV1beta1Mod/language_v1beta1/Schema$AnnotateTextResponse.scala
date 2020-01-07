package typings.googleapis.buildSrcApisLanguageV1beta1Mod.language_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The text annotations response message.
  */
@js.native
trait Schema$AnnotateTextResponse extends js.Object {
  /**
    * The overall sentiment for the document. Populated if the user enables
    * AnnotateTextRequest.Features.extract_document_sentiment.
    */
  var documentSentiment: js.UndefOr[Schema$Sentiment] = js.native
  /**
    * Entities, along with their semantic information, in the input document.
    * Populated if the user enables
    * AnnotateTextRequest.Features.extract_entities.
    */
  var entities: js.UndefOr[js.Array[Schema$Entity]] = js.native
  /**
    * The language of the text, which will be the same as the language
    * specified in the request or, if not specified, the automatically-detected
    * language. See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Sentences in the input document. Populated if the user enables
    * AnnotateTextRequest.Features.extract_syntax.
    */
  var sentences: js.UndefOr[js.Array[Schema$Sentence]] = js.native
  /**
    * Tokens, along with their syntactic information, in the input document.
    * Populated if the user enables
    * AnnotateTextRequest.Features.extract_syntax.
    */
  var tokens: js.UndefOr[js.Array[Schema$Token]] = js.native
}

object Schema$AnnotateTextResponse {
  @scala.inline
  def apply(
    documentSentiment: Schema$Sentiment = null,
    entities: js.Array[Schema$Entity] = null,
    language: String = null,
    sentences: js.Array[Schema$Sentence] = null,
    tokens: js.Array[Schema$Token] = null
  ): Schema$AnnotateTextResponse = {
    val __obj = js.Dynamic.literal()
    if (documentSentiment != null) __obj.updateDynamic("documentSentiment")(documentSentiment.asInstanceOf[js.Any])
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (sentences != null) __obj.updateDynamic("sentences")(sentences.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AnnotateTextResponse]
  }
}

