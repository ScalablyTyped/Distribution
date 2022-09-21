package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a flexible bidding strategy.
  * Bidding strategies store shared bidding configuration data and are account-level objects.
  * For more information, refer to Using flexible bid strategies.
  */
@js.native
trait BiddingStrategy
  extends StObject
     with StatsFor {
  
  /** Returns the selector of all ad groups that use this bidding strategy. */
  def adGroups(): AdGroupSelector = js.native
  
  /** Returns the selector of all campaigns that use this bidding strategy. */
  def campaigns(): CampaignSelector = js.native
  
  /** Returns the type of this entity as a String, in this case, "BiddingStrategy". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the bidding strategy. */
  def getId(): Double = js.native
  
  /** Returns the name of the bidding strategy. */
  def getName(): String = js.native
  
  /** Returns the type of the bidding strategy. */
  def getType(): String = js.native
  
  /** Returns the selector of all keywords that use this bidding strategy. */
  def keywords(): KeywordSelector = js.native
  
  /** Returns the selector of all shopping ad groups that use this bidding strategy. */
  def shoppingAdGroups(): ShoppingAdGroupSelector = js.native
  
  /** Returns the selector of all shopping campaigns that use this bidding strategy. */
  def shoppingCampaigns(): ShoppingCampaignSelector = js.native
}
