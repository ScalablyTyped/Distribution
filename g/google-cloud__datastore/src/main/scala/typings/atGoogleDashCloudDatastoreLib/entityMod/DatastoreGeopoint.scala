package typings
package atGoogleDashCloudDatastoreLib.entityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatastoreGeopoint extends js.Object {
  var value: DatastoreCoords
}

object DatastoreGeopoint {
  @scala.inline
  def apply(value: DatastoreCoords): DatastoreGeopoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DatastoreGeopoint]
  }
}

