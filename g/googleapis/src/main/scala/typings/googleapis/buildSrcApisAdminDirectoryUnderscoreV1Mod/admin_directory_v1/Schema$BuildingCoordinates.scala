package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for coordinates of a building in Directory API.
  */
@js.native
trait Schema$BuildingCoordinates extends js.Object {
  /**
    * Latitude in decimal degrees.
    */
  var latitude: js.UndefOr[Double] = js.native
  /**
    * Longitude in decimal degrees.
    */
  var longitude: js.UndefOr[Double] = js.native
}

object Schema$BuildingCoordinates {
  @scala.inline
  def apply(latitude: Int | Double = null, longitude: Int | Double = null): Schema$BuildingCoordinates = {
    val __obj = js.Dynamic.literal()
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildingCoordinates]
  }
}

