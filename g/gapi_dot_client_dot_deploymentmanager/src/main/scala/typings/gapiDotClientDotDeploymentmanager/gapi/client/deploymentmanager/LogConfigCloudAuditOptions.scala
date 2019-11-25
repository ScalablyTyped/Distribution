package typings.gapiDotClientDotDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogConfigCloudAuditOptions extends js.Object {
  /** Information used by the Cloud Audit Logging pipeline. */
  var authorizationLoggingOptions: js.UndefOr[AuthorizationLoggingOptions] = js.undefined
  /** The log_name to populate in the Cloud Audit Record. */
  var logName: js.UndefOr[String] = js.undefined
}

object LogConfigCloudAuditOptions {
  @scala.inline
  def apply(authorizationLoggingOptions: AuthorizationLoggingOptions = null, logName: String = null): LogConfigCloudAuditOptions = {
    val __obj = js.Dynamic.literal()
    if (authorizationLoggingOptions != null) __obj.updateDynamic("authorizationLoggingOptions")(authorizationLoggingOptions.asInstanceOf[js.Any])
    if (logName != null) __obj.updateDynamic("logName")(logName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfigCloudAuditOptions]
  }
}

