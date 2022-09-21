package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads topic. */
@js.native
trait Topic
  extends StObject
     with StatsFor {
  
  /** Provides access to this audience's bidding fields. */
  def bidding(): DisplayCriterionBidding = js.native
  
  /** Returns the ad group to which this audience belongs. */
  def getAdGroup(): AdGroup = js.native
  
  /** Returns the base ad group to which this audience belongs. */
  def getBaseAdGroup(): AdGroup = js.native
  
  /** Returns the base campaign to which this audience belongs. */
  def getBaseCampaign(): Campaign = js.native
  
  /** Returns the campaign to which this audience belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign = js.native
  
  /** Returns the ID of the audience. */
  def getId(): Double = js.native
  
  /** Returns the topic ID of the topic. */
  def getTopicId(): Double = js.native
  
  /** Returns true if the audience is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the audience is paused. */
  def isPaused(): Boolean = js.native
  
  /** Removes the audience. */
  def remove(): Unit = js.native
}
