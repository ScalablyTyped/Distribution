package typings.formatjsIntlUnifiedNumberformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ResolvedUnifiedNumberFormatOptions = typings.std.Intl.ResolvedNumberFormatOptions with (typings.std.Pick[
    typings.formatjsIntlUnifiedNumberformat.mod.UnifiedNumberFormatInternal, 
    typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.currencySign | typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.unit | typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.unitDisplay | typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.notation | typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compactDisplay | typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.signDisplay
  ])
  type UnifiedNumberFormatOptions = typings.std.Intl.NumberFormatOptions with typings.formatjsIntlUtils.numberTypesMod.NumberFormatDigitOptions with typings.formatjsIntlUnifiedNumberformat.AnonAccountingAlways
  /* Rewritten from type alias, can be one of: 
    - typings.std.Intl.NumberFormatPartTypes
    - typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.exponentSeparator
    - typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.exponentMinusSign
    - typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.exponentInteger
    - typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compact
    - typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.unit
    - typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.literal
  */
  type UnifiedNumberFormatPartTypes = typings.formatjsIntlUnifiedNumberformat.mod._UnifiedNumberFormatPartTypes | typings.std.Intl.NumberFormatPartTypes
}
