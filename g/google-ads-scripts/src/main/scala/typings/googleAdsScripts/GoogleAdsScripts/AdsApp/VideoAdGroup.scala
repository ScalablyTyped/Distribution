package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads video ad group. */
@js.native
trait VideoAdGroup
  extends StObject
     with StatsFor {
  
  /** Applies a label to the video ad group. */
  def applyLabel(name: String): Unit = js.native
  
  /** Provides access to this ad group's bidding fields. */
  def bidding(): VideoAdGroupBidding = js.native
  
  /** Clears the top content bid modifier for this ad group. */
  def clearTopContentBidModifier(): Unit = js.native
  
  /** Provides access to this ad group's device-specific configuration. */
  def devices(): AdGroupDevices = js.native
  
  /** Enables the video ad group. */
  def enable(): Unit = js.native
  
  /** Returns the video ad group type. */
  def getAdGroupType(): String = js.native
  
  /** Returns the type of this entity as a String, in this case, "VideoAdGroup". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the video ad group. */
  def getId(): Double = js.native
  
  /** Returns the name of the ad group. */
  def getName(): String = js.native
  
  /** Returns the top content bid modifier for this ad group. */
  def getTopContentBidModifier(): Double = js.native
  
  /** Returns the campaign to which this video ad group belongs. */
  def getVideoCampaign(): VideoCampaign = js.native
  
  /** Returns true if the video ad group is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the video ad group is paused. */
  def isPaused(): Boolean = js.native
  
  /** Returns true if the ad group is removed. */
  def isRemoved(): Boolean = js.native
  
  /** Creates a selector of all labels applied to the video ad group. */
  def labels(): LabelSelector = js.native
  
  /** Returns a new video ad builder space associated with this ad group. */
  def newVideoAd(): VideoAdBuilderSpace = js.native
  
  /** Pauses the video ad group. */
  def pause(): Unit = js.native
  
  /** Removes a label from the video ad group. */
  def removeLabel(name: String): Unit = js.native
  
  /** Sets the name of the ad group. */
  def setName(name: String): Unit = js.native
  
  /** Sets the top content bid modifier for this ad group to the specified value. */
  def setTopContentBidModifier(modifier: Double): Unit = js.native
  
  /** Returns the selector of all ads in the video ad group. */
  def videoAds(): VideoAdSelector = js.native
  
  /** Provides access to this ad group's video targeting criteria. */
  def videoTargeting(): AdGroupVideoTargeting = js.native
}
