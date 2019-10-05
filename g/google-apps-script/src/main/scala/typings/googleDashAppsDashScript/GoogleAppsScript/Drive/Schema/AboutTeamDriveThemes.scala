package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutTeamDriveThemes extends js.Object {
  var backgroundImageLink: js.UndefOr[String] = js.undefined
  var colorRgb: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
}

object AboutTeamDriveThemes {
  @scala.inline
  def apply(backgroundImageLink: String = null, colorRgb: String = null, id: String = null): AboutTeamDriveThemes = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageLink != null) __obj.updateDynamic("backgroundImageLink")(backgroundImageLink)
    if (colorRgb != null) __obj.updateDynamic("colorRgb")(colorRgb)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[AboutTeamDriveThemes]
  }
}

