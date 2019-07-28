package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLngBounds extends js.Object {
  var northeast: LatLngLiteral
  var southwest: LatLngLiteral
}

object LatLngBounds {
  @scala.inline
  def apply(northeast: LatLngLiteral, southwest: LatLngLiteral): LatLngBounds = {
    val __obj = js.Dynamic.literal(northeast = northeast, southwest = southwest)
  
    __obj.asInstanceOf[LatLngBounds]
  }
}

