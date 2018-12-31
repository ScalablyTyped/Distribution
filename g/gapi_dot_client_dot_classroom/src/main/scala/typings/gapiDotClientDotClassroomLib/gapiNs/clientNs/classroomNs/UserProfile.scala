package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfile extends js.Object {
  /**
    * Email address of the user.
    *
    * Read-only.
    */
  var emailAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifier of the user.
    *
    * Read-only.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the user.
    *
    * Read-only.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * Global permissions of the user.
    *
    * Read-only.
    */
  var permissions: js.UndefOr[js.Array[GlobalPermission]] = js.undefined
  /**
    * URL of user's profile photo.
    *
    * Read-only.
    */
  var photoUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Represents whether a G Suite for Education user's domain administrator has
    * explicitly verified them as being a teacher. If the user is not a member of
    * a G Suite for Education domain, than this field will always be false.
    *
    * Read-only
    */
  var verifiedTeacher: js.UndefOr[scala.Boolean] = js.undefined
}

