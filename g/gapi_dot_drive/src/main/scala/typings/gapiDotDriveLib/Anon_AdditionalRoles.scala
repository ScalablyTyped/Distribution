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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("additionalRoles")(additionalRoles)
    __obj.updateDynamic("inherited")(inherited)
    __obj.updateDynamic("inheritedFrom")(inheritedFrom)
    __obj.updateDynamic("role")(role)
    __obj.updateDynamic("teamDrivePermissionType")(teamDrivePermissionType)
    __obj.asInstanceOf[Anon_AdditionalRoles]
  }
}

