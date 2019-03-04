package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait formatSettings extends js.Object {
  var currency: currencySettings
  var decimals: scala.Double
  var groupSizes: js.Array[scala.Double]
  var pattern: js.Array[java.lang.String]
  var percent: percentSettings
}

object formatSettings {
  @scala.inline
  def apply(
    currency: currencySettings,
    decimals: scala.Double,
    groupSizes: js.Array[scala.Double],
    pattern: js.Array[java.lang.String],
    percent: percentSettings
  ): formatSettings = {
    val __obj = js.Dynamic.literal(currency = currency, decimals = decimals, groupSizes = groupSizes, pattern = pattern, percent = percent)
  
    __obj.asInstanceOf[formatSettings]
  }
}

