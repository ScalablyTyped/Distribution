package typings.formatjsIntl.srcTypesMod

import typings.formatjsIntl.srcErrorMod.InvalidConfigError
import typings.formatjsIntl.srcErrorMod.MessageFormatError
import typings.formatjsIntl.srcErrorMod.MissingDataError
import typings.formatjsIntl.srcErrorMod.MissingTranslationError
import typings.formatjsIntl.srcErrorMod.UnsupportedFormatterError
import typings.intlMessageformat.mod.FormatError
import typings.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typings.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntlConfig[T] extends js.Object {
  
  var defaultFormats: CustomFormats = js.native
  
  var defaultLocale: String = js.native
  
  var defaultRichTextElements: js.UndefOr[Record[String, FormatXMLElementFn[T, String | T | (js.Array[String | T])]]] = js.native
  
  var formats: CustomFormats = js.native
  
  var locale: String = js.native
  
  var messages: Record[String, js.Array[MessageFormatElement] | String] = js.native
  
  def onError(err: InvalidConfigError): Unit = js.native
  def onError(err: MessageFormatError): Unit = js.native
  def onError(err: MissingDataError): Unit = js.native
  def onError(err: MissingTranslationError): Unit = js.native
  def onError(err: UnsupportedFormatterError): Unit = js.native
  def onError(err: FormatError): Unit = js.native
  @JSName("onError")
  var onError_Original: OnErrorFn = js.native
  
  var timeZone: js.UndefOr[String] = js.native
}
