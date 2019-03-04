package typings
package gapiDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionalRoles extends js.Object {
  var additionalRoles: js.Array[java.lang.String]
  var inherited: scala.Boolean
  var inheritedFrom: java.lang.String
  var role: java.lang.String
  var teamDrivePermissionType: java.lang.String
}

object Anon_AdditionalRoles {
  @scala.inline
  def apply(
    additionalRoles: js.Array[java.lang.String],
    inherited: scala.Boolean,
    inheritedFrom: java.lang.String,
    role: java.lang.String,
    teamDrivePermissionType: java.lang.String
  ): Anon_AdditionalRoles = {
    val __obj = js.Dynamic.literal(additionalRoles = additionalRoles, inherited = inherited, inheritedFrom = inheritedFrom, role = role, teamDrivePermissionType = teamDrivePermissionType)
  
    __obj.asInstanceOf[Anon_AdditionalRoles]
  }
}

