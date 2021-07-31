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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@formatjs/intl-relativetimeformat/lib", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with RelativeTimeFormat {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: IntlRelativeTimeFormatOptions) = this()
    def this(locales: js.Array[String], options: IntlRelativeTimeFormatOptions) = this()
    def this(locales: Unit, options: IntlRelativeTimeFormatOptions) = this()
    
    /* CompleteClass */
    override def format(value: Double, unit: RelativeTimeFormattableUnit): String = js.native
    
    /* CompleteClass */
    override def formatToParts(value: Double, unit: RelativeTimeFormattableUnit): js.Array[RelativeTimePart] = js.native
    
    /* CompleteClass */
    override def resolvedOptions(): ResolvedIntlRelativeTimeFormatOptions = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@formatjs/intl-relativetimeformat/lib", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def __addLocaleData(data: RelativeTimeLocaleData*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("__addLocaleData")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("@formatjs/intl-relativetimeformat/lib", "default.__defaultLocale")
    @js.native
    def __defaultLocale: js.Any = js.native
    @scala.inline
    def __defaultLocale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-relativetimeformat/lib", "default.availableLocales")
    @js.native
    def availableLocales: js.Any = js.native
    @scala.inline
    def availableLocales_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableLocales")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-relativetimeformat/lib", "default.getDefaultLocale")
    @js.native
    def getDefaultLocale: js.Any = js.native
    @scala.inline
    def getDefaultLocale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-relativetimeformat/lib", "default.localeData")
    @js.native
    def localeData: Record[String, LocaleFieldsData] = js.native
    @scala.inline
    def localeData_=(x: Record[String, LocaleFieldsData]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localeData")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-relativetimeformat/lib", "default.polyfilled")
    @js.native
    def polyfilled: Boolean = js.native
    @scala.inline
    def polyfilled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polyfilled")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-relativetimeformat/lib", "default.relevantExtensionKeys")
    @js.native
    def relevantExtensionKeys: js.Any = js.native
    @scala.inline
    def relevantExtensionKeys_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("relevantExtensionKeys")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def supportedLocalesOf(locales: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def supportedLocalesOf(locales: String, options: PickIntlRelativeTimeForma): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    @scala.inline
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    @scala.inline
    def supportedLocalesOf(locales: js.Array[String], options: PickIntlRelativeTimeForma): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  }
  
  trait RelativeTimeFormat extends StObject {
    
    def format(value: Double, unit: RelativeTimeFormattableUnit): String
    
    def formatToParts(value: Double, unit: RelativeTimeFormattableUnit): js.Array[RelativeTimePart]
    
    def resolvedOptions(): ResolvedIntlRelativeTimeFormatOptions
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
