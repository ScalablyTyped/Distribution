package typings.formatjsIntl

import typings.formatjsIntl.srcErrorMod.IntlErrorCode.FORMAT_ERROR
import typings.formatjsIntl.srcErrorMod.IntlErrorCode.INVALID_CONFIG
import typings.formatjsIntl.srcErrorMod.IntlErrorCode.MISSING_DATA
import typings.formatjsIntl.srcErrorMod.IntlErrorCode.MISSING_TRANSLATION
import typings.formatjsIntl.srcErrorMod.IntlErrorCode.UNSUPPORTED_FORMATTER
import typings.formatjsIntl.srcTypesMod.MessageDescriptor
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcErrorMod {
  
  @JSImport("@formatjs/intl/src/error", "IntlError")
  @js.native
  open class IntlError[T /* <: IntlErrorCode */] protected ()
    extends StObject
       with Error {
    def this(code: T, message: String) = this()
    def this(code: T, message: String, exception: js.Error) = this()
    def this(code: T, message: String, exception: Any) = this()
    
    val code: T = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @js.native
  sealed trait IntlErrorCode extends StObject
  @JSImport("@formatjs/intl/src/error", "IntlErrorCode")
  @js.native
  object IntlErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[IntlErrorCode & String] = js.native
    
    @js.native
    sealed trait FORMAT_ERROR
      extends StObject
         with IntlErrorCode
    /* "FORMAT_ERROR" */ val FORMAT_ERROR: typings.formatjsIntl.srcErrorMod.IntlErrorCode.FORMAT_ERROR & String = js.native
    
    @js.native
    sealed trait INVALID_CONFIG
      extends StObject
         with IntlErrorCode
    /* "INVALID_CONFIG" */ val INVALID_CONFIG: typings.formatjsIntl.srcErrorMod.IntlErrorCode.INVALID_CONFIG & String = js.native
    
    @js.native
    sealed trait MISSING_DATA
      extends StObject
         with IntlErrorCode
    /* "MISSING_DATA" */ val MISSING_DATA: typings.formatjsIntl.srcErrorMod.IntlErrorCode.MISSING_DATA & String = js.native
    
    @js.native
    sealed trait MISSING_TRANSLATION
      extends StObject
         with IntlErrorCode
    /* "MISSING_TRANSLATION" */ val MISSING_TRANSLATION: typings.formatjsIntl.srcErrorMod.IntlErrorCode.MISSING_TRANSLATION & String = js.native
    
    @js.native
    sealed trait UNSUPPORTED_FORMATTER
      extends StObject
         with IntlErrorCode
    /* "UNSUPPORTED_FORMATTER" */ val UNSUPPORTED_FORMATTER: typings.formatjsIntl.srcErrorMod.IntlErrorCode.UNSUPPORTED_FORMATTER & String = js.native
  }
  
  @JSImport("@formatjs/intl/src/error", "IntlFormatError")
  @js.native
  open class IntlFormatError protected () extends IntlError[FORMAT_ERROR] {
    def this(message: String, locale: String) = this()
    def this(message: String, locale: String, exception: js.Error) = this()
    def this(message: String, locale: String, exception: Any) = this()
    
    val descriptor: js.UndefOr[MessageDescriptor] = js.native
    
    val locale: String = js.native
  }
  
  @JSImport("@formatjs/intl/src/error", "InvalidConfigError")
  @js.native
  open class InvalidConfigError protected () extends IntlError[INVALID_CONFIG] {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
    def this(message: String, exception: Any) = this()
  }
  
  @JSImport("@formatjs/intl/src/error", "MessageFormatError")
  @js.native
  open class MessageFormatError protected () extends IntlFormatError {
    def this(message: String, locale: String) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor) = this()
    def this(message: String, locale: String, descriptor: Unit, exception: js.Error) = this()
    def this(message: String, locale: String, descriptor: Unit, exception: Any) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor, exception: js.Error) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor, exception: Any) = this()
  }
  
  @JSImport("@formatjs/intl/src/error", "MissingDataError")
  @js.native
  open class MissingDataError protected () extends IntlError[MISSING_DATA] {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
    def this(message: String, exception: Any) = this()
  }
  
  @JSImport("@formatjs/intl/src/error", "MissingTranslationError")
  @js.native
  open class MissingTranslationError protected () extends IntlError[MISSING_TRANSLATION] {
    def this(descriptor: MessageDescriptor, locale: String) = this()
    
    val descriptor: js.UndefOr[MessageDescriptor] = js.native
  }
  
  @JSImport("@formatjs/intl/src/error", "UnsupportedFormatterError")
  @js.native
  open class UnsupportedFormatterError protected () extends IntlError[UNSUPPORTED_FORMATTER] {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
    def this(message: String, exception: Any) = this()
  }
}
