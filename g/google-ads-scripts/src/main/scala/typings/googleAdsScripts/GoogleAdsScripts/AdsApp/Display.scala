package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Access to display criteria that have been added to ad groups in this account: Audience, DisplayKeyword, Placement, Topic. */
trait Display extends StObject {
  
  /** Returns the selector of all audiences in the account. */
  def audiences(): AudienceSelector
  
  /** Returns the selector of all display keywords in the account. */
  def keywords(): DisplayKeywordSelector
  
  /** Returns the selector of all website placements in the account. */
  def placements(): PlacementSelector
  
  /** Returns the selector of all topics in the account. */
  def topics(): TopicSelector
  
  /** Returns the selector of all YouTube channels in the account. */
  def youTubeChannels(): YouTubeChannelSelector
  
  /** Returns the selector of all YouTube videos in the account. */
  def youTubeVideos(): YouTubeVideoSelector
}
object Display {
  
  inline def apply(
    audiences: () => AudienceSelector,
    keywords: () => DisplayKeywordSelector,
    placements: () => PlacementSelector,
    topics: () => TopicSelector,
    youTubeChannels: () => YouTubeChannelSelector,
    youTubeVideos: () => YouTubeVideoSelector
  ): Display = {
    val __obj = js.Dynamic.literal(audiences = js.Any.fromFunction0(audiences), keywords = js.Any.fromFunction0(keywords), placements = js.Any.fromFunction0(placements), topics = js.Any.fromFunction0(topics), youTubeChannels = js.Any.fromFunction0(youTubeChannels), youTubeVideos = js.Any.fromFunction0(youTubeVideos))
    __obj.asInstanceOf[Display]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Display] (val x: Self) extends AnyVal {
    
    inline def setAudiences(value: () => AudienceSelector): Self = StObject.set(x, "audiences", js.Any.fromFunction0(value))
    
    inline def setKeywords(value: () => DisplayKeywordSelector): Self = StObject.set(x, "keywords", js.Any.fromFunction0(value))
    
    inline def setPlacements(value: () => PlacementSelector): Self = StObject.set(x, "placements", js.Any.fromFunction0(value))
    
    inline def setTopics(value: () => TopicSelector): Self = StObject.set(x, "topics", js.Any.fromFunction0(value))
    
    inline def setYouTubeChannels(value: () => YouTubeChannelSelector): Self = StObject.set(x, "youTubeChannels", js.Any.fromFunction0(value))
    
    inline def setYouTubeVideos(value: () => YouTubeVideoSelector): Self = StObject.set(x, "youTubeVideos", js.Any.fromFunction0(value))
  }
}
