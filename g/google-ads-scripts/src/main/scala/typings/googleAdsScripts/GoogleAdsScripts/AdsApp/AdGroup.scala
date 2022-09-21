package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.StatsFor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Google Ads ad group. */
@js.native
trait AdGroup
  extends StObject
     with StatsFor {
  
  /** Creates a selector of all ad params in the ad group. */
  def adParams(): AdParamSelector = js.native
  
  /** Adds a callout to this ad group. */
  def addCallout(calloutExtension: Callout): CalloutOperation = js.native
  
  /** Adds a message to this ad group. */
  def addMessage(messageExtension: Message): MessageOperation = js.native
  
  /** Adds a mobile app to this ad group. */
  def addMobileApp(mobileAppExtension: MobileApp): MobileAppOperation = js.native
  
  /** Adds a phone number to this ad group. */
  def addPhoneNumber(phoneNumberExtension: PhoneNumber): PhoneNumberOperation = js.native
  
  /** Adds a price extension to this ad group. */
  def addPrice(priceExtension: Price): PriceOperation = js.native
  
  /** Adds a sitelink to this ad group. */
  def addSitelink(sitelinkExtension: Sitelink): SitelinkOperation = js.native
  
  /** Adds a snippet to this ad group. */
  def addSnippet(snippetExtension: Snippet): SnippetOperation = js.native
  
  /** Returns the selector of all ads in the ad group. */
  def ads(): AdSelector = js.native
  
  /** Applies a label to the ad group. */
  def applyLabel(name: String): Unit = js.native
  
  /** Provides access to this ad group's bidding fields. */
  def bidding(): AdGroupBidding = js.native
  
  /**
    * Clears the mobile bid modifier for this ad group.
    *
    * @deprecated **Deprecated**. Google Ads Scripts now supports desktop and tablet ad group bid modifiers in addition to mobile.
    * This functionality is available in the AdGroupDevices class, accessible via the AdGroup.devices method.
    */
  def clearMobileBidModifier(): Unit = js.native
  
  /** Creates a new negative keyword with the specified text. */
  def createNegativeKeyword(keywordText: String): Unit = js.native
  
  /** Returns an AdGroupDevices instance associated with the ad group. */
  def devices(): AdGroupDevices = js.native
  
  /**
    * Provides access to this ad group's display criteria: Audience, ExcludedAudience, DisplayKeyword, ExcludedDisplayKeyword, Placement, ExcludedPlacement,
    * Topic, and ExcludedTopic.
    */
  def display(): AdGroupDisplay = js.native
  
  /** Enables the ad group. */
  def enable(): Unit = js.native
  
  /** Provides access to this ad group's extensions: AdGroupCallout, AdGroupMessage, AdGroupMobileApp, AdGroupPhoneNumber, AdGroupSitelink, and AdGroupSnippet. */
  def extensions(): AdGroupExtensions = js.native
  
  /** Returns the base ad group to which this ad group belongs. */
  def getBaseAdGroup(): AdGroup = js.native
  
  /** Returns the base campaign to which this ad group belongs. */
  def getBaseCampaign(): Campaign = js.native
  
  /** Returns the campaign to which this ad group belongs or null if it does not belong to a search or display campaign. */
  def getCampaign(): Campaign = js.native
  
  /** Returns the type of this entity as a String, in this case, "AdGroup". */
  def getEntityType(): String = js.native
  
  /** Returns the ID of the ad group. */
  def getId(): Double = js.native
  
  /**
    * Returns the mobile bid modifier for this ad group.
    *
    * **Deprecated**. Google Ads Scripts now supports desktop and tablet ad group bid modifiers in addition to mobile.
    * This functionality is available in the AdGroupDevices class, accessible via the AdGroup.devices method.
    */
  def getMobileBidModifier(): Double = js.native
  
  /** Returns the name of the ad group. */
  def getName(): String = js.native
  
  /** Returns true if the ad group is enabled. */
  def isEnabled(): Boolean = js.native
  
  /** Returns true if the ad group is paused. */
  def isPaused(): Boolean = js.native
  
  /** Returns true if the ad group is removed. */
  def isRemoved(): Boolean = js.native
  
  /** Returns the selector of all keywords in the ad group. */
  def keywords(): KeywordSelector = js.native
  
  /** 	Creates a selector of all labels applied to the ad group. */
  def labels(): LabelSelector = js.native
  
  /** Returns a selector of all negative keywords in the ad group. */
  def negativeKeywords(): NegativeKeywordSelector = js.native
  
  /** Returns a new ad builder space associated with this ad group. */
  def newAd(): AdBuilderSpace = js.native
  
  /** Returns a new keyword builder associated with this ad group. */
  def newKeywordBuilder(): KeywordBuilder = js.native
  
  /** Pauses the ad group. */
  def pause(): Unit = js.native
  
  /** Removes a callout extension from this ad group. */
  def removeCallout(calloutExtension: Callout): Unit = js.native
  
  /** Removes a label from the ad group. */
  def removeLabel(name: String): Unit = js.native
  
  /** Removes a message extension from this ad group. */
  def removeMessage(messageExtension: Message): Unit = js.native
  
  /** Removes a mobile app extension from this ad group. */
  def removeMobileApp(mobileAppExtension: MobileApp): Unit = js.native
  
  /** Removes a phone number extension from this ad group. */
  def removePhoneNumber(phoneNumberExtension: PhoneNumber): Unit = js.native
  
  /** Removes a price extension from this ad group. */
  def removePrice(priceExtension: Price): Unit = js.native
  
  /** Removes a sitelink extension from this ad group. */
  def removeSitelink(sitelinkExtension: Sitelink): Unit = js.native
  
  /** Removes a snippet extension from this ad group. */
  def removeSnippet(snippetExtension: Snippet): Unit = js.native
  
  /**
    * Sets the mobile bid modifier for this ad group to the specified value.
    *
    * @deprecated **Deprecated**. Google Ads Scripts now supports desktop and tablet ad group bid modifiers in addition to mobile.
    * This functionality is available in the AdGroupDevices class, accessible via the AdGroup.devices method.
    */
  def setMobileBidModifier(modifier: Double): Unit = js.native
  
  /** Sets the name of the ad group. */
  def setName(name: String): Unit = js.native
  
  /** Provides access to ad group-level targeting criteria: audiences. */
  def targeting(): AdGroupTargeting = js.native
  
  /** Provides access to this ad group's URL fields. */
  def urls(): AdGroupUrls = js.native
}
