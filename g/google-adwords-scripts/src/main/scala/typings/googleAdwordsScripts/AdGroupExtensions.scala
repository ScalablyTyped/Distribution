package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdGroupExtensions
  extends StObject
     with AccountExtensions {
  
  def phoneNumbers(): AdWordsSelector[PhoneNumber]
}
object AdGroupExtensions {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: AdGroupExtensions] (val x: Self) extends AnyVal {
    
    inline def setPhoneNumbers(value: () => AdWordsSelector[PhoneNumber]): Self = StObject.set(x, "phoneNumbers", js.Any.fromFunction0(value))
  }
}
