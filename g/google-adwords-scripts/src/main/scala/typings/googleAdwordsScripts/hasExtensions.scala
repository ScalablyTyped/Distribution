package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hasExtensions extends StObject {
  
  def addCallout(calloutExtension: Callout): AdWordsOperation[Callout]
  
  def addMessage(messageExtension: Message): AdWordsOperation[Message]
  
  def addMobileApp(mobileAppExtension: MobileApp): AdWordsOperation[MobileApp]
  
  def addPhoneNumber(phoneNumberExtension: PhoneNumber): AdWordsOperation[PhoneNumber]
  
  def addReview(reviewExtension: Review): AdWordsOperation[Review]
  
  def addSitelink(sitelinkExtension: Sitelink): AdWordsOperation[Sitelink]
  
  def addSnippet(snippetExtension: Snippet): AdWordsOperation[Snippet]
  
  def removeCallout(calloutExtension: Callout): Unit
  
  def removeMessage(messageExtension: Message): Unit
  
  def removeMobileApp(mobileAppExtension: MobileApp): Unit
  
  def removePhoneNumber(phoneNumberExtension: PhoneNumber): Unit
  
  def removeReview(reviewExtension: Review): Unit
  
  def removeSitelink(sitelinkExtension: Sitelink): Unit
  
  def removeSnippet(snippetExtension: Snippet): Unit
}
object hasExtensions {
  
  @scala.inline
  def apply(
    addCallout: Callout => AdWordsOperation[Callout],
    addMessage: Message => AdWordsOperation[Message],
    addMobileApp: MobileApp => AdWordsOperation[MobileApp],
    addPhoneNumber: PhoneNumber => AdWordsOperation[PhoneNumber],
    addReview: Review => AdWordsOperation[Review],
    addSitelink: Sitelink => AdWordsOperation[Sitelink],
    addSnippet: Snippet => AdWordsOperation[Snippet],
    removeCallout: Callout => Unit,
    removeMessage: Message => Unit,
    removeMobileApp: MobileApp => Unit,
    removePhoneNumber: PhoneNumber => Unit,
    removeReview: Review => Unit,
    removeSitelink: Sitelink => Unit,
    removeSnippet: Snippet => Unit
  ): hasExtensions = {
    val __obj = js.Dynamic.literal(addCallout = js.Any.fromFunction1(addCallout), addMessage = js.Any.fromFunction1(addMessage), addMobileApp = js.Any.fromFunction1(addMobileApp), addPhoneNumber = js.Any.fromFunction1(addPhoneNumber), addReview = js.Any.fromFunction1(addReview), addSitelink = js.Any.fromFunction1(addSitelink), addSnippet = js.Any.fromFunction1(addSnippet), removeCallout = js.Any.fromFunction1(removeCallout), removeMessage = js.Any.fromFunction1(removeMessage), removeMobileApp = js.Any.fromFunction1(removeMobileApp), removePhoneNumber = js.Any.fromFunction1(removePhoneNumber), removeReview = js.Any.fromFunction1(removeReview), removeSitelink = js.Any.fromFunction1(removeSitelink), removeSnippet = js.Any.fromFunction1(removeSnippet))
    __obj.asInstanceOf[hasExtensions]
  }
  
  @scala.inline
  implicit class hasExtensionsMutableBuilder[Self <: hasExtensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddCallout(value: Callout => AdWordsOperation[Callout]): Self = StObject.set(x, "addCallout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddMessage(value: Message => AdWordsOperation[Message]): Self = StObject.set(x, "addMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddMobileApp(value: MobileApp => AdWordsOperation[MobileApp]): Self = StObject.set(x, "addMobileApp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddPhoneNumber(value: PhoneNumber => AdWordsOperation[PhoneNumber]): Self = StObject.set(x, "addPhoneNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddReview(value: Review => AdWordsOperation[Review]): Self = StObject.set(x, "addReview", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddSitelink(value: Sitelink => AdWordsOperation[Sitelink]): Self = StObject.set(x, "addSitelink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddSnippet(value: Snippet => AdWordsOperation[Snippet]): Self = StObject.set(x, "addSnippet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveCallout(value: Callout => Unit): Self = StObject.set(x, "removeCallout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveMessage(value: Message => Unit): Self = StObject.set(x, "removeMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveMobileApp(value: MobileApp => Unit): Self = StObject.set(x, "removeMobileApp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemovePhoneNumber(value: PhoneNumber => Unit): Self = StObject.set(x, "removePhoneNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveReview(value: Review => Unit): Self = StObject.set(x, "removeReview", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSitelink(value: Sitelink => Unit): Self = StObject.set(x, "removeSitelink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSnippet(value: Snippet => Unit): Self = StObject.set(x, "removeSnippet", js.Any.fromFunction1(value))
  }
}
