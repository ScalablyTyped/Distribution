package typings.exReactNativeI18n

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ex-react-native-i18n", JSImport.Default)
  @js.native
  class default () extends i18n
  /* static members */
  object default {
    
    @JSImport("ex-react-native-i18n", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ex-react-native-i18n", "default.currentLocale")
    @js.native
    def currentLocale(): String = js.native
    
    @JSImport("ex-react-native-i18n", "default.defaultLocale")
    @js.native
    def defaultLocale: String = js.native
    @scala.inline
    def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("ex-react-native-i18n", "default.fallbacks")
    @js.native
    def fallbacks: Boolean = js.native
    @scala.inline
    def fallbacks_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallbacks")(x.asInstanceOf[js.Any])
    
    @JSImport("ex-react-native-i18n", "default.getFallbackLocale")
    @js.native
    def getFallbackLocale(): String = js.native
    
    @JSImport("ex-react-native-i18n", "default.localShort")
    @js.native
    def localShort(): String = js.native
    
    @JSImport("ex-react-native-i18n", "default.locale")
    @js.native
    def locale: String = js.native
    @scala.inline
    def locale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
    
    @JSImport("ex-react-native-i18n", "default.missingTranslation")
    @js.native
    def missingTranslation(): String = js.native
    
    @JSImport("ex-react-native-i18n", "default.t")
    @js.native
    def t(text: String): String = js.native
    @JSImport("ex-react-native-i18n", "default.t")
    @js.native
    def t(text: String, interpolation: js.Object): String = js.native
    
    @JSImport("ex-react-native-i18n", "default.translations")
    @js.native
    def translations: StringDictionary[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeRequireFunction */ js.Any
      ] = js.native
    @scala.inline
    def translations_=(
      x: StringDictionary[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeRequireFunction */ js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translations")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait i18n extends StObject
}
