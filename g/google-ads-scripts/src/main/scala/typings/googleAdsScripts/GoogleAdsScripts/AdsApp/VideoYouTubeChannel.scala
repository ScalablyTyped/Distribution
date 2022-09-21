package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads YouTube Channel in a Video Campaign. */
@js.native
trait VideoYouTubeChannel
  extends StObject
     with StatsFor {
  
  /** Provides access to bidding fields of this video YouTube channel. */
  def bidding(): VideoCriterionBidding = js.native
  
  /** Returns the YouTube channel ID. */
  def getChannelId(): String = js.native
  
  /** Returns the type of this entity as a String, in this case, "VideoYouTubeChannel". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the video YouTube channel. */
  def getId(): Double = js.native
  
  /** Returns the ad group to which this video YouTube channel belongs. */
  def getVideoAdGroup(): VideoAdGroup = js.native
  
  /** Returns the campaign to which this video YouTube channel belongs. */
  def getVideoCampaign(): VideoCampaign = js.native
  
  /** Returns true if the video YouTube channel is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the YouTube channel is managed. */
  def isManaged(): Boolean = js.native
  
  /** Returns true if the video YouTube channel is paused. */
  def isPaused(): Boolean = js.native
  
  /** Removes the video YouTube channel. */
  def remove(): Unit = js.native
}
