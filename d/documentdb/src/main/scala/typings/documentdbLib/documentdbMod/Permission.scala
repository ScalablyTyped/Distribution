package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends UniqueId {
  /** The mode of the permission */
  var permissionMode: PermissionMode
  /** The link of the resource that the permission will be applied to. */
  var resource: java.lang.String
}

