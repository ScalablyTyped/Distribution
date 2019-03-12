package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignDisplay extends Display {
  def excludedAudiences(): AdWordsSelector[ExcludedAudience]
  def excludedKeywords(): AdWordsSelector[ExcludedDisplayKeyword]
  def excludedPlacements(): AdWordsSelector[ExcludedPlacement]
  def excludedTopics(): AdWordsSelector[Topic]
  def newAudienceBuilder(): AudienceBuilder[Audience]
  def newKeywordBuilder(): DisplayKeywordBuilder[DisplayKeyword]
  def newPlacementBuilder(): PlacementBuilder[Placement]
  def newTopicBuilder(): TopicBuilder[Topic]
}

object CampaignDisplay {
  @scala.inline
  def apply(
    audiences: () => AdWordsSelector[Audience],
    excludedAudiences: () => AdWordsSelector[ExcludedAudience],
    excludedKeywords: () => AdWordsSelector[ExcludedDisplayKeyword],
    excludedPlacements: () => AdWordsSelector[ExcludedPlacement],
    excludedTopics: () => AdWordsSelector[Topic],
    keywords: () => AdWordsSelector[DisplayKeyword],
    newAudienceBuilder: () => AudienceBuilder[Audience],
    newKeywordBuilder: () => DisplayKeywordBuilder[DisplayKeyword],
    newPlacementBuilder: () => PlacementBuilder[Placement],
    newTopicBuilder: () => TopicBuilder[Topic],
    placements: () => AdWordsSelector[Placement],
    topics: () => AdWordsSelector[Topic]
  ): CampaignDisplay = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences), excludedAudiences = js.Any.fromFunction0(excludedAudiences), excludedKeywords = js.Any.fromFunction0(excludedKeywords), excludedPlacements = js.Any.fromFunction0(excludedPlacements), excludedTopics = js.Any.fromFunction0(excludedTopics), keywords = js.Any.fromFunction0(keywords), newAudienceBuilder = js.Any.fromFunction0(newAudienceBuilder), newKeywordBuilder = js.Any.fromFunction0(newKeywordBuilder), newPlacementBuilder = js.Any.fromFunction0(newPlacementBuilder), newTopicBuilder = js.Any.fromFunction0(newTopicBuilder), placements = js.Any.fromFunction0(placements), topics = js.Any.fromFunction0(topics))
  
    __obj.asInstanceOf[CampaignDisplay]
  }
}

