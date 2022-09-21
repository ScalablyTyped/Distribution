package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a campaign's bidding fields. */
@js.native
trait CampaignBidding extends StObject {
  
  /** Returns the flexible bidding strategy of the campaign. */
  def getStrategy(): BiddingStrategy = js.native
  
  /**
    * Returns the bidding strategy source of this campaign.
    * @deprecated **Deprecated**. Google Ads does not support setting bidding strategies at different levels. As a result, 'CAMPAIGN' is the only possible source for bidding strategies.
    */
  def getStrategySource(): String = js.native
  
  /** Returns the bidding strategy type of this campaign. */
  def getStrategyType(): String = js.native
  
  /** Sets the bidding strategy of this campaign to the specified standard bidding strategy. */
  def setStrategy(biddingStrategy: String): Unit = js.native
  /** Sets the bidding strategy of this campaign to the provided portfolio bidding strategy. */
  def setStrategy(biddingStrategy: BiddingStrategy): Unit = js.native
}
