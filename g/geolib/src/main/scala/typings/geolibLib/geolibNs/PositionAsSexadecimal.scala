package typings
package geolibLib.geolibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionAsSexadecimal extends js.Object {
  var latitude: java.lang.String
  var longitude: java.lang.String
}

object PositionAsSexadecimal {
  @scala.inline
  def apply(latitude: java.lang.String, longitude: java.lang.String): PositionAsSexadecimal = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[PositionAsSexadecimal]
  }
}

