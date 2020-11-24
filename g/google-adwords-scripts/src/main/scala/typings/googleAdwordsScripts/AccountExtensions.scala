package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Ad extensions
@js.native
trait AccountExtensions extends js.Object {
  
  def callouts(): AdWordsSelector[Callout] = js.native
  
  def message(): AdWordsSelector[Message] = js.native
  
  def mobileApps(): AdWordsSelector[MobileApp] = js.native
  
  def reviews(): AdWordsSelector[Review] = js.native
  
  def sitelinks(): AdWordsSelector[Sitelink] = js.native
  
  def snippets(): AdWordsSelector[Snippet] = js.native
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
  
  @scala.inline
  implicit class AccountExtensionsOps[Self <: AccountExtensions] (val x: Self) extends AnyVal {
    
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
    def setCallouts(value: () => AdWordsSelector[Callout]): Self = this.set("callouts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessage(value: () => AdWordsSelector[Message]): Self = this.set("message", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMobileApps(value: () => AdWordsSelector[MobileApp]): Self = this.set("mobileApps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReviews(value: () => AdWordsSelector[Review]): Self = this.set("reviews", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSitelinks(value: () => AdWordsSelector[Sitelink]): Self = this.set("sitelinks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSnippets(value: () => AdWordsSelector[Snippet]): Self = this.set("snippets", js.Any.fromFunction0(value))
  }
}
