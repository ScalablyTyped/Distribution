package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogConfigCloudAuditOptions extends js.Object {
  /** Information used by the Cloud Audit Logging pipeline. */
  var authorizationLoggingOptions: js.UndefOr[AuthorizationLoggingOptions] = js.native
  /** The log_name to populate in the Cloud Audit Record. */
  var logName: js.UndefOr[String] = js.native
}

object LogConfigCloudAuditOptions {
  @scala.inline
  def apply(): LogConfigCloudAuditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfigCloudAuditOptions]
  }
  @scala.inline
  implicit class LogConfigCloudAuditOptionsOps[Self <: LogConfigCloudAuditOptions] (val x: Self) extends AnyVal {
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
    def setAuthorizationLoggingOptions(value: AuthorizationLoggingOptions): Self = this.set("authorizationLoggingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationLoggingOptions: Self = this.set("authorizationLoggingOptions", js.undefined)
    @scala.inline
    def setLogName(value: String): Self = this.set("logName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogName: Self = this.set("logName", js.undefined)
  }
  
}

