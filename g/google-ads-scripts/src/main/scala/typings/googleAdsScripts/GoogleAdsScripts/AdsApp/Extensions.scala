package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extensions extends StObject {
  
  /** Returns the selector of all callouts in the account. */
  def callouts(): CalloutSelector
  
  /** Returns the selector of all messages in the account. */
  def messages(): MessageSelector
  
  /** Returns the selector of all mobile apps in the account. */
  def mobileApps(): MobileAppSelector
  
  /** Returns a new callout builder for this account. */
  def newCalloutBuilder(): CalloutBuilder
  
  /** Returns a new message builder for this account. */
  def newMessageBuilder(): MessageBuilder
  
  /** Returns a new mobile app builder for this account. */
  def newMobileAppBuilder(): MobileAppBuilder
  
  /** Returns a new phone number builder for this account. */
  def newPhoneNumberBuilder(): PhoneNumberBuilder
  
  /** Returns a new price builder for this account. */
  def newPriceBuilder(): PriceBuilder
  
  /** Returns a new price item builder for this account. */
  def newPriceItemBuilder(): PriceItemBuilder
  
  /** Returns a new sitelink builder for this account. */
  def newSitelinkBuilder(): SitelinkBuilder
  
  /** Returns a new snippet builder for this account. */
  def newSnippetBuilder(): SnippetBuilder
  
  /** Returns the selector of all phone numbers in the account. */
  def phoneNumbers(): PhoneNumberSelector
  
  /** Returns the selector of all prices in the account. */
  def prices(): PriceSelector
  
  /** Returns the selector of all sitelinks in the account. */
  def sitelinks(): SitelinkSelector
  
  /** Returns the selector of all snippets in the account. */
  def snippets(): SnippetSelector
}
object Extensions {
  
  inline def apply(
    callouts: () => CalloutSelector,
    messages: () => MessageSelector,
    mobileApps: () => MobileAppSelector,
    newCalloutBuilder: () => CalloutBuilder,
    newMessageBuilder: () => MessageBuilder,
    newMobileAppBuilder: () => MobileAppBuilder,
    newPhoneNumberBuilder: () => PhoneNumberBuilder,
    newPriceBuilder: () => PriceBuilder,
    newPriceItemBuilder: () => PriceItemBuilder,
    newSitelinkBuilder: () => SitelinkBuilder,
    newSnippetBuilder: () => SnippetBuilder,
    phoneNumbers: () => PhoneNumberSelector,
    prices: () => PriceSelector,
    sitelinks: () => SitelinkSelector,
    snippets: () => SnippetSelector
  ): Extensions = {
    val __obj = js.Dynamic.literal(callouts = js.Any.fromFunction0(callouts), messages = js.Any.fromFunction0(messages), mobileApps = js.Any.fromFunction0(mobileApps), newCalloutBuilder = js.Any.fromFunction0(newCalloutBuilder), newMessageBuilder = js.Any.fromFunction0(newMessageBuilder), newMobileAppBuilder = js.Any.fromFunction0(newMobileAppBuilder), newPhoneNumberBuilder = js.Any.fromFunction0(newPhoneNumberBuilder), newPriceBuilder = js.Any.fromFunction0(newPriceBuilder), newPriceItemBuilder = js.Any.fromFunction0(newPriceItemBuilder), newSitelinkBuilder = js.Any.fromFunction0(newSitelinkBuilder), newSnippetBuilder = js.Any.fromFunction0(newSnippetBuilder), phoneNumbers = js.Any.fromFunction0(phoneNumbers), prices = js.Any.fromFunction0(prices), sitelinks = js.Any.fromFunction0(sitelinks), snippets = js.Any.fromFunction0(snippets))
    __obj.asInstanceOf[Extensions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Extensions] (val x: Self) extends AnyVal {
    
    inline def setCallouts(value: () => CalloutSelector): Self = StObject.set(x, "callouts", js.Any.fromFunction0(value))
    
    inline def setMessages(value: () => MessageSelector): Self = StObject.set(x, "messages", js.Any.fromFunction0(value))
    
    inline def setMobileApps(value: () => MobileAppSelector): Self = StObject.set(x, "mobileApps", js.Any.fromFunction0(value))
    
    inline def setNewCalloutBuilder(value: () => CalloutBuilder): Self = StObject.set(x, "newCalloutBuilder", js.Any.fromFunction0(value))
    
    inline def setNewMessageBuilder(value: () => MessageBuilder): Self = StObject.set(x, "newMessageBuilder", js.Any.fromFunction0(value))
    
    inline def setNewMobileAppBuilder(value: () => MobileAppBuilder): Self = StObject.set(x, "newMobileAppBuilder", js.Any.fromFunction0(value))
    
    inline def setNewPhoneNumberBuilder(value: () => PhoneNumberBuilder): Self = StObject.set(x, "newPhoneNumberBuilder", js.Any.fromFunction0(value))
    
    inline def setNewPriceBuilder(value: () => PriceBuilder): Self = StObject.set(x, "newPriceBuilder", js.Any.fromFunction0(value))
    
    inline def setNewPriceItemBuilder(value: () => PriceItemBuilder): Self = StObject.set(x, "newPriceItemBuilder", js.Any.fromFunction0(value))
    
    inline def setNewSitelinkBuilder(value: () => SitelinkBuilder): Self = StObject.set(x, "newSitelinkBuilder", js.Any.fromFunction0(value))
    
    inline def setNewSnippetBuilder(value: () => SnippetBuilder): Self = StObject.set(x, "newSnippetBuilder", js.Any.fromFunction0(value))
    
    inline def setPhoneNumbers(value: () => PhoneNumberSelector): Self = StObject.set(x, "phoneNumbers", js.Any.fromFunction0(value))
    
    inline def setPrices(value: () => PriceSelector): Self = StObject.set(x, "prices", js.Any.fromFunction0(value))
    
    inline def setSitelinks(value: () => SitelinkSelector): Self = StObject.set(x, "sitelinks", js.Any.fromFunction0(value))
    
    inline def setSnippets(value: () => SnippetSelector): Self = StObject.set(x, "snippets", js.Any.fromFunction0(value))
  }
}
