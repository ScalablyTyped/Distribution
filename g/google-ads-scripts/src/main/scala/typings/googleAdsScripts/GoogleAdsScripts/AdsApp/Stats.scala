package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Statistics common to various entity types. Typical usage:
  *
  *      var stats = campaign.getStatsFor("LAST_MONTH");
  *      var impressions = stats.getImpressions();
  *      var clicks = stats.getClicks();
  *      // etc.
  *
  * Note that Analytics-related stats (`Stats.getAveragePageviews()`, `Stats.getAverageTimeOnSite()` and `Stats.getBounceRate()`)
  * are only available for Campaigns, Ad groups, Keywords, and Ads. The method calls will return null for other entity types.
  */
trait Stats extends StObject {
  
  /** Returns the average cost per click. */
  def getAverageCpc(): Double
  
  /** Returns the average cost per thousand impressions. */
  def getAverageCpm(): Double
  
  /** Returns the average cost per view. */
  def getAverageCpv(): Double
  
  /**
    * Returns the average number of pages viewed per visit. Only available for Campaigns, Ad groups, Keywords, and Ads.
    * Returns `null` for other entity types. Returns `null` if the account is not linked to Analytics.
    */
  def getAveragePageviews(): Double
  
  /**
    * ~~Returns the average position. Returns `null` if this is a Display entity that doesn't have an average position.~~
    *
    * @deprecated **Deprecated**. Starting the week of September 30, 2019 this method will return `null`.
    */
  def getAveragePosition(): Null
  
  /**
    * Returns the average time a visitor spent on site, in seconds. Only available for Campaigns, Ad groups, Keywords, and Ads.
    * Returns `null` for other entity types. Returns `null` if the account is not linked to Analytics.
    */
  def getAverageTimeOnSite(): Double
  
  /**
    * Returns the bounce rate of the entity, in `0..1` range. When a visitor to your site sees only one page or triggers only one event,
    * Analytics considers this visit a "bounce." Only available for Campaigns, Ad groups, Keywords, and Ads.
    * Returns `null` for other entity types. Returns `null` if the account is not linked to Analytics.
    */
  def getBounceRate(): Double
  
  /** Returns the number of clicks. */
  def getClicks(): Double
  
  /** Returns the rate of conversions. */
  def getConversionRate(): Double
  
  /** Returns the number of conversions. */
  def getConversions(): Double
  
  /** Returns the cost in the default currency of the account. */
  def getCost(): Double
  
  /** Returns the click through rate of the entity, in `0..1` range. */
  def getCtr(): Double
  
  /** Returns the number of impressions. */
  def getImpressions(): Double
  
  /** Returns the view rate of the entity, in `0..1` range. */
  def getViewRate(): Double
  
  /** Returns the number of video views. */
  def getViews(): Double
}
object Stats {
  
  inline def apply(
    getAverageCpc: () => Double,
    getAverageCpm: () => Double,
    getAverageCpv: () => Double,
    getAveragePageviews: () => Double,
    getAveragePosition: () => Null,
    getAverageTimeOnSite: () => Double,
    getBounceRate: () => Double,
    getClicks: () => Double,
    getConversionRate: () => Double,
    getConversions: () => Double,
    getCost: () => Double,
    getCtr: () => Double,
    getImpressions: () => Double,
    getViewRate: () => Double,
    getViews: () => Double
  ): Stats = {
    val __obj = js.Dynamic.literal(getAverageCpc = js.Any.fromFunction0(getAverageCpc), getAverageCpm = js.Any.fromFunction0(getAverageCpm), getAverageCpv = js.Any.fromFunction0(getAverageCpv), getAveragePageviews = js.Any.fromFunction0(getAveragePageviews), getAveragePosition = js.Any.fromFunction0(getAveragePosition), getAverageTimeOnSite = js.Any.fromFunction0(getAverageTimeOnSite), getBounceRate = js.Any.fromFunction0(getBounceRate), getClicks = js.Any.fromFunction0(getClicks), getConversionRate = js.Any.fromFunction0(getConversionRate), getConversions = js.Any.fromFunction0(getConversions), getCost = js.Any.fromFunction0(getCost), getCtr = js.Any.fromFunction0(getCtr), getImpressions = js.Any.fromFunction0(getImpressions), getViewRate = js.Any.fromFunction0(getViewRate), getViews = js.Any.fromFunction0(getViews))
    __obj.asInstanceOf[Stats]
  }
  
  extension [Self <: Stats](x: Self) {
    
    inline def setGetAverageCpc(value: () => Double): Self = StObject.set(x, "getAverageCpc", js.Any.fromFunction0(value))
    
    inline def setGetAverageCpm(value: () => Double): Self = StObject.set(x, "getAverageCpm", js.Any.fromFunction0(value))
    
    inline def setGetAverageCpv(value: () => Double): Self = StObject.set(x, "getAverageCpv", js.Any.fromFunction0(value))
    
    inline def setGetAveragePageviews(value: () => Double): Self = StObject.set(x, "getAveragePageviews", js.Any.fromFunction0(value))
    
    inline def setGetAveragePosition(value: () => Null): Self = StObject.set(x, "getAveragePosition", js.Any.fromFunction0(value))
    
    inline def setGetAverageTimeOnSite(value: () => Double): Self = StObject.set(x, "getAverageTimeOnSite", js.Any.fromFunction0(value))
    
    inline def setGetBounceRate(value: () => Double): Self = StObject.set(x, "getBounceRate", js.Any.fromFunction0(value))
    
    inline def setGetClicks(value: () => Double): Self = StObject.set(x, "getClicks", js.Any.fromFunction0(value))
    
    inline def setGetConversionRate(value: () => Double): Self = StObject.set(x, "getConversionRate", js.Any.fromFunction0(value))
    
    inline def setGetConversions(value: () => Double): Self = StObject.set(x, "getConversions", js.Any.fromFunction0(value))
    
    inline def setGetCost(value: () => Double): Self = StObject.set(x, "getCost", js.Any.fromFunction0(value))
    
    inline def setGetCtr(value: () => Double): Self = StObject.set(x, "getCtr", js.Any.fromFunction0(value))
    
    inline def setGetImpressions(value: () => Double): Self = StObject.set(x, "getImpressions", js.Any.fromFunction0(value))
    
    inline def setGetViewRate(value: () => Double): Self = StObject.set(x, "getViewRate", js.Any.fromFunction0(value))
    
    inline def setGetViews(value: () => Double): Self = StObject.set(x, "getViews", js.Any.fromFunction0(value))
  }
}
