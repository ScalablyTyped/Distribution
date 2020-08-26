package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserLocation extends js.Object {
  var area: js.UndefOr[String] = js.native
  var buildingId: js.UndefOr[String] = js.native
  var customType: js.UndefOr[String] = js.native
  var deskCode: js.UndefOr[String] = js.native
  var floorName: js.UndefOr[String] = js.native
  var floorSection: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object UserLocation {
  @scala.inline
  def apply(): UserLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserLocation]
  }
  @scala.inline
  implicit class UserLocationOps[Self <: UserLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArea(value: String): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    @scala.inline
    def setBuildingId(value: String): Self = this.set("buildingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildingId: Self = this.set("buildingId", js.undefined)
    @scala.inline
    def setCustomType(value: String): Self = this.set("customType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomType: Self = this.set("customType", js.undefined)
    @scala.inline
    def setDeskCode(value: String): Self = this.set("deskCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeskCode: Self = this.set("deskCode", js.undefined)
    @scala.inline
    def setFloorName(value: String): Self = this.set("floorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloorName: Self = this.set("floorName", js.undefined)
    @scala.inline
    def setFloorSection(value: String): Self = this.set("floorSection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloorSection: Self = this.set("floorSection", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

