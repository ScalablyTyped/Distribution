package typings.gapiClientLanguage.gapi.client.language

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientLanguage.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentsResource extends js.Object {
  /**
    * Finds named entities (currently proper names and common nouns) in the text
    * along with entity types, salience, mentions for each entity, and
    * other properties.
    */
  def analyzeEntities(request: AnonAccesstoken): Request_[AnalyzeEntitiesResponse]
  /**
    * Finds entities, similar to AnalyzeEntities in the text and analyzes
    * sentiment associated with each entity and its mentions.
    */
  def analyzeEntitySentiment(request: AnonAccesstoken): Request_[AnalyzeEntitySentimentResponse]
  /** Analyzes the sentiment of the provided text. */
  def analyzeSentiment(request: AnonAccesstoken): Request_[AnalyzeSentimentResponse]
  /**
    * Analyzes the syntax of the text and provides sentence boundaries and
    * tokenization along with part of speech tags, dependency trees, and other
    * properties.
    */
  def analyzeSyntax(request: AnonAccesstoken): Request_[AnalyzeSyntaxResponse]
  /**
    * A convenience method that provides all the features that analyzeSentiment,
    * analyzeEntities, and analyzeSyntax provide in one call.
    */
  def annotateText(request: AnonAccesstoken): Request_[AnnotateTextResponse]
}

object DocumentsResource {
  @scala.inline
  def apply(
    analyzeEntities: AnonAccesstoken => Request_[AnalyzeEntitiesResponse],
    analyzeEntitySentiment: AnonAccesstoken => Request_[AnalyzeEntitySentimentResponse],
    analyzeSentiment: AnonAccesstoken => Request_[AnalyzeSentimentResponse],
    analyzeSyntax: AnonAccesstoken => Request_[AnalyzeSyntaxResponse],
    annotateText: AnonAccesstoken => Request_[AnnotateTextResponse]
  ): DocumentsResource = {
    val __obj = js.Dynamic.literal(analyzeEntities = js.Any.fromFunction1(analyzeEntities), analyzeEntitySentiment = js.Any.fromFunction1(analyzeEntitySentiment), analyzeSentiment = js.Any.fromFunction1(analyzeSentiment), analyzeSyntax = js.Any.fromFunction1(analyzeSyntax), annotateText = js.Any.fromFunction1(annotateText))
    __obj.asInstanceOf[DocumentsResource]
  }
}

