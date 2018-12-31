package typings
package gapiDotClientDotAppsactivityLib.gapiNs.clientNs.appsactivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  /** The name of the user or group the permission applies to. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The ID for this permission. Corresponds to the Drive API's permission ID returned as part of the Drive Permissions resource. */
  var permissionId: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates the Google Drive permissions role. The role determines a user's ability to read, write, or comment on the file. */
  var role: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates how widely permissions are granted. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** The user's information if the type is USER. */
  var user: js.UndefOr[User] = js.undefined
  /** Whether the permission requires a link to the file. */
  var withLink: js.UndefOr[scala.Boolean] = js.undefined
}

