package typings
package gapiDotClientDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Inherited extends js.Object {
  /** Whether this permission is inherited. This field is always populated. This is an output-only field. */
  var inherited: js.UndefOr[scala.Boolean] = js.undefined
  /** The ID of the item from which this permission is inherited. This is an output-only field and is only populated for members of the Team Drive. */
  var inheritedFrom: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The primary role for this user. While new values may be added in the future, the following are currently possible:
    * - organizer
    * - writer
    * - commenter
    * - reader
    */
  var role: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Team Drive permission type for this user. While new values may be added in future, the following are currently possible:
    * - file
    * - member
    */
  var teamDrivePermissionType: js.UndefOr[java.lang.String] = js.undefined
}

