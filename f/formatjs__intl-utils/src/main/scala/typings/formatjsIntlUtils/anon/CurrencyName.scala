package typings.formatjsIntlUtils.anon

import typings.formatjsIntlUtils.numberTypesMod.LDMLPluralRuleMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencyName extends js.Object {
  var currencyName: LDMLPluralRuleMap[String]
  var currencyNarrowSymbol: String
  var currencySymbol: String
}

object CurrencyName {
  @scala.inline
  def apply(currencyName: LDMLPluralRuleMap[String], currencyNarrowSymbol: String, currencySymbol: String): CurrencyName = {
    val __obj = js.Dynamic.literal(currencyName = currencyName.asInstanceOf[js.Any], currencyNarrowSymbol = currencyNarrowSymbol.asInstanceOf[js.Any], currencySymbol = currencySymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyName]
  }
}

