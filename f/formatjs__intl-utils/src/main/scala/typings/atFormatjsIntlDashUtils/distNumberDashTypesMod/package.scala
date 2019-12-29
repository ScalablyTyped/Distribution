package typings.atFormatjsIntlDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distNumberDashTypesMod {
  import typings.atFormatjsIntlDashUtils.Anon_Other
  import typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.other
  import typings.atFormatjsIntlDashUtils.distPluralDashRulesDashTypesMod.LDMLPluralRule
  import typings.atFormatjsIntlDashUtils.distTypesMod.LocaleData
  import typings.std.Omit
  import typings.std.Partial
  import typings.std.Record

  type LDMLPluralRuleMap[T] = (Omit[Partial[Record[LDMLPluralRule, T]], other]) with Anon_Other[T]
  type NumberLocaleData = LocaleData[NumberInternalSlots]
  type NumberingSystem = String
  type RawNumberLocaleData = LocaleData[NumberLocaleInternalData]
}
