package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamDriveBackgroundImageFile extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[stdLib.Number] = js.undefined
  var xCoordinate: js.UndefOr[stdLib.Number] = js.undefined
  var yCoordinate: js.UndefOr[stdLib.Number] = js.undefined
}

object TeamDriveBackgroundImageFile {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    width: stdLib.Number = null,
    xCoordinate: stdLib.Number = null,
    yCoordinate: stdLib.Number = null
  ): TeamDriveBackgroundImageFile = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (width != null) __obj.updateDynamic("width")(width)
    if (xCoordinate != null) __obj.updateDynamic("xCoordinate")(xCoordinate)
    if (yCoordinate != null) __obj.updateDynamic("yCoordinate")(yCoordinate)
    __obj.asInstanceOf[TeamDriveBackgroundImageFile]
  }
}

