package typings.fontoxml.com_.fontoxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUserInfo extends IWorkflowInfo {
  var roleId: String = js.native
}

object IUserInfo {
  @scala.inline
  def apply(displayName: String, id: String, roleId: String): IUserInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], roleId = roleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserInfo]
  }
  @scala.inline
  implicit class IUserInfoOps[Self <: IUserInfo] (val x: Self) extends AnyVal {
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
    def setRoleId(value: String): Self = this.set("roleId", value.asInstanceOf[js.Any])
  }
  
}

