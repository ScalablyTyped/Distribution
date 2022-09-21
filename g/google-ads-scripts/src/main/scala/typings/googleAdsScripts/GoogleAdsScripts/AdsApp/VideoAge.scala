package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads Age criterion in a Video Campaign. */
@js.native
trait VideoAge
  extends StObject
     with StatsFor {
  
  /** Provides access to bidding fields of this video age. */
  def bidding(): VideoCriterionBidding = js.native
  
  /** Excludes this video age from the ad group. */
  def exclude(): Unit = js.native
  
  /** Returns the age range. */
  def getAgeRange(): String = js.native
  
  /** Returns the type of this entity as a String, in this case, "VideoAge". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the video age. */
  def getId(): Double = js.native
  
  /** Returns the ad group to which this video age belongs. */
  def getVideoAdGroup(): VideoAdGroup = js.native
  
  /** Returns the campaign to which this video age belongs. */
  def getVideoCampaign(): VideoCampaign = js.native
}
