package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads Parental Status criterion in a Video Campaign. */
@js.native
trait VideoParentalStatus
  extends StObject
     with StatsFor {
  
  /** Provides access to bidding fields of this video parental status. */
  def bidding(): VideoCriterionBidding = js.native
  
  /** Excludes this video parental status from the ad group. */
  def exclude(): Unit = js.native
  
  /** Returns the type of this entity as a String, in this case, "VideoParentalStatus". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the video parental status. */
  def getId(): Double = js.native
  
  /** Returns the parental status type. */
  def getParentType(): String = js.native
  
  /** Returns the ad group to which this video parental status belongs. */
  def getVideoAdGroup(): VideoAdGroup = js.native
  
  /** Returns the campaign to which this video parental status belongs. */
  def getVideoCampaign(): VideoCampaign = js.native
}
