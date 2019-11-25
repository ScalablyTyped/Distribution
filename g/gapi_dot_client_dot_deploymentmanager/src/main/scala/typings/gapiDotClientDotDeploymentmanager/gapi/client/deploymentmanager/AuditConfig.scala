package typings.gapiDotClientDotDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditConfig extends js.Object {
  /** The configuration for logging of each type of permission. */
  var auditLogConfigs: js.UndefOr[js.Array[AuditLogConfig]] = js.undefined
  var exemptedMembers: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a
    * special value that covers all services.
    */
  var service: js.UndefOr[String] = js.undefined
}

object AuditConfig {
  @scala.inline
  def apply(
    auditLogConfigs: js.Array[AuditLogConfig] = null,
    exemptedMembers: js.Array[String] = null,
    service: String = null
  ): AuditConfig = {
    val __obj = js.Dynamic.literal()
    if (auditLogConfigs != null) __obj.updateDynamic("auditLogConfigs")(auditLogConfigs.asInstanceOf[js.Any])
    if (exemptedMembers != null) __obj.updateDynamic("exemptedMembers")(exemptedMembers.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditConfig]
  }
}

