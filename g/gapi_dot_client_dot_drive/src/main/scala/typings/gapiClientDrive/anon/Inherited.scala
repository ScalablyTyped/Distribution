package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inherited extends js.Object {
  /** Whether this permission is inherited. This field is always populated. This is an output-only field. */
  var inherited: js.UndefOr[Boolean] = js.undefined
  /** The ID of the item from which this permission is inherited. This is an output-only field and is only populated for members of the Team Drive. */
  var inheritedFrom: js.UndefOr[String] = js.undefined
  /**
    * The primary role for this user. While new values may be added in the future, the following are currently possible:
    * - organizer
    * - writer
    * - commenter
    * - reader
    */
  var role: js.UndefOr[String] = js.undefined
  /**
    * The Team Drive permission type for this user. While new values may be added in future, the following are currently possible:
    * - file
    * - member
    */
  var teamDrivePermissionType: js.UndefOr[String] = js.undefined
}

object Inherited {
  @scala.inline
  def apply(
    inherited: js.UndefOr[Boolean] = js.undefined,
    inheritedFrom: String = null,
    role: String = null,
    teamDrivePermissionType: String = null
  ): Inherited = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inherited)) __obj.updateDynamic("inherited")(inherited.get.asInstanceOf[js.Any])
    if (inheritedFrom != null) __obj.updateDynamic("inheritedFrom")(inheritedFrom.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (teamDrivePermissionType != null) __obj.updateDynamic("teamDrivePermissionType")(teamDrivePermissionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inherited]
  }
}

