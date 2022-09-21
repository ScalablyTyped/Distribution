package typings.formatjsIntl.srcTypesMod

import typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.MessageFormatElement
import typings.formatjsIntl.srcErrorMod.InvalidConfigError
import typings.formatjsIntl.srcErrorMod.MessageFormatError
import typings.formatjsIntl.srcErrorMod.MissingDataError
import typings.formatjsIntl.srcErrorMod.MissingTranslationError
import typings.formatjsIntl.srcErrorMod.UnsupportedFormatterError
import typings.intlMessageformat.mod.FormatError
import typings.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedIntlConfig[T] extends StObject {
  
  var defaultFormats: CustomFormats
  
  var defaultLocale: String
  
  var defaultRichTextElements: js.UndefOr[Record[String, FormatXMLElementFn[T, String | T | (js.Array[String | T])]]] = js.undefined
  
  var fallbackOnEmptyString: js.UndefOr[Boolean] = js.undefined
  
  var formats: CustomFormats
  
  var locale: Locale
  
  var messages: Record[MessageIds, js.Array[MessageFormatElement] | String]
  
  def onError(err: InvalidConfigError): Unit
  def onError(err: MessageFormatError): Unit
  def onError(err: MissingDataError): Unit
  def onError(err: MissingTranslationError): Unit
  def onError(err: UnsupportedFormatterError): Unit
  def onError(err: FormatError): Unit
  @JSName("onError")
  var onError_Original: OnErrorFn
  
  var onWarn: js.UndefOr[OnWarnFn] = js.undefined
  
  var timeZone: js.UndefOr[String] = js.undefined
}
object ResolvedIntlConfig {
  
  inline def apply[T](
    defaultFormats: CustomFormats,
    defaultLocale: String,
    formats: CustomFormats,
    locale: Locale,
    messages: Record[MessageIds, js.Array[MessageFormatElement] | String],
    onError: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
  ): ResolvedIntlConfig[T] = {
    val __obj = js.Dynamic.literal(defaultFormats = defaultFormats.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError))
    __obj.asInstanceOf[ResolvedIntlConfig[T]]
  }
  
  extension [Self <: ResolvedIntlConfig[?], T](x: Self & ResolvedIntlConfig[T]) {
    
    inline def setDefaultFormats(value: CustomFormats): Self = StObject.set(x, "defaultFormats", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    inline def setDefaultRichTextElements(value: Record[String, FormatXMLElementFn[T, String | T | (js.Array[String | T])]]): Self = StObject.set(x, "defaultRichTextElements", value.asInstanceOf[js.Any])
    
    inline def setDefaultRichTextElementsUndefined: Self = StObject.set(x, "defaultRichTextElements", js.undefined)
    
    inline def setFallbackOnEmptyString(value: Boolean): Self = StObject.set(x, "fallbackOnEmptyString", value.asInstanceOf[js.Any])
    
    inline def setFallbackOnEmptyStringUndefined: Self = StObject.set(x, "fallbackOnEmptyString", js.undefined)
    
    inline def setFormats(value: CustomFormats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: Record[MessageIds, js.Array[MessageFormatElement] | String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setOnError(
      value: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
    ): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnWarn(value: /* warning */ String => Unit): Self = StObject.set(x, "onWarn", js.Any.fromFunction1(value))
    
    inline def setOnWarnUndefined: Self = StObject.set(x, "onWarn", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
