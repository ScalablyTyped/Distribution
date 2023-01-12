package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShoppingAdGroupBidding extends StObject {
  
  /** Returns the max CPC bid for this shopping ad group. */
  def getCpc(): Double
  
  /** Returns the flexible bidding strategy of the shopping ad group. */
  def getStrategy(): BiddingStrategy
  
  /**
    * Returns the bidding strategy source of this shopping ad group.
    *
    * @deprecated **Deprecated**. Google Ads does not support setting bidding strategies at different levels. As a result, 'CAMPAIGN' is the only possible source for bidding strategies.
    */
  def getStrategySource(): String
  
  /** Returns the bidding strategy type of this shopping ad group. */
  def getStrategyType(): String
  
  /** Sets the max CPC bid for this shopping ad group. */
  def setCpc(cpc: Double): Unit
}
object ShoppingAdGroupBidding {
  
  inline def apply(
    getCpc: () => Double,
    getStrategy: () => BiddingStrategy,
    getStrategySource: () => String,
    getStrategyType: () => String,
    setCpc: Double => Unit
  ): ShoppingAdGroupBidding = {
    val __obj = js.Dynamic.literal(getCpc = js.Any.fromFunction0(getCpc), getStrategy = js.Any.fromFunction0(getStrategy), getStrategySource = js.Any.fromFunction0(getStrategySource), getStrategyType = js.Any.fromFunction0(getStrategyType), setCpc = js.Any.fromFunction1(setCpc))
    __obj.asInstanceOf[ShoppingAdGroupBidding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShoppingAdGroupBidding] (val x: Self) extends AnyVal {
    
    inline def setGetCpc(value: () => Double): Self = StObject.set(x, "getCpc", js.Any.fromFunction0(value))
    
    inline def setGetStrategy(value: () => BiddingStrategy): Self = StObject.set(x, "getStrategy", js.Any.fromFunction0(value))
    
    inline def setGetStrategySource(value: () => String): Self = StObject.set(x, "getStrategySource", js.Any.fromFunction0(value))
    
    inline def setGetStrategyType(value: () => String): Self = StObject.set(x, "getStrategyType", js.Any.fromFunction0(value))
    
    inline def setSetCpc(value: Double => Unit): Self = StObject.set(x, "setCpc", js.Any.fromFunction1(value))
  }
}
