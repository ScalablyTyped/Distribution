package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Gmail single promotion ad. */
@js.native
trait GmailSinglePromotionAd
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
  
  /** Returns the advertiser shown in the ad. */
  def getAdvertiser(): String = js.native
  
  /** Returns the call to action of the ad. */
  def getCallToAction(): String = js.native
  
  /** Returns the call to action button color hex code of the ad. */
  def getCallToActionButtonColor(): String = js.native
  
  /** Returns the call to action text color hex code of the ad. */
  def getCallToActionTextColor(): String = js.native
  
  /** Returns the campaign to which this ad belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign = js.native
  
  /** Returns the content of the ad. */
  def getContent(): String = js.native
  
  /** Returns the description of the ad. */
  def getDescription(): String = js.native
  
  /** Returns the type of this entity as a String, in this case, "Ad". */
  def getEntityType(): String = js.native
  
  /** Returns the ad's header image. */
  def getHeader(): Media = js.native
  
  /** Returns the headline of the ad. */
  def getHeadline(): String = js.native
  
  /** Returns the headline color hex code of the ad. */
  def getHeadlineColor(): String = js.native
  
  /** Returns the ID of the ad. */
  def getId(): Double = js.native
  
  /** Returns the ad's image. */
  def getImage(): Media = js.native
  
  /** Returns the ad's logo image. */
  def getLogo(): Media = js.native
  
  /** Returns the name of the ad. */
  def getName(): String = js.native
  
  /** Returns the policy approval status of the ad. */
  def getPolicyApprovalStatus(): String = js.native
  
  /** Returns the list of policy topics associated with the ad. */
  def getPolicyTopics(): js.Array[PolicyTopic] = js.native
  
  /** Returns the subject of the ad. */
  def getSubject(): String = js.native
  
  /** Returns the type of the ad. */
  def getType(): String = js.native
  
  /** Returns true if the ad is enabled. */
  def isEnabled(): Boolean = js.native
  
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
