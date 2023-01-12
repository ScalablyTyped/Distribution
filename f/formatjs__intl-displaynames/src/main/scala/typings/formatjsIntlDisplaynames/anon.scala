package typings.formatjsIntlDisplaynames

import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.`best fit`
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<@formatjs/intl-displaynames.@formatjs/intl-displaynames/lib.DisplayNamesOptions, 'localeMatcher'> */
  trait PickDisplayNamesOptionslo extends StObject {
    
    var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
  }
  object PickDisplayNamesOptionslo {
    
    inline def apply(): PickDisplayNamesOptionslo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickDisplayNamesOptionslo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickDisplayNamesOptionslo] (val x: Self) extends AnyVal {
      
      inline def setLocaleMatcher(value: lookup | (`best fit`)): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    }
  }
}
