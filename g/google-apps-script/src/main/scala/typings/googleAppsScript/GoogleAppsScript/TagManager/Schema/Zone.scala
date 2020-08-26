package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Zone extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var boundary: js.UndefOr[ZoneBoundary] = js.native
  var childContainer: js.UndefOr[js.Array[ZoneChildContainer]] = js.native
  var containerId: js.UndefOr[String] = js.native
  var fingerprint: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var notes: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var tagManagerUrl: js.UndefOr[String] = js.native
  var typeRestriction: js.UndefOr[ZoneTypeRestriction] = js.native
  var workspaceId: js.UndefOr[String] = js.native
  var zoneId: js.UndefOr[String] = js.native
}

object Zone {
  @scala.inline
  def apply(): Zone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Zone]
  }
  @scala.inline
  implicit class ZoneOps[Self <: Zone] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setBoundary(value: ZoneBoundary): Self = this.set("boundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    @scala.inline
    def setChildContainerVarargs(value: ZoneChildContainer*): Self = this.set("childContainer", js.Array(value :_*))
    @scala.inline
    def setChildContainer(value: js.Array[ZoneChildContainer]): Self = this.set("childContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildContainer: Self = this.set("childContainer", js.undefined)
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setTagManagerUrl(value: String): Self = this.set("tagManagerUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagManagerUrl: Self = this.set("tagManagerUrl", js.undefined)
    @scala.inline
    def setTypeRestriction(value: ZoneTypeRestriction): Self = this.set("typeRestriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeRestriction: Self = this.set("typeRestriction", js.undefined)
    @scala.inline
    def setWorkspaceId(value: String): Self = this.set("workspaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspaceId: Self = this.set("workspaceId", js.undefined)
    @scala.inline
    def setZoneId(value: String): Self = this.set("zoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoneId: Self = this.set("zoneId", js.undefined)
  }
  
}

