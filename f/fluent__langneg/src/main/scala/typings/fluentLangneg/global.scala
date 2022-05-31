package typings.fluentLangneg

import typings.fluentLangneg.mod.NegotiateLanguageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object FluentLangNeg {
    
    @JSGlobal("FluentLangNeg")
    @js.native
    val ^ : js.Any = js.native
    
    inline def acceptedLanguages(acceptedLanguages: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("acceptedLanguages")(acceptedLanguages.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def negotiateLanguages(requestedLocales: js.Array[String], availableLocales: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("negotiateLanguages")(requestedLocales.asInstanceOf[js.Any], availableLocales.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def negotiateLanguages(
      requestedLocales: js.Array[String],
      availableLocales: js.Array[String],
      options: NegotiateLanguageOptions
    ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("negotiateLanguages")(requestedLocales.asInstanceOf[js.Any], availableLocales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  }
}
