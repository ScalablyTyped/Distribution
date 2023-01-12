package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a shopping campaign's bidding fields. */
trait ShoppingCampaignBidding extends StObject {
  
  /** Returns the flexible bidding strategy of the shopping campaign. */
  def getStrategy(): BiddingStrategy
  
  /** Returns the bidding strategy source of this shopping campaign. */
  def getStrategySource(): String
  
  /** Returns the bidding strategy type of this shopping campaign. */
  def getStrategyType(): String
  
  /** Sets the bidding strategy of this shopping campaign to the specified standard bidding strategy. */
  def setStrategy(biddingStrategy: String): Unit
}
object ShoppingCampaignBidding {
  
  inline def apply(
    getStrategy: () => BiddingStrategy,
    getStrategySource: () => String,
    getStrategyType: () => String,
    setStrategy: String => Unit
  ): ShoppingCampaignBidding = {
    val __obj = js.Dynamic.literal(getStrategy = js.Any.fromFunction0(getStrategy), getStrategySource = js.Any.fromFunction0(getStrategySource), getStrategyType = js.Any.fromFunction0(getStrategyType), setStrategy = js.Any.fromFunction1(setStrategy))
    __obj.asInstanceOf[ShoppingCampaignBidding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShoppingCampaignBidding] (val x: Self) extends AnyVal {
    
    inline def setGetStrategy(value: () => BiddingStrategy): Self = StObject.set(x, "getStrategy", js.Any.fromFunction0(value))
    
    inline def setGetStrategySource(value: () => String): Self = StObject.set(x, "getStrategySource", js.Any.fromFunction0(value))
    
    inline def setGetStrategyType(value: () => String): Self = StObject.set(x, "getStrategyType", js.Any.fromFunction0(value))
    
    inline def setSetStrategy(value: String => Unit): Self = StObject.set(x, "setStrategy", js.Any.fromFunction1(value))
  }
}
