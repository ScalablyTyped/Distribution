package typings.fluentLangneg

import typings.fluentLangneg.anon.ReadonlyArraystring
import typings.fluentLangneg.negotiateLanguagesMod.NegotiateLanguagesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluent/langneg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def acceptedLanguages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("acceptedLanguages")().asInstanceOf[js.Array[String]]
  inline def acceptedLanguages(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("acceptedLanguages")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def filterMatches(requestedLocales: js.Array[String], availableLocales: js.Array[String], strategy: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterMatches")(requestedLocales.asInstanceOf[js.Any], availableLocales.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def negotiateLanguages(requestedLocales: ReadonlyArraystring, availableLocales: ReadonlyArraystring): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("negotiateLanguages")(requestedLocales.asInstanceOf[js.Any], availableLocales.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def negotiateLanguages(
    requestedLocales: ReadonlyArraystring,
    availableLocales: ReadonlyArraystring,
    hasStrategyDefaultLocale: NegotiateLanguagesOptions
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("negotiateLanguages")(requestedLocales.asInstanceOf[js.Any], availableLocales.asInstanceOf[js.Any], hasStrategyDefaultLocale.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
