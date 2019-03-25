package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildingCoordinates extends js.Object {
  var latitude: js.UndefOr[stdLib.Number] = js.undefined
  var longitude: js.UndefOr[stdLib.Number] = js.undefined
}

object BuildingCoordinates {
  @scala.inline
  def apply(latitude: stdLib.Number = null, longitude: stdLib.Number = null): BuildingCoordinates = {
    val __obj = js.Dynamic.literal()
    if (latitude != null) __obj.updateDynamic("latitude")(latitude)
    if (longitude != null) __obj.updateDynamic("longitude")(longitude)
    __obj.asInstanceOf[BuildingCoordinates]
  }
}

