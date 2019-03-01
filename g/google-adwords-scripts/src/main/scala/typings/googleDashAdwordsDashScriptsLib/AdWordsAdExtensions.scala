package typings
package googleDashAdwordsDashScriptsLib

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
    callouts: js.Function0[AdWordsSelector[Callout]],
    message: js.Function0[AdWordsSelector[Message]],
    mobileApps: js.Function0[AdWordsSelector[MobileApp]],
    newCalloutBuilder: js.Function0[CalloutBuilder[Callout]],
    newMessageBuilder: js.Function0[MessageBuilder[Message]],
    newMobileAppBuilder: js.Function0[MobileAppBuilder[MobileApp]],
    newPhoneNumberBuilder: js.Function0[PhoneNumberBuilder[PhoneNumber]],
    newReviewBuilder: js.Function0[ReviewBuilder[Review]],
    newSitelinkBuilder: js.Function0[SitelinkBuilder[Sitelink]],
    newSnippetBuilder: js.Function0[SnippetBuilder[Snippet]],
    phoneNumbers: js.Function0[AdWordsSelector[PhoneNumber]],
    reviews: js.Function0[AdWordsSelector[Review]],
    sitelinks: js.Function0[AdWordsSelector[Sitelink]],
    snippets: js.Function0[AdWordsSelector[Snippet]]
  ): AdWordsAdExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callouts")(callouts)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("mobileApps")(mobileApps)
    __obj.updateDynamic("newCalloutBuilder")(newCalloutBuilder)
    __obj.updateDynamic("newMessageBuilder")(newMessageBuilder)
    __obj.updateDynamic("newMobileAppBuilder")(newMobileAppBuilder)
    __obj.updateDynamic("newPhoneNumberBuilder")(newPhoneNumberBuilder)
    __obj.updateDynamic("newReviewBuilder")(newReviewBuilder)
    __obj.updateDynamic("newSitelinkBuilder")(newSitelinkBuilder)
    __obj.updateDynamic("newSnippetBuilder")(newSnippetBuilder)
    __obj.updateDynamic("phoneNumbers")(phoneNumbers)
    __obj.updateDynamic("reviews")(reviews)
    __obj.updateDynamic("sitelinks")(sitelinks)
    __obj.updateDynamic("snippets")(snippets)
    __obj.asInstanceOf[AdWordsAdExtensions]
  }
}

