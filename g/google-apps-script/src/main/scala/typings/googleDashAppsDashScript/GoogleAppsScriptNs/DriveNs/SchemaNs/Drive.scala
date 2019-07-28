package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs

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
    if (backgroundImageFile != null) __obj.updateDynamic("backgroundImageFile")(backgroundImageFile)
    if (backgroundImageLink != null) __obj.updateDynamic("backgroundImageLink")(backgroundImageLink)
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities)
    if (colorRgb != null) __obj.updateDynamic("colorRgb")(colorRgb)
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions)
    if (themeId != null) __obj.updateDynamic("themeId")(themeId)
    __obj.asInstanceOf[Drive]
  }
}

