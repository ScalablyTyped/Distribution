package typings
package geolibLib.geolibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distance extends js.Object {
  var distance: scala.Double
  var key: java.lang.String
  var latitude: scala.Double
  var longitude: scala.Double
}

object Distance {
  @scala.inline
  def apply(distance: scala.Double, key: java.lang.String, latitude: scala.Double, longitude: scala.Double): Distance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.asInstanceOf[Distance]
  }
}

