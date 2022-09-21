package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads device target (either desktop, mobile, or tablet). */
@js.native
trait Platform
  extends StObject
     with StatsFor {
  
  /** Returns the base campaign to which this platform belongs. */
  def getBaseCampaign(): Campaign = js.native
  
  /** Returns the bid modifier for this platform. */
  def getBidModifier(): Double = js.native
  
  /** Returns the campaign to which this platform belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign = js.native
  
  /** Returns the campaign type. */
  def getCampaignType(): String = js.native
  
  /** Returns the type of this entity as a String, in this case, "Platform". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the platform. */
  def getId(): Double = js.native
  
  /** Returns the name of this platform. */
  def getName(): String = js.native
  
  /** Returns the shopping campaign to which this platform belongs or null if it does not belong to a shopping campaign. */
  def getShoppingCampaign(): ShoppingCampaign = js.native
  
  /** Returns the video campaign to which this platform belongs or null if it does not belong to a video campaign. */
  def getVideoCampaign(): VideoCampaign = js.native
  
  /** Sets the bid modifier for this platform. */
  def setBidModifier(modifier: Double): Unit = js.native
}
