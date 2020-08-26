package typings.gapiClientLanguage.gapi.client.language

import typings.gapiClient.gapi.client.Request
import typings.gapiClientLanguage.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentsResource extends js.Object {
  /**
    * Finds named entities (currently proper names and common nouns) in the text
    * along with entity types, salience, mentions for each entity, and
    * other properties.
    */
  def analyzeEntities(request: Accesstoken): Request[AnalyzeEntitiesResponse] = js.native
  /**
    * Finds entities, similar to AnalyzeEntities in the text and analyzes
    * sentiment associated with each entity and its mentions.
    */
  def analyzeEntitySentiment(request: Accesstoken): Request[AnalyzeEntitySentimentResponse] = js.native
  /** Analyzes the sentiment of the provided text. */
  def analyzeSentiment(request: Accesstoken): Request[AnalyzeSentimentResponse] = js.native
  /**
    * Analyzes the syntax of the text and provides sentence boundaries and
    * tokenization along with part of speech tags, dependency trees, and other
    * properties.
    */
  def analyzeSyntax(request: Accesstoken): Request[AnalyzeSyntaxResponse] = js.native
  /**
    * A convenience method that provides all the features that analyzeSentiment,
    * analyzeEntities, and analyzeSyntax provide in one call.
    */
  def annotateText(request: Accesstoken): Request[AnnotateTextResponse] = js.native
}

object DocumentsResource {
  @scala.inline
  def apply(
    analyzeEntities: Accesstoken => Request[AnalyzeEntitiesResponse],
    analyzeEntitySentiment: Accesstoken => Request[AnalyzeEntitySentimentResponse],
    analyzeSentiment: Accesstoken => Request[AnalyzeSentimentResponse],
    analyzeSyntax: Accesstoken => Request[AnalyzeSyntaxResponse],
    annotateText: Accesstoken => Request[AnnotateTextResponse]
  ): DocumentsResource = {
    val __obj = js.Dynamic.literal(analyzeEntities = js.Any.fromFunction1(analyzeEntities), analyzeEntitySentiment = js.Any.fromFunction1(analyzeEntitySentiment), analyzeSentiment = js.Any.fromFunction1(analyzeSentiment), analyzeSyntax = js.Any.fromFunction1(analyzeSyntax), annotateText = js.Any.fromFunction1(annotateText))
    __obj.asInstanceOf[DocumentsResource]
  }
  @scala.inline
  implicit class DocumentsResourceOps[Self <: DocumentsResource] (val x: Self) extends AnyVal {
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
    def setAnalyzeEntities(value: Accesstoken => Request[AnalyzeEntitiesResponse]): Self = this.set("analyzeEntities", js.Any.fromFunction1(value))
    @scala.inline
    def setAnalyzeEntitySentiment(value: Accesstoken => Request[AnalyzeEntitySentimentResponse]): Self = this.set("analyzeEntitySentiment", js.Any.fromFunction1(value))
    @scala.inline
    def setAnalyzeSentiment(value: Accesstoken => Request[AnalyzeSentimentResponse]): Self = this.set("analyzeSentiment", js.Any.fromFunction1(value))
    @scala.inline
    def setAnalyzeSyntax(value: Accesstoken => Request[AnalyzeSyntaxResponse]): Self = this.set("analyzeSyntax", js.Any.fromFunction1(value))
    @scala.inline
    def setAnnotateText(value: Accesstoken => Request[AnnotateTextResponse]): Self = this.set("annotateText", js.Any.fromFunction1(value))
  }
  
}

