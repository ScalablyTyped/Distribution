package typings.formatjsIntl.errorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl/lib/src/error", "IntlError")
@js.native
class IntlError[T /* <: IntlErrorCode */] protected () extends Error {
  def this(code: T, message: String) = this()
  def this(code: T, message: String, exception: Error) = this()
  
  val code: T = js.native
}
