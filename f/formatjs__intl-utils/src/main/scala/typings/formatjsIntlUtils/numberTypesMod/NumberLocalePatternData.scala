package typings.formatjsIntlUtils.numberTypesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberLocalePatternData extends js.Object {
  var currency: Record[String, CurrencyPattern]
  var decimal: SignDisplayPattern
  var percent: SignDisplayPattern
  var unit: Record[String, UnitPattern]
}

object NumberLocalePatternData {
  @scala.inline
  def apply(
    currency: Record[String, CurrencyPattern],
    decimal: SignDisplayPattern,
    percent: SignDisplayPattern,
    unit: Record[String, UnitPattern]
  ): NumberLocalePatternData = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NumberLocalePatternData]
  }
}

