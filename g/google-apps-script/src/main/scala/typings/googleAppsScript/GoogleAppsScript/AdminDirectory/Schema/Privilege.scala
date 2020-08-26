package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Privilege extends js.Object {
  var childPrivileges: js.UndefOr[js.Array[Privilege]] = js.native
  var etag: js.UndefOr[String] = js.native
  var isOuScopable: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var privilegeName: js.UndefOr[String] = js.native
  var serviceId: js.UndefOr[String] = js.native
  var serviceName: js.UndefOr[String] = js.native
}

object Privilege {
  @scala.inline
  def apply(): Privilege = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Privilege]
  }
  @scala.inline
  implicit class PrivilegeOps[Self <: Privilege] (val x: Self) extends AnyVal {
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
    def setChildPrivilegesVarargs(value: Privilege*): Self = this.set("childPrivileges", js.Array(value :_*))
    @scala.inline
    def setChildPrivileges(value: js.Array[Privilege]): Self = this.set("childPrivileges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildPrivileges: Self = this.set("childPrivileges", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setIsOuScopable(value: Boolean): Self = this.set("isOuScopable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOuScopable: Self = this.set("isOuScopable", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPrivilegeName(value: String): Self = this.set("privilegeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivilegeName: Self = this.set("privilegeName", js.undefined)
    @scala.inline
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceId: Self = this.set("serviceId", js.undefined)
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
  }
  
}

