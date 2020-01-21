package typings.formatjsIntlUtils.numberTypesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberLocaleInternalData extends js.Object {
  var currencies: Record[String, CurrencyData]
  var nu: js.Array[String]
  var numbers: RawNumberData
  var units: Record[String, UnitData]
}

object NumberLocaleInternalData {
  @scala.inline
  def apply(
    currencies: Record[String, CurrencyData],
    nu: js.Array[String],
    numbers: RawNumberData,
    units: Record[String, UnitData]
  ): NumberLocaleInternalData = {
    val __obj = js.Dynamic.literal(currencies = currencies.asInstanceOf[js.Any], nu = nu.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NumberLocaleInternalData]
  }
}

