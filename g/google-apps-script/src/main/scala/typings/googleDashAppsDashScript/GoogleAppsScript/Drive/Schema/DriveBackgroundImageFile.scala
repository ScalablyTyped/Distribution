package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveBackgroundImageFile extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Number] = js.undefined
  var xCoordinate: js.UndefOr[Number] = js.undefined
  var yCoordinate: js.UndefOr[Number] = js.undefined
}

object DriveBackgroundImageFile {
  @scala.inline
  def apply(id: String = null, width: Number = null, xCoordinate: Number = null, yCoordinate: Number = null): DriveBackgroundImageFile = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (width != null) __obj.updateDynamic("width")(width)
    if (xCoordinate != null) __obj.updateDynamic("xCoordinate")(xCoordinate)
    if (yCoordinate != null) __obj.updateDynamic("yCoordinate")(yCoordinate)
    __obj.asInstanceOf[DriveBackgroundImageFile]
  }
}

