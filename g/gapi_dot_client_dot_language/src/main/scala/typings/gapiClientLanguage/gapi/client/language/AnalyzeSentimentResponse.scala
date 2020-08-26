package typings.gapiClientLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyzeSentimentResponse extends js.Object {
  /** The overall sentiment of the input document. */
  var documentSentiment: js.UndefOr[Sentiment] = js.native
  /**
    * The language of the text, which will be the same as the language specified
    * in the request or, if not specified, the automatically-detected language.
    * See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.native
  /** The sentiment for all the sentences in the document. */
  var sentences: js.UndefOr[js.Array[Sentence]] = js.native
}

object AnalyzeSentimentResponse {
  @scala.inline
  def apply(): AnalyzeSentimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeSentimentResponse]
  }
  @scala.inline
  implicit class AnalyzeSentimentResponseOps[Self <: AnalyzeSentimentResponse] (val x: Self) extends AnyVal {
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setSentencesVarargs(value: Sentence*): Self = this.set("sentences", js.Array(value :_*))
    @scala.inline
    def setSentences(value: js.Array[Sentence]): Self = this.set("sentences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentences: Self = this.set("sentences", js.undefined)
  }
  
}

