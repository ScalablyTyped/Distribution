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
    val __obj = js.Dynamic.literal(callouts = callouts, message = message, mobileApps = mobileApps, reviews = reviews, sitelinks = sitelinks, snippets = snippets)
  
    __obj.asInstanceOf[AccountExtensions]
  }
}

