package typings.formatjsIntl.errorMod

import typings.formatjsIntl.formatjsIntlStrings.MISSING_TRANSLATION
import typings.formatjsIntl.typesMod.MessageDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl/lib/src/error", "MissingTranslationError")
@js.native
class MissingTranslationError protected () extends IntlError[MISSING_TRANSLATION] {
  def this(descriptor: MessageDescriptor, locale: String) = this()
  
  val descriptor: js.UndefOr[MessageDescriptor] = js.native
}
