package typings.atGoogleDashCloudStorage.buildSrcAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessControlObject extends js.Object {
  var entity: String
  var projectTeam: String
  var role: String
}

object AccessControlObject {
  @scala.inline
  def apply(entity: String, projectTeam: String, role: String): AccessControlObject = {
    val __obj = js.Dynamic.literal(entity = entity, projectTeam = projectTeam, role = role)
  
    __obj.asInstanceOf[AccessControlObject]
  }
}

