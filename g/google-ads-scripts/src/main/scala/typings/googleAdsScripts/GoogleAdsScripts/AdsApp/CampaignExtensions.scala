package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignExtensions extends StObject {
  
  /** Returns the selector of all callouts to the campaign. */
  def callouts(): CampaignCalloutSelector
  
  /** Returns the selector of all messages to the campaign. */
  def messages(): CampaignMessageSelector
  
  /** Returns the selector of all mobile apps to the campaign. */
  def mobileApps(): CampaignMobileAppSelector
  
  /** Returns the selector of all phone numbers to the campaign. */
  def phoneNumbers(): CampaignPhoneNumberSelector
  
  /** Returns the selector of all prices to the campaign. */
  def prices(): CampaignPriceSelector
  
  /** Returns the selector of all sitelinks to the campaign. */
  def sitelinks(): CampaignSitelinkSelector
  
  /** Returns the selector of all snippets to the campaign. */
  def snippets(): CampaignSnippetSelector
}
object CampaignExtensions {
  
  inline def apply(
    callouts: () => CampaignCalloutSelector,
    messages: () => CampaignMessageSelector,
    mobileApps: () => CampaignMobileAppSelector,
    phoneNumbers: () => CampaignPhoneNumberSelector,
    prices: () => CampaignPriceSelector,
    sitelinks: () => CampaignSitelinkSelector,
    snippets: () => CampaignSnippetSelector
  ): CampaignExtensions = {
    val __obj = js.Dynamic.literal(callouts = js.Any.fromFunction0(callouts), messages = js.Any.fromFunction0(messages), mobileApps = js.Any.fromFunction0(mobileApps), phoneNumbers = js.Any.fromFunction0(phoneNumbers), prices = js.Any.fromFunction0(prices), sitelinks = js.Any.fromFunction0(sitelinks), snippets = js.Any.fromFunction0(snippets))
    __obj.asInstanceOf[CampaignExtensions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CampaignExtensions] (val x: Self) extends AnyVal {
    
    inline def setCallouts(value: () => CampaignCalloutSelector): Self = StObject.set(x, "callouts", js.Any.fromFunction0(value))
    
    inline def setMessages(value: () => CampaignMessageSelector): Self = StObject.set(x, "messages", js.Any.fromFunction0(value))
    
    inline def setMobileApps(value: () => CampaignMobileAppSelector): Self = StObject.set(x, "mobileApps", js.Any.fromFunction0(value))
    
    inline def setPhoneNumbers(value: () => CampaignPhoneNumberSelector): Self = StObject.set(x, "phoneNumbers", js.Any.fromFunction0(value))
    
    inline def setPrices(value: () => CampaignPriceSelector): Self = StObject.set(x, "prices", js.Any.fromFunction0(value))
    
    inline def setSitelinks(value: () => CampaignSitelinkSelector): Self = StObject.set(x, "sitelinks", js.Any.fromFunction0(value))
    
    inline def setSnippets(value: () => CampaignSnippetSelector): Self = StObject.set(x, "snippets", js.Any.fromFunction0(value))
  }
}
