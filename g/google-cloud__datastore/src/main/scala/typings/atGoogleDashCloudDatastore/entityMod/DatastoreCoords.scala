package typings.atGoogleDashCloudDatastore.entityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatastoreCoords extends js.Object {
  var latitude: Double
  var longitude: Double
}

object DatastoreCoords {
  @scala.inline
  def apply(latitude: Double, longitude: Double): DatastoreCoords = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatastoreCoords]
  }
}

