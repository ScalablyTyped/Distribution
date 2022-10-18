package typings.formatjsIntlListformat

import typings.formatjsEcma402Abstract.typesListMod.ListPatternFieldsData
import typings.formatjsEcma402Abstract.typesListMod.ListPatternLocaleData
import typings.formatjsEcma402Abstract.utilsMod.LiteralPart
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@formatjs/intl-listformat/lib", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ListFormat {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: IntlListFormatOptions) = this()
    def this(locales: js.Array[String], options: IntlListFormatOptions) = this()
    def this(locales: Unit, options: IntlListFormatOptions) = this()
    
    /* CompleteClass */
    override def format(elements: js.Array[String]): String = js.native
    
    /* CompleteClass */
    override def formatToParts(elements: js.Array[String]): js.Array[Part[String]] = js.native
    
    /* CompleteClass */
    override def resolvedOptions(): ResolvedIntlListFormatOptions = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@formatjs/intl-listformat/lib", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@formatjs/intl-listformat/lib", "default.__INTERNAL_SLOT_MAP__")
    @js.native
    val __INTERNAL_SLOT_MAP__ : Any = js.native
    
    inline def __addLocaleData(data: ListPatternLocaleData*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("__addLocaleData")(data.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    @JSImport("@formatjs/intl-listformat/lib", "default.__defaultLocale")
    @js.native
    def __defaultLocale: Any = js.native
    inline def __defaultLocale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-listformat/lib", "default.availableLocales")
    @js.native
    def availableLocales: Any = js.native
    inline def availableLocales_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableLocales")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-listformat/lib", "default.getDefaultLocale")
    @js.native
    def getDefaultLocale: Any = js.native
    inline def getDefaultLocale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-listformat/lib", "default.localeData")
    @js.native
    def localeData: Record[String, js.UndefOr[ListPatternFieldsData]] = js.native
    inline def localeData_=(x: Record[String, js.UndefOr[ListPatternFieldsData]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localeData")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-listformat/lib", "default.polyfilled")
    @js.native
    def polyfilled: Boolean = js.native
    inline def polyfilled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polyfilled")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl-listformat/lib", "default.relevantExtensionKeys")
    @js.native
    def relevantExtensionKeys: Any = js.native
    inline def relevantExtensionKeys_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("relevantExtensionKeys")(x.asInstanceOf[js.Any])
    
    inline def supportedLocalesOf(locales: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def supportedLocalesOf(locales: String, options: PickIntlListFormatOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def supportedLocalesOf(locales: js.Array[String], options: PickIntlListFormatOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  }
  
  trait ElementPart[T] extends StObject {
    
    var `type`: element
    
    var value: T
  }
  object ElementPart {
    
    inline def apply[T](value: T): ElementPart[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("element")
      __obj.asInstanceOf[ElementPart[T]]
    }
    
    extension [Self <: ElementPart[?], T](x: Self & ElementPart[T]) {
      
      inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IntlListFormatOptions extends StObject {
    
    /**
      * The locale matching algorithm to use.
      * Possible values are "lookup" and "best fit"; the default is "best fit".
      * For information about this option, see
      * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation.
      */
    var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.undefined
    
    /**
      * The length of the formatted message.
      * Possible values are:
      * - "long" (default, e.g., "A, B, and C");
      * - "short" (e.g., "A, B, C"), or
      * - "narrow" (e.g., "A B C").
      * When style is "short" or "narrow", "unit" is the only allowed value for the type option.
      */
    var style: js.UndefOr[long | short | narrow] = js.undefined
    
    /**
      * The format of output message.
      * Possible values are :
      * - "conjunction" that stands for "and"-based lists (default, e.g., "A, B, and C")
      * - "disjunction" that stands for "or"-based lists (e.g., "A, B, or C").
      * - "unit" stands for lists of values with units (e.g., "5 pounds, 12 ounces").
      */
    var `type`: js.UndefOr[conjunction | disjunction | unit] = js.undefined
  }
  object IntlListFormatOptions {
    
    inline def apply(): IntlListFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntlListFormatOptions]
    }
    
    extension [Self <: IntlListFormatOptions](x: Self) {
      
      inline def setLocaleMatcher(value: (`best fit`) | lookup): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      inline def setStyle(value: long | short | narrow): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: conjunction | disjunction | unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ListFormat extends StObject {
    
    def format(elements: js.Array[String]): String
    
    def formatToParts(elements: js.Array[String]): js.Array[Part[String]]
    
    def resolvedOptions(): ResolvedIntlListFormatOptions
  }
  object ListFormat {
    
    inline def apply(
      format: js.Array[String] => String,
      formatToParts: js.Array[String] => js.Array[Part[String]],
      resolvedOptions: () => ResolvedIntlListFormatOptions
    ): ListFormat = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), formatToParts = js.Any.fromFunction1(formatToParts), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
      __obj.asInstanceOf[ListFormat]
    }
    
    extension [Self <: ListFormat](x: Self) {
      
      inline def setFormat(value: js.Array[String] => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatToParts(value: js.Array[String] => js.Array[Part[String]]): Self = StObject.set(x, "formatToParts", js.Any.fromFunction1(value))
      
      inline def setResolvedOptions(value: () => ResolvedIntlListFormatOptions): Self = StObject.set(x, "resolvedOptions", js.Any.fromFunction0(value))
    }
  }
  
  type Part[T] = LiteralPart | (ElementPart[String | T])
  
  trait ResolvedIntlListFormatOptions extends StObject {
    
    /**
      * A string with a BCP 47 language tag, or an array of such strings.
      * For the general form and interpretation of the locales argument,
      * see the [Intl](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#locale_identification_and_negotiation) page.
      */
    var locale: String
    
    /**
      * The length of the formatted message.
      * Possible values are:
      * - "long" (default, e.g., "A, B, and C");
      * - "short" (e.g., "A, B, C"), or
      * - "narrow" (e.g., "A B C").
      * When style is "short" or "narrow", "unit" is the only allowed value for the type option.
      */
    var style: long | short | narrow
    
    /**
      * The format of output message.
      * Possible values are :
      * - "conjunction" that stands for "and"-based lists (default, e.g., "A, B, and C")
      * - "disjunction" that stands for "or"-based lists (e.g., "A, B, or C").
      * - "unit" stands for lists of values with units (e.g., "5 pounds, 12 ounces").
      */
    var `type`: conjunction | disjunction | unit
  }
  object ResolvedIntlListFormatOptions {
    
    inline def apply(locale: String, style: long | short | narrow, `type`: conjunction | disjunction | unit): ResolvedIntlListFormatOptions = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedIntlListFormatOptions]
    }
    
    extension [Self <: ResolvedIntlListFormatOptions](x: Self) {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: long | short | narrow): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setType(value: conjunction | disjunction | unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
