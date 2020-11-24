package typings.formatjsIntl.srcErrorMod

import typings.formatjsIntl.formatjsIntlStrings.MISSING_DATA
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl/src/error", "MissingDataError")
@js.native
class MissingDataError protected () extends IntlError[MISSING_DATA] {
  def this(message: String) = this()
  def this(message: String, exception: Error) = this()
}
