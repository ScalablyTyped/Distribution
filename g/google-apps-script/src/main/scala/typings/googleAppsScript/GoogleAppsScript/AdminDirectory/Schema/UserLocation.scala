package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

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
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (buildingId != null) __obj.updateDynamic("buildingId")(buildingId.asInstanceOf[js.Any])
    if (customType != null) __obj.updateDynamic("customType")(customType.asInstanceOf[js.Any])
    if (deskCode != null) __obj.updateDynamic("deskCode")(deskCode.asInstanceOf[js.Any])
    if (floorName != null) __obj.updateDynamic("floorName")(floorName.asInstanceOf[js.Any])
    if (floorSection != null) __obj.updateDynamic("floorSection")(floorSection.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserLocation]
  }
}

