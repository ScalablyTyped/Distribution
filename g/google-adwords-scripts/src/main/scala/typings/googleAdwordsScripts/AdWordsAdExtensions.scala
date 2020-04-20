package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsAdExtensions extends AdGroupExtensions {
  def newCalloutBuilder(): CalloutBuilder[Callout]
  def newMessageBuilder(): MessageBuilder[Message]
  def newMobileAppBuilder(): MobileAppBuilder[MobileApp]
  def newPhoneNumberBuilder(): PhoneNumberBuilder[PhoneNumber]
  def newReviewBuilder(): ReviewBuilder[Review]
  def newSitelinkBuilder(): SitelinkBuilder[Sitelink]
  def newSnippetBuilder(): SnippetBuilder[Snippet]
}

object AdWordsAdExtensions {
  @scala.inline
  def apply(
    callouts: () => AdWordsSelector[Callout],
    message: () => AdWordsSelector[Message],
    mobileApps: () => AdWordsSelector[MobileApp],
    newCalloutBuilder: () => CalloutBuilder[Callout],
    newMessageBuilder: () => MessageBuilder[Message],
    newMobileAppBuilder: () => MobileAppBuilder[MobileApp],
    newPhoneNumberBuilder: () => PhoneNumberBuilder[PhoneNumber],
    newReviewBuilder: () => ReviewBuilder[Review],
    newSitelinkBuilder: () => SitelinkBuilder[Sitelink],
    newSnippetBuilder: () => SnippetBuilder[Snippet],
    phoneNumbers: () => AdWordsSelector[PhoneNumber],
    reviews: () => AdWordsSelector[Review],
    sitelinks: () => AdWordsSelector[Sitelink],
    snippets: () => AdWordsSelector[Snippet]
  ): AdWordsAdExtensions = {
    val __obj = js.Dynamic.literal(callouts = js.Any.fromFunction0(callouts), message = js.Any.fromFunction0(message), mobileApps = js.Any.fromFunction0(mobileApps), newCalloutBuilder = js.Any.fromFunction0(newCalloutBuilder), newMessageBuilder = js.Any.fromFunction0(newMessageBuilder), newMobileAppBuilder = js.Any.fromFunction0(newMobileAppBuilder), newPhoneNumberBuilder = js.Any.fromFunction0(newPhoneNumberBuilder), newReviewBuilder = js.Any.fromFunction0(newReviewBuilder), newSitelinkBuilder = js.Any.fromFunction0(newSitelinkBuilder), newSnippetBuilder = js.Any.fromFunction0(newSnippetBuilder), phoneNumbers = js.Any.fromFunction0(phoneNumbers), reviews = js.Any.fromFunction0(reviews), sitelinks = js.Any.fromFunction0(sitelinks), snippets = js.Any.fromFunction0(snippets))
    __obj.asInstanceOf[AdWordsAdExtensions]
  }
}

