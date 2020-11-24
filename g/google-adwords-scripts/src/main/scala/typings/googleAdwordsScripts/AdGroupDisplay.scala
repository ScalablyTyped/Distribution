package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdGroupDisplay extends Display {
  
  def excludedAudiences(): AdWordsSelector[ExcludedAudience] = js.native
  
  def excludedKeywords(): AdWordsSelector[ExcludedDisplayKeyword] = js.native
  
  def excludedPlacements(): AdWordsSelector[ExcludedPlacement] = js.native
  
  def excludedTopics(): AdWordsSelector[Topic] = js.native
  
  def newAudienceBuilder(): AudienceBuilder[Audience] = js.native
  
  def newKeywordBuilder(): DisplayKeywordBuilder[DisplayKeyword] = js.native
  
  def newPlacementBuilder(): PlacementBuilder[Placement] = js.native
  
  def newTopicBuilder(): TopicBuilder[Topic] = js.native
}
object AdGroupDisplay {
  
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
  ): AdGroupDisplay = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences), excludedAudiences = js.Any.fromFunction0(excludedAudiences), excludedKeywords = js.Any.fromFunction0(excludedKeywords), excludedPlacements = js.Any.fromFunction0(excludedPlacements), excludedTopics = js.Any.fromFunction0(excludedTopics), keywords = js.Any.fromFunction0(keywords), newAudienceBuilder = js.Any.fromFunction0(newAudienceBuilder), newKeywordBuilder = js.Any.fromFunction0(newKeywordBuilder), newPlacementBuilder = js.Any.fromFunction0(newPlacementBuilder), newTopicBuilder = js.Any.fromFunction0(newTopicBuilder), placements = js.Any.fromFunction0(placements), topics = js.Any.fromFunction0(topics))
    __obj.asInstanceOf[AdGroupDisplay]
  }
  
  @scala.inline
  implicit class AdGroupDisplayOps[Self <: AdGroupDisplay] (val x: Self) extends AnyVal {
    
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
    def setExcludedAudiences(value: () => AdWordsSelector[ExcludedAudience]): Self = this.set("excludedAudiences", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcludedKeywords(value: () => AdWordsSelector[ExcludedDisplayKeyword]): Self = this.set("excludedKeywords", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcludedPlacements(value: () => AdWordsSelector[ExcludedPlacement]): Self = this.set("excludedPlacements", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExcludedTopics(value: () => AdWordsSelector[Topic]): Self = this.set("excludedTopics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAudienceBuilder(value: () => AudienceBuilder[Audience]): Self = this.set("newAudienceBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewKeywordBuilder(value: () => DisplayKeywordBuilder[DisplayKeyword]): Self = this.set("newKeywordBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPlacementBuilder(value: () => PlacementBuilder[Placement]): Self = this.set("newPlacementBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTopicBuilder(value: () => TopicBuilder[Topic]): Self = this.set("newTopicBuilder", js.Any.fromFunction0(value))
  }
}
