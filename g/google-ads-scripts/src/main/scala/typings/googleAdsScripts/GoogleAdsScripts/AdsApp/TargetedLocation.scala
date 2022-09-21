package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Ads targeted location.
  *
  * Targeted locations are used to only show your ads in specific geographic areas.
  * For instance, a broadly-targeted campaign might have location targets for an entire country,
  * whereas a more specifically-targeted campaign might break down its location targets at the city level.
  */
@js.native
trait TargetedLocation
  extends StObject
     with StatsFor {
  
  /** Returns the bid modifier for this targeted location. */
  def getBidModifier(): Double = js.native
  
  /** Returns the campaign to which this targeted location belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign = js.native
  
  /** Returns the campaign type. */
  def getCampaignType(): String = js.native
  
  /** Returns the country code of this location. */
  def getCountryCode(): String = js.native
  
  /** Returns the type of this entity as a String, in this case, "TargetedLocation". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the targeted location. */
  def getId(): Double = js.native
  
  /** Returns the name of this location. */
  def getName(): String = js.native
  
  /** Returns the shopping campaign to which this targeted location belongs or null if it does not belong to a shopping campaign. */
  def getShoppingCampaign(): ShoppingCampaign = js.native
  
  /** Returns the target type of this location. */
  def getTargetType(): String = js.native
  
  /** Returns the targeting status of this location. */
  def getTargetingStatus(): String = js.native
  
  /** Returns the video campaign to which this targeted location belongs or null if it does not belong to a video campaign. */
  def getVideoCampaign(): VideoCampaign = js.native
  
  /** Removes the targeted location. */
  def remove(): Unit = js.native
  
  /** Sets the bid modifier for this targeted location. */
  def setBidModifier(modifier: Double): Unit = js.native
}
