package typings.faker.Faker

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
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geo]
  }
}

