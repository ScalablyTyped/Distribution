package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignExtensions extends AccountExtensions {
  def phoneNumbers(): AdWordsSelector[PhoneNumber]
}

object CampaignExtensions {
  @scala.inline
  def apply(
    callouts: js.Function0[AdWordsSelector[Callout]],
    message: js.Function0[AdWordsSelector[Message]],
    mobileApps: js.Function0[AdWordsSelector[MobileApp]],
    phoneNumbers: js.Function0[AdWordsSelector[PhoneNumber]],
    reviews: js.Function0[AdWordsSelector[Review]],
    sitelinks: js.Function0[AdWordsSelector[Sitelink]],
    snippets: js.Function0[AdWordsSelector[Snippet]]
  ): CampaignExtensions = {
    val __obj = js.Dynamic.literal(callouts = callouts, message = message, mobileApps = mobileApps, phoneNumbers = phoneNumbers, reviews = reviews, sitelinks = sitelinks, snippets = snippets)
  
    __obj.asInstanceOf[CampaignExtensions]
  }
}

