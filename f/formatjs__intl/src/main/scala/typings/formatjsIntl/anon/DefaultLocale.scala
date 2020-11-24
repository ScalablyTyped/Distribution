package typings.formatjsIntl.anon

import typings.formatjsIntl.errorMod.InvalidConfigError
import typings.formatjsIntl.errorMod.MessageFormatError
import typings.formatjsIntl.errorMod.MissingDataError
import typings.formatjsIntl.errorMod.MissingTranslationError
import typings.formatjsIntl.errorMod.UnsupportedFormatterError
import typings.formatjsIntl.typesMod.CustomFormats
import typings.formatjsIntl.typesMod.OnErrorFn
import typings.intlMessageformat.mod.FormatError
import typings.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultLocale extends js.Object {
  
  var defaultFormats: CustomFormats = js.native
  
  var defaultLocale: String = js.native
  
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
