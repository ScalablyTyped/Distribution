package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a video criterion's bidding fields. */
trait VideoCriterionBidding extends StObject {
  
  /**
    * Returns the bidding strategy source of this video criterion.
    *
    * @deprecated **Deprecated**. Google Ads does not support setting bidding strategies at different levels. As a result, 'CAMPAIGN' is the only possible source for bidding strategies.
    */
  def getStrategySource(): String
  
  /** Returns the bidding strategy type of this video criterion. */
  def getStrategyType(): String
}
object VideoCriterionBidding {
  
  inline def apply(getStrategySource: () => String, getStrategyType: () => String): VideoCriterionBidding = {
    val __obj = js.Dynamic.literal(getStrategySource = js.Any.fromFunction0(getStrategySource), getStrategyType = js.Any.fromFunction0(getStrategyType))
    __obj.asInstanceOf[VideoCriterionBidding]
  }
  
  extension [Self <: VideoCriterionBidding](x: Self) {
    
    inline def setGetStrategySource(value: () => String): Self = StObject.set(x, "getStrategySource", js.Any.fromFunction0(value))
    
    inline def setGetStrategyType(value: () => String): Self = StObject.set(x, "getStrategyType", js.Any.fromFunction0(value))
  }
}
