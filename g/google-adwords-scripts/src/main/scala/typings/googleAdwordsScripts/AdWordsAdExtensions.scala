package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdWordsAdExtensions extends AdGroupExtensions {
  
  def newCalloutBuilder(): CalloutBuilder[Callout] = js.native
  
  def newMessageBuilder(): MessageBuilder[Message] = js.native
  
  def newMobileAppBuilder(): MobileAppBuilder[MobileApp] = js.native
  
  def newPhoneNumberBuilder(): PhoneNumberBuilder[PhoneNumber] = js.native
  
  def newReviewBuilder(): ReviewBuilder[Review] = js.native
  
  def newSitelinkBuilder(): SitelinkBuilder[Sitelink] = js.native
  
  def newSnippetBuilder(): SnippetBuilder[Snippet] = js.native
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
  
  @scala.inline
  implicit class AdWordsAdExtensionsOps[Self <: AdWordsAdExtensions] (val x: Self) extends AnyVal {
    
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
    def setNewCalloutBuilder(value: () => CalloutBuilder[Callout]): Self = this.set("newCalloutBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewMessageBuilder(value: () => MessageBuilder[Message]): Self = this.set("newMessageBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewMobileAppBuilder(value: () => MobileAppBuilder[MobileApp]): Self = this.set("newMobileAppBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewPhoneNumberBuilder(value: () => PhoneNumberBuilder[PhoneNumber]): Self = this.set("newPhoneNumberBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewReviewBuilder(value: () => ReviewBuilder[Review]): Self = this.set("newReviewBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSitelinkBuilder(value: () => SitelinkBuilder[Sitelink]): Self = this.set("newSitelinkBuilder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSnippetBuilder(value: () => SnippetBuilder[Snippet]): Self = this.set("newSnippetBuilder", js.Any.fromFunction0(value))
  }
}
