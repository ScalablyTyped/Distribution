package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamDrive extends js.Object {
  var backgroundImageFile: js.UndefOr[TeamDriveBackgroundImageFile] = js.undefined
  var backgroundImageLink: js.UndefOr[String] = js.undefined
  var capabilities: js.UndefOr[TeamDriveCapabilities] = js.undefined
  var colorRgb: js.UndefOr[String] = js.undefined
  var createdDate: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var restrictions: js.UndefOr[TeamDriveRestrictions] = js.undefined
  var themeId: js.UndefOr[String] = js.undefined
}

object TeamDrive {
  @scala.inline
  def apply(
    backgroundImageFile: TeamDriveBackgroundImageFile = null,
    backgroundImageLink: String = null,
    capabilities: TeamDriveCapabilities = null,
    colorRgb: String = null,
    createdDate: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    restrictions: TeamDriveRestrictions = null,
    themeId: String = null
  ): TeamDrive = {
    val __obj = js.Dynamic.literal()
    if (backgroundImageFile != null) __obj.updateDynamic("backgroundImageFile")(backgroundImageFile)
    if (backgroundImageLink != null) __obj.updateDynamic("backgroundImageLink")(backgroundImageLink)
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities)
    if (colorRgb != null) __obj.updateDynamic("colorRgb")(colorRgb)
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions)
    if (themeId != null) __obj.updateDynamic("themeId")(themeId)
    __obj.asInstanceOf[TeamDrive]
  }
}

