package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgUnit extends js.Object {
  var blockInheritance: js.UndefOr[Boolean] = js.native
  var description: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var orgUnitId: js.UndefOr[String] = js.native
  var orgUnitPath: js.UndefOr[String] = js.native
  var parentOrgUnitId: js.UndefOr[String] = js.native
  var parentOrgUnitPath: js.UndefOr[String] = js.native
}

object OrgUnit {
  @scala.inline
  def apply(): OrgUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgUnit]
  }
  @scala.inline
  implicit class OrgUnitOps[Self <: OrgUnit] (val x: Self) extends AnyVal {
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
    def setBlockInheritance(value: Boolean): Self = this.set("blockInheritance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockInheritance: Self = this.set("blockInheritance", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOrgUnitId(value: String): Self = this.set("orgUnitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrgUnitId: Self = this.set("orgUnitId", js.undefined)
    @scala.inline
    def setOrgUnitPath(value: String): Self = this.set("orgUnitPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrgUnitPath: Self = this.set("orgUnitPath", js.undefined)
    @scala.inline
    def setParentOrgUnitId(value: String): Self = this.set("parentOrgUnitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentOrgUnitId: Self = this.set("parentOrgUnitId", js.undefined)
    @scala.inline
    def setParentOrgUnitPath(value: String): Self = this.set("parentOrgUnitPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentOrgUnitPath: Self = this.set("parentOrgUnitPath", js.undefined)
  }
  
}

