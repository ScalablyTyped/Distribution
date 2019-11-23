package typings.geodesy.geodesyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSON extends js.Object {
  var coordinates: js.Tuple2[Double, Double]
  var `type`: String
}

object GeoJSON {
  @scala.inline
  def apply(coordinates: js.Tuple2[Double, Double], `type`: String): GeoJSON = {
    val __obj = js.Dynamic.literal(coordinates = coordinates)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GeoJSON]
  }
}

