package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutDriveThemes extends js.Object {
  var backgroundImageLink: js.UndefOr[java.lang.String] = js.undefined
  var colorRgb: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object AboutDriveThemes {
  @scala.inline
  def apply(
    backgroundImageLink: java.lang.String = null,
    colorRgb: java.lang.String = null,
    id: java.lang.String = null
  ): AboutDriveThemes = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageLink != null) __obj.updateDynamic("backgroundImageLink")(backgroundImageLink)
    if (colorRgb != null) __obj.updateDynamic("colorRgb")(colorRgb)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[AboutDriveThemes]
  }
}

