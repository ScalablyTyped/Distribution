package typings.atFormatjsIntlDashUtils

import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.LDMLPluralRuleMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UnitName extends js.Object {
  var unitName: LDMLPluralRuleMap[String]
  var unitNarrowSymbol: LDMLPluralRuleMap[String]
  var unitSymbol: LDMLPluralRuleMap[String]
}

object Anon_UnitName {
  @scala.inline
  def apply(
    unitName: LDMLPluralRuleMap[String],
    unitNarrowSymbol: LDMLPluralRuleMap[String],
    unitSymbol: LDMLPluralRuleMap[String]
  ): Anon_UnitName = {
    val __obj = js.Dynamic.literal(unitName = unitName.asInstanceOf[js.Any], unitNarrowSymbol = unitNarrowSymbol.asInstanceOf[js.Any], unitSymbol = unitSymbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_UnitName]
  }
}

