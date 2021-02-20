package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignDisplay extends Display {
  
  def excludedAudiences(): AdWordsSelector[ExcludedAudience] = js.native
  
  def excludedKeywords(): AdWordsSelector[ExcludedDisplayKeyword] = js.native
  
  def excludedPlacements(): AdWordsSelector[ExcludedPlacement] = js.native
  
  def excludedTopics(): AdWordsSelector[Topic] = js.native
  
  def newAudienceBuilder(): AudienceBuilder[Audience] = js.native
  
  def newKeywordBuilder(): DisplayKeywordBuilder[DisplayKeyword] = js.native
  
  def newPlacementBuilder(): PlacementBuilder[Placement] = js.native
  
  def newTopicBuilder(): TopicBuilder[Topic] = js.native
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
  
  @scala.inline
  implicit class CampaignDisplayMutableBuilder[Self <: CampaignDisplay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedAudiences(value: () => AdWordsSelector[ExcludedAudience]): Self = StObject.set(x, "excludedAudiences", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcludedKeywords(value: () => AdWordsSelector[ExcludedDisplayKeyword]): Self = StObject.set(x, "excludedKeywords", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcludedPlacements(value: () => AdWordsSelector[ExcludedPlacement]): Self = StObject.set(x, "excludedPlacements", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcludedTopics(value: () => AdWordsSelector[Topic]): Self = StObject.set(x, "excludedTopics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAudienceBuilder(value: () => AudienceBuilder[Audience]): Self = StObject.set(x, "newAudienceBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewKeywordBuilder(value: () => DisplayKeywordBuilder[DisplayKeyword]): Self = StObject.set(x, "newKeywordBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPlacementBuilder(value: () => PlacementBuilder[Placement]): Self = StObject.set(x, "newPlacementBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTopicBuilder(value: () => TopicBuilder[Topic]): Self = StObject.set(x, "newTopicBuilder", js.Any.fromFunction0(value))
  }
}
