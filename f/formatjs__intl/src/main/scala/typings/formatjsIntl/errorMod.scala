package typings.formatjsIntl

import typings.formatjsIntl.formatjsIntlStrings.FORMAT_ERROR
import typings.formatjsIntl.formatjsIntlStrings.INVALID_CONFIG
import typings.formatjsIntl.formatjsIntlStrings.MISSING_DATA
import typings.formatjsIntl.formatjsIntlStrings.MISSING_TRANSLATION
import typings.formatjsIntl.formatjsIntlStrings.UNSUPPORTED_FORMATTER
import typings.formatjsIntl.typesMod.MessageDescriptor
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("@formatjs/intl/lib/src/error", "IntlError")
  @js.native
  class IntlError[T /* <: IntlErrorCode */] protected () extends Error {
    def this(code: T, message: String) = this()
    def this(code: T, message: String, exception: Error) = this()
    
    val code: T = js.native
  }
  
  @JSImport("@formatjs/intl/lib/src/error", "InvalidConfigError")
  @js.native
  class InvalidConfigError protected () extends IntlError[INVALID_CONFIG] {
    def this(message: String) = this()
    def this(message: String, exception: Error) = this()
  }
  
  @JSImport("@formatjs/intl/lib/src/error", "MessageFormatError")
  @js.native
  class MessageFormatError protected () extends IntlError[FORMAT_ERROR] {
    def this(message: String, locale: String) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor) = this()
    def this(message: String, locale: String, descriptor: js.UndefOr[scala.Nothing], exception: Error) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor, exception: Error) = this()
    
    val descriptor: js.UndefOr[MessageDescriptor] = js.native
  }
  
  @JSImport("@formatjs/intl/lib/src/error", "MissingDataError")
  @js.native
  class MissingDataError protected () extends IntlError[MISSING_DATA] {
    def this(message: String) = this()
    def this(message: String, exception: Error) = this()
  }
  
  @JSImport("@formatjs/intl/lib/src/error", "MissingTranslationError")
  @js.native
  class MissingTranslationError protected () extends IntlError[MISSING_TRANSLATION] {
    def this(descriptor: MessageDescriptor, locale: String) = this()
    
    val descriptor: js.UndefOr[MessageDescriptor] = js.native
  }
  
  @JSImport("@formatjs/intl/lib/src/error", "UnsupportedFormatterError")
  @js.native
  class UnsupportedFormatterError protected () extends IntlError[UNSUPPORTED_FORMATTER] {
    def this(message: String) = this()
    def this(message: String, exception: Error) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.formatjsIntl.formatjsIntlStrings.FORMAT_ERROR
    - typings.formatjsIntl.formatjsIntlStrings.UNSUPPORTED_FORMATTER
    - typings.formatjsIntl.formatjsIntlStrings.INVALID_CONFIG
    - typings.formatjsIntl.formatjsIntlStrings.MISSING_DATA
    - typings.formatjsIntl.formatjsIntlStrings.MISSING_TRANSLATION
  */
  trait IntlErrorCode extends StObject
  object IntlErrorCode {
    
    @scala.inline
    def FORMAT_ERROR: typings.formatjsIntl.formatjsIntlStrings.FORMAT_ERROR = "FORMAT_ERROR".asInstanceOf[typings.formatjsIntl.formatjsIntlStrings.FORMAT_ERROR]
    
    @scala.inline
    def INVALID_CONFIG: typings.formatjsIntl.formatjsIntlStrings.INVALID_CONFIG = "INVALID_CONFIG".asInstanceOf[typings.formatjsIntl.formatjsIntlStrings.INVALID_CONFIG]
    
    @scala.inline
    def MISSING_DATA: typings.formatjsIntl.formatjsIntlStrings.MISSING_DATA = "MISSING_DATA".asInstanceOf[typings.formatjsIntl.formatjsIntlStrings.MISSING_DATA]
    
    @scala.inline
    def MISSING_TRANSLATION: typings.formatjsIntl.formatjsIntlStrings.MISSING_TRANSLATION = "MISSING_TRANSLATION".asInstanceOf[typings.formatjsIntl.formatjsIntlStrings.MISSING_TRANSLATION]
    
    @scala.inline
    def UNSUPPORTED_FORMATTER: typings.formatjsIntl.formatjsIntlStrings.UNSUPPORTED_FORMATTER = "UNSUPPORTED_FORMATTER".asInstanceOf[typings.formatjsIntl.formatjsIntlStrings.UNSUPPORTED_FORMATTER]
  }
}
