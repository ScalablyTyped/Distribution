package typings.fontoxml.com.fontoxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserInfo extends IWorkflowInfo {
  var roleId: String
}

object IUserInfo {
  @scala.inline
  def apply(displayName: String, id: String, roleId: String): IUserInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName, id = id, roleId = roleId)
  
    __obj.asInstanceOf[IUserInfo]
  }
}

