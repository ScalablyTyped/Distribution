package typings
package gapiDotClientDotLanguageLib.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityMention extends js.Object {
  /**
    * For calls to AnalyzeEntitySentiment or if
    * AnnotateTextRequest.Features.extract_entity_sentiment is set to
    * true, this field will contain the sentiment expressed for this mention of
    * the entity in the provided document.
    */
  var sentiment: js.UndefOr[Sentiment] = js.undefined
  /** The mention text. */
  var text: js.UndefOr[TextSpan] = js.undefined
  /** The type of the entity mention. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

