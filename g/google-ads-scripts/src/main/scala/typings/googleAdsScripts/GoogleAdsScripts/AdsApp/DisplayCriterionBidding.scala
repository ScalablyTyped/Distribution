package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a display criterion's bidding fields. */
trait DisplayCriterionBidding extends StObject {
  
  /** Clears the max CPC bid for this display criterion. */
  def clearCpc(): Unit
  
  /** Clears the CPM bid for this display criterion. */
  def clearCpm(): Unit
  
  /** Returns the max CPC bid for this display criterion. */
  def getCpc(): Double
  
  /** Returns the CPM bid for this display criterion. */
  def getCpm(): Double
  
  /** Returns the flexible bidding strategy of the display criterion. */
  def getStrategy(): BiddingStrategy
  
  /**
    * Returns the bidding strategy source of this display criterion.
    *
    * @deprecated **Deprecated**. Google Ads does not support setting bidding strategies at different levels. As a result, 'CAMPAIGN' is the only possible source for bidding strategies.
    */
  def getStrategySource(): String
  
  /** Returns the bidding strategy type of this display criterion. */
  def getStrategyType(): String
  
  /** Sets the max CPC bid for this display criterion. */
  def setCpc(cpc: Double): Unit
  
  /** Sets the CPM bid for this display criterion. */
  def setCpm(cpm: Double): Unit
}
object DisplayCriterionBidding {
  
  inline def apply(
    clearCpc: () => Unit,
    clearCpm: () => Unit,
    getCpc: () => Double,
    getCpm: () => Double,
    getStrategy: () => BiddingStrategy,
    getStrategySource: () => String,
    getStrategyType: () => String,
    setCpc: Double => Unit,
    setCpm: Double => Unit
  ): DisplayCriterionBidding = {
    val __obj = js.Dynamic.literal(clearCpc = js.Any.fromFunction0(clearCpc), clearCpm = js.Any.fromFunction0(clearCpm), getCpc = js.Any.fromFunction0(getCpc), getCpm = js.Any.fromFunction0(getCpm), getStrategy = js.Any.fromFunction0(getStrategy), getStrategySource = js.Any.fromFunction0(getStrategySource), getStrategyType = js.Any.fromFunction0(getStrategyType), setCpc = js.Any.fromFunction1(setCpc), setCpm = js.Any.fromFunction1(setCpm))
    __obj.asInstanceOf[DisplayCriterionBidding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayCriterionBidding] (val x: Self) extends AnyVal {
    
    inline def setClearCpc(value: () => Unit): Self = StObject.set(x, "clearCpc", js.Any.fromFunction0(value))
    
    inline def setClearCpm(value: () => Unit): Self = StObject.set(x, "clearCpm", js.Any.fromFunction0(value))
    
    inline def setGetCpc(value: () => Double): Self = StObject.set(x, "getCpc", js.Any.fromFunction0(value))
    
    inline def setGetCpm(value: () => Double): Self = StObject.set(x, "getCpm", js.Any.fromFunction0(value))
    
    inline def setGetStrategy(value: () => BiddingStrategy): Self = StObject.set(x, "getStrategy", js.Any.fromFunction0(value))
    
    inline def setGetStrategySource(value: () => String): Self = StObject.set(x, "getStrategySource", js.Any.fromFunction0(value))
    
    inline def setGetStrategyType(value: () => String): Self = StObject.set(x, "getStrategyType", js.Any.fromFunction0(value))
    
    inline def setSetCpc(value: Double => Unit): Self = StObject.set(x, "setCpc", js.Any.fromFunction1(value))
    
    inline def setSetCpm(value: Double => Unit): Self = StObject.set(x, "setCpm", js.Any.fromFunction1(value))
  }
}
