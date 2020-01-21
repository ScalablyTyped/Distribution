package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutDriveThemes extends js.Object {
  var backgroundImageLink: js.UndefOr[String] = js.undefined
  var colorRgb: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
}

object AboutDriveThemes {
  @scala.inline
  def apply(backgroundImageLink: String = null, colorRgb: String = null, id: String = null): AboutDriveThemes = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageLink != null) __obj.updateDynamic("backgroundImageLink")(backgroundImageLink.asInstanceOf[js.Any])
    if (colorRgb != null) __obj.updateDynamic("colorRgb")(colorRgb.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AboutDriveThemes]
  }
}

