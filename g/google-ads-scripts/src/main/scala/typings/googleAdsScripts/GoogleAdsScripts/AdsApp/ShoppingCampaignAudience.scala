package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads audience, either `USER_INTEREST` or `USER_LIST`, configured for shopping campaigns. */
@js.native
trait ShoppingCampaignAudience
  extends StObject
     with StatsFor {
  
  /** Provides access to this audience's bidding fields. */
  def bidding(): ShoppingAudienceBidding = js.native
  
  /** Returns the audience ID of the audience. */
  def getAudienceId(): Double = js.native
  
  /** Returns the type of the audience, either `USER_INTEREST` or `USER_LIST`. */
  def getAudienceType(): String = js.native
  
  /** Returns the campaign to which this audience belongs. */
  def getCampaign(): ShoppingCampaign = js.native
  
  /** Returns the ID of the shopping audience. */
  def getId(): Double = js.native
  
  /** Returns the name of the audience. */
  def getName(): String = js.native
  
  /** Returns true if the shopping audience is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the shopping audience is paused. */
  def isPaused(): Boolean = js.native
  
  /** Removes the shopping audience. */
  def remove(): Unit = js.native
}
