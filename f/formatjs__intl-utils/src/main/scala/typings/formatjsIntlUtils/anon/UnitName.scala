package typings.formatjsIntlUtils.anon

import typings.formatjsIntlUtils.numberTypesMod.LDMLPluralRuleMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitName extends js.Object {
  var unitName: LDMLPluralRuleMap[js.Array[String]]
  var unitNarrowSymbol: LDMLPluralRuleMap[js.Array[String]]
  var unitSymbol: LDMLPluralRuleMap[js.Array[String]]
}

object UnitName {
  @scala.inline
  def apply(
    unitName: LDMLPluralRuleMap[js.Array[String]],
    unitNarrowSymbol: LDMLPluralRuleMap[js.Array[String]],
    unitSymbol: LDMLPluralRuleMap[js.Array[String]]
  ): UnitName = {
    val __obj = js.Dynamic.literal(unitName = unitName.asInstanceOf[js.Any], unitNarrowSymbol = unitNarrowSymbol.asInstanceOf[js.Any], unitSymbol = unitSymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitName]
  }
}

