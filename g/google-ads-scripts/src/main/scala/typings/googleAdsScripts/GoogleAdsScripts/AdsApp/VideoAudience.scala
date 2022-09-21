package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads Audience in a Video Campaign. */
@js.native
trait VideoAudience
  extends StObject
     with StatsFor {
  
  /** Provides access to bidding fields of this video audience. */
  def bidding(): VideoCriterionBidding = js.native
  
  /** Returns the audience ID of the audience. */
  def getAudienceId(): Double = js.native
  
  /** Returns the type of the audience. */
  def getAudienceType(): String = js.native
  
  /** Returns the type of this entity as a String, in this case, "VideoAudience". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the video audience. */
  def getId(): Double = js.native
  
  /** Returns the name of the audience. */
  def getName(): String = js.native
  
  /** Returns the ad group to which this video audience belongs. */
  def getVideoAdGroup(): VideoAdGroup = js.native
  
  /** Returns the campaign to which this video audience belongs. */
  def getVideoCampaign(): VideoCampaign = js.native
  
  /** Returns true if the video audience is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the video audience is paused. */
  def isPaused(): Boolean = js.native
  
  /** Removes the video audience. */
  def remove(): Unit = js.native
}
