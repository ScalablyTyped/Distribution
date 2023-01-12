package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignDisplay
  extends StObject
     with Display {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: CampaignDisplay] (val x: Self) extends AnyVal {
    
    inline def setExcludedAudiences(value: () => AdWordsSelector[ExcludedAudience]): Self = StObject.set(x, "excludedAudiences", js.Any.fromFunction0(value))
    
    inline def setExcludedKeywords(value: () => AdWordsSelector[ExcludedDisplayKeyword]): Self = StObject.set(x, "excludedKeywords", js.Any.fromFunction0(value))
    
    inline def setExcludedPlacements(value: () => AdWordsSelector[ExcludedPlacement]): Self = StObject.set(x, "excludedPlacements", js.Any.fromFunction0(value))
    
    inline def setExcludedTopics(value: () => AdWordsSelector[Topic]): Self = StObject.set(x, "excludedTopics", js.Any.fromFunction0(value))
    
    inline def setNewAudienceBuilder(value: () => AudienceBuilder[Audience]): Self = StObject.set(x, "newAudienceBuilder", js.Any.fromFunction0(value))
    
    inline def setNewKeywordBuilder(value: () => DisplayKeywordBuilder[DisplayKeyword]): Self = StObject.set(x, "newKeywordBuilder", js.Any.fromFunction0(value))
    
    inline def setNewPlacementBuilder(value: () => PlacementBuilder[Placement]): Self = StObject.set(x, "newPlacementBuilder", js.Any.fromFunction0(value))
    
    inline def setNewTopicBuilder(value: () => TopicBuilder[Topic]): Self = StObject.set(x, "newTopicBuilder", js.Any.fromFunction0(value))
  }
}
