package typings.formatjsIntlDisplaynames

import typings.formatjsEcma402Abstract.typesDisplaynamesMod.DisplayNamesData
import typings.formatjsEcma402Abstract.typesDisplaynamesMod.DisplayNamesLocaleData
import typings.formatjsIntlDisplaynames.anon.PickDisplayNamesOptionslo
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.`best fit`
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.code
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.currency
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.language
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.long
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.lookup
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.narrow
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.none
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.region
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.script
import typings.formatjsIntlDisplaynames.formatjsIntlDisplaynamesStrings.short
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@formatjs/intl-displaynames", "DisplayNames")
  @js.native
  class DisplayNames protected () extends StObject {
    def this(locales: String, options: DisplayNamesOptions) = this()
    def this(locales: js.Array[String], options: DisplayNamesOptions) = this()
    def this(locales: Unit, options: DisplayNamesOptions) = this()
    
    def of(code: String): js.UndefOr[String] = js.native
    def of(code: js.Object): js.UndefOr[String] = js.native
    def of(code: Double): js.UndefOr[String] = js.native
    
    def resolvedOptions(): DisplayNamesResolvedOptions = js.native
  }
  /* static members */
  object DisplayNames {
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def __addLocaleData(data: DisplayNamesLocaleData*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("__addLocaleData")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.__defaultLocale")
    @js.native
    def __defaultLocale: js.Any = js.native
    @scala.inline
    def __defaultLocale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.availableLocales")
    @js.native
    def availableLocales: js.Any = js.native
    @scala.inline
    def availableLocales_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableLocales")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.getDefaultLocale")
    @js.native
    def getDefaultLocale: js.Any = js.native
    @scala.inline
    def getDefaultLocale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.localeData")
    @js.native
    def localeData: Record[String, js.UndefOr[DisplayNamesData]] = js.native
    @scala.inline
    def localeData_=(x: Record[String, js.UndefOr[DisplayNamesData]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localeData")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-displaynames", "DisplayNames.polyfilled")
    @js.native
    val polyfilled: /* true */ Boolean = js.native
    
    @scala.inline
    def supportedLocalesOf(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")().asInstanceOf[js.Array[String]]
    @scala.inline
    def supportedLocalesOf(locales: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def supportedLocalesOf(locales: String, options: PickDisplayNamesOptionslo): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    @scala.inline
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def supportedLocalesOf(locales: js.Array[String], options: PickDisplayNamesOptionslo): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    @scala.inline
    def supportedLocalesOf(locales: Unit, options: PickDisplayNamesOptionslo): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  }
  
  trait DisplayNamesOptions extends StObject {
    
    var fallback: js.UndefOr[code | none] = js.undefined
    
    var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
    
    var style: js.UndefOr[narrow | short | long] = js.undefined
    
    var `type`: language | region | script | currency
  }
  object DisplayNamesOptions {
    
    @scala.inline
    def apply(`type`: language | region | script | currency): DisplayNamesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayNamesOptions]
    }
    
    @scala.inline
    implicit class DisplayNamesOptionsMutableBuilder[Self <: DisplayNamesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallback(value: code | none): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setLocaleMatcher(value: lookup | (`best fit`)): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      @scala.inline
      def setStyle(value: narrow | short | long): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: language | region | script | currency): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DisplayNamesResolvedOptions extends StObject {
    
    var fallback: NonNullable[js.UndefOr[code | none]]
    
    var locale: String
    
    var style: NonNullable[js.UndefOr[narrow | short | long]]
    
    var `type`: NonNullable[language | region | script | currency]
  }
  object DisplayNamesResolvedOptions {
    
    @scala.inline
    def apply(locale: String, `type`: NonNullable[language | region | script | currency]): DisplayNamesResolvedOptions = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayNamesResolvedOptions]
    }
    
    @scala.inline
    implicit class DisplayNamesResolvedOptionsMutableBuilder[Self <: DisplayNamesResolvedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallback(value: NonNullable[js.UndefOr[code | none]]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: NonNullable[js.UndefOr[narrow | short | long]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: NonNullable[language | region | script | currency]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
