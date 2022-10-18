package typings.formatjsIntl.anon

import typings.formatjsIntl.libSrcErrorMod.InvalidConfigError
import typings.formatjsIntl.libSrcErrorMod.MessageFormatError
import typings.formatjsIntl.libSrcErrorMod.MissingDataError
import typings.formatjsIntl.libSrcErrorMod.MissingTranslationError
import typings.formatjsIntl.libSrcErrorMod.UnsupportedFormatterError
import typings.formatjsIntl.libSrcTypesMod.OnErrorFn
import typings.intlMessageformat.mod.FormatError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocaleOnError extends StObject {
  
  var locale: String
  
  def onError(err: InvalidConfigError): Unit
  def onError(err: MessageFormatError): Unit
  def onError(err: MissingDataError): Unit
  def onError(err: MissingTranslationError): Unit
  def onError(err: UnsupportedFormatterError): Unit
  def onError(err: FormatError): Unit
  @JSName("onError")
  var onError_Original: OnErrorFn
}
object LocaleOnError {
  
  inline def apply(
    locale: String,
    onError: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
  ): LocaleOnError = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError))
    __obj.asInstanceOf[LocaleOnError]
  }
  
  extension [Self <: LocaleOnError](x: Self) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setOnError(
      value: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
    ): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
  }
}
