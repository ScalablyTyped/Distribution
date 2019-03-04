package typings
package googleDashAdwordsDashScriptsLib

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
  def removeCallout(calloutExtension: Callout): scala.Unit
  def removeMessage(messageExtension: Message): scala.Unit
  def removeMobileApp(mobileAppExtension: MobileApp): scala.Unit
  def removePhoneNumber(phoneNumberExtension: PhoneNumber): scala.Unit
  def removeReview(reviewExtension: Review): scala.Unit
  def removeSitelink(sitelinkExtension: Sitelink): scala.Unit
  def removeSnippet(snippetExtension: Snippet): scala.Unit
}

object hasExtensions {
  @scala.inline
  def apply(
    addCallout: js.Function1[Callout, AdWordsOperation[Callout]],
    addMessage: js.Function1[Message, AdWordsOperation[Message]],
    addMobileApp: js.Function1[MobileApp, AdWordsOperation[MobileApp]],
    addPhoneNumber: js.Function1[PhoneNumber, AdWordsOperation[PhoneNumber]],
    addReview: js.Function1[Review, AdWordsOperation[Review]],
    addSitelink: js.Function1[Sitelink, AdWordsOperation[Sitelink]],
    addSnippet: js.Function1[Snippet, AdWordsOperation[Snippet]],
    removeCallout: js.Function1[Callout, scala.Unit],
    removeMessage: js.Function1[Message, scala.Unit],
    removeMobileApp: js.Function1[MobileApp, scala.Unit],
    removePhoneNumber: js.Function1[PhoneNumber, scala.Unit],
    removeReview: js.Function1[Review, scala.Unit],
    removeSitelink: js.Function1[Sitelink, scala.Unit],
    removeSnippet: js.Function1[Snippet, scala.Unit]
  ): hasExtensions = {
    val __obj = js.Dynamic.literal(addCallout = addCallout, addMessage = addMessage, addMobileApp = addMobileApp, addPhoneNumber = addPhoneNumber, addReview = addReview, addSitelink = addSitelink, addSnippet = addSnippet, removeCallout = removeCallout, removeMessage = removeMessage, removeMobileApp = removeMobileApp, removePhoneNumber = removePhoneNumber, removeReview = removeReview, removeSitelink = removeSitelink, removeSnippet = removeSnippet)
  
    __obj.asInstanceOf[hasExtensions]
  }
}

