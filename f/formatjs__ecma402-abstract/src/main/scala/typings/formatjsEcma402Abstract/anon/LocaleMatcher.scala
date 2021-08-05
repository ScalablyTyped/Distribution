package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.`best fit`
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocaleMatcher extends StObject {
  
  var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.undefined
}
object LocaleMatcher {
  
  inline def apply(): LocaleMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleMatcher]
  }
  
  extension [Self <: LocaleMatcher](x: Self) {
    
    inline def setLocaleMatcher(value: (`best fit`) | lookup): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
  }
}
