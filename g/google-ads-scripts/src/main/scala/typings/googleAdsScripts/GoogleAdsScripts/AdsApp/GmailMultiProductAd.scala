package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Gmail multi-product ad. */
@js.native
trait GmailMultiProductAd
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
  
  /** Returns the calls to action for the ad's six items. */
  def getItemButtonCallsToAction(): js.Array[String] = js.native
  
  /** Returns the button colors for the ad's six items. */
  def getItemButtonColors(): js.Array[String] = js.native
  
  /** Returns the mobile final URLs for the ad's six item buttons. */
  def getItemButtonFinalMobileUrls(): js.Array[String] = js.native
  
  /** Returns the final URLs for the ad's six item buttons. */
  def getItemButtonFinalUrls(): js.Array[String] = js.native
  
  /** Returns the button text colors for the ad's six items. */
  def getItemButtonTextColors(): js.Array[String] = js.native
  
  /** Returns the tracking templates for the ad's six item buttons. */
  def getItemButtonTrackingTemplates(): js.Array[String] = js.native
  
  /** Returns the images for the ad's six items. */
  def getItemImages(): js.Array[Media] = js.native
  
  /** Returns the title colors for the ad's six items. */
  def getItemTitleColors(): js.Array[String] = js.native
  
  /** Returns the titles for the ad's six items. */
  def getItemTitles(): js.Array[String] = js.native
  
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
