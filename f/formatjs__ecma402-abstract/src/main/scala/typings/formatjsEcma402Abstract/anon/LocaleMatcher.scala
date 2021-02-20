package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`best fit`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocaleMatcher extends StObject {
  
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.native
}
object LocaleMatcher {
  
  @scala.inline
  def apply(): LocaleMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleMatcher]
  }
  
  @scala.inline
  implicit class LocaleMatcherMutableBuilder[Self <: LocaleMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocaleMatcher(value: (`best fit`) | lookup): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
  }
}
