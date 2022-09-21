package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to an AdGroup's bidding fields. */
trait AdGroupBidding extends StObject {
  
  /** Returns the Target CPA bid for this ad group. */
  def getCpa(): Double
  
  /** Returns the max CPC bid for this ad group. */
  def getCpc(): Double
  
  /** Returns the CPM bid for this ad group. */
  def getCpm(): Double
  
  /** Returns the flexible bidding strategy of the ad group. */
  def getStrategy(): BiddingStrategy
  
  /** Returns the bidding strategy source of this ad group. */
  def getStrategySource(): String
  
  /** Returns the bidding strategy type of this ad group. */
  def getStrategyType(): String
  
  /** Sets the Target CPA bid for this ad group. */
  def setCpa(cpa: Double): Unit
  
  /** Sets the max CPC bid for this ad group. */
  def setCpc(cpc: Double): Unit
  
  /** Sets the CPM bid for this ad group. */
  def setCpm(cpm: Double): Unit
}
object AdGroupBidding {
  
  inline def apply(
    getCpa: () => Double,
    getCpc: () => Double,
    getCpm: () => Double,
    getStrategy: () => BiddingStrategy,
    getStrategySource: () => String,
    getStrategyType: () => String,
    setCpa: Double => Unit,
    setCpc: Double => Unit,
    setCpm: Double => Unit
  ): AdGroupBidding = {
    val __obj = js.Dynamic.literal(getCpa = js.Any.fromFunction0(getCpa), getCpc = js.Any.fromFunction0(getCpc), getCpm = js.Any.fromFunction0(getCpm), getStrategy = js.Any.fromFunction0(getStrategy), getStrategySource = js.Any.fromFunction0(getStrategySource), getStrategyType = js.Any.fromFunction0(getStrategyType), setCpa = js.Any.fromFunction1(setCpa), setCpc = js.Any.fromFunction1(setCpc), setCpm = js.Any.fromFunction1(setCpm))
    __obj.asInstanceOf[AdGroupBidding]
  }
  
  extension [Self <: AdGroupBidding](x: Self) {
    
    inline def setGetCpa(value: () => Double): Self = StObject.set(x, "getCpa", js.Any.fromFunction0(value))
    
    inline def setGetCpc(value: () => Double): Self = StObject.set(x, "getCpc", js.Any.fromFunction0(value))
    
    inline def setGetCpm(value: () => Double): Self = StObject.set(x, "getCpm", js.Any.fromFunction0(value))
    
    inline def setGetStrategy(value: () => BiddingStrategy): Self = StObject.set(x, "getStrategy", js.Any.fromFunction0(value))
    
    inline def setGetStrategySource(value: () => String): Self = StObject.set(x, "getStrategySource", js.Any.fromFunction0(value))
    
    inline def setGetStrategyType(value: () => String): Self = StObject.set(x, "getStrategyType", js.Any.fromFunction0(value))
    
    inline def setSetCpa(value: Double => Unit): Self = StObject.set(x, "setCpa", js.Any.fromFunction1(value))
    
    inline def setSetCpc(value: Double => Unit): Self = StObject.set(x, "setCpc", js.Any.fromFunction1(value))
    
    inline def setSetCpm(value: Double => Unit): Self = StObject.set(x, "setCpm", js.Any.fromFunction1(value))
  }
}
