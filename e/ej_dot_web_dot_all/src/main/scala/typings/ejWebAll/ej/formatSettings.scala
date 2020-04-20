package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait formatSettings extends js.Object {
  var currency: currencySettings
  var decimals: Double
  var groupSizes: js.Array[Double]
  var pattern: js.Array[String]
  var percent: percentSettings
}

object formatSettings {
  @scala.inline
  def apply(
    currency: currencySettings,
    decimals: Double,
    groupSizes: js.Array[Double],
    pattern: js.Array[String],
    percent: percentSettings
  ): formatSettings = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], groupSizes = groupSizes.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[formatSettings]
  }
}

