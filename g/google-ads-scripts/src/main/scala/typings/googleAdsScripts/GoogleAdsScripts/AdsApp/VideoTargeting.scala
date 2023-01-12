package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Access to video criteria that have been added to ad groups in this account. */
trait VideoTargeting extends StObject {
  
  /** Returns the selector of all ages in the account. */
  def ages(): VideoAgeSelector
  
  /** Returns the selector of all audiences in the account. */
  def audiences(): VideoAudienceSelector
  
  /** Returns the selector of all genders in the account. */
  def genders(): VideoGenderSelector
  
  /** Returns the selector of all keywords in the account. */
  def keywords(): VideoKeywordSelector
  
  /** Returns the selector of all mobile application categories in the account. */
  def mobileAppCategories(): VideoMobileAppCategorySelector
  
  /** Returns the selector of all mobile applications in the account. */
  def mobileApplications(): VideoMobileApplicationSelector
  
  /** Returns the selector of all parental statuses in the account. */
  def parentalStatuses(): VideoParentalStatusSelector
  
  /** Returns the selector of all placements in the account. */
  def placements(): VideoPlacementSelector
  
  /** Returns the selector of all topics in the account. */
  def topics(): VideoTopicSelector
  
  /** Returns the selector of all YouTube channels in the account. */
  def youTubeChannels(): VideoYouTubeChannelSelector
  
  /** Returns the selector of all YouTube videos in the account. */
  def youTubeVideos(): VideoYouTubeVideoSelector
}
object VideoTargeting {
  
  inline def apply(
    ages: () => VideoAgeSelector,
    audiences: () => VideoAudienceSelector,
    genders: () => VideoGenderSelector,
    keywords: () => VideoKeywordSelector,
    mobileAppCategories: () => VideoMobileAppCategorySelector,
    mobileApplications: () => VideoMobileApplicationSelector,
    parentalStatuses: () => VideoParentalStatusSelector,
    placements: () => VideoPlacementSelector,
    topics: () => VideoTopicSelector,
    youTubeChannels: () => VideoYouTubeChannelSelector,
    youTubeVideos: () => VideoYouTubeVideoSelector
  ): VideoTargeting = {
    val __obj = js.Dynamic.literal(ages = js.Any.fromFunction0(ages), audiences = js.Any.fromFunction0(audiences), genders = js.Any.fromFunction0(genders), keywords = js.Any.fromFunction0(keywords), mobileAppCategories = js.Any.fromFunction0(mobileAppCategories), mobileApplications = js.Any.fromFunction0(mobileApplications), parentalStatuses = js.Any.fromFunction0(parentalStatuses), placements = js.Any.fromFunction0(placements), topics = js.Any.fromFunction0(topics), youTubeChannels = js.Any.fromFunction0(youTubeChannels), youTubeVideos = js.Any.fromFunction0(youTubeVideos))
    __obj.asInstanceOf[VideoTargeting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoTargeting] (val x: Self) extends AnyVal {
    
    inline def setAges(value: () => VideoAgeSelector): Self = StObject.set(x, "ages", js.Any.fromFunction0(value))
    
    inline def setAudiences(value: () => VideoAudienceSelector): Self = StObject.set(x, "audiences", js.Any.fromFunction0(value))
    
    inline def setGenders(value: () => VideoGenderSelector): Self = StObject.set(x, "genders", js.Any.fromFunction0(value))
    
    inline def setKeywords(value: () => VideoKeywordSelector): Self = StObject.set(x, "keywords", js.Any.fromFunction0(value))
    
    inline def setMobileAppCategories(value: () => VideoMobileAppCategorySelector): Self = StObject.set(x, "mobileAppCategories", js.Any.fromFunction0(value))
    
    inline def setMobileApplications(value: () => VideoMobileApplicationSelector): Self = StObject.set(x, "mobileApplications", js.Any.fromFunction0(value))
    
    inline def setParentalStatuses(value: () => VideoParentalStatusSelector): Self = StObject.set(x, "parentalStatuses", js.Any.fromFunction0(value))
    
    inline def setPlacements(value: () => VideoPlacementSelector): Self = StObject.set(x, "placements", js.Any.fromFunction0(value))
    
    inline def setTopics(value: () => VideoTopicSelector): Self = StObject.set(x, "topics", js.Any.fromFunction0(value))
    
    inline def setYouTubeChannels(value: () => VideoYouTubeChannelSelector): Self = StObject.set(x, "youTubeChannels", js.Any.fromFunction0(value))
    
    inline def setYouTubeVideos(value: () => VideoYouTubeVideoSelector): Self = StObject.set(x, "youTubeVideos", js.Any.fromFunction0(value))
  }
}
