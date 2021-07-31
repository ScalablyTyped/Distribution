package typings.formatjsIntl.anon

import typings.formatjsIntl.errorMod.InvalidConfigError
import typings.formatjsIntl.errorMod.MessageFormatError
import typings.formatjsIntl.errorMod.MissingDataError
import typings.formatjsIntl.errorMod.MissingTranslationError
import typings.formatjsIntl.errorMod.UnsupportedFormatterError
import typings.formatjsIntl.typesMod.CustomFormats
import typings.formatjsIntl.typesMod.OnErrorFn
import typings.intlMessageformat.mod.FormatError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeZone extends StObject {
  
  var formats: CustomFormats
  
  var locale: String
  
  def onError(err: InvalidConfigError): Unit
  def onError(err: MessageFormatError): Unit
  def onError(err: MissingDataError): Unit
  def onError(err: MissingTranslationError): Unit
  def onError(err: UnsupportedFormatterError): Unit
  def onError(err: FormatError): Unit
  @JSName("onError")
  var onError_Original: OnErrorFn
  
  var timeZone: js.UndefOr[String] = js.undefined
}
object TimeZone {
  
  @scala.inline
  def apply(
    formats: CustomFormats,
    locale: String,
    onError: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
  ): TimeZone = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError))
    __obj.asInstanceOf[TimeZone]
  }
  
  @scala.inline
  implicit class TimeZoneMutableBuilder[Self <: TimeZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormats(value: CustomFormats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnError(
      value: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
    ): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
