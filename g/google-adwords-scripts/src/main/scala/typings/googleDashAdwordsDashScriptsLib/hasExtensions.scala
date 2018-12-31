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

