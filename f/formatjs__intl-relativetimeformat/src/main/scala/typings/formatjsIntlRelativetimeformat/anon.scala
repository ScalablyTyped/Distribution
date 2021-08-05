package typings.formatjsIntlRelativetimeformat

import typings.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.`best fit`
import typings.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<@formatjs/ecma402-abstract.@formatjs/ecma402-abstract.IntlRelativeTimeFormatOptions, 'localeMatcher'> */
  trait PickIntlRelativeTimeForma extends StObject {
    
    var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.undefined
  }
  object PickIntlRelativeTimeForma {
    
    inline def apply(): PickIntlRelativeTimeForma = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickIntlRelativeTimeForma]
    }
    
    extension [Self <: PickIntlRelativeTimeForma](x: Self) {
      
      inline def setLocaleMatcher(value: (`best fit`) | lookup): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    }
  }
}
