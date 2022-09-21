package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountExtensions extends StObject {
  
  /** Returns the selector of all callouts to the account. */
  def callouts(): AccountCalloutSelector
  
  /** Returns the selector of all messages to the account. */
  def messages(): AccountMessageSelector
  
  /** Returns the selector of all mobile apps to the account. */
  def mobileApps(): AccountMobileAppSelector
  
  /** Returns the selector of all phone numbers to the account. */
  def phoneNumbers(): AccountPhoneNumberSelector
  
  /** Returns the selector of all prices to the account. */
  def prices(): AccountPriceSelector
  
  /** Returns the selector of all sitelinks to the account. */
  def sitelinks(): AccountSitelinkSelector
  
  /** Returns the selector of all snippets to the account. */
  def snippets(): AccountSnippetSelector
}
object AccountExtensions {
  
  inline def apply(
    callouts: () => AccountCalloutSelector,
    messages: () => AccountMessageSelector,
    mobileApps: () => AccountMobileAppSelector,
    phoneNumbers: () => AccountPhoneNumberSelector,
    prices: () => AccountPriceSelector,
    sitelinks: () => AccountSitelinkSelector,
    snippets: () => AccountSnippetSelector
  ): AccountExtensions = {
    val __obj = js.Dynamic.literal(callouts = js.Any.fromFunction0(callouts), messages = js.Any.fromFunction0(messages), mobileApps = js.Any.fromFunction0(mobileApps), phoneNumbers = js.Any.fromFunction0(phoneNumbers), prices = js.Any.fromFunction0(prices), sitelinks = js.Any.fromFunction0(sitelinks), snippets = js.Any.fromFunction0(snippets))
    __obj.asInstanceOf[AccountExtensions]
  }
  
  extension [Self <: AccountExtensions](x: Self) {
    
    inline def setCallouts(value: () => AccountCalloutSelector): Self = StObject.set(x, "callouts", js.Any.fromFunction0(value))
    
    inline def setMessages(value: () => AccountMessageSelector): Self = StObject.set(x, "messages", js.Any.fromFunction0(value))
    
    inline def setMobileApps(value: () => AccountMobileAppSelector): Self = StObject.set(x, "mobileApps", js.Any.fromFunction0(value))
    
    inline def setPhoneNumbers(value: () => AccountPhoneNumberSelector): Self = StObject.set(x, "phoneNumbers", js.Any.fromFunction0(value))
    
    inline def setPrices(value: () => AccountPriceSelector): Self = StObject.set(x, "prices", js.Any.fromFunction0(value))
    
    inline def setSitelinks(value: () => AccountSitelinkSelector): Self = StObject.set(x, "sitelinks", js.Any.fromFunction0(value))
    
    inline def setSnippets(value: () => AccountSnippetSelector): Self = StObject.set(x, "snippets", js.Any.fromFunction0(value))
  }
}
