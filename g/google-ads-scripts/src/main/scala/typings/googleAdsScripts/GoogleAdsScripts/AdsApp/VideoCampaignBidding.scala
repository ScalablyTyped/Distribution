package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a video campaign's bidding fields. */
trait VideoCampaignBidding extends StObject {
  
  /** Returns the bidding strategy type of this video campaign. */
  def getStrategyType(): String
}
object VideoCampaignBidding {
  
  inline def apply(getStrategyType: () => String): VideoCampaignBidding = {
    val __obj = js.Dynamic.literal(getStrategyType = js.Any.fromFunction0(getStrategyType))
    __obj.asInstanceOf[VideoCampaignBidding]
  }
  
  extension [Self <: VideoCampaignBidding](x: Self) {
    
    inline def setGetStrategyType(value: () => String): Self = StObject.set(x, "getStrategyType", js.Any.fromFunction0(value))
  }
}
