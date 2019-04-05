package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserLocation extends js.Object {
  var area: js.UndefOr[java.lang.String] = js.undefined
  var buildingId: js.UndefOr[java.lang.String] = js.undefined
  var customType: js.UndefOr[java.lang.String] = js.undefined
  var deskCode: js.UndefOr[java.lang.String] = js.undefined
  var floorName: js.UndefOr[java.lang.String] = js.undefined
  var floorSection: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object UserLocation {
  @scala.inline
  def apply(
    area: java.lang.String = null,
    buildingId: java.lang.String = null,
    customType: java.lang.String = null,
    deskCode: java.lang.String = null,
    floorName: java.lang.String = null,
    floorSection: java.lang.String = null,
    `type`: java.lang.String = null
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

