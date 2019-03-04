package typings
package atGoogleDashCloudDatastoreLib.entityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatastoreCoords extends js.Object {
  var latitude: scala.Double
  var longitude: scala.Double
}

object DatastoreCoords {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double): DatastoreCoords = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[DatastoreCoords]
  }
}

