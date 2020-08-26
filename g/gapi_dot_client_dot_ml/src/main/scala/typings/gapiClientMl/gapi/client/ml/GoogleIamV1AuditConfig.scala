package typings.gapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleIamV1AuditConfig extends js.Object {
  /**
    * The configuration for logging of each type of permission.
    * Next ID: 4
    */
  var auditLogConfigs: js.UndefOr[js.Array[GoogleIamV1AuditLogConfig]] = js.native
  var exemptedMembers: js.UndefOr[js.Array[String]] = js.native
  /**
    * Specifies a service that will be enabled for audit logging.
    * For example, `storage.googleapis.com`, `cloudsql.googleapis.com`.
    * `allServices` is a special value that covers all services.
    */
  var service: js.UndefOr[String] = js.native
}

object GoogleIamV1AuditConfig {
  @scala.inline
  def apply(): GoogleIamV1AuditConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIamV1AuditConfig]
  }
  @scala.inline
  implicit class GoogleIamV1AuditConfigOps[Self <: GoogleIamV1AuditConfig] (val x: Self) extends AnyVal {
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
    def setAuditLogConfigsVarargs(value: GoogleIamV1AuditLogConfig*): Self = this.set("auditLogConfigs", js.Array(value :_*))
    @scala.inline
    def setAuditLogConfigs(value: js.Array[GoogleIamV1AuditLogConfig]): Self = this.set("auditLogConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuditLogConfigs: Self = this.set("auditLogConfigs", js.undefined)
    @scala.inline
    def setExemptedMembersVarargs(value: String*): Self = this.set("exemptedMembers", js.Array(value :_*))
    @scala.inline
    def setExemptedMembers(value: js.Array[String]): Self = this.set("exemptedMembers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExemptedMembers: Self = this.set("exemptedMembers", js.undefined)
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
  
}

