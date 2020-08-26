package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Package extends js.Object {
  var content: js.UndefOr[String] = js.native
  var customIds: js.UndefOr[js.Array[String]] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var statusReports: js.UndefOr[js.Array[StatusReport]] = js.native
  var timeCreated: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var uploaderName: js.UndefOr[String] = js.native
}

object Package {
  @scala.inline
  def apply(): Package = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Package]
  }
  @scala.inline
  implicit class PackageOps[Self <: Package] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setCustomIdsVarargs(value: String*): Self = this.set("customIds", js.Array(value :_*))
    @scala.inline
    def setCustomIds(value: js.Array[String]): Self = this.set("customIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomIds: Self = this.set("customIds", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusReportsVarargs(value: StatusReport*): Self = this.set("statusReports", js.Array(value :_*))
    @scala.inline
    def setStatusReports(value: js.Array[StatusReport]): Self = this.set("statusReports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusReports: Self = this.set("statusReports", js.undefined)
    @scala.inline
    def setTimeCreated(value: String): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeCreated: Self = this.set("timeCreated", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUploaderName(value: String): Self = this.set("uploaderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploaderName: Self = this.set("uploaderName", js.undefined)
  }
  
}

