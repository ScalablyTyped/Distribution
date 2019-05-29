package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamDriveBackgroundImageFile extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var xCoordinate: js.UndefOr[scala.Double] = js.undefined
  var yCoordinate: js.UndefOr[scala.Double] = js.undefined
}

object TeamDriveBackgroundImageFile {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    xCoordinate: scala.Int | scala.Double = null,
    yCoordinate: scala.Int | scala.Double = null
  ): TeamDriveBackgroundImageFile = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xCoordinate != null) __obj.updateDynamic("xCoordinate")(xCoordinate.asInstanceOf[js.Any])
    if (yCoordinate != null) __obj.updateDynamic("yCoordinate")(yCoordinate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamDriveBackgroundImageFile]
  }
}

