package typings.atFormatjsIntlDashUtils

import typings.atFormatjsIntlDashUtils.distNumberDashTypesMod.LDMLPluralRuleMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrencyName extends js.Object {
  var currencyName: LDMLPluralRuleMap[String]
  var currencyNarrowSymbol: String
  var currencySymbol: String
}

object Anon_CurrencyName {
  @scala.inline
  def apply(currencyName: LDMLPluralRuleMap[String], currencyNarrowSymbol: String, currencySymbol: String): Anon_CurrencyName = {
    val __obj = js.Dynamic.literal(currencyName = currencyName.asInstanceOf[js.Any], currencyNarrowSymbol = currencyNarrowSymbol.asInstanceOf[js.Any], currencySymbol = currencySymbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CurrencyName]
  }
}

