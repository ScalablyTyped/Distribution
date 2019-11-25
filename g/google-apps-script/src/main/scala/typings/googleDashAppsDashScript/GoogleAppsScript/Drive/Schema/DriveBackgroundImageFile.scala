package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveBackgroundImageFile extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var xCoordinate: js.UndefOr[Double] = js.undefined
  var yCoordinate: js.UndefOr[Double] = js.undefined
}

object DriveBackgroundImageFile {
  @scala.inline
  def apply(
    id: String = null,
    width: Int | Double = null,
    xCoordinate: Int | Double = null,
    yCoordinate: Int | Double = null
  ): DriveBackgroundImageFile = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xCoordinate != null) __obj.updateDynamic("xCoordinate")(xCoordinate.asInstanceOf[js.Any])
    if (yCoordinate != null) __obj.updateDynamic("yCoordinate")(yCoordinate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveBackgroundImageFile]
  }
}

