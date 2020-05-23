package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

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
    width: js.UndefOr[Double] = js.undefined,
    xCoordinate: js.UndefOr[Double] = js.undefined,
    yCoordinate: js.UndefOr[Double] = js.undefined
  ): DriveBackgroundImageFile = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xCoordinate)) __obj.updateDynamic("xCoordinate")(xCoordinate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yCoordinate)) __obj.updateDynamic("yCoordinate")(yCoordinate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveBackgroundImageFile]
  }
}

