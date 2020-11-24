package typings.formatjsIntl.srcErrorMod

import typings.formatjsIntl.formatjsIntlStrings.UNSUPPORTED_FORMATTER
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl/src/error", "UnsupportedFormatterError")
@js.native
class UnsupportedFormatterError protected () extends IntlError[UNSUPPORTED_FORMATTER] {
  def this(message: String) = this()
  def this(message: String, exception: Error) = this()
}
