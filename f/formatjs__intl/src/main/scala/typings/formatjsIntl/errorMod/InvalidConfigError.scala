package typings.formatjsIntl.errorMod

import typings.formatjsIntl.formatjsIntlStrings.INVALID_CONFIG
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl/lib/src/error", "InvalidConfigError")
@js.native
class InvalidConfigError protected () extends IntlError[INVALID_CONFIG] {
  def this(message: String) = this()
  def this(message: String, exception: Error) = this()
}
