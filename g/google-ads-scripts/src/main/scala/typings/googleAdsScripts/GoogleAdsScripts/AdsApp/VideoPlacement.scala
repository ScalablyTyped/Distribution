package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads Placement in a Video Campaign. */
@js.native
trait VideoPlacement
  extends StObject
     with StatsFor {
  
  /** Provides access to bidding fields of this video placement. */
  def bidding(): VideoCriterionBidding = js.native
  
  /** Returns the type of this entity as a String, in this case, "VideoPlacement". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the video placement. */
  def getId(): Double = js.native
  
  /** Returns the URL of the placement. */
  def getUrl(): String = js.native
  
  /** Returns the ad group to which this video placement belongs. */
  def getVideoAdGroup(): VideoAdGroup = js.native
  
  /** Returns the campaign to which this video placement belongs. */
  def getVideoCampaign(): VideoCampaign = js.native
  
  /** Returns true if the video placement is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the placement is managed. */
  def isManaged(): Boolean = js.native
  
  /** Returns true if the video placement is paused. */
  def isPaused(): Boolean = js.native
  
  /** Removes the video placement. */
  def remove(): Unit = js.native
}
