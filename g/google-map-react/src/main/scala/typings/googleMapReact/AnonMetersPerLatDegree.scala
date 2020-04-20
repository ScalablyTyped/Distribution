package typings.googleMapReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMetersPerLatDegree extends js.Object {
  var metersPerLatDegree: Double
  var metersPerLngDegree: Double
}

object AnonMetersPerLatDegree {
  @scala.inline
  def apply(metersPerLatDegree: Double, metersPerLngDegree: Double): AnonMetersPerLatDegree = {
    val __obj = js.Dynamic.literal(metersPerLatDegree = metersPerLatDegree.asInstanceOf[js.Any], metersPerLngDegree = metersPerLngDegree.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMetersPerLatDegree]
  }
}

