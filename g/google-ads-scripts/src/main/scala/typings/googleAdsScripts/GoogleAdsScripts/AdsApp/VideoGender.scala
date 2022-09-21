package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads Gender criterion in a Video Campaign. */
@js.native
trait VideoGender
  extends StObject
     with StatsFor {
  
  /** Provides access to bidding fields of this video gender. */
  def bidding(): VideoCriterionBidding = js.native
  
  /** Excludes this video gender from the ad group. */
  def exclude(): Unit = js.native
  
  /** Returns the type of this entity as a String, in this case, "VideoGender". */
  def getEntityType(): String = js.native
  
  /** Returns the gender type. */
  def getGenderType(): String = js.native
  
  /** Returns the ID of the video gender. */
  def getId(): Double = js.native
  
  /** Returns the ad group to which this video gender belongs. */
  def getVideoAdGroup(): VideoAdGroup = js.native
  
  /** Returns the campaign to which this video gender belongs. */
  def getVideoCampaign(): VideoCampaign = js.native
}
