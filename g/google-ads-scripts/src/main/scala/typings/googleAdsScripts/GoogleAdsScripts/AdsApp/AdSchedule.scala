package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents one period of a Google Ads ad schedule. */
@js.native
trait AdSchedule
  extends StObject
     with StatsFor {
  
  /** Returns the base campaign to which this ad schedule belongs. */
  def getBaseCampaign(): Campaign = js.native
  
  /** Returns the bid modifier for this ad schedule. */
  def getBidModifier(): Double = js.native
  
  /** Returns the campaign to which this ad schedule belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign = js.native
  
  /** Returns the campaign type. */
  def getCampaignType(): String = js.native
  
  /** Returns the day of week this ad schedule applies to. */
  def getDayOfWeek(): AdScheduleDayOfWeekType = js.native
  
  /** Returns the ending hour of this ad schedule. */
  def getEndHour(): Double = js.native
  
  /** Returns the ending minute of this ad schedule. */
  def getEndMinute(): Double = js.native
  
  /** Returns the type of this entity as a String, in this case, "AdSchedule". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the ad schedule. */
  def getId(): Double = js.native
  
  /** Returns the shopping campaign to which this ad schedule belongs or null if it does not belong to a shopping campaign. */
  def getShoppingCampaign(): ShoppingCampaign = js.native
  
  /** Returns the starting hour of this ad schedule. */
  def getStartHour(): Double = js.native
  
  /** Returns the starting minute of this ad schedule. */
  def getStartMinute(): Double = js.native
  
  /** Returns the video campaign to which this ad schedule belongs or null if it does not belong to a video campaign. */
  def getVideoCampaign(): VideoCampaign = js.native
  
  /** Removes the ad schedule. */
  def remove(): Unit = js.native
  
  /** Sets the bid modifier for this ad schedule. */
  def setBidModifier(modifier: Double): Unit = js.native
}
