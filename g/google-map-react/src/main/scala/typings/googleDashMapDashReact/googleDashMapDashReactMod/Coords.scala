package typings.googleDashMapDashReact.googleDashMapDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coords extends js.Object {
  var lat: Double
  var lng: Double
}

object Coords {
  @scala.inline
  def apply(lat: Double, lng: Double): Coords = {
    val __obj = js.Dynamic.literal(lat = lat, lng = lng)
  
    __obj.asInstanceOf[Coords]
  }
}

