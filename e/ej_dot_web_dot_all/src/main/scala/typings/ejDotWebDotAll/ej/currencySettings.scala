package typings.ejDotWebDotAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait currencySettings extends js.Object {
  var decimals: Double
  var groupSizes: js.Array[Double]
  var pattern: js.Array[String]
  var symbol: String
}

object currencySettings {
  @scala.inline
  def apply(decimals: Double, groupSizes: js.Array[Double], pattern: js.Array[String], symbol: String): currencySettings = {
    val __obj = js.Dynamic.literal(decimals = decimals, groupSizes = groupSizes, pattern = pattern, symbol = symbol)
  
    __obj.asInstanceOf[currencySettings]
  }
}

