package typings.formatjsIntlNumberformat.formatToPartsMod

import typings.formatjsIntlNumberformat.anon.CompactDisplay
import typings.formatjsIntlNumberformat.typesMod.NumberFormatPart
import typings.formatjsIntlUtils.mod.NumberFormatLocaleInternalData
import typings.std.Intl.PluralRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-numberformat/src/format_to_parts", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(
    numberResult: NumberResult,
    data: NumberFormatLocaleInternalData,
    pl: PluralRules,
    options: CompactDisplay
  ): js.Array[NumberFormatPart] = js.native
}

