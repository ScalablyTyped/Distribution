package typings.atFormatjsIntlDashUnifiedDashNumberformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCoreMod {
  import typings.atFormatjsIntlDashUnifiedDashNumberformat.Anon_Accounting
  import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.compactDisplay
  import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.currencySign
  import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.notation
  import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.signDisplay
  import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.unit
  import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.unitDisplay
  import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.NumberFormatDigitOptions
  import typings.std.Intl.NumberFormatOptions
  import typings.std.Intl.NumberFormatPartTypes
  import typings.std.Intl.ResolvedNumberFormatOptions
  import typings.std.Pick

  type ResolvedUnifiedNumberFormatOptions = ResolvedNumberFormatOptions with (Pick[
    UnifiedNumberFormatInternal, 
    currencySign | unit | unitDisplay | notation | compactDisplay | signDisplay
  ])
  type UnifiedNumberFormatOptions = NumberFormatOptions with NumberFormatDigitOptions with Anon_Accounting
  /* Rewritten from type alias, can be one of: 
    - typings.std.Intl.NumberFormatPartTypes
    - typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.exponentSeparator
    - typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.exponentMinusSign
    - typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.exponentInteger
    - typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.compact
    - typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.unit
  */
  type UnifiedNumberFormatPartTypes = _UnifiedNumberFormatPartTypes | NumberFormatPartTypes
}
