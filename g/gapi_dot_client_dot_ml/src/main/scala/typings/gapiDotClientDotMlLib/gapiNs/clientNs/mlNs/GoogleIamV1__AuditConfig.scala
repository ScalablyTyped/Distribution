package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleIamV1__AuditConfig extends js.Object {
  /**
    * The configuration for logging of each type of permission.
    * Next ID: 4
    */
  var auditLogConfigs: js.UndefOr[js.Array[GoogleIamV1__AuditLogConfig]] = js.undefined
  var exemptedMembers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Specifies a service that will be enabled for audit logging.
    * For example, `storage.googleapis.com`, `cloudsql.googleapis.com`.
    * `allServices` is a special value that covers all services.
    */
  var service: js.UndefOr[java.lang.String] = js.undefined
}

object GoogleIamV1__AuditConfig {
  @scala.inline
  def apply(
    auditLogConfigs: js.Array[GoogleIamV1__AuditLogConfig] = null,
    exemptedMembers: js.Array[java.lang.String] = null,
    service: java.lang.String = null
  ): GoogleIamV1__AuditConfig = {
    val __obj = js.Dynamic.literal()
    if (auditLogConfigs != null) __obj.updateDynamic("auditLogConfigs")(auditLogConfigs)
    if (exemptedMembers != null) __obj.updateDynamic("exemptedMembers")(exemptedMembers)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[GoogleIamV1__AuditConfig]
  }
}

