package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditConfig extends js.Object {
  /** The configuration for logging of each type of permission. */
  var auditLogConfigs: js.UndefOr[js.Array[AuditLogConfig]] = js.undefined
  var exemptedMembers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a
    * special value that covers all services.
    */
  var service: js.UndefOr[java.lang.String] = js.undefined
}

object AuditConfig {
  @scala.inline
  def apply(
    auditLogConfigs: js.Array[AuditLogConfig] = null,
    exemptedMembers: js.Array[java.lang.String] = null,
    service: java.lang.String = null
  ): AuditConfig = {
    val __obj = js.Dynamic.literal()
    if (auditLogConfigs != null) __obj.updateDynamic("auditLogConfigs")(auditLogConfigs)
    if (exemptedMembers != null) __obj.updateDynamic("exemptedMembers")(exemptedMembers)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[AuditConfig]
  }
}

