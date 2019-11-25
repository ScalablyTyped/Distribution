package typings.gapiDotDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionalRoles extends js.Object {
  var additionalRoles: js.Array[String]
  var inherited: Boolean
  var inheritedFrom: String
  var role: String
  var teamDrivePermissionType: String
}

object Anon_AdditionalRoles {
  @scala.inline
  def apply(
    additionalRoles: js.Array[String],
    inherited: Boolean,
    inheritedFrom: String,
    role: String,
    teamDrivePermissionType: String
  ): Anon_AdditionalRoles = {
    val __obj = js.Dynamic.literal(additionalRoles = additionalRoles.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any], inheritedFrom = inheritedFrom.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], teamDrivePermissionType = teamDrivePermissionType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AdditionalRoles]
  }
}

