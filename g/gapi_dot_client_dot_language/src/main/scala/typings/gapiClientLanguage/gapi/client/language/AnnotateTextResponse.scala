package typings.gapiClientLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotateTextResponse extends js.Object {
  /**
    * The overall sentiment for the document. Populated if the user enables
    * AnnotateTextRequest.Features.extract_document_sentiment.
    */
  var documentSentiment: js.UndefOr[Sentiment] = js.native
  /**
    * Entities, along with their semantic information, in the input document.
    * Populated if the user enables
    * AnnotateTextRequest.Features.extract_entities.
    */
  var entities: js.UndefOr[js.Array[Entity]] = js.native
  /**
    * The language of the text, which will be the same as the language specified
    * in the request or, if not specified, the automatically-detected language.
    * See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Sentences in the input document. Populated if the user enables
    * AnnotateTextRequest.Features.extract_syntax.
    */
  var sentences: js.UndefOr[js.Array[Sentence]] = js.native
  /**
    * Tokens, along with their syntactic information, in the input document.
    * Populated if the user enables
    * AnnotateTextRequest.Features.extract_syntax.
    */
  var tokens: js.UndefOr[js.Array[Token]] = js.native
}

object AnnotateTextResponse {
  @scala.inline
  def apply(): AnnotateTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotateTextResponse]
  }
  @scala.inline
  implicit class AnnotateTextResponseOps[Self <: AnnotateTextResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocumentSentiment(value: Sentiment): Self = this.set("documentSentiment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentSentiment: Self = this.set("documentSentiment", js.undefined)
    @scala.inline
    def setEntitiesVarargs(value: Entity*): Self = this.set("entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: js.Array[Entity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setSentencesVarargs(value: Sentence*): Self = this.set("sentences", js.Array(value :_*))
    @scala.inline
    def setSentences(value: js.Array[Sentence]): Self = this.set("sentences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentences: Self = this.set("sentences", js.undefined)
    @scala.inline
    def setTokensVarargs(value: Token*): Self = this.set("tokens", js.Array(value :_*))
    @scala.inline
    def setTokens(value: js.Array[Token]): Self = this.set("tokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokens: Self = this.set("tokens", js.undefined)
  }
  
}

