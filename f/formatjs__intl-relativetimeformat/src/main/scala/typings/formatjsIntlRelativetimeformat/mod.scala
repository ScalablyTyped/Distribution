package typings.formatjsIntlRelativetimeformat

import typings.formatjsEcma402Abstract.typesRelativeTimeMod.IntlRelativeTimeFormatOptions
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.LocaleFieldsData
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeFormattableUnit
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeLocaleData
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimePart
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.ResolvedIntlRelativeTimeFormatOptions
import typings.formatjsIntlRelativetimeformat.anon.PickIntlRelativeTimeForma
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@formatjs/intl-relativetimeformat", JSImport.Default)
  @js.native
  class default () extends RelativeTimeFormat {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: js.UndefOr[scala.Nothing], options: IntlRelativeTimeFormatOptions) = this()
    def this(locales: String, options: IntlRelativeTimeFormatOptions) = this()
    def this(locales: js.Array[String], options: IntlRelativeTimeFormatOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@formatjs/intl-relativetimeformat", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@formatjs/intl-relativetimeformat", "default.__addLocaleData")
    @js.native
    def __addLocaleData(data: RelativeTimeLocaleData*): Unit = js.native
    
    @JSImport("@formatjs/intl-relativetimeformat", "default.__defaultLocale")
    @js.native
    def __defaultLocale: js.Any = js.native
    @scala.inline
    def __defaultLocale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-relativetimeformat", "default.availableLocales")
    @js.native
    def availableLocales: js.Any = js.native
    @scala.inline
    def availableLocales_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableLocales")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-relativetimeformat", "default.getDefaultLocale")
    @js.native
    def getDefaultLocale: js.Any = js.native
    @scala.inline
    def getDefaultLocale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-relativetimeformat", "default.localeData")
    @js.native
    def localeData: Record[String, LocaleFieldsData] = js.native
    @scala.inline
    def localeData_=(x: Record[String, LocaleFieldsData]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localeData")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-relativetimeformat", "default.polyfilled")
    @js.native
    def polyfilled: Boolean = js.native
    @scala.inline
    def polyfilled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polyfilled")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-relativetimeformat", "default.relevantExtensionKeys")
    @js.native
    def relevantExtensionKeys: js.Any = js.native
    @scala.inline
    def relevantExtensionKeys_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("relevantExtensionKeys")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-relativetimeformat", "default.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    @JSImport("@formatjs/intl-relativetimeformat", "default.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: String, options: PickIntlRelativeTimeForma): js.Array[String] = js.native
    @JSImport("@formatjs/intl-relativetimeformat", "default.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    @JSImport("@formatjs/intl-relativetimeformat", "default.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[String], options: PickIntlRelativeTimeForma): js.Array[String] = js.native
  }
  
  @js.native
  trait RelativeTimeFormat extends StObject {
    
    def format(value: Double, unit: RelativeTimeFormattableUnit): String = js.native
    
    def formatToParts(value: Double, unit: RelativeTimeFormattableUnit): js.Array[RelativeTimePart] = js.native
    
    def resolvedOptions(): ResolvedIntlRelativeTimeFormatOptions = js.native
  }
  object RelativeTimeFormat {
    
    @scala.inline
    def apply(
      format: (Double, RelativeTimeFormattableUnit) => String,
      formatToParts: (Double, RelativeTimeFormattableUnit) => js.Array[RelativeTimePart],
      resolvedOptions: () => ResolvedIntlRelativeTimeFormatOptions
    ): RelativeTimeFormat = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), formatToParts = js.Any.fromFunction2(formatToParts), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
      __obj.asInstanceOf[RelativeTimeFormat]
    }
    
    @scala.inline
    implicit class RelativeTimeFormatMutableBuilder[Self <: RelativeTimeFormat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: (Double, RelativeTimeFormattableUnit) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatToParts(value: (Double, RelativeTimeFormattableUnit) => js.Array[RelativeTimePart]): Self = StObject.set(x, "formatToParts", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResolvedOptions(value: () => ResolvedIntlRelativeTimeFormatOptions): Self = StObject.set(x, "resolvedOptions", js.Any.fromFunction0(value))
    }
  }
}
