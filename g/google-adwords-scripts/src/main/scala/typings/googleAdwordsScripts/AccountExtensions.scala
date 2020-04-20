package typings.googleAdwordsScripts

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
    callouts: () => AdWordsSelector[Callout],
    message: () => AdWordsSelector[Message],
    mobileApps: () => AdWordsSelector[MobileApp],
    reviews: () => AdWordsSelector[Review],
    sitelinks: () => AdWordsSelector[Sitelink],
    snippets: () => AdWordsSelector[Snippet]
  ): AccountExtensions = {
    val __obj = js.Dynamic.literal(callouts = js.Any.fromFunction0(callouts), message = js.Any.fromFunction0(message), mobileApps = js.Any.fromFunction0(mobileApps), reviews = js.Any.fromFunction0(reviews), sitelinks = js.Any.fromFunction0(sitelinks), snippets = js.Any.fromFunction0(snippets))
    __obj.asInstanceOf[AccountExtensions]
  }
}

