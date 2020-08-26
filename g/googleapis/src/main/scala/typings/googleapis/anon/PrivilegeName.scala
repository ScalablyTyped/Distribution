package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivilegeName extends js.Object {
  var privilegeName: js.UndefOr[String] = js.native
  var serviceId: js.UndefOr[String] = js.native
}

object PrivilegeName {
  @scala.inline
  def apply(): PrivilegeName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivilegeName]
  }
  @scala.inline
  implicit class PrivilegeNameOps[Self <: PrivilegeName] (val x: Self) extends AnyVal {
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
    def setPrivilegeName(value: String): Self = this.set("privilegeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivilegeName: Self = this.set("privilegeName", js.undefined)
    @scala.inline
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceId: Self = this.set("serviceId", js.undefined)
  }
  
}

