package typings.gapiDotClientDotCloudresourcemanager.gapi.client.cloudresourcemanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditConfig extends js.Object {
  /**
    * The configuration for logging of each type of permission.
    * Next ID: 4
    */
  var auditLogConfigs: js.UndefOr[js.Array[AuditLogConfig]] = js.undefined
  /**
    * Specifies a service that will be enabled for audit logging.
    * For example, `storage.googleapis.com`, `cloudsql.googleapis.com`.
    * `allServices` is a special value that covers all services.
    */
  var service: js.UndefOr[String] = js.undefined
}

object AuditConfig {
  @scala.inline
  def apply(auditLogConfigs: js.Array[AuditLogConfig] = null, service: String = null): AuditConfig = {
    val __obj = js.Dynamic.literal()
    if (auditLogConfigs != null) __obj.updateDynamic("auditLogConfigs")(auditLogConfigs.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditConfig]
  }
}

