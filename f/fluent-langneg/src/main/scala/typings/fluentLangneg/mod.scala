package typings.fluentLangneg

import typings.fluentLangneg.fluentLangnegStrings.filtering
import typings.fluentLangneg.fluentLangnegStrings.lookup
import typings.fluentLangneg.fluentLangnegStrings.matching
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fluent-langneg", "negotiateLanguages")
  @js.native
  def negotiateLanguages(requestedLocales: js.Array[String], availableLocales: js.Array[String]): js.Array[String] = js.native
  @JSImport("fluent-langneg", "negotiateLanguages")
  @js.native
  def negotiateLanguages(
    requestedLocales: js.Array[String],
    availableLocales: js.Array[String],
    options: LanguageNegotiationOptions
  ): js.Array[String] = js.native
  
  @js.native
  trait LanguageNegotiationOptions extends StObject {
    
    var defaultLocale: js.UndefOr[String] = js.native
    
    var strategy: js.UndefOr[filtering | matching | lookup] = js.native
  }
  object LanguageNegotiationOptions {
    
    @scala.inline
    def apply(): LanguageNegotiationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LanguageNegotiationOptions]
    }
    
    @scala.inline
    implicit class LanguageNegotiationOptionsMutableBuilder[Self <: LanguageNegotiationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      @scala.inline
      def setStrategy(value: filtering | matching | lookup): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
}
