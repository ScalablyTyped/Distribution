package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdGroupExtensions extends AccountExtensions {
  def phoneNumbers(): AdWordsSelector[PhoneNumber]
}

object AdGroupExtensions {
  @scala.inline
  def apply(
    callouts: js.Function0[AdWordsSelector[Callout]],
    message: js.Function0[AdWordsSelector[Message]],
    mobileApps: js.Function0[AdWordsSelector[MobileApp]],
    phoneNumbers: js.Function0[AdWordsSelector[PhoneNumber]],
    reviews: js.Function0[AdWordsSelector[Review]],
    sitelinks: js.Function0[AdWordsSelector[Sitelink]],
    snippets: js.Function0[AdWordsSelector[Snippet]]
  ): AdGroupExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callouts")(callouts)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("mobileApps")(mobileApps)
    __obj.updateDynamic("phoneNumbers")(phoneNumbers)
    __obj.updateDynamic("reviews")(reviews)
    __obj.updateDynamic("sitelinks")(sitelinks)
    __obj.updateDynamic("snippets")(snippets)
    __obj.asInstanceOf[AdGroupExtensions]
  }
}

