package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads YouTube Video in a Video Campaign. */
@js.native
trait VideoYouTubeVideo
  extends StObject
     with StatsFor {
  
  /** Provides access to bidding fields of this video YouTube video. */
  def bidding(): VideoCriterionBidding = js.native
  
  /** Returns the type of this entity as a String, in this case, "VideoYouTubeVideo". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the video YouTube video. */
  def getId(): Double = js.native
  
  /** Returns the ad group to which this video YouTube video belongs. */
  def getVideoAdGroup(): VideoAdGroup = js.native
  
  /** Returns the campaign to which this video YouTube video belongs. */
  def getVideoCampaign(): VideoCampaign = js.native
  
  /** Returns the YouTube video ID. */
  def getVideoId(): String = js.native
  
  /** Returns true if the video YouTube video is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the YouTube video is managed. */
  def isManaged(): Boolean = js.native
  
  /** Returns true if the video YouTube video is paused. */
  def isPaused(): Boolean = js.native
  
  /** Removes the video YouTube video. */
  def remove(): Unit = js.native
}
