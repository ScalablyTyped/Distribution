package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileImageMediaMetadataLocation extends js.Object {
  var altitude: js.UndefOr[scala.Double] = js.undefined
  var latitude: js.UndefOr[scala.Double] = js.undefined
  var longitude: js.UndefOr[scala.Double] = js.undefined
}

object FileImageMediaMetadataLocation {
  @scala.inline
  def apply(
    altitude: scala.Int | scala.Double = null,
    latitude: scala.Int | scala.Double = null,
    longitude: scala.Int | scala.Double = null
  ): FileImageMediaMetadataLocation = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileImageMediaMetadataLocation]
  }
}

