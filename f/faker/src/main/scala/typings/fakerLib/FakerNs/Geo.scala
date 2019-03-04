package typings
package fakerLib.FakerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geo extends js.Object {
  var lat: java.lang.String
  var lng: java.lang.String
}

object Geo {
  @scala.inline
  def apply(lat: java.lang.String, lng: java.lang.String): Geo = {
    val __obj = js.Dynamic.literal(lat = lat, lng = lng)
  
    __obj.asInstanceOf[Geo]
  }
}

