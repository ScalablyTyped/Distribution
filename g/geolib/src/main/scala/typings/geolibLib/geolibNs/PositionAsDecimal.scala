package typings
package geolibLib.geolibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionAsDecimal extends js.Object {
  var latitude: scala.Double
  var longitude: scala.Double
}

object PositionAsDecimal {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double): PositionAsDecimal = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[PositionAsDecimal]
  }
}

