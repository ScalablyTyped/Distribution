package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads keyword. */
@js.native
trait Keyword
  extends StObject
     with StatsFor {
  
  /** Creates a selector of all ad params belonging to this keyword. */
  def adParams(): AdParamSelector = js.native
  
  /** Applies a label to the keyword. */
  def applyLabel(name: String): Unit = js.native
  
  /** Provides access to this keyword's bidding fields. */
  def bidding(): KeywordBidding = js.native
  
  /** Clears the destination URL of the keyword. */
  def clearDestinationUrl(): Unit = js.native
  
  /** Enables the keyword. */
  def enable(): Unit = js.native
  
  /** Returns the ad group to which this keyword belongs. */
  def getAdGroup(): AdGroup = js.native
  
  /** Returns the approval status of the keyword. */
  def getApprovalStatus(): String = js.native
  
  /** Returns the base ad group to which this keyword belongs. */
  def getBaseAdGroup(): AdGroup = js.native
  
  /** Returns the base campaign to which this keyword belongs. */
  def getBaseCampaign(): Campaign = js.native
  
  /** Returns the campaign to which this keyword belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign = js.native
  
  /** Returns the type of this entity as a String, in this case, "Keyword". */
  def getEntityType(): String = js.native
  
  /** Returns the first page cpc for the keyword. */
  def getFirstPageCpc(): Double = js.native
  
  /** Returns the ID of the keyword. */
  def getId(): Double = js.native
  
  /** Returns the match type of the keyword. */
  def getMatchType(): String = js.native
  
  /** Returns the quality score of the keyword, in 1..10 range. */
  def getQualityScore(): Double = js.native
  
  /** Returns the text of the keyword. */
  def getText(): String = js.native
  
  /** Returns the top of page cpc for the keyword. */
  def getTopOfPageCpc(): Double = js.native
  
  /** Returns true if the keyword is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the keyword is paused. */
  def isPaused(): Boolean = js.native
  
  /** Creates a selector of all labels applied to the keyword. */
  def labels(): LabelSelector = js.native
  
  /** Pauses the keyword. */
  def pause(): Unit = js.native
  
  /** Removes the keyword. */
  def remove(): Unit = js.native
  
  /** Removes a label from the keyword. */
  def removeLabel(name: String): Unit = js.native
  
  /** Creates an ad param for this keyword with the specified index and insertion text. */
  def setAdParam(index: Double, insertionText: String): Unit = js.native
  
  /** Provides access to this keyword's URL fields. */
  def urls(): KeywordUrls = js.native
}
