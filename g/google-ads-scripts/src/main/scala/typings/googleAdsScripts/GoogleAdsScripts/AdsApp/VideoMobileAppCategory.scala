package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads Mobile App Category in a Video Campaign. */
@js.native
trait VideoMobileAppCategory
  extends StObject
     with StatsFor {
  
  /** Provides access to bidding fields of this video mobile application category. */
  def bidding(): VideoCriterionBidding = js.native
  
  /** Returns the type of this entity as a String, in this case, "VideoMobileAppCategory". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the video mobile application category. */
  def getId(): Double = js.native
  
  /** Returns the ID of the mobile application category. */
  def getMobileAppCategoryId(): Double = js.native
  
  /** Returns the ad group to which this video mobile application category belongs. */
  def getVideoAdGroup(): VideoAdGroup = js.native
  
  /** Returns the campaign to which this video mobile application category belongs. */
  def getVideoCampaign(): VideoCampaign = js.native
  
  /** Returns true if the video mobile application category is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the mobile application category is managed. */
  def isManaged(): Boolean = js.native
  
  /** Returns true if the video mobile application category is paused. */
  def isPaused(): Boolean = js.native
  
  /** Removes the video mobile application category. */
  def remove(): Unit = js.native
}
