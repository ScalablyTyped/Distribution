package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserLocation extends js.Object {
  var area: js.UndefOr[String] = js.undefined
  var buildingId: js.UndefOr[String] = js.undefined
  var customType: js.UndefOr[String] = js.undefined
  var deskCode: js.UndefOr[String] = js.undefined
  var floorName: js.UndefOr[String] = js.undefined
  var floorSection: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object UserLocation {
  @scala.inline
  def apply(
    area: String = null,
    buildingId: String = null,
    customType: String = null,
    deskCode: String = null,
    floorName: String = null,
    floorSection: String = null,
    `type`: String = null
  ): UserLocation = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area)
    if (buildingId != null) __obj.updateDynamic("buildingId")(buildingId)
    if (customType != null) __obj.updateDynamic("customType")(customType)
    if (deskCode != null) __obj.updateDynamic("deskCode")(deskCode)
    if (floorName != null) __obj.updateDynamic("floorName")(floorName)
    if (floorSection != null) __obj.updateDynamic("floorSection")(floorSection)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UserLocation]
  }
}

