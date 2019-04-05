package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamDrive extends js.Object {
  var backgroundImageFile: js.UndefOr[TeamDriveBackgroundImageFile] = js.undefined
  var backgroundImageLink: js.UndefOr[java.lang.String] = js.undefined
  var capabilities: js.UndefOr[TeamDriveCapabilities] = js.undefined
  var colorRgb: js.UndefOr[java.lang.String] = js.undefined
  var createdDate: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var restrictions: js.UndefOr[TeamDriveRestrictions] = js.undefined
  var themeId: js.UndefOr[java.lang.String] = js.undefined
}

object TeamDrive {
  @scala.inline
  def apply(
    backgroundImageFile: TeamDriveBackgroundImageFile = null,
    backgroundImageLink: java.lang.String = null,
    capabilities: TeamDriveCapabilities = null,
    colorRgb: java.lang.String = null,
    createdDate: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    restrictions: TeamDriveRestrictions = null,
    themeId: java.lang.String = null
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

