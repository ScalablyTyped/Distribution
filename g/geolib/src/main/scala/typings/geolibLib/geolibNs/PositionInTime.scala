package typings
package geolibLib.geolibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionInTime extends PositionAsDecimal {
  var time: scala.Double
}

object PositionInTime {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double, time: scala.Double): PositionInTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[PositionInTime]
  }
}

