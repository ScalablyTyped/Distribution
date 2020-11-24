package typings.formatjsEcma402Abstract.formatToPartsMod

import typings.formatjsEcma402Abstract.anon.Currency
import typings.formatjsEcma402Abstract.numberMod.NumberFormatLocaleInternalData
import typings.formatjsEcma402Abstract.numberMod.NumberFormatPart
import typings.std.Intl.PluralRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/lib/NumberFormat/format_to_parts", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(
    numberResult: NumberResult,
    data: NumberFormatLocaleInternalData,
    pl: PluralRules,
    options: Currency
  ): js.Array[NumberFormatPart] = js.native
}
