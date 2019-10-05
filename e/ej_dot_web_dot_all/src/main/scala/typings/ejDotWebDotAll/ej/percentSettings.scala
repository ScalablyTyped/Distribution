package typings.ejDotWebDotAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait percentSettings extends js.Object {
  var decimals: Double
  var groupSizes: js.Array[Double]
  var pattern: js.Array[String]
  var symbol: String
}

object percentSettings {
  @scala.inline
  def apply(decimals: Double, groupSizes: js.Array[Double], pattern: js.Array[String], symbol: String): percentSettings = {
    val __obj = js.Dynamic.literal(decimals = decimals, groupSizes = groupSizes, pattern = pattern, symbol = symbol)
  
    __obj.asInstanceOf[percentSettings]
  }
}

