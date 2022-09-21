package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads Keyword in a Video Campaign. */
@js.native
trait VideoKeyword
  extends StObject
     with StatsFor {
  
  /** Provides access to bidding fields of this video keyword. */
  def bidding(): VideoKeywordBidding = js.native
  
  /** Returns the type of this entity as a String, in this case, "VideoKeyword". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the video keyword. */
  def getId(): Double = js.native
  
  /** Returns the text of the display keyword. */
  def getText(): String = js.native
  
  /** Returns the ad group to which this video keyword belongs. */
  def getVideoAdGroup(): VideoAdGroup = js.native
  
  /** Returns the campaign to which this video keyword belongs. */
  def getVideoCampaign(): VideoCampaign = js.native
  
  /** Returns true if the video keyword is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the video keyword is paused. */
  def isPaused(): Boolean = js.native
  
  /** Removes the video keyword. */
  def remove(): Unit = js.native
}
