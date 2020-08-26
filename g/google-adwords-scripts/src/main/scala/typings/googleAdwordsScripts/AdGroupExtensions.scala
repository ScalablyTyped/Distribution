package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdGroupExtensions extends AccountExtensions {
  def phoneNumbers(): AdWordsSelector[PhoneNumber] = js.native
}

object AdGroupExtensions {
  @scala.inline
  def apply(
    callouts: () => AdWordsSelector[Callout],
    message: () => AdWordsSelector[Message],
    mobileApps: () => AdWordsSelector[MobileApp],
    phoneNumbers: () => AdWordsSelector[PhoneNumber],
    reviews: () => AdWordsSelector[Review],
    sitelinks: () => AdWordsSelector[Sitelink],
    snippets: () => AdWordsSelector[Snippet]
  ): AdGroupExtensions = {
    val __obj = js.Dynamic.literal(callouts = js.Any.fromFunction0(callouts), message = js.Any.fromFunction0(message), mobileApps = js.Any.fromFunction0(mobileApps), phoneNumbers = js.Any.fromFunction0(phoneNumbers), reviews = js.Any.fromFunction0(reviews), sitelinks = js.Any.fromFunction0(sitelinks), snippets = js.Any.fromFunction0(snippets))
    __obj.asInstanceOf[AdGroupExtensions]
  }
  @scala.inline
  implicit class AdGroupExtensionsOps[Self <: AdGroupExtensions] (val x: Self) extends AnyVal {
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
    def setPhoneNumbers(value: () => AdWordsSelector[PhoneNumber]): Self = this.set("phoneNumbers", js.Any.fromFunction0(value))
  }
  
}

