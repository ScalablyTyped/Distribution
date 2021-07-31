package typings.fluentLangneg

import org.scalablytyped.runtime.StringDictionary
import typings.fluentLangneg.fluentLangnegStrings.filtering
import typings.fluentLangneg.fluentLangnegStrings.lookup
import typings.fluentLangneg.fluentLangnegStrings.matching
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluent/langneg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def acceptedLanguages(acceptedLanguages: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("acceptedLanguages")(acceptedLanguages.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def negotiateLanguages(requestedLocales: js.Array[String], availableLocales: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("negotiateLanguages")(requestedLocales.asInstanceOf[js.Any], availableLocales.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def negotiateLanguages(
    requestedLocales: js.Array[String],
    availableLocales: js.Array[String],
    options: NegotiateLanguageOptions
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("negotiateLanguages")(requestedLocales.asInstanceOf[js.Any], availableLocales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait NegotiateLanguageOptions extends StObject {
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var likelySubtags: js.UndefOr[StringMap] = js.undefined
    
    var strategy: js.UndefOr[filtering | matching | lookup] = js.undefined
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
