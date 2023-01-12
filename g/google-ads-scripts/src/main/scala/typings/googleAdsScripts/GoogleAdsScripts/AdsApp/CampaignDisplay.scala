package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access to aggregated ad group-level display criteria for a campaign and campaign-level excluded display criteria for a campaign.
  * For example, to access all display keywords in all ad groups in this campaign:
  *
  *      var displayKeywordIterator = campaign.display().keywords().get();
  *      while (displayKeywordIterator.hasNext()) {
  *        var displayKeyword = displayKeywordIterator.next();
  *      }
  */
trait CampaignDisplay extends StObject {
  
  /** Returns the selector of all audiences in the campaign. */
  def audiences(): AudienceSelector
  
  /** Returns the selector of all excluded audiences in the campaign. */
  def excludedAudiences(): ExcludedAudienceSelector
  
  /** Returns the selector of all excluded display keywords in the campaign. */
  def excludedKeywords(): ExcludedDisplayKeywordSelector
  
  /** Returns the selector of all excluded website placements in the campaign. */
  def excludedPlacements(): ExcludedPlacementSelector
  
  /** Returns the selector of all excluded topics in the campaign. */
  def excludedTopics(): ExcludedTopicSelector
  
  /** Returns the selector of all excluded YouTube channels in the campaign. */
  def excludedYouTubeChannels(): ExcludedYouTubeChannelSelector
  
  /** Returns the selector of all excluded YouTube videos in the campaign. */
  def excludedYouTubeVideos(): ExcludedYouTubeVideoSelector
  
  /** Returns the selector of all display keywords in all ad groups in the campaign. */
  def keywords(): DisplayKeywordSelector
  
  /** Returns a new audience builder for this campaign. */
  def newAudienceBuilder(): AudienceBuilder
  
  /** Returns a new display keyword builder for this campaign. */
  def newKeywordBuilder(): DisplayKeywordBuilder
  
  /** Returns a new placement builder for this campaign. */
  def newPlacementBuilder(): PlacementBuilder
  
  /** Returns a new topic builder for this campaign. */
  def newTopicBuilder(): TopicBuilder
  
  /** Returns a new YouTube channel builder for this campaign. */
  def newYouTubeChannelBuilder(): YouTubeChannelBuilder
  
  /** Returns a new YouTube video builder for this campaign. */
  def newYouTubeVideoBuilder(): YouTubeVideoBuilder
  
  /** Returns the selector of all website placements in all ad groups in the campaign. */
  def placements(): PlacementSelector
  
  /** Returns the selector of all topics in all ad groups in the campaign. */
  def topics(): TopicSelector
  
  /** Returns the selector of all YouTube channels in the campaign. */
  def youTubeChannels(): YouTubeChannelSelector
  
  /** Returns the selector of all YouTube videos in the campaign. */
  def youTubeVideos(): YouTubeVideoSelector
}
object CampaignDisplay {
  
  inline def apply(
    audiences: () => AudienceSelector,
    excludedAudiences: () => ExcludedAudienceSelector,
    excludedKeywords: () => ExcludedDisplayKeywordSelector,
    excludedPlacements: () => ExcludedPlacementSelector,
    excludedTopics: () => ExcludedTopicSelector,
    excludedYouTubeChannels: () => ExcludedYouTubeChannelSelector,
    excludedYouTubeVideos: () => ExcludedYouTubeVideoSelector,
    keywords: () => DisplayKeywordSelector,
    newAudienceBuilder: () => AudienceBuilder,
    newKeywordBuilder: () => DisplayKeywordBuilder,
    newPlacementBuilder: () => PlacementBuilder,
    newTopicBuilder: () => TopicBuilder,
    newYouTubeChannelBuilder: () => YouTubeChannelBuilder,
    newYouTubeVideoBuilder: () => YouTubeVideoBuilder,
    placements: () => PlacementSelector,
    topics: () => TopicSelector,
    youTubeChannels: () => YouTubeChannelSelector,
    youTubeVideos: () => YouTubeVideoSelector
  ): CampaignDisplay = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences), excludedAudiences = js.Any.fromFunction0(excludedAudiences), excludedKeywords = js.Any.fromFunction0(excludedKeywords), excludedPlacements = js.Any.fromFunction0(excludedPlacements), excludedTopics = js.Any.fromFunction0(excludedTopics), excludedYouTubeChannels = js.Any.fromFunction0(excludedYouTubeChannels), excludedYouTubeVideos = js.Any.fromFunction0(excludedYouTubeVideos), keywords = js.Any.fromFunction0(keywords), newAudienceBuilder = js.Any.fromFunction0(newAudienceBuilder), newKeywordBuilder = js.Any.fromFunction0(newKeywordBuilder), newPlacementBuilder = js.Any.fromFunction0(newPlacementBuilder), newTopicBuilder = js.Any.fromFunction0(newTopicBuilder), newYouTubeChannelBuilder = js.Any.fromFunction0(newYouTubeChannelBuilder), newYouTubeVideoBuilder = js.Any.fromFunction0(newYouTubeVideoBuilder), placements = js.Any.fromFunction0(placements), topics = js.Any.fromFunction0(topics), youTubeChannels = js.Any.fromFunction0(youTubeChannels), youTubeVideos = js.Any.fromFunction0(youTubeVideos))
    __obj.asInstanceOf[CampaignDisplay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CampaignDisplay] (val x: Self) extends AnyVal {
    
    inline def setAudiences(value: () => AudienceSelector): Self = StObject.set(x, "audiences", js.Any.fromFunction0(value))
    
    inline def setExcludedAudiences(value: () => ExcludedAudienceSelector): Self = StObject.set(x, "excludedAudiences", js.Any.fromFunction0(value))
    
    inline def setExcludedKeywords(value: () => ExcludedDisplayKeywordSelector): Self = StObject.set(x, "excludedKeywords", js.Any.fromFunction0(value))
    
    inline def setExcludedPlacements(value: () => ExcludedPlacementSelector): Self = StObject.set(x, "excludedPlacements", js.Any.fromFunction0(value))
    
    inline def setExcludedTopics(value: () => ExcludedTopicSelector): Self = StObject.set(x, "excludedTopics", js.Any.fromFunction0(value))
    
    inline def setExcludedYouTubeChannels(value: () => ExcludedYouTubeChannelSelector): Self = StObject.set(x, "excludedYouTubeChannels", js.Any.fromFunction0(value))
    
    inline def setExcludedYouTubeVideos(value: () => ExcludedYouTubeVideoSelector): Self = StObject.set(x, "excludedYouTubeVideos", js.Any.fromFunction0(value))
    
    inline def setKeywords(value: () => DisplayKeywordSelector): Self = StObject.set(x, "keywords", js.Any.fromFunction0(value))
    
    inline def setNewAudienceBuilder(value: () => AudienceBuilder): Self = StObject.set(x, "newAudienceBuilder", js.Any.fromFunction0(value))
    
    inline def setNewKeywordBuilder(value: () => DisplayKeywordBuilder): Self = StObject.set(x, "newKeywordBuilder", js.Any.fromFunction0(value))
    
    inline def setNewPlacementBuilder(value: () => PlacementBuilder): Self = StObject.set(x, "newPlacementBuilder", js.Any.fromFunction0(value))
    
    inline def setNewTopicBuilder(value: () => TopicBuilder): Self = StObject.set(x, "newTopicBuilder", js.Any.fromFunction0(value))
    
    inline def setNewYouTubeChannelBuilder(value: () => YouTubeChannelBuilder): Self = StObject.set(x, "newYouTubeChannelBuilder", js.Any.fromFunction0(value))
    
    inline def setNewYouTubeVideoBuilder(value: () => YouTubeVideoBuilder): Self = StObject.set(x, "newYouTubeVideoBuilder", js.Any.fromFunction0(value))
    
    inline def setPlacements(value: () => PlacementSelector): Self = StObject.set(x, "placements", js.Any.fromFunction0(value))
    
    inline def setTopics(value: () => TopicSelector): Self = StObject.set(x, "topics", js.Any.fromFunction0(value))
    
    inline def setYouTubeChannels(value: () => YouTubeChannelSelector): Self = StObject.set(x, "youTubeChannels", js.Any.fromFunction0(value))
    
    inline def setYouTubeVideos(value: () => YouTubeVideoSelector): Self = StObject.set(x, "youTubeVideos", js.Any.fromFunction0(value))
  }
}
