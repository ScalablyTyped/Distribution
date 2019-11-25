package typings.expoDashPermissions.buildPermissionsDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionResponse extends js.Object {
  var expires: PermissionExpiration
  var permissions: PermissionMap
  var status: PermissionStatus
}

object PermissionResponse {
  @scala.inline
  def apply(expires: PermissionExpiration, permissions: PermissionMap, status: PermissionStatus): PermissionResponse = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PermissionResponse]
  }
}

