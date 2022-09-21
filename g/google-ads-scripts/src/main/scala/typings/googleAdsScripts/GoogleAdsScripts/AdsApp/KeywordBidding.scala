package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a keyword's bidding fields. */
trait KeywordBidding extends StObject {
  
  /** Clears the max CPC bid for this keyword. */
  def clearCpc(): Unit
  
  /** Clears the CPM bid for this keyword. */
  def clearCpm(): Unit
  
  /** Returns the max CPC bid for this keyword. */
  def getCpc(): Double
  
  /** Returns the CPM bid for this keyword. */
  def getCpm(): Double
  
  /** Returns the flexible bidding strategy of the keyword. */
  def getStrategy(): BiddingStrategy
  
  /** Returns the bidding strategy source of this keyword. */
  def getStrategySource(): String
  
  /** Returns the bidding strategy type of this keyword. */
  def getStrategyType(): String
  
  /** Sets the max CPC bid for this keyword. */
  def setCpc(cpc: Double): Unit
  
  /** Sets the CPM bid for this keyword. */
  def setCpm(cpm: Double): Unit
}
object KeywordBidding {
  
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
  ): KeywordBidding = {
    val __obj = js.Dynamic.literal(clearCpc = js.Any.fromFunction0(clearCpc), clearCpm = js.Any.fromFunction0(clearCpm), getCpc = js.Any.fromFunction0(getCpc), getCpm = js.Any.fromFunction0(getCpm), getStrategy = js.Any.fromFunction0(getStrategy), getStrategySource = js.Any.fromFunction0(getStrategySource), getStrategyType = js.Any.fromFunction0(getStrategyType), setCpc = js.Any.fromFunction1(setCpc), setCpm = js.Any.fromFunction1(setCpm))
    __obj.asInstanceOf[KeywordBidding]
  }
  
  extension [Self <: KeywordBidding](x: Self) {
    
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
