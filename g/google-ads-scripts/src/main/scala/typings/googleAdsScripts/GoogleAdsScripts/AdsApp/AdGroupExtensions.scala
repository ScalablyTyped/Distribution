package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdGroupExtensions extends StObject {
  
  /** Returns the selector of all callouts to the ad group. */
  def callouts(): AdGroupCalloutSelector
  
  /** Returns the selector of all messages to the ad group. */
  def messages(): AdGroupMessageSelector
  
  /** Returns the selector of all mobile apps to the ad group. */
  def mobileApps(): AdGroupMobileAppSelector
  
  /** Returns the selector of all phone numbers to the ad group. */
  def phoneNumbers(): AdGroupPhoneNumberSelector
  
  /** Returns the selector of all prices to the ad group. */
  def prices(): AdGroupPriceSelector
  
  /** Returns the selector of all sitelinks to the ad group. */
  def sitelinks(): AdGroupSitelinkSelector
  
  /** Returns the selector of all snippets to the ad group. */
  def snippets(): AdGroupSnippetSelector
}
object AdGroupExtensions {
  
  inline def apply(
    callouts: () => AdGroupCalloutSelector,
    messages: () => AdGroupMessageSelector,
    mobileApps: () => AdGroupMobileAppSelector,
    phoneNumbers: () => AdGroupPhoneNumberSelector,
    prices: () => AdGroupPriceSelector,
    sitelinks: () => AdGroupSitelinkSelector,
    snippets: () => AdGroupSnippetSelector
  ): AdGroupExtensions = {
    val __obj = js.Dynamic.literal(callouts = js.Any.fromFunction0(callouts), messages = js.Any.fromFunction0(messages), mobileApps = js.Any.fromFunction0(mobileApps), phoneNumbers = js.Any.fromFunction0(phoneNumbers), prices = js.Any.fromFunction0(prices), sitelinks = js.Any.fromFunction0(sitelinks), snippets = js.Any.fromFunction0(snippets))
    __obj.asInstanceOf[AdGroupExtensions]
  }
  
  extension [Self <: AdGroupExtensions](x: Self) {
    
    inline def setCallouts(value: () => AdGroupCalloutSelector): Self = StObject.set(x, "callouts", js.Any.fromFunction0(value))
    
    inline def setMessages(value: () => AdGroupMessageSelector): Self = StObject.set(x, "messages", js.Any.fromFunction0(value))
    
    inline def setMobileApps(value: () => AdGroupMobileAppSelector): Self = StObject.set(x, "mobileApps", js.Any.fromFunction0(value))
    
    inline def setPhoneNumbers(value: () => AdGroupPhoneNumberSelector): Self = StObject.set(x, "phoneNumbers", js.Any.fromFunction0(value))
    
    inline def setPrices(value: () => AdGroupPriceSelector): Self = StObject.set(x, "prices", js.Any.fromFunction0(value))
    
    inline def setSitelinks(value: () => AdGroupSitelinkSelector): Self = StObject.set(x, "sitelinks", js.Any.fromFunction0(value))
    
    inline def setSnippets(value: () => AdGroupSnippetSelector): Self = StObject.set(x, "snippets", js.Any.fromFunction0(value))
  }
}
