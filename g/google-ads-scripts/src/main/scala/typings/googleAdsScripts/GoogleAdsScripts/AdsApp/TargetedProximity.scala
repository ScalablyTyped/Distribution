package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads targeted proximity — some radius around a geographical point. */
@js.native
trait TargetedProximity
  extends StObject
     with StatsFor {
  
  /** Returns the address of the central point, or null if unknown. */
  def getAddress(): Address = js.native
  
  /** Returns the base campaign to which this targeted proximity belongs. */
  def getBaseCampaign(): Campaign = js.native
  
  /** Returns the bid modifier for this targeted proximity. */
  def getBidModifier(): Double = js.native
  
  /** Returns the campaign to which this targeted proximity belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign = js.native
  
  /** Returns the campaign type. */
  def getCampaignType(): String = js.native
  
  /** Returns the type of this entity as a String, in this case, "TargetedProximity". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the targeted proximity. */
  def getId(): Double = js.native
  
  /** Returns the latitude in degrees of the central point of this proximity. */
  def getLatitude(): Double = js.native
  
  /** Returns the longitude in degrees of the central point of this proximity. */
  def getLongitude(): Double = js.native
  
  /** Returns the radius around the central point to target. */
  def getRadius(): Double = js.native
  
  /** Returns the units of `TargetedProximity.getRadius()`. */
  def getRadiusUnits(): String = js.native
  
  /** Returns the shopping campaign to which this targeted proximity belongs or null if it does not belong to a shopping campaign. */
  def getShoppingCampaign(): ShoppingCampaign = js.native
  
  /** Returns the video campaign to which this targeted proximity belongs or null if it does not belong to a video campaign. */
  def getVideoCampaign(): VideoCampaign = js.native
  
  /** Removes the targeted proximity. */
  def remove(): Unit = js.native
  
  /** Sets the bid modifier for this targeted proximity. */
  def setBidModifier(modifier: Double): Unit = js.native
}
