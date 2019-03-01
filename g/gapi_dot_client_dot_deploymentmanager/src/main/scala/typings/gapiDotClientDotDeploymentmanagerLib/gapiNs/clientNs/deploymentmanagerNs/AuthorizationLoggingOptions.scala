package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationLoggingOptions extends js.Object {
  /** The type of the permission that was checked. */
  var permissionType: js.UndefOr[java.lang.String] = js.undefined
}

object AuthorizationLoggingOptions {
  @scala.inline
  def apply(permissionType: java.lang.String = null): AuthorizationLoggingOptions = {
    val __obj = js.Dynamic.literal()
    if (permissionType != null) __obj.updateDynamic("permissionType")(permissionType)
    __obj.asInstanceOf[AuthorizationLoggingOptions]
  }
}

