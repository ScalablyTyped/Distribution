package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads Mobile Application criterion in a Video Campaign. */
@js.native
trait VideoMobileApplication
  extends StObject
     with StatsFor {
  
  /** Provides access to bidding fields of this video mobile application. */
  def bidding(): VideoCriterionBidding = js.native
  
  /** Returns the ID of the mobile application. */
  def getAppId(): String = js.native
  
  /** Returns the type of this entity as a String, in this case, "VideoMobileApplication". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the video mobile application. */
  def getId(): Double = js.native
  
  /** Returns the mobile application name. */
  def getName(): String = js.native
  
  /** Returns the ad group to which this video mobile application belongs. */
  def getVideoAdGroup(): VideoAdGroup = js.native
  
  /** Returns the campaign to which this video mobile application belongs. */
  def getVideoCampaign(): VideoCampaign = js.native
  
  /** Returns true if the video mobile application is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the mobile application is managed. */
  def isManaged(): Boolean = js.native
  
  /** Returns true if the video mobile application is paused. */
  def isPaused(): Boolean = js.native
  
  /** Removes the video mobile application. */
  def remove(): Unit = js.native
}
