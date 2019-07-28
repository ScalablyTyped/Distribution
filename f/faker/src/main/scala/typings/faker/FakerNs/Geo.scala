package typings.faker.FakerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geo extends js.Object {
  var lat: String
  var lng: String
}

object Geo {
  @scala.inline
  def apply(lat: String, lng: String): Geo = {
    val __obj = js.Dynamic.literal(lat = lat, lng = lng)
  
    __obj.asInstanceOf[Geo]
  }
}

