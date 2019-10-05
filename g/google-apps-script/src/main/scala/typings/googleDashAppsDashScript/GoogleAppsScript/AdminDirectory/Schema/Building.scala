package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Building extends js.Object {
  var address: js.UndefOr[BuildingAddress] = js.undefined
  var buildingId: js.UndefOr[String] = js.undefined
  var buildingName: js.UndefOr[String] = js.undefined
  var coordinates: js.UndefOr[BuildingCoordinates] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var etags: js.UndefOr[String] = js.undefined
  var floorNames: js.UndefOr[js.Array[String]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object Building {
  @scala.inline
  def apply(
    address: BuildingAddress = null,
    buildingId: String = null,
    buildingName: String = null,
    coordinates: BuildingCoordinates = null,
    description: String = null,
    etags: String = null,
    floorNames: js.Array[String] = null,
    kind: String = null
  ): Building = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (buildingId != null) __obj.updateDynamic("buildingId")(buildingId)
    if (buildingName != null) __obj.updateDynamic("buildingName")(buildingName)
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates)
    if (description != null) __obj.updateDynamic("description")(description)
    if (etags != null) __obj.updateDynamic("etags")(etags)
    if (floorNames != null) __obj.updateDynamic("floorNames")(floorNames)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Building]
  }
}

