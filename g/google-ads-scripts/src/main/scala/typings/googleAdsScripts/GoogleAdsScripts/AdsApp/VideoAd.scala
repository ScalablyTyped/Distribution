package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads video ad. */
@js.native
trait VideoAd
  extends StObject
     with StatsFor {
  
  /** Applies a label to the video ad. */
  def applyLabel(name: String): Unit = js.native
  
  /** Enables the video ad. */
  def enable(): Unit = js.native
  
  /** Returns the channel ID of the ad's video. */
  def getChannelName(): String = js.native
  
  /** Returns the first line of the ad description. */
  def getDescription1(): String = js.native
  
  /** Returns the second line of the ad description. */
  def getDescription2(): String = js.native
  
  /** Returns the type of destination page of the ad. */
  def getDestinationPage(): String = js.native
  
  /** Returns the display URL of the ad. */
  def getDisplayUrl(): String = js.native
  
  /** Returns the type of this entity as a String, in this case, "VideoAd". */
  def getEntityType(): String = js.native
  
  /** Returns the headline of the ad. */
  def getHeadline(): String = js.native
  
  /** Returns the ID of the ad. */
  def getId(): Double = js.native
  
  /** Returns the ad name. */
  def getName(): String = js.native
  
  /** Returns the policy approval status of the ad. */
  def getPolicyApprovalStatus(): String = js.native
  
  /** Returns the list of policy topics associated with the ad. */
  def getPolicyTopics(): js.Array[PolicyTopic] = js.native
  
  /** Returns the type of the ad. */
  def getType(): String = js.native
  
  /** Returns the video ad group to which this video ad belongs. */
  def getVideoAdGroup(): VideoAdGroup = js.native
  
  /** Returns the video campaign to which this video ad belongs. */
  def getVideoCampaign(): VideoCampaign = js.native
  
  /** Returns the video ID of the ad. */
  def getVideoId(): String = js.native
  
  /** Returns true if the video ad is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the video ad is paused. */
  def isPaused(): Boolean = js.native
  
  /** Creates a selector of all labels applied to the video ad. */
  def labels(): LabelSelector = js.native
  
  /** Pauses the video ad. */
  def pause(): Unit = js.native
  
  /** Removes the video ad. */
  def remove(): Unit = js.native
  
  /** Removes a label from the video ad. */
  def removeLabel(name: String): Unit = js.native
  
  /** Provides access to this ad's URL fields. */
  def urls(): VideoAdUrls = js.native
}
