package typings.fontoxml.com_.fontoxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserInfo extends IWorkflowInfo {
  var roleId: String
}

object IUserInfo {
  @scala.inline
  def apply(displayName: String, id: String, roleId: String): IUserInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], roleId = roleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserInfo]
  }
}

