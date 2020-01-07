package typings.googleapis.buildSrcApisDeploymentmanagerV2Mod.deploymentmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Write a Cloud Audit log
  */
@js.native
trait Schema$LogConfigCloudAuditOptions extends js.Object {
  /**
    * Information used by the Cloud Audit Logging pipeline.
    */
  var authorizationLoggingOptions: js.UndefOr[Schema$AuthorizationLoggingOptions] = js.native
  /**
    * The log_name to populate in the Cloud Audit Record.
    */
  var logName: js.UndefOr[String] = js.native
}

object Schema$LogConfigCloudAuditOptions {
  @scala.inline
  def apply(authorizationLoggingOptions: Schema$AuthorizationLoggingOptions = null, logName: String = null): Schema$LogConfigCloudAuditOptions = {
    val __obj = js.Dynamic.literal()
    if (authorizationLoggingOptions != null) __obj.updateDynamic("authorizationLoggingOptions")(authorizationLoggingOptions.asInstanceOf[js.Any])
    if (logName != null) __obj.updateDynamic("logName")(logName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LogConfigCloudAuditOptions]
  }
}

