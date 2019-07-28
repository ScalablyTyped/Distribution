package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasExtensions extends js.Object {
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
}

