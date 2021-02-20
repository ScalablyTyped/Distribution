package typings.fluentLangneg

import org.scalablytyped.runtime.StringDictionary
import typings.fluentLangneg.fluentLangnegStrings.filtering
import typings.fluentLangneg.fluentLangnegStrings.lookup
import typings.fluentLangneg.fluentLangnegStrings.matching
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluent/langneg", "acceptedLanguages")
  @js.native
  def acceptedLanguages(acceptedLanguages: String): js.Array[String] = js.native
  
  @JSImport("@fluent/langneg", "negotiateLanguages")
  @js.native
  def negotiateLanguages(requestedLocales: js.Array[String], availableLocales: js.Array[String]): js.Array[String] = js.native
  @JSImport("@fluent/langneg", "negotiateLanguages")
  @js.native
  def negotiateLanguages(
    requestedLocales: js.Array[String],
    availableLocales: js.Array[String],
    options: NegotiateLanguageOptions
  ): js.Array[String] = js.native
  
  @js.native
  trait NegotiateLanguageOptions extends StObject {
    
    var defaultLocale: js.UndefOr[String] = js.native
    
    var likelySubtags: js.UndefOr[StringMap] = js.native
    
    var strategy: js.UndefOr[filtering | matching | lookup] = js.native
  }
  object NegotiateLanguageOptions {
    
    @scala.inline
    def apply(): NegotiateLanguageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NegotiateLanguageOptions]
    }
    
    @scala.inline
    implicit class NegotiateLanguageOptionsMutableBuilder[Self <: NegotiateLanguageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      @scala.inline
      def setLikelySubtags(value: StringMap): Self = StObject.set(x, "likelySubtags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLikelySubtagsUndefined: Self = StObject.set(x, "likelySubtags", js.undefined)
      
      @scala.inline
      def setStrategy(value: filtering | matching | lookup): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  type StringMap = StringDictionary[String]
}
