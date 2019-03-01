package typings
package geoipDashLiteLib.geoipDashLiteMod.modNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lookup extends js.Object {
  var city: java.lang.String
   // range start, end
  var country: java.lang.String
  var ll: js.Array[scala.Double]
  var range: js.Array[scala.Double]
  var region: java.lang.String
}

object Lookup {
  @scala.inline
  def apply(
    city: java.lang.String,
    country: java.lang.String,
    ll: js.Array[scala.Double],
    range: js.Array[scala.Double],
    region: java.lang.String
  ): Lookup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("ll")(ll)
    __obj.updateDynamic("range")(range)
    __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[Lookup]
  }
}

