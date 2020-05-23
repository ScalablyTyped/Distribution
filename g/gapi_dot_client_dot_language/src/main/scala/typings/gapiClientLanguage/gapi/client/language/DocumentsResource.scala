package typings.gapiClientLanguage.gapi.client.language

import typings.gapiClient.gapi.client.Request
import typings.gapiClientLanguage.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentsResource extends js.Object {
  /**
    * Finds named entities (currently proper names and common nouns) in the text
    * along with entity types, salience, mentions for each entity, and
    * other properties.
    */
  def analyzeEntities(request: Accesstoken): Request[AnalyzeEntitiesResponse]
  /**
    * Finds entities, similar to AnalyzeEntities in the text and analyzes
    * sentiment associated with each entity and its mentions.
    */
  def analyzeEntitySentiment(request: Accesstoken): Request[AnalyzeEntitySentimentResponse]
  /** Analyzes the sentiment of the provided text. */
  def analyzeSentiment(request: Accesstoken): Request[AnalyzeSentimentResponse]
  /**
    * Analyzes the syntax of the text and provides sentence boundaries and
    * tokenization along with part of speech tags, dependency trees, and other
    * properties.
    */
  def analyzeSyntax(request: Accesstoken): Request[AnalyzeSyntaxResponse]
  /**
    * A convenience method that provides all the features that analyzeSentiment,
    * analyzeEntities, and analyzeSyntax provide in one call.
    */
  def annotateText(request: Accesstoken): Request[AnnotateTextResponse]
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
}

