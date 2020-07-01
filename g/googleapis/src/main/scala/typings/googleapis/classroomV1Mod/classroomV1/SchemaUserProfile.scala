package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Global information for a user.
  */
@js.native
trait SchemaUserProfile extends js.Object {
  /**
    * Email address of the user.  Read-only.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * Identifier of the user.  Read-only.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Name of the user.  Read-only.
    */
  var name: js.UndefOr[SchemaName] = js.native
  /**
    * Global permissions of the user.  Read-only.
    */
  var permissions: js.UndefOr[js.Array[SchemaGlobalPermission]] = js.native
  /**
    * URL of user&#39;s profile photo.  Read-only.
    */
  var photoUrl: js.UndefOr[String] = js.native
  /**
    * Represents whether a G Suite for Education user&#39;s domain
    * administrator has explicitly verified them as being a teacher. If the
    * user is not a member of a G Suite for Education domain, than this field
    * will always be false.  Read-only
    */
  var verifiedTeacher: js.UndefOr[Boolean] = js.native
}

object SchemaUserProfile {
  @scala.inline
  def apply(
    emailAddress: String = null,
    id: String = null,
    name: SchemaName = null,
    permissions: js.Array[SchemaGlobalPermission] = null,
    photoUrl: String = null,
    verifiedTeacher: js.UndefOr[Boolean] = js.undefined
  ): SchemaUserProfile = {
    val __obj = js.Dynamic.literal()
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(verifiedTeacher)) __obj.updateDynamic("verifiedTeacher")(verifiedTeacher.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserProfile]
  }
}

