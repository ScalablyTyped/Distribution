package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Drive extends js.Object {
  var backgroundImageFile: js.UndefOr[DriveBackgroundImageFile] = js.undefined
  var backgroundImageLink: js.UndefOr[String] = js.undefined
  var capabilities: js.UndefOr[DriveCapabilities] = js.undefined
  var colorRgb: js.UndefOr[String] = js.undefined
  var createdDate: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var restrictions: js.UndefOr[DriveRestrictions] = js.undefined
  var themeId: js.UndefOr[String] = js.undefined
}

object Drive {
  @scala.inline
  def apply(
    backgroundImageFile: DriveBackgroundImageFile = null,
    backgroundImageLink: String = null,
    capabilities: DriveCapabilities = null,
    colorRgb: String = null,
    createdDate: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    name: String = null,
    restrictions: DriveRestrictions = null,
    themeId: String = null
  ): Drive = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageFile != null) __obj.updateDynamic("backgroundImageFile")(backgroundImageFile.asInstanceOf[js.Any])
    if (backgroundImageLink != null) __obj.updateDynamic("backgroundImageLink")(backgroundImageLink.asInstanceOf[js.Any])
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (colorRgb != null) __obj.updateDynamic("colorRgb")(colorRgb.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    if (themeId != null) __obj.updateDynamic("themeId")(themeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drive]
  }
}

