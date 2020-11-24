package typings.formatjsIntl.errorMod

import typings.formatjsIntl.formatjsIntlStrings.FORMAT_ERROR
import typings.formatjsIntl.typesMod.MessageDescriptor
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl/lib/src/error", "MessageFormatError")
@js.native
class MessageFormatError protected () extends IntlError[FORMAT_ERROR] {
  def this(message: String, locale: String) = this()
  def this(message: String, locale: String, descriptor: MessageDescriptor) = this()
  def this(message: String, locale: String, descriptor: js.UndefOr[scala.Nothing], exception: Error) = this()
  def this(message: String, locale: String, descriptor: MessageDescriptor, exception: Error) = this()
  
  val descriptor: js.UndefOr[MessageDescriptor] = js.native
}
