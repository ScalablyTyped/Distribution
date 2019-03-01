package typings
package gapiDotClientDotLanguageLib.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentsResource extends js.Object {
  /**
    * Finds named entities (currently proper names and common nouns) in the text
    * along with entity types, salience, mentions for each entity, and
    * other properties.
    */
  def analyzeEntities(request: gapiDotClientDotLanguageLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[AnalyzeEntitiesResponse]
  /**
    * Finds entities, similar to AnalyzeEntities in the text and analyzes
    * sentiment associated with each entity and its mentions.
    */
  def analyzeEntitySentiment(request: gapiDotClientDotLanguageLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[AnalyzeEntitySentimentResponse]
  /** Analyzes the sentiment of the provided text. */
  def analyzeSentiment(request: gapiDotClientDotLanguageLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[AnalyzeSentimentResponse]
  /**
    * Analyzes the syntax of the text and provides sentence boundaries and
    * tokenization along with part of speech tags, dependency trees, and other
    * properties.
    */
  def analyzeSyntax(request: gapiDotClientDotLanguageLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[AnalyzeSyntaxResponse]
  /**
    * A convenience method that provides all the features that analyzeSentiment,
    * analyzeEntities, and analyzeSyntax provide in one call.
    */
  def annotateText(request: gapiDotClientDotLanguageLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[AnnotateTextResponse]
}

object DocumentsResource {
  @scala.inline
  def apply(
    analyzeEntities: js.Function1[
      gapiDotClientDotLanguageLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[AnalyzeEntitiesResponse]
    ],
    analyzeEntitySentiment: js.Function1[
      gapiDotClientDotLanguageLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[AnalyzeEntitySentimentResponse]
    ],
    analyzeSentiment: js.Function1[
      gapiDotClientDotLanguageLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[AnalyzeSentimentResponse]
    ],
    analyzeSyntax: js.Function1[
      gapiDotClientDotLanguageLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[AnalyzeSyntaxResponse]
    ],
    annotateText: js.Function1[
      gapiDotClientDotLanguageLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[AnnotateTextResponse]
    ]
  ): DocumentsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("analyzeEntities")(analyzeEntities)
    __obj.updateDynamic("analyzeEntitySentiment")(analyzeEntitySentiment)
    __obj.updateDynamic("analyzeSentiment")(analyzeSentiment)
    __obj.updateDynamic("analyzeSyntax")(analyzeSyntax)
    __obj.updateDynamic("annotateText")(annotateText)
    __obj.asInstanceOf[DocumentsResource]
  }
}

