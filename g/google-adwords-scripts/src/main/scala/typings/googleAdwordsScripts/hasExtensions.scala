package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hasExtensions extends js.Object {
  
  def addCallout(calloutExtension: Callout): AdWordsOperation[Callout] = js.native
  
  def addMessage(messageExtension: Message): AdWordsOperation[Message] = js.native
  
  def addMobileApp(mobileAppExtension: MobileApp): AdWordsOperation[MobileApp] = js.native
  
  def addPhoneNumber(phoneNumberExtension: PhoneNumber): AdWordsOperation[PhoneNumber] = js.native
  
  def addReview(reviewExtension: Review): AdWordsOperation[Review] = js.native
  
  def addSitelink(sitelinkExtension: Sitelink): AdWordsOperation[Sitelink] = js.native
  
  def addSnippet(snippetExtension: Snippet): AdWordsOperation[Snippet] = js.native
  
  def removeCallout(calloutExtension: Callout): Unit = js.native
  
  def removeMessage(messageExtension: Message): Unit = js.native
  
  def removeMobileApp(mobileAppExtension: MobileApp): Unit = js.native
  
  def removePhoneNumber(phoneNumberExtension: PhoneNumber): Unit = js.native
  
  def removeReview(reviewExtension: Review): Unit = js.native
  
  def removeSitelink(sitelinkExtension: Sitelink): Unit = js.native
  
  def removeSnippet(snippetExtension: Snippet): Unit = js.native
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
  implicit class hasExtensionsOps[Self <: hasExtensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddCallout(value: Callout => AdWordsOperation[Callout]): Self = this.set("addCallout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddMessage(value: Message => AdWordsOperation[Message]): Self = this.set("addMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddMobileApp(value: MobileApp => AdWordsOperation[MobileApp]): Self = this.set("addMobileApp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddPhoneNumber(value: PhoneNumber => AdWordsOperation[PhoneNumber]): Self = this.set("addPhoneNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddReview(value: Review => AdWordsOperation[Review]): Self = this.set("addReview", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddSitelink(value: Sitelink => AdWordsOperation[Sitelink]): Self = this.set("addSitelink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddSnippet(value: Snippet => AdWordsOperation[Snippet]): Self = this.set("addSnippet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveCallout(value: Callout => Unit): Self = this.set("removeCallout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveMessage(value: Message => Unit): Self = this.set("removeMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveMobileApp(value: MobileApp => Unit): Self = this.set("removeMobileApp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemovePhoneNumber(value: PhoneNumber => Unit): Self = this.set("removePhoneNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveReview(value: Review => Unit): Self = this.set("removeReview", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSitelink(value: Sitelink => Unit): Self = this.set("removeSitelink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSnippet(value: Snippet => Unit): Self = this.set("removeSnippet", js.Any.fromFunction1(value))
  }
}
