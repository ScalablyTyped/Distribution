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
    val __obj = js.Dynamic.literal(entity = entity, projectTeam = projectTeam, role = role)
  
    __obj.asInstanceOf[AccessControlObject]
  }
}

