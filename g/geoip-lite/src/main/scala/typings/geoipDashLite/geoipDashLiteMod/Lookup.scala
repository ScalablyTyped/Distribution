package typings.geoipDashLite.geoipDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lookup extends js.Object {
  var city: String
   // range start, end
  var country: String
  var ll: js.Array[Double]
  var range: js.Array[Double]
  var region: String
}

object Lookup {
  @scala.inline
  def apply(city: String, country: String, ll: js.Array[Double], range: js.Array[Double], region: String): Lookup = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], ll = ll.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Lookup]
  }
}

@JSImport("geoip-lite", "lookup")
@js.native
object lookup extends js.Object {
  def apply(ip: String): Lookup = js.native
}

