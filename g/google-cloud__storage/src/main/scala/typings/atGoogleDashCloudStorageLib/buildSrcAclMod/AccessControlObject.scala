package typings
package atGoogleDashCloudStorageLib.buildSrcAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessControlObject extends js.Object {
  var entity: java.lang.String
  var projectTeam: java.lang.String
  var role: java.lang.String
}

object AccessControlObject {
  @scala.inline
  def apply(entity: java.lang.String, projectTeam: java.lang.String, role: java.lang.String): AccessControlObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entity")(entity)
    __obj.updateDynamic("projectTeam")(projectTeam)
    __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[AccessControlObject]
  }
}

