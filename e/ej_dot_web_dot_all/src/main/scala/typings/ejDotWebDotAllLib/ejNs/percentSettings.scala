package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait percentSettings extends js.Object {
  var decimals: scala.Double
  var groupSizes: js.Array[scala.Double]
  var pattern: js.Array[java.lang.String]
  var symbol: java.lang.String
}

object percentSettings {
  @scala.inline
  def apply(
    decimals: scala.Double,
    groupSizes: js.Array[scala.Double],
    pattern: js.Array[java.lang.String],
    symbol: java.lang.String
  ): percentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decimals")(decimals)
    __obj.updateDynamic("groupSizes")(groupSizes)
    __obj.updateDynamic("pattern")(pattern)
    __obj.updateDynamic("symbol")(symbol)
    __obj.asInstanceOf[percentSettings]
  }
}

