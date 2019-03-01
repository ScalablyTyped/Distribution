package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Ad extensions
trait AccountExtensions extends js.Object {
  def callouts(): AdWordsSelector[Callout]
  def message(): AdWordsSelector[Message]
  def mobileApps(): AdWordsSelector[MobileApp]
  def reviews(): AdWordsSelector[Review]
  def sitelinks(): AdWordsSelector[Sitelink]
  def snippets(): AdWordsSelector[Snippet]
}

object AccountExtensions {
  @scala.inline
  def apply(
    callouts: js.Function0[AdWordsSelector[Callout]],
    message: js.Function0[AdWordsSelector[Message]],
    mobileApps: js.Function0[AdWordsSelector[MobileApp]],
    reviews: js.Function0[AdWordsSelector[Review]],
    sitelinks: js.Function0[AdWordsSelector[Sitelink]],
    snippets: js.Function0[AdWordsSelector[Snippet]]
  ): AccountExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callouts")(callouts)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("mobileApps")(mobileApps)
    __obj.updateDynamic("reviews")(reviews)
    __obj.updateDynamic("sitelinks")(sitelinks)
    __obj.updateDynamic("snippets")(snippets)
    __obj.asInstanceOf[AccountExtensions]
  }
}

