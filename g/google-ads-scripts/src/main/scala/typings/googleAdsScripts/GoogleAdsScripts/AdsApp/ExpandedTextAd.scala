package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an expanded text ad. */
@js.native
trait ExpandedTextAd
  extends StObject
     with StatsFor {
  
  /** Applies a label to the ad. */
  def applyLabel(name: String): Unit = js.native
  
  /** Returns an AdViewSpace, which provides access to type-specific fields of the ad. */
  def asType(): AdViewSpace = js.native
  
  /** Enables the ad. */
  def enable(): Unit = js.native
  
  /** Returns the ad group to which this ad belongs. */
  def getAdGroup(): AdGroup = js.native
  
  /** Returns the campaign to which this ad belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign = js.native
  
  /** Returns the description of the ad. */
  def getDescription(): String = js.native
  
  /** Returns the first description of the ad. */
  def getDescription1(): String = js.native
  
  /** Returns the second description of the ad, if it has one. */
  def getDescription2(): String = js.native
  
  /** Returns the type of this entity as a String, in this case, "Ad". */
  def getEntityType(): String = js.native
  
  /** Returns the first part of the ad's headline. */
  def getHeadlinePart1(): String = js.native
  
  /** Returns the second part of the ad's headline. */
  def getHeadlinePart2(): String = js.native
  
  /** Returns the third part of the ad's headline, if it has one. */
  def getHeadlinePart3(): String = js.native
  
  /** Returns the ID of the ad. */
  def getId(): Double = js.native
  
  /** Returns the first path that appears with the ad's displayed URL, if it has one. */
  def getPath1(): String = js.native
  
  /** Returns the second path that appears with the ad's displayed URL, if it has one. */
  def getPath2(): String = js.native
  
  /** Returns the policy approval status of the ad. */
  def getPolicyApprovalStatus(): String = js.native
  
  /** Returns the list of policy topics associated with the ad. */
  def getPolicyTopics(): js.Array[PolicyTopic] = js.native
  
  /** Returns the type of the ad. */
  def getType(): String = js.native
  
  /** Returns true if the ad is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the ad specifies mobile device preference or false otherwise. */
  def isMobilePreferred(): Boolean = js.native
  
  /** Returns true if the ad is paused. */
  def isPaused(): Boolean = js.native
  
  /** Returns an AdTypeSpace, which determines the type of the ad. */
  def isType(): AdTypeSpace = js.native
  
  /** Creates a selector of all labels applied to the ad. */
  def labels(): LabelSelector = js.native
  
  /** Pauses the ad. */
  def pause(): Unit = js.native
  
  /** Removes the ad. */
  def remove(): Unit = js.native
  
  /** Removes a label from the ad. */
  def removeLabel(name: String): Unit = js.native
  
  /** Provides access to this ad's URL fields. */
  def urls(): AdUrls = js.native
}
