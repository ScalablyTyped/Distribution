package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads YouTube Channel. */
@js.native
trait YouTubeChannel
  extends StObject
     with StatsFor {
  
  /** Provides access to this YouTube channel's bidding fields. */
  def bidding(): DisplayCriterionBidding = js.native
  
  /** Returns the ad group to which this YouTube channel belongs. */
  def getAdGroup(): AdGroup = js.native
  
  /** Returns the base ad group to which this YouTube channel belongs. */
  def getBaseAdGroup(): AdGroup = js.native
  
  /** Returns the base campaign to which this YouTube channel belongs. */
  def getBaseCampaign(): Campaign = js.native
  
  /** Returns the campaign to which this YouTube channel belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign = js.native
  
  /** Returns the YouTube channel ID. */
  def getChannelId(): String = js.native
  
  /** Returns the type of this entity as a String, in this case, "YouTubeChannel". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the YouTube channel. */
  def getId(): Double = js.native
  
  /** Returns true if the YouTube channel is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the YouTube channel is managed. */
  def isManaged(): Boolean = js.native
  
  /** Returns true if the YouTube channel is paused. */
  def isPaused(): Boolean = js.native
  
  /** Removes the YouTube channel. */
  def remove(): Unit = js.native
}
