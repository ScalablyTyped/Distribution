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
    audiences: js.Function0[AdWordsSelector[Audience]],
    excludedAudiences: js.Function0[AdWordsSelector[ExcludedAudience]],
    excludedKeywords: js.Function0[AdWordsSelector[ExcludedDisplayKeyword]],
    excludedPlacements: js.Function0[AdWordsSelector[ExcludedPlacement]],
    excludedTopics: js.Function0[AdWordsSelector[Topic]],
    keywords: js.Function0[AdWordsSelector[DisplayKeyword]],
    newAudienceBuilder: js.Function0[AudienceBuilder[Audience]],
    newKeywordBuilder: js.Function0[DisplayKeywordBuilder[DisplayKeyword]],
    newPlacementBuilder: js.Function0[PlacementBuilder[Placement]],
    newTopicBuilder: js.Function0[TopicBuilder[Topic]],
    placements: js.Function0[AdWordsSelector[Placement]],
    topics: js.Function0[AdWordsSelector[Topic]]
  ): CampaignDisplay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("audiences")(audiences)
    __obj.updateDynamic("excludedAudiences")(excludedAudiences)
    __obj.updateDynamic("excludedKeywords")(excludedKeywords)
    __obj.updateDynamic("excludedPlacements")(excludedPlacements)
    __obj.updateDynamic("excludedTopics")(excludedTopics)
    __obj.updateDynamic("keywords")(keywords)
    __obj.updateDynamic("newAudienceBuilder")(newAudienceBuilder)
    __obj.updateDynamic("newKeywordBuilder")(newKeywordBuilder)
    __obj.updateDynamic("newPlacementBuilder")(newPlacementBuilder)
    __obj.updateDynamic("newTopicBuilder")(newTopicBuilder)
    __obj.updateDynamic("placements")(placements)
    __obj.updateDynamic("topics")(topics)
    __obj.asInstanceOf[CampaignDisplay]
  }
}

