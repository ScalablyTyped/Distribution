package typings.formatjsIntl.anon

import typings.formatjsIntl.srcErrorMod.InvalidConfigError
import typings.formatjsIntl.srcErrorMod.MessageFormatError
import typings.formatjsIntl.srcErrorMod.MissingDataError
import typings.formatjsIntl.srcErrorMod.MissingTranslationError
import typings.formatjsIntl.srcErrorMod.UnsupportedFormatterError
import typings.formatjsIntl.srcTypesMod.OnErrorFn
import typings.intlMessageformat.mod.FormatError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locale extends js.Object {
  
  var locale: String = js.native
  
  def onError(err: InvalidConfigError): Unit = js.native
  def onError(err: MessageFormatError): Unit = js.native
  def onError(err: MissingDataError): Unit = js.native
  def onError(err: MissingTranslationError): Unit = js.native
  def onError(err: UnsupportedFormatterError): Unit = js.native
  def onError(err: FormatError): Unit = js.native
  @JSName("onError")
  var onError_Original: OnErrorFn = js.native
}
