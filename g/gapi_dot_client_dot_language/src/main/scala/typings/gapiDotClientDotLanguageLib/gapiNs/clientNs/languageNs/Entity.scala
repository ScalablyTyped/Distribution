package typings
package gapiDotClientDotLanguageLib.gapiNs.clientNs.languageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entity extends js.Object {
  /**
    * The mentions of this entity in the input document. The API currently
    * supports proper noun mentions.
    */
  var mentions: js.UndefOr[js.Array[EntityMention]] = js.undefined
  /**
    * Metadata associated with the entity.
    *
    * Currently, Wikipedia URLs and Knowledge Graph MIDs are provided, if
    * available. The associated keys are "wikipedia_url" and "mid", respectively.
    */
  var metadata: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The representative name for the entity. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The salience score associated with the entity in the [0, 1.0] range.
    *
    * The salience score for an entity provides information about the
    * importance or centrality of that entity to the entire document text.
    * Scores closer to 0 are less salient, while scores closer to 1.0 are highly
    * salient.
    */
  var salience: js.UndefOr[scala.Double] = js.undefined
  /**
    * For calls to AnalyzeEntitySentiment or if
    * AnnotateTextRequest.Features.extract_entity_sentiment is set to
    * true, this field will contain the aggregate sentiment expressed for this
    * entity in the provided document.
    */
  var sentiment: js.UndefOr[Sentiment] = js.undefined
  /** The entity type. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

