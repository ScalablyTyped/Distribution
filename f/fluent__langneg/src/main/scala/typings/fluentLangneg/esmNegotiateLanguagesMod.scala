package typings.fluentLangneg

import typings.fluentLangneg.anon.ReadonlyArraystring
import typings.fluentLangneg.fluentLangnegStrings.filtering
import typings.fluentLangneg.fluentLangnegStrings.lookup
import typings.fluentLangneg.fluentLangnegStrings.matching
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmNegotiateLanguagesMod {
  
  @JSImport("@fluent/langneg/esm/negotiate_languages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def negotiateLanguages(requestedLocales: ReadonlyArraystring, availableLocales: ReadonlyArraystring): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("negotiateLanguages")(requestedLocales.asInstanceOf[js.Any], availableLocales.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def negotiateLanguages(
    requestedLocales: ReadonlyArraystring,
    availableLocales: ReadonlyArraystring,
    param2: NegotiateLanguagesOptions
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("negotiateLanguages")(requestedLocales.asInstanceOf[js.Any], availableLocales.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait NegotiateLanguagesOptions extends StObject {
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var strategy: js.UndefOr[filtering | matching | lookup] = js.undefined
  }
  object NegotiateLanguagesOptions {
    
    inline def apply(): NegotiateLanguagesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NegotiateLanguagesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NegotiateLanguagesOptions] (val x: Self) extends AnyVal {
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setStrategy(value: filtering | matching | lookup): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
}
