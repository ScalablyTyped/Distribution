package typings.atFormatjsIntlDashUtils

import typings.atFormatjsIntlDashUtils.libPluralDashRulesDashTypesMod.LDMLPluralRule
import typings.atFormatjsIntlDashUtils.libPluralDashRulesDashTypesMod.PluralRulesData
import typings.atFormatjsIntlDashUtils.libTypesMod.LocaleData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/lib/plural-rules-types", JSImport.Namespace)
@js.native
object libPluralDashRulesDashTypesMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.zero
    - typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.one
    - typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.two
    - typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.few
    - typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.many
    - typings.atFormatjsIntlDashUtils.atFormatjsIntlDashUtilsStrings.other
  */
  trait LDMLPluralRule extends js.Object
  
  @js.native
  trait PluralRulesData extends js.Object {
    var categories: Anon_Cardinal = js.native
    def fn(`val`: String): LDMLPluralRule = js.native
    def fn(`val`: String, ord: Boolean): LDMLPluralRule = js.native
    def fn(`val`: Double): LDMLPluralRule = js.native
    def fn(`val`: Double, ord: Boolean): LDMLPluralRule = js.native
  }
  
  type PluralRulesLocaleData = LocaleData[PluralRulesData]
}

