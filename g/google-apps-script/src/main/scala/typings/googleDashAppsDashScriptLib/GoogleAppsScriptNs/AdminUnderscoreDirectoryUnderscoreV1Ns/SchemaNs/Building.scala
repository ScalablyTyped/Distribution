package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Building extends js.Object {
  var address: js.UndefOr[BuildingAddress] = js.undefined
  var buildingId: js.UndefOr[java.lang.String] = js.undefined
  var buildingName: js.UndefOr[java.lang.String] = js.undefined
  var coordinates: js.UndefOr[BuildingCoordinates] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var etags: js.UndefOr[java.lang.String] = js.undefined
  var floorNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object Building {
  @scala.inline
  def apply(
    address: BuildingAddress = null,
    buildingId: java.lang.String = null,
    buildingName: java.lang.String = null,
    coordinates: BuildingCoordinates = null,
    description: java.lang.String = null,
    etags: java.lang.String = null,
    floorNames: js.Array[java.lang.String] = null,
    kind: java.lang.String = null
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

