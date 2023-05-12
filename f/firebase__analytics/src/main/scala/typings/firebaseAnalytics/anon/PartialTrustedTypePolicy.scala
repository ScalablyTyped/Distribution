package typings.firebaseAnalytics.anon

import typings.firebaseAnalytics.firebaseAnalyticsStrings.createHTML
import typings.firebaseAnalytics.firebaseAnalyticsStrings.createScript
import typings.firebaseAnalytics.firebaseAnalyticsStrings.createScriptURL
import typings.trustedTypes.libMod.Args
import typings.trustedTypes.libMod.TrustedHTML
import typings.trustedTypes.libMod.TrustedScript
import typings.trustedTypes.libMod.TrustedScriptURL
import typings.trustedTypes.libMod.TrustedTypePolicyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<trusted-types.trusted-types.<global>.TrustedTypePolicy> */
trait PartialTrustedTypePolicy extends StObject {
  
  var createHTML: js.UndefOr[
    js.Function1[
      /* args */ Args[
        TrustedTypePolicyOptions, 
        typings.firebaseAnalytics.firebaseAnalyticsStrings.createHTML
      ], 
      TrustedHTML
    ]
  ] = js.undefined
  
  var createScript: js.UndefOr[
    js.Function1[
      /* args */ Args[
        TrustedTypePolicyOptions, 
        typings.firebaseAnalytics.firebaseAnalyticsStrings.createScript
      ], 
      TrustedScript
    ]
  ] = js.undefined
  
  var createScriptURL: js.UndefOr[
    js.Function1[
      /* args */ Args[
        TrustedTypePolicyOptions, 
        typings.firebaseAnalytics.firebaseAnalyticsStrings.createScriptURL
      ], 
      TrustedScriptURL
    ]
  ] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object PartialTrustedTypePolicy {
  
  inline def apply(): PartialTrustedTypePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTrustedTypePolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTrustedTypePolicy] (val x: Self) extends AnyVal {
    
    inline def setCreateHTML(value: /* args */ Args[TrustedTypePolicyOptions, createHTML] => TrustedHTML): Self = StObject.set(x, "createHTML", js.Any.fromFunction1(value))
    
    inline def setCreateHTMLUndefined: Self = StObject.set(x, "createHTML", js.undefined)
    
    inline def setCreateScript(value: /* args */ Args[TrustedTypePolicyOptions, createScript] => TrustedScript): Self = StObject.set(x, "createScript", js.Any.fromFunction1(value))
    
    inline def setCreateScriptURL(value: /* args */ Args[TrustedTypePolicyOptions, createScriptURL] => TrustedScriptURL): Self = StObject.set(x, "createScriptURL", js.Any.fromFunction1(value))
    
    inline def setCreateScriptURLUndefined: Self = StObject.set(x, "createScriptURL", js.undefined)
    
    inline def setCreateScriptUndefined: Self = StObject.set(x, "createScript", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
