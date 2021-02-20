package typings.formatjsIntlListformat

import typings.formatjsEcma402Abstract.formatjsEcma402AbstractUtilsMod.LiteralPart
import typings.formatjsEcma402Abstract.typesListMod.ListPatternFieldsData
import typings.formatjsEcma402Abstract.typesListMod.ListPatternLocaleData
import typings.formatjsIntlListformat.anon.PickIntlListFormatOptions
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.`best fit`
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.conjunction
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.disjunction
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.element
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.long
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.lookup
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.narrow
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.short
import typings.formatjsIntlListformat.formatjsIntlListformatStrings.unit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@formatjs/intl-listformat", JSImport.Default)
  @js.native
  class default () extends ListFormat {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: js.UndefOr[scala.Nothing], options: IntlListFormatOptions) = this()
    def this(locales: String, options: IntlListFormatOptions) = this()
    def this(locales: js.Array[String], options: IntlListFormatOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@formatjs/intl-listformat", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@formatjs/intl-listformat", "default.__INTERNAL_SLOT_MAP__")
    @js.native
    val __INTERNAL_SLOT_MAP__ : js.Any = js.native
    
    @JSImport("@formatjs/intl-listformat", "default.__addLocaleData")
    @js.native
    def __addLocaleData(data: ListPatternLocaleData*): Unit = js.native
    
    @JSImport("@formatjs/intl-listformat", "default.__defaultLocale")
    @js.native
    def __defaultLocale: js.Any = js.native
    @scala.inline
    def __defaultLocale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-listformat", "default.availableLocales")
    @js.native
    def availableLocales: js.Any = js.native
    @scala.inline
    def availableLocales_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableLocales")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-listformat", "default.getDefaultLocale")
    @js.native
    def getDefaultLocale: js.Any = js.native
    @scala.inline
    def getDefaultLocale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-listformat", "default.localeData")
    @js.native
    def localeData: Record[String, js.UndefOr[ListPatternFieldsData]] = js.native
    @scala.inline
    def localeData_=(x: Record[String, js.UndefOr[ListPatternFieldsData]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localeData")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-listformat", "default.polyfilled")
    @js.native
    def polyfilled: Boolean = js.native
    @scala.inline
    def polyfilled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polyfilled")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-listformat", "default.relevantExtensionKeys")
    @js.native
    def relevantExtensionKeys: js.Any = js.native
    @scala.inline
    def relevantExtensionKeys_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("relevantExtensionKeys")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-listformat", "default.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    @JSImport("@formatjs/intl-listformat", "default.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: String, options: PickIntlListFormatOptions): js.Array[String] = js.native
    @JSImport("@formatjs/intl-listformat", "default.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    @JSImport("@formatjs/intl-listformat", "default.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[String], options: PickIntlListFormatOptions): js.Array[String] = js.native
  }
  
  @js.native
  trait ElementPart extends StObject {
    
    var `type`: element = js.native
    
    var value: String = js.native
  }
  object ElementPart {
    
    @scala.inline
    def apply(`type`: element, value: String): ElementPart = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementPart]
    }
    
    @scala.inline
    implicit class ElementPartMutableBuilder[Self <: ElementPart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IntlListFormatOptions extends StObject {
    
    /**
      * The locale matching algorithm to use.
      * Possible values are "lookup" and "best fit"; the default is "best fit".
      * For information about this option, see
      * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation.
      */
    var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.native
    
    /**
      * The length of the internationalized message. Possible values are:
      * - "long" (default, e.g., in 1 month)
      * - "short" (e.g., in 1 mo.),
      * - or "narrow" (e.g., in 1 mo.).
      * The narrow style could be similar to the short style for some locales.
      */
    var style: js.UndefOr[long | short | narrow] = js.native
    
    /**
      * The format of output message. Possible values are:
      * - "always" (default, e.g., 1 day ago),
      * - or "auto" (e.g., yesterday).
      * The "auto" value allows to not always have to
      * use numeric values in the output.
      */
    var `type`: js.UndefOr[conjunction | disjunction | unit] = js.native
  }
  object IntlListFormatOptions {
    
    @scala.inline
    def apply(): IntlListFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntlListFormatOptions]
    }
    
    @scala.inline
    implicit class IntlListFormatOptionsMutableBuilder[Self <: IntlListFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocaleMatcher(value: (`best fit`) | lookup): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      @scala.inline
      def setStyle(value: long | short | narrow): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: conjunction | disjunction | unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ListFormat extends StObject {
    
    def format(elements: js.Array[String]): String = js.native
    
    def formatToParts(elements: js.Array[String]): js.Array[Part] = js.native
    
    def resolvedOptions(): ResolvedIntlListFormatOptions = js.native
  }
  object ListFormat {
    
    @scala.inline
    def apply(
      format: js.Array[String] => String,
      formatToParts: js.Array[String] => js.Array[Part],
      resolvedOptions: () => ResolvedIntlListFormatOptions
    ): ListFormat = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), formatToParts = js.Any.fromFunction1(formatToParts), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
      __obj.asInstanceOf[ListFormat]
    }
    
    @scala.inline
    implicit class ListFormatMutableBuilder[Self <: ListFormat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: js.Array[String] => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatToParts(value: js.Array[String] => js.Array[Part]): Self = StObject.set(x, "formatToParts", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolvedOptions(value: () => ResolvedIntlListFormatOptions): Self = StObject.set(x, "resolvedOptions", js.Any.fromFunction0(value))
    }
  }
  
  type Part = LiteralPart | ElementPart
  
  @js.native
  trait ResolvedIntlListFormatOptions extends StObject {
    
    /**
      * The BCP 47 language tag for the locale actually used.
      * If any Unicode extension values were requested in the
      * input BCP 47 language tag that led to this locale,
      * the key-value pairs that were requested and are
      * supported for this locale are included in locale.
      */
    var locale: String = js.native
    
    /**
      * The length of the internationalized message. Possible values are:
      * - "long" (default, e.g., in 1 month)
      * - "short" (e.g., in 1 mo.),
      * - or "narrow" (e.g., in 1 mo.).
      * The narrow style could be similar to the short style for some locales.
      */
    var style: long | short | narrow = js.native
    
    /**
      * The format of output message. Possible values are:
      * - "always" (default, e.g., 1 day ago),
      * - or "auto" (e.g., yesterday).
      * The "auto" value allows to not always have to
      * use numeric values in the output.
      */
    var `type`: conjunction | disjunction | unit = js.native
  }
  object ResolvedIntlListFormatOptions {
    
    @scala.inline
    def apply(locale: String, style: long | short | narrow, `type`: conjunction | disjunction | unit): ResolvedIntlListFormatOptions = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedIntlListFormatOptions]
    }
    
    @scala.inline
    implicit class ResolvedIntlListFormatOptionsMutableBuilder[Self <: ResolvedIntlListFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: long | short | narrow): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: conjunction | disjunction | unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
