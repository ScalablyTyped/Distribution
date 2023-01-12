package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access to ad group-level video criteria. For example, to access all video keywords in an ad group:
  *
  *      var videoKeywordIterator = videoAdGroup.videoTargeting().keywords().get();
  *      while (videoKeywordIterator.hasNext()) {
  *        var videoKeyword = videoKeywordIterator.next();
  *      }
  */
trait AdGroupVideoTargeting extends StObject {
  
  /** Returns the selector of all ages in the ad group. */
  def ages(): VideoAgeSelector
  
  /** Returns the selector of all audiences in the ad group. */
  def audiences(): VideoAudienceSelector
  
  /** Returns the selector of all excluded ages in the ad group. */
  def excludedAges(): ExcludedVideoAgeSelector
  
  /** Returns the selector of all excluded audiences in the ad group. */
  def excludedAudiences(): ExcludedVideoAudienceSelector
  
  /** Returns the selector of all excluded genders in the ad group. */
  def excludedGenders(): ExcludedVideoGenderSelector
  
  /** Returns the selector of all excluded keywords in the ad group. */
  def excludedKeywords(): ExcludedVideoKeywordSelector
  
  /** Returns the selector of all excluded mobile application categories in the ad group. */
  def excludedMobileAppCategories(): ExcludedVideoMobileAppCategorySelector
  
  /** Returns the selector of all excluded mobile applications in the ad group. */
  def excludedMobileApplications(): ExcludedVideoMobileApplicationSelector
  
  /** Returns the selector of all excluded parental statuses in the ad group. */
  def excludedParentalStatuses(): ExcludedVideoParentalStatusSelector
  
  /** Returns the selector of all excluded placements in the ad group. */
  def excludedPlacements(): ExcludedVideoPlacementSelector
  
  /** Returns the selector of all excluded topics in the ad group. */
  def excludedTopics(): ExcludedVideoTopicSelector
  
  /** Returns the selector of all excluded YouTube channels in the ad group. */
  def excludedYouTubeChannels(): ExcludedVideoYouTubeChannelSelector
  
  /** Returns the selector of all excluded YouTube videos in the ad group. */
  def excludedYouTubeVideos(): ExcludedVideoYouTubeVideoSelector
  
  /** Returns the selector of all genders in the ad group. */
  def genders(): VideoGenderSelector
  
  /** Returns the selector of all keywords in the ad group. */
  def keywords(): VideoKeywordSelector
  
  /** Returns the selector of all mobile application categories in the ad group. */
  def mobileAppCategories(): VideoMobileAppCategorySelector
  
  /** Returns the selector of all mobile applications in the ad group. */
  def mobileApplications(): VideoMobileApplicationSelector
  
  /** Returns a new age builder for this ad group. */
  def newAgeBuilder(): VideoAgeBuilder
  
  /** Returns a new audience builder for this ad group. */
  def newAudienceBuilder(): VideoAudienceBuilder
  
  /** Returns a new age gender for this ad group. */
  def newGenderBuilder(): VideoGenderBuilder
  
  /** Returns a new keyword builder for this ad group. */
  def newKeywordBuilder(): VideoKeywordBuilder
  
  /** Returns a new mobile application category builder for this ad group. */
  def newMobileAppCategoryBuilder(): VideoMobileAppCategoryBuilder
  
  /** Returns a new mobile application builder for this ad group. */
  def newMobileApplicationBuilder(): VideoMobileApplicationBuilder
  
  /** Returns a new parental status builder for this ad group. */
  def newParentalStatusBuilder(): VideoParentalStatusBuilder
  
  /** Returns a new placement builder for this ad group. */
  def newPlacementBuilder(): VideoPlacementBuilder
  
  /** Returns a new video topic builder for this ad group. */
  def newTopicBuilder(): VideoTopicBuilder
  
  /** Returns a new YouTube channel builder for this ad group. */
  def newYouTubeChannelBuilder(): VideoYouTubeChannelBuilder
  
  /** Returns a new YouTube video builder for this ad group. */
  def newYouTubeVideoBuilder(): VideoYouTubeVideoBuilder
  
  /** Returns the selector of all parental statuses in the ad group. */
  def parentalStatuses(): VideoParentalStatusSelector
  
  /** Returns the selector of all placements in the ad group. */
  def placements(): VideoPlacementSelector
  
  /** Returns the selector of all topics in the ad group. */
  def topics(): VideoTopicSelector
  
  /** Returns the selector of all YouTube channels in the ad group. */
  def youTubeChannels(): VideoYouTubeChannelSelector
  
  /** Returns the selector of all YouTube videos in the ad group. */
  def youTubeVideos(): VideoYouTubeVideoSelector
}
object AdGroupVideoTargeting {
  
  inline def apply(
    ages: () => VideoAgeSelector,
    audiences: () => VideoAudienceSelector,
    excludedAges: () => ExcludedVideoAgeSelector,
    excludedAudiences: () => ExcludedVideoAudienceSelector,
    excludedGenders: () => ExcludedVideoGenderSelector,
    excludedKeywords: () => ExcludedVideoKeywordSelector,
    excludedMobileAppCategories: () => ExcludedVideoMobileAppCategorySelector,
    excludedMobileApplications: () => ExcludedVideoMobileApplicationSelector,
    excludedParentalStatuses: () => ExcludedVideoParentalStatusSelector,
    excludedPlacements: () => ExcludedVideoPlacementSelector,
    excludedTopics: () => ExcludedVideoTopicSelector,
    excludedYouTubeChannels: () => ExcludedVideoYouTubeChannelSelector,
    excludedYouTubeVideos: () => ExcludedVideoYouTubeVideoSelector,
    genders: () => VideoGenderSelector,
    keywords: () => VideoKeywordSelector,
    mobileAppCategories: () => VideoMobileAppCategorySelector,
    mobileApplications: () => VideoMobileApplicationSelector,
    newAgeBuilder: () => VideoAgeBuilder,
    newAudienceBuilder: () => VideoAudienceBuilder,
    newGenderBuilder: () => VideoGenderBuilder,
    newKeywordBuilder: () => VideoKeywordBuilder,
    newMobileAppCategoryBuilder: () => VideoMobileAppCategoryBuilder,
    newMobileApplicationBuilder: () => VideoMobileApplicationBuilder,
    newParentalStatusBuilder: () => VideoParentalStatusBuilder,
    newPlacementBuilder: () => VideoPlacementBuilder,
    newTopicBuilder: () => VideoTopicBuilder,
    newYouTubeChannelBuilder: () => VideoYouTubeChannelBuilder,
    newYouTubeVideoBuilder: () => VideoYouTubeVideoBuilder,
    parentalStatuses: () => VideoParentalStatusSelector,
    placements: () => VideoPlacementSelector,
    topics: () => VideoTopicSelector,
    youTubeChannels: () => VideoYouTubeChannelSelector,
    youTubeVideos: () => VideoYouTubeVideoSelector
  ): AdGroupVideoTargeting = {
    val __obj = js.Dynamic.literal(ages = js.Any.fromFunction0(ages), audiences = js.Any.fromFunction0(audiences), excludedAges = js.Any.fromFunction0(excludedAges), excludedAudiences = js.Any.fromFunction0(excludedAudiences), excludedGenders = js.Any.fromFunction0(excludedGenders), excludedKeywords = js.Any.fromFunction0(excludedKeywords), excludedMobileAppCategories = js.Any.fromFunction0(excludedMobileAppCategories), excludedMobileApplications = js.Any.fromFunction0(excludedMobileApplications), excludedParentalStatuses = js.Any.fromFunction0(excludedParentalStatuses), excludedPlacements = js.Any.fromFunction0(excludedPlacements), excludedTopics = js.Any.fromFunction0(excludedTopics), excludedYouTubeChannels = js.Any.fromFunction0(excludedYouTubeChannels), excludedYouTubeVideos = js.Any.fromFunction0(excludedYouTubeVideos), genders = js.Any.fromFunction0(genders), keywords = js.Any.fromFunction0(keywords), mobileAppCategories = js.Any.fromFunction0(mobileAppCategories), mobileApplications = js.Any.fromFunction0(mobileApplications), newAgeBuilder = js.Any.fromFunction0(newAgeBuilder), newAudienceBuilder = js.Any.fromFunction0(newAudienceBuilder), newGenderBuilder = js.Any.fromFunction0(newGenderBuilder), newKeywordBuilder = js.Any.fromFunction0(newKeywordBuilder), newMobileAppCategoryBuilder = js.Any.fromFunction0(newMobileAppCategoryBuilder), newMobileApplicationBuilder = js.Any.fromFunction0(newMobileApplicationBuilder), newParentalStatusBuilder = js.Any.fromFunction0(newParentalStatusBuilder), newPlacementBuilder = js.Any.fromFunction0(newPlacementBuilder), newTopicBuilder = js.Any.fromFunction0(newTopicBuilder), newYouTubeChannelBuilder = js.Any.fromFunction0(newYouTubeChannelBuilder), newYouTubeVideoBuilder = js.Any.fromFunction0(newYouTubeVideoBuilder), parentalStatuses = js.Any.fromFunction0(parentalStatuses), placements = js.Any.fromFunction0(placements), topics = js.Any.fromFunction0(topics), youTubeChannels = js.Any.fromFunction0(youTubeChannels), youTubeVideos = js.Any.fromFunction0(youTubeVideos))
    __obj.asInstanceOf[AdGroupVideoTargeting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdGroupVideoTargeting] (val x: Self) extends AnyVal {
    
    inline def setAges(value: () => VideoAgeSelector): Self = StObject.set(x, "ages", js.Any.fromFunction0(value))
    
    inline def setAudiences(value: () => VideoAudienceSelector): Self = StObject.set(x, "audiences", js.Any.fromFunction0(value))
    
    inline def setExcludedAges(value: () => ExcludedVideoAgeSelector): Self = StObject.set(x, "excludedAges", js.Any.fromFunction0(value))
    
    inline def setExcludedAudiences(value: () => ExcludedVideoAudienceSelector): Self = StObject.set(x, "excludedAudiences", js.Any.fromFunction0(value))
    
    inline def setExcludedGenders(value: () => ExcludedVideoGenderSelector): Self = StObject.set(x, "excludedGenders", js.Any.fromFunction0(value))
    
    inline def setExcludedKeywords(value: () => ExcludedVideoKeywordSelector): Self = StObject.set(x, "excludedKeywords", js.Any.fromFunction0(value))
    
    inline def setExcludedMobileAppCategories(value: () => ExcludedVideoMobileAppCategorySelector): Self = StObject.set(x, "excludedMobileAppCategories", js.Any.fromFunction0(value))
    
    inline def setExcludedMobileApplications(value: () => ExcludedVideoMobileApplicationSelector): Self = StObject.set(x, "excludedMobileApplications", js.Any.fromFunction0(value))
    
    inline def setExcludedParentalStatuses(value: () => ExcludedVideoParentalStatusSelector): Self = StObject.set(x, "excludedParentalStatuses", js.Any.fromFunction0(value))
    
    inline def setExcludedPlacements(value: () => ExcludedVideoPlacementSelector): Self = StObject.set(x, "excludedPlacements", js.Any.fromFunction0(value))
    
    inline def setExcludedTopics(value: () => ExcludedVideoTopicSelector): Self = StObject.set(x, "excludedTopics", js.Any.fromFunction0(value))
    
    inline def setExcludedYouTubeChannels(value: () => ExcludedVideoYouTubeChannelSelector): Self = StObject.set(x, "excludedYouTubeChannels", js.Any.fromFunction0(value))
    
    inline def setExcludedYouTubeVideos(value: () => ExcludedVideoYouTubeVideoSelector): Self = StObject.set(x, "excludedYouTubeVideos", js.Any.fromFunction0(value))
    
    inline def setGenders(value: () => VideoGenderSelector): Self = StObject.set(x, "genders", js.Any.fromFunction0(value))
    
    inline def setKeywords(value: () => VideoKeywordSelector): Self = StObject.set(x, "keywords", js.Any.fromFunction0(value))
    
    inline def setMobileAppCategories(value: () => VideoMobileAppCategorySelector): Self = StObject.set(x, "mobileAppCategories", js.Any.fromFunction0(value))
    
    inline def setMobileApplications(value: () => VideoMobileApplicationSelector): Self = StObject.set(x, "mobileApplications", js.Any.fromFunction0(value))
    
    inline def setNewAgeBuilder(value: () => VideoAgeBuilder): Self = StObject.set(x, "newAgeBuilder", js.Any.fromFunction0(value))
    
    inline def setNewAudienceBuilder(value: () => VideoAudienceBuilder): Self = StObject.set(x, "newAudienceBuilder", js.Any.fromFunction0(value))
    
    inline def setNewGenderBuilder(value: () => VideoGenderBuilder): Self = StObject.set(x, "newGenderBuilder", js.Any.fromFunction0(value))
    
    inline def setNewKeywordBuilder(value: () => VideoKeywordBuilder): Self = StObject.set(x, "newKeywordBuilder", js.Any.fromFunction0(value))
    
    inline def setNewMobileAppCategoryBuilder(value: () => VideoMobileAppCategoryBuilder): Self = StObject.set(x, "newMobileAppCategoryBuilder", js.Any.fromFunction0(value))
    
    inline def setNewMobileApplicationBuilder(value: () => VideoMobileApplicationBuilder): Self = StObject.set(x, "newMobileApplicationBuilder", js.Any.fromFunction0(value))
    
    inline def setNewParentalStatusBuilder(value: () => VideoParentalStatusBuilder): Self = StObject.set(x, "newParentalStatusBuilder", js.Any.fromFunction0(value))
    
    inline def setNewPlacementBuilder(value: () => VideoPlacementBuilder): Self = StObject.set(x, "newPlacementBuilder", js.Any.fromFunction0(value))
    
    inline def setNewTopicBuilder(value: () => VideoTopicBuilder): Self = StObject.set(x, "newTopicBuilder", js.Any.fromFunction0(value))
    
    inline def setNewYouTubeChannelBuilder(value: () => VideoYouTubeChannelBuilder): Self = StObject.set(x, "newYouTubeChannelBuilder", js.Any.fromFunction0(value))
    
    inline def setNewYouTubeVideoBuilder(value: () => VideoYouTubeVideoBuilder): Self = StObject.set(x, "newYouTubeVideoBuilder", js.Any.fromFunction0(value))
    
    inline def setParentalStatuses(value: () => VideoParentalStatusSelector): Self = StObject.set(x, "parentalStatuses", js.Any.fromFunction0(value))
    
    inline def setPlacements(value: () => VideoPlacementSelector): Self = StObject.set(x, "placements", js.Any.fromFunction0(value))
    
    inline def setTopics(value: () => VideoTopicSelector): Self = StObject.set(x, "topics", js.Any.fromFunction0(value))
    
    inline def setYouTubeChannels(value: () => VideoYouTubeChannelSelector): Self = StObject.set(x, "youTubeChannels", js.Any.fromFunction0(value))
    
    inline def setYouTubeVideos(value: () => VideoYouTubeVideoSelector): Self = StObject.set(x, "youTubeVideos", js.Any.fromFunction0(value))
  }
}
