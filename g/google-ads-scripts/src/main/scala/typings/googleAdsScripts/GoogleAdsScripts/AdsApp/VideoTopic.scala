package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads Topic in a Video Campaign. */
@js.native
trait VideoTopic
  extends StObject
     with StatsFor {
  
  /** Provides access to bidding fields of this video topic. */
  def bidding(): VideoCriterionBidding = js.native
  
  /** Returns the type of this entity as a String, in this case, "VideoTopic". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the video topic. */
  def getId(): Double = js.native
  
  /** Returns the topic ID of the topic. */
  def getTopicId(): Double = js.native
  
  /** Returns the ad group to which this video topic belongs. */
  def getVideoAdGroup(): VideoAdGroup = js.native
  
  /** Returns the campaign to which this video topic belongs. */
  def getVideoCampaign(): VideoCampaign = js.native
  
  /** Returns true if the video topic is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the video topic is paused. */
  def isPaused(): Boolean = js.native
  
  /** Removes the video topic. */
  def remove(): Unit = js.native
}
