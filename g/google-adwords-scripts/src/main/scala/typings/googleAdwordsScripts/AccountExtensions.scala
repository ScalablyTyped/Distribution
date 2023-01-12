package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Ad extensions
trait AccountExtensions extends StObject {
  
  def callouts(): AdWordsSelector[Callout]
  
  def message(): AdWordsSelector[Message]
  
  def mobileApps(): AdWordsSelector[MobileApp]
  
  def reviews(): AdWordsSelector[Review]
  
  def sitelinks(): AdWordsSelector[Sitelink]
  
  def snippets(): AdWordsSelector[Snippet]
}
object AccountExtensions {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: AccountExtensions] (val x: Self) extends AnyVal {
    
    inline def setCallouts(value: () => AdWordsSelector[Callout]): Self = StObject.set(x, "callouts", js.Any.fromFunction0(value))
    
    inline def setMessage(value: () => AdWordsSelector[Message]): Self = StObject.set(x, "message", js.Any.fromFunction0(value))
    
    inline def setMobileApps(value: () => AdWordsSelector[MobileApp]): Self = StObject.set(x, "mobileApps", js.Any.fromFunction0(value))
    
    inline def setReviews(value: () => AdWordsSelector[Review]): Self = StObject.set(x, "reviews", js.Any.fromFunction0(value))
    
    inline def setSitelinks(value: () => AdWordsSelector[Sitelink]): Self = StObject.set(x, "sitelinks", js.Any.fromFunction0(value))
    
    inline def setSnippets(value: () => AdWordsSelector[Snippet]): Self = StObject.set(x, "snippets", js.Any.fromFunction0(value))
  }
}
