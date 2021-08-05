package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsStats extends StObject {
  
  def getAverageCpc(): Double
  
  def getAverageCpm(): Double
  
  def getAverageCpv(): Double
  
  def getAveragePageviews(): Double
  
  def getAveragePosition(): Double
  
  def getAverageTimeOnSite(): Double
  
  def getBounceRage(): Double
  
  def getClicks(): Double
  
  def getConversionRate(): Double
  
  def getConversions(): Double
  
  def getCost(): Double
  
  def getCtr(): Double
  
  def getImpressions(): Double
  
  def getViewRate(): Double
  
  def getViews(): Double
}
object AdWordsStats {
  
  inline def apply(
    getAverageCpc: () => Double,
    getAverageCpm: () => Double,
    getAverageCpv: () => Double,
    getAveragePageviews: () => Double,
    getAveragePosition: () => Double,
    getAverageTimeOnSite: () => Double,
    getBounceRage: () => Double,
    getClicks: () => Double,
    getConversionRate: () => Double,
    getConversions: () => Double,
    getCost: () => Double,
    getCtr: () => Double,
    getImpressions: () => Double,
    getViewRate: () => Double,
    getViews: () => Double
  ): AdWordsStats = {
    val __obj = js.Dynamic.literal(getAverageCpc = js.Any.fromFunction0(getAverageCpc), getAverageCpm = js.Any.fromFunction0(getAverageCpm), getAverageCpv = js.Any.fromFunction0(getAverageCpv), getAveragePageviews = js.Any.fromFunction0(getAveragePageviews), getAveragePosition = js.Any.fromFunction0(getAveragePosition), getAverageTimeOnSite = js.Any.fromFunction0(getAverageTimeOnSite), getBounceRage = js.Any.fromFunction0(getBounceRage), getClicks = js.Any.fromFunction0(getClicks), getConversionRate = js.Any.fromFunction0(getConversionRate), getConversions = js.Any.fromFunction0(getConversions), getCost = js.Any.fromFunction0(getCost), getCtr = js.Any.fromFunction0(getCtr), getImpressions = js.Any.fromFunction0(getImpressions), getViewRate = js.Any.fromFunction0(getViewRate), getViews = js.Any.fromFunction0(getViews))
    __obj.asInstanceOf[AdWordsStats]
  }
  
  extension [Self <: AdWordsStats](x: Self) {
    
    inline def setGetAverageCpc(value: () => Double): Self = StObject.set(x, "getAverageCpc", js.Any.fromFunction0(value))
    
    inline def setGetAverageCpm(value: () => Double): Self = StObject.set(x, "getAverageCpm", js.Any.fromFunction0(value))
    
    inline def setGetAverageCpv(value: () => Double): Self = StObject.set(x, "getAverageCpv", js.Any.fromFunction0(value))
    
    inline def setGetAveragePageviews(value: () => Double): Self = StObject.set(x, "getAveragePageviews", js.Any.fromFunction0(value))
    
    inline def setGetAveragePosition(value: () => Double): Self = StObject.set(x, "getAveragePosition", js.Any.fromFunction0(value))
    
    inline def setGetAverageTimeOnSite(value: () => Double): Self = StObject.set(x, "getAverageTimeOnSite", js.Any.fromFunction0(value))
    
    inline def setGetBounceRage(value: () => Double): Self = StObject.set(x, "getBounceRage", js.Any.fromFunction0(value))
    
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
