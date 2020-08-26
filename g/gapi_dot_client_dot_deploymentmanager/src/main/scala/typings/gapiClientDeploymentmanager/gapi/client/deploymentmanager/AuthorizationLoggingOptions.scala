package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationLoggingOptions extends js.Object {
  /** The type of the permission that was checked. */
  var permissionType: js.UndefOr[String] = js.native
}

object AuthorizationLoggingOptions {
  @scala.inline
  def apply(): AuthorizationLoggingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationLoggingOptions]
  }
  @scala.inline
  implicit class AuthorizationLoggingOptionsOps[Self <: AuthorizationLoggingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPermissionType(value: String): Self = this.set("permissionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionType: Self = this.set("permissionType", js.undefined)
  }
  
}

